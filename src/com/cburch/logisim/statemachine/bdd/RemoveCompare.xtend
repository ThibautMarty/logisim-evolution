package com.cburch.logisim.statemachine.bdd

import com.cburch.logisim.statemachine.fSMDSL.BoolExpr
import com.cburch.logisim.statemachine.fSMDSL.AndExpr
import com.cburch.logisim.statemachine.fSMDSL.OrExpr
import com.cburch.logisim.statemachine.fSMDSL.NotExpr
import com.cburch.logisim.statemachine.fSMDSL.Constant
import com.cburch.logisim.statemachine.fSMDSL.FSMDSLFactory
import com.cburch.logisim.statemachine.fSMDSL.PortRef
import org.eclipse.emf.ecore.util.EcoreUtil
import com.cburch.logisim.statemachine.fSMDSL.CmpExpr

class RemoveCompare {

	new() {
		
	}
	
	def dispatch replace(BoolExpr e) {
		val list = EcoreUtil.getAllContents(e,false).filter(typeof(CmpExpr)).toList
		for (n:list) {
			println("")
			EcoreUtil.replace(n,slice(n))
		}
		e
	}
	def dispatch replace(CmpExpr  e) {
		val list = EcoreUtil.getAllContents(e,false).filter(typeof(CmpExpr)).toList
		for (n:list) {
			println("")
			EcoreUtil.replace(n,slice(n))
		}
		slice(e)
	}

	def dispatch BoolExpr slice(BoolExpr e, int offset) {
		throw new RuntimeException("Cannot bitslice expression "+e);
	}
	
	def BoolExpr and(BoolExpr a, BoolExpr b) {
		var and= FSMDSLFactory.eINSTANCE.createAndExpr
		and.args+=#{a,b}
		and
	}

	def BoolExpr or(BoolExpr a, BoolExpr b) {
		var or= FSMDSLFactory.eINSTANCE.createOrExpr
		or.args+=#{a,b}
		or
	}
	
	def BoolExpr not(BoolExpr a) {
		var not= FSMDSLFactory.eINSTANCE.createNotExpr
		not.args+=a
		not
	}
	
	def BoolExpr equ(BoolExpr a, BoolExpr b) {
		or(and(EcoreUtil.copy(a),EcoreUtil.copy(b)), not(or(EcoreUtil.copy(a),EcoreUtil.copy(b))))
	}
	
	def BoolExpr nequ(BoolExpr a, BoolExpr b) {
		or(and(not(EcoreUtil.copy(a)),EcoreUtil.copy(b)), and(EcoreUtil.copy(a),not(EcoreUtil.copy(b))))
	}
	

	def dispatch BoolExpr slice(CmpExpr e) {
		var and= FSMDSLFactory.eINSTANCE.createAndExpr
		var canDoIt =true;
		var i = 0;
		while(canDoIt) {
			try {
				var BoolExpr slice = null
				val left= slice(e.args.get(0), i)
				val right= slice(e.args.get(1), i)
				
				switch(e.op) {
					case "==" : {
						slice = equ(left,right);
					}
					case "!=" : {
						slice = nequ(left,right);
					}
				}
				if(slice!=null)
					and.args.add(slice)
					
				i++
			} catch (IndexOutOfBoundsException ex) {
				canDoIt=false
			}
		}
		and
	}
	
	def dispatch BoolExpr slice(AndExpr e, int offset) {
		var and= FSMDSLFactory.eINSTANCE.createAndExpr
		and.args.addAll(e.args.map[arg| slice(arg,offset)])
		and
	}

	def dispatch BoolExpr slice(OrExpr e, int offset) {
		var or= FSMDSLFactory.eINSTANCE.createOrExpr
		or.args.addAll(e.args.map[arg| slice(arg,offset)])
		or
	}
	def dispatch BoolExpr slice(NotExpr e, int offset) {
		var not= FSMDSLFactory.eINSTANCE.createNotExpr
		not.args.addAll(e.args.map[arg| slice(arg,offset)])
		not
	}

	def dispatch BoolExpr slice(Constant e, int offset) {
		var c= FSMDSLFactory.eINSTANCE.createConstant
		c.value='''"«e.value.charAt(offset+1)»"'''
		c
	}
	
	def dispatch BoolExpr slice(PortRef e, int offset) {
		if (e.range!=null) {
			if(offset+e.range.lb>=e.port.width) {
				throw new IndexOutOfBoundsException("Offset "+offset+" is out of bound w.r.t to port "+e.port)
			}
			var pref= FSMDSLFactory.eINSTANCE.createPortRef
			pref.port=e.port
			pref.range = FSMDSLFactory.eINSTANCE.createRange
			pref.range.lb = offset+e.range.lb
			pref.range.ub = offset+e.range.lb
			pref
		} else {
			if(offset>=e.port.width) {
				throw new IndexOutOfBoundsException("Offset "+offset+" is out of bound w.r.t to port "+e.port)
			}
			var pref= FSMDSLFactory.eINSTANCE.createPortRef
			pref.port=e.port
			pref.range = FSMDSLFactory.eINSTANCE.createRange
			pref.range.lb = offset
			pref.range.ub = offset
			pref
		}
	}
	
}