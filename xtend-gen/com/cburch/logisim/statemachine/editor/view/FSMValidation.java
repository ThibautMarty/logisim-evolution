package com.cburch.logisim.statemachine.editor.view;

import com.cburch.logisim.statemachine.PrettyPrinter;
import com.cburch.logisim.statemachine.bdd.BDDOptimizer;
import com.cburch.logisim.statemachine.editor.view.FSMCustomFactory;
import com.cburch.logisim.statemachine.fSMDSL.BoolExpr;
import com.cburch.logisim.statemachine.fSMDSL.Command;
import com.cburch.logisim.statemachine.fSMDSL.CommandList;
import com.cburch.logisim.statemachine.fSMDSL.DefaultPredicate;
import com.cburch.logisim.statemachine.fSMDSL.FSM;
import com.cburch.logisim.statemachine.fSMDSL.FSMElement;
import com.cburch.logisim.statemachine.fSMDSL.OrExpr;
import com.cburch.logisim.statemachine.fSMDSL.Port;
import com.cburch.logisim.statemachine.fSMDSL.State;
import com.cburch.logisim.statemachine.fSMDSL.Transition;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FSMValidation {
  private FSM fsm;
  
  private HashSet<State> targets = new HashSet<State>();
  
  private List<String> warnings = new ArrayList<String>();
  
  private List<String> errors = new ArrayList<String>();
  
  public FSMValidation(final FSM fsm) {
    this.fsm = fsm;
  }
  
  public List<String> getErrors() {
    return this.errors;
  }
  
  public List<String> getWarnings() {
    return this.warnings;
  }
  
  public Boolean _validate(final FSM e) {
    State _start = e.getStart();
    boolean _equals = Objects.equal(_start, null);
    if (_equals) {
      this.error("No initial state");
    }
    EList<State> _states = e.getStates();
    int _size = _states.size();
    boolean _equals_1 = (_size == 0);
    if (_equals_1) {
      this.error("The FSM has no states !");
    }
    EList<Port> _out = e.getOut();
    boolean _equals_2 = Objects.equal(_out, Integer.valueOf(0));
    if (_equals_2) {
      this.warning("The FSM has no output pins !");
    }
    EList<Port> _in = e.getIn();
    boolean _equals_3 = Objects.equal(_in, Integer.valueOf(0));
    if (_equals_3) {
      this.warning("The FSM has no input pins !");
    }
    EList<State> _states_1 = e.getStates();
    for (final State s : _states_1) {
      this.validate(s);
    }
    EList<State> _states_2 = e.getStates();
    for (final State s_1 : _states_2) {
      boolean _and = false;
      State _start_1 = this.fsm.getStart();
      boolean _notEquals = (!Objects.equal(s_1, _start_1));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _contains = this.targets.contains(s_1);
        boolean _not = (!_contains);
        _and = _not;
      }
      if (_and) {
        String _pp = PrettyPrinter.pp(s_1);
        String _plus = ("State " + _pp);
        String _plus_1 = (_plus + " is not reachable from initial state ");
        State _start_2 = e.getStart();
        String _pp_1 = PrettyPrinter.pp(_start_2);
        String _plus_2 = (_plus_1 + _pp_1);
        this.warning(_plus_2);
      }
    }
    return null;
  }
  
  public boolean warning(final String string) {
    return this.warnings.add(string);
  }
  
  public boolean error(final String string) {
    return this.errors.add(string);
  }
  
  public Boolean _validate(final FSMElement e) {
    return null;
  }
  
  public Boolean _validate(final CommandList cl) {
    EList<Command> _commands = cl.getCommands();
    for (final Command c : _commands) {
      {
        BoolExpr _value = c.getValue();
        final BDDOptimizer optimizer = new BDDOptimizer(_value);
        optimizer.simplify();
        boolean _isAlwaysFalse = optimizer.isAlwaysFalse();
        if (_isAlwaysFalse) {
          String _pp = PrettyPrinter.pp(c);
          String _plus = ("command " + _pp);
          String _plus_1 = (_plus + " is always evaluated to 0");
          this.warning(_plus_1);
        }
        boolean _isAlwaysTrue = optimizer.isAlwaysTrue();
        if (_isAlwaysTrue) {
          String _pp_1 = PrettyPrinter.pp(c);
          String _plus_2 = ("command " + _pp_1);
          String _plus_3 = (_plus_2 + " is always evaluated to 1");
          this.warning(_plus_3);
        }
      }
    }
    return null;
  }
  
  public Boolean _validate(final Transition t) {
    boolean _xblockexpression = false;
    {
      BoolExpr _predicate = t.getPredicate();
      final BDDOptimizer optimizer = new BDDOptimizer(_predicate);
      optimizer.simplify();
      boolean _isAlwaysFalse = optimizer.isAlwaysFalse();
      if (_isAlwaysFalse) {
        String _pp = PrettyPrinter.pp(t);
        String _plus = ("Transition  " + _pp);
        String _plus_1 = (_plus + " is never taken (evaluated to 0)");
        this.error(_plus_1);
      }
      boolean _xifexpression = false;
      boolean _isAlwaysTrue = optimizer.isAlwaysTrue();
      if (_isAlwaysTrue) {
        String _pp_1 = PrettyPrinter.pp(t);
        String _plus_2 = ("Transition " + _pp_1);
        String _plus_3 = (_plus_2 + " is always taken (evaluated to 1)");
        _xifexpression = this.warning(_plus_3);
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  public Boolean _validate(final State e) {
    int i = 0;
    int j = 0;
    EObject _eContainer = e.eContainer();
    if ((_eContainer instanceof FSM)) {
      EObject _eContainer_1 = e.eContainer();
      final FSM fsm = ((FSM) _eContainer_1);
      String _code = e.getCode();
      int _length = _code.length();
      int _width = fsm.getWidth();
      int _plus = (_width + 2);
      boolean _notEquals = (_length != _plus);
      if (_notEquals) {
        String _pp = PrettyPrinter.pp(e);
        String _plus_1 = ("State " + _pp);
        String _plus_2 = (_plus_1 + " code is not consistent with FSM configuration (");
        int _width_1 = fsm.getWidth();
        String _plus_3 = (_plus_2 + Integer.valueOf(_width_1));
        String _plus_4 = (_plus_3 + " bits expected");
        this.error(_plus_4);
      }
    }
    EList<Transition> _transition = e.getTransition();
    int _size = _transition.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      String _pp_1 = PrettyPrinter.pp(e);
      String _plus_5 = ("State " + _pp_1);
      String _plus_6 = (_plus_5 + " has no output transition");
      this.warning(_plus_6);
    }
    EList<Transition> _transition_1 = e.getTransition();
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      return Boolean.valueOf((!(t instanceof DefaultPredicate)));
    };
    final Iterable<Transition> nonDefaultTransitions = IterableExtensions.<Transition>filter(_transition_1, _function);
    EList<Transition> _transition_2 = e.getTransition();
    int _size_1 = _transition_2.size();
    int _length_1 = ((Object[])Conversions.unwrapArray(nonDefaultTransitions, Object.class)).length;
    int _minus = (_size_1 - _length_1);
    boolean _greaterThan = (_minus > 1);
    if (_greaterThan) {
      String _pp_2 = PrettyPrinter.pp(e);
      String _plus_7 = ("State " + _pp_2);
      String _plus_8 = (_plus_7 + " has multiple default transitions");
      this.error(_plus_8);
    }
    for (final Transition a : nonDefaultTransitions) {
      {
        this.validate(a);
        State _dst = a.getDst();
        this.targets.add(_dst);
        j = 0;
        for (final Transition b : nonDefaultTransitions) {
          {
            if ((i < j)) {
              BoolExpr _predicate = a.getPredicate();
              BoolExpr _predicate_1 = b.getPredicate();
              final OrExpr or = FSMCustomFactory.or(_predicate, _predicate_1);
              final BDDOptimizer optimizer = new BDDOptimizer(or);
              boolean _isAlwaysFalse = optimizer.isAlwaysFalse();
              boolean _not = (!_isAlwaysFalse);
              if (_not) {
                String _pp_3 = PrettyPrinter.pp(a);
                String _plus_9 = ("Transitions " + _pp_3);
                String _plus_10 = (_plus_9 + " and ");
                String _pp_4 = PrettyPrinter.pp(a);
                String _plus_11 = (_plus_10 + _pp_4);
                String _plus_12 = (_plus_11 + " are not mutually exclusive");
                this.error(_plus_12);
              }
            }
            int _j = j;
            j = (_j + 1);
          }
        }
        int _i = i;
        i = (_i + 1);
      }
    }
    return null;
  }
  
  public Boolean validate(final FSMElement cl) {
    if (cl instanceof CommandList) {
      return _validate((CommandList)cl);
    } else if (cl instanceof FSM) {
      return _validate((FSM)cl);
    } else if (cl instanceof State) {
      return _validate((State)cl);
    } else if (cl instanceof Transition) {
      return _validate((Transition)cl);
    } else if (cl != null) {
      return _validate(cl);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cl).toString());
    }
  }
}
