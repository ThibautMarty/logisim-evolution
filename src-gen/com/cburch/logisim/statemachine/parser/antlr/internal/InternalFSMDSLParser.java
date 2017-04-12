package com.cburch.logisim.statemachine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.cburch.logisim.statemachine.services.FSMDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFSMDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BIN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "','", "']'", "';'", "'fsm'", "'{'", "'codeWidth'", "'='", "'reset'", "'}'", "'in'", "'out'", "'commands'", "'@['", "'state'", "'code'", "'transitions'", "'->'", "'goto'", "'when'", "':'", "'default'", "'+'", "'.'", "'=='", "'/='", "'('", "')'", "'/'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_BIN=6;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFSMDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFSMDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFSMDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FSMDSLGrammarAccess grammarAccess;
     	
        public InternalFSMDSLParser(TokenStream input, FSMDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TOP";	
       	}
       	
       	@Override
       	protected FSMDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTOP"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:73:1: entryRuleTOP returns [EObject current=null] : iv_ruleTOP= ruleTOP EOF ;
    public final EObject entryRuleTOP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTOP = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:74:2: (iv_ruleTOP= ruleTOP EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:75:2: iv_ruleTOP= ruleTOP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTOPRule()); 
            }
            pushFollow(FOLLOW_ruleTOP_in_entryRuleTOP81);
            iv_ruleTOP=ruleTOP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTOP; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOP91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTOP"


    // $ANTLR start "ruleTOP"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:82:1: ruleTOP returns [EObject current=null] : (this_FSM_0= ruleFSM | this_CommandStmt_1= ruleCommandStmt | this_PredicateStmt_2= rulePredicateStmt ) ;
    public final EObject ruleTOP() throws RecognitionException {
        EObject current = null;

        EObject this_FSM_0 = null;

        EObject this_CommandStmt_1 = null;

        EObject this_PredicateStmt_2 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:85:28: ( (this_FSM_0= ruleFSM | this_CommandStmt_1= ruleCommandStmt | this_PredicateStmt_2= rulePredicateStmt ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:86:1: (this_FSM_0= ruleFSM | this_CommandStmt_1= ruleCommandStmt | this_PredicateStmt_2= rulePredicateStmt )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:86:1: (this_FSM_0= ruleFSM | this_CommandStmt_1= ruleCommandStmt | this_PredicateStmt_2= rulePredicateStmt )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:87:2: this_FSM_0= ruleFSM
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTOPAccess().getFSMParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFSM_in_ruleTOP141);
                    this_FSM_0=ruleFSM();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FSM_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:100:2: this_CommandStmt_1= ruleCommandStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTOPAccess().getCommandStmtParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommandStmt_in_ruleTOP171);
                    this_CommandStmt_1=ruleCommandStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommandStmt_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:113:2: this_PredicateStmt_2= rulePredicateStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTOPAccess().getPredicateStmtParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePredicateStmt_in_ruleTOP201);
                    this_PredicateStmt_2=rulePredicateStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PredicateStmt_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTOP"


    // $ANTLR start "entryRuleCommandStmt"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:132:1: entryRuleCommandStmt returns [EObject current=null] : iv_ruleCommandStmt= ruleCommandStmt EOF ;
    public final EObject entryRuleCommandStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandStmt = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:133:2: (iv_ruleCommandStmt= ruleCommandStmt EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:134:2: iv_ruleCommandStmt= ruleCommandStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandStmtRule()); 
            }
            pushFollow(FOLLOW_ruleCommandStmt_in_entryRuleCommandStmt236);
            iv_ruleCommandStmt=ruleCommandStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandStmt246); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandStmt"


    // $ANTLR start "ruleCommandStmt"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:141:1: ruleCommandStmt returns [EObject current=null] : (otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' otherlv_5= '[' ( (lv_out_6_0= ruleShortOutput ) ) (otherlv_7= ',' ( (lv_out_8_0= ruleShortOutput ) ) )* otherlv_9= ']' ( (lv_commands_10_0= ruleCommand ) ) ( (lv_commands_11_0= ruleCommand ) )* ) ;
    public final EObject ruleCommandStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_in_1_0 = null;

        EObject lv_in_3_0 = null;

        EObject lv_out_6_0 = null;

        EObject lv_out_8_0 = null;

        EObject lv_commands_10_0 = null;

        EObject lv_commands_11_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:144:28: ( (otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' otherlv_5= '[' ( (lv_out_6_0= ruleShortOutput ) ) (otherlv_7= ',' ( (lv_out_8_0= ruleShortOutput ) ) )* otherlv_9= ']' ( (lv_commands_10_0= ruleCommand ) ) ( (lv_commands_11_0= ruleCommand ) )* ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:145:1: (otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' otherlv_5= '[' ( (lv_out_6_0= ruleShortOutput ) ) (otherlv_7= ',' ( (lv_out_8_0= ruleShortOutput ) ) )* otherlv_9= ']' ( (lv_commands_10_0= ruleCommand ) ) ( (lv_commands_11_0= ruleCommand ) )* )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:145:1: (otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' otherlv_5= '[' ( (lv_out_6_0= ruleShortOutput ) ) (otherlv_7= ',' ( (lv_out_8_0= ruleShortOutput ) ) )* otherlv_9= ']' ( (lv_commands_10_0= ruleCommand ) ) ( (lv_commands_11_0= ruleCommand ) )* )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:145:3: otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' otherlv_5= '[' ( (lv_out_6_0= ruleShortOutput ) ) (otherlv_7= ',' ( (lv_out_8_0= ruleShortOutput ) ) )* otherlv_9= ']' ( (lv_commands_10_0= ruleCommand ) ) ( (lv_commands_11_0= ruleCommand ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleCommandStmt283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCommandStmtAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:149:1: ( (lv_in_1_0= ruleShortInput ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:150:1: (lv_in_1_0= ruleShortInput )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:150:1: (lv_in_1_0= ruleShortInput )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:151:3: lv_in_1_0= ruleShortInput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandStmtAccess().getInShortInputParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleShortInput_in_ruleCommandStmt304);
            lv_in_1_0=ruleShortInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandStmtRule());
              	        }
                     		add(
                     			current, 
                     			"in",
                      		lv_in_1_0, 
                      		"ShortInput");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:167:2: (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:167:4: otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleCommandStmt317); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCommandStmtAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:171:1: ( (lv_in_3_0= ruleShortInput ) )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:172:1: (lv_in_3_0= ruleShortInput )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:172:1: (lv_in_3_0= ruleShortInput )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:173:3: lv_in_3_0= ruleShortInput
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandStmtAccess().getInShortInputParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShortInput_in_ruleCommandStmt338);
            	    lv_in_3_0=ruleShortInput();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommandStmtRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"in",
            	              		lv_in_3_0, 
            	              		"ShortInput");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCommandStmt352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCommandStmtAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleCommandStmt364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCommandStmtAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:197:1: ( (lv_out_6_0= ruleShortOutput ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:198:1: (lv_out_6_0= ruleShortOutput )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:198:1: (lv_out_6_0= ruleShortOutput )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:199:3: lv_out_6_0= ruleShortOutput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandStmtAccess().getOutShortOutputParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleShortOutput_in_ruleCommandStmt385);
            lv_out_6_0=ruleShortOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandStmtRule());
              	        }
                     		add(
                     			current, 
                     			"out",
                      		lv_out_6_0, 
                      		"ShortOutput");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:215:2: (otherlv_7= ',' ( (lv_out_8_0= ruleShortOutput ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:215:4: otherlv_7= ',' ( (lv_out_8_0= ruleShortOutput ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleCommandStmt398); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getCommandStmtAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:219:1: ( (lv_out_8_0= ruleShortOutput ) )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:220:1: (lv_out_8_0= ruleShortOutput )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:220:1: (lv_out_8_0= ruleShortOutput )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:221:3: lv_out_8_0= ruleShortOutput
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandStmtAccess().getOutShortOutputParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShortOutput_in_ruleCommandStmt419);
            	    lv_out_8_0=ruleShortOutput();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommandStmtRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"out",
            	              		lv_out_8_0, 
            	              		"ShortOutput");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCommandStmt433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCommandStmtAccess().getRightSquareBracketKeyword_7());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:241:1: ( (lv_commands_10_0= ruleCommand ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:242:1: (lv_commands_10_0= ruleCommand )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:242:1: (lv_commands_10_0= ruleCommand )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:243:3: lv_commands_10_0= ruleCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandStmtAccess().getCommandsCommandParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommand_in_ruleCommandStmt454);
            lv_commands_10_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandStmtRule());
              	        }
                     		add(
                     			current, 
                     			"commands",
                      		lv_commands_10_0, 
                      		"Command");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:259:2: ( (lv_commands_11_0= ruleCommand ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:260:1: (lv_commands_11_0= ruleCommand )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:260:1: (lv_commands_11_0= ruleCommand )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:261:3: lv_commands_11_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandStmtAccess().getCommandsCommandParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommand_in_ruleCommandStmt475);
            	    lv_commands_11_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommandStmtRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"commands",
            	              		lv_commands_11_0, 
            	              		"Command");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandStmt"


    // $ANTLR start "entryRulePredicateStmt"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:285:1: entryRulePredicateStmt returns [EObject current=null] : iv_rulePredicateStmt= rulePredicateStmt EOF ;
    public final EObject entryRulePredicateStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateStmt = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:286:2: (iv_rulePredicateStmt= rulePredicateStmt EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:287:2: iv_rulePredicateStmt= rulePredicateStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateStmtRule()); 
            }
            pushFollow(FOLLOW_rulePredicateStmt_in_entryRulePredicateStmt512);
            iv_rulePredicateStmt=rulePredicateStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateStmt522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateStmt"


    // $ANTLR start "rulePredicateStmt"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:294:1: rulePredicateStmt returns [EObject current=null] : (otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' ( (lv_predicate_5_0= rulePredicate ) ) otherlv_6= ';' ) ;
    public final EObject rulePredicateStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_in_1_0 = null;

        EObject lv_in_3_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:297:28: ( (otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' ( (lv_predicate_5_0= rulePredicate ) ) otherlv_6= ';' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:298:1: (otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' ( (lv_predicate_5_0= rulePredicate ) ) otherlv_6= ';' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:298:1: (otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' ( (lv_predicate_5_0= rulePredicate ) ) otherlv_6= ';' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:298:3: otherlv_0= '[' ( (lv_in_1_0= ruleShortInput ) ) (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )* otherlv_4= ']' ( (lv_predicate_5_0= rulePredicate ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePredicateStmt559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPredicateStmtAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:302:1: ( (lv_in_1_0= ruleShortInput ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:303:1: (lv_in_1_0= ruleShortInput )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:303:1: (lv_in_1_0= ruleShortInput )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:304:3: lv_in_1_0= ruleShortInput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPredicateStmtAccess().getInShortInputParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleShortInput_in_rulePredicateStmt580);
            lv_in_1_0=ruleShortInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPredicateStmtRule());
              	        }
                     		add(
                     			current, 
                     			"in",
                      		lv_in_1_0, 
                      		"ShortInput");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:320:2: (otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:320:4: otherlv_2= ',' ( (lv_in_3_0= ruleShortInput ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePredicateStmt593); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPredicateStmtAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:324:1: ( (lv_in_3_0= ruleShortInput ) )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:325:1: (lv_in_3_0= ruleShortInput )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:325:1: (lv_in_3_0= ruleShortInput )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:326:3: lv_in_3_0= ruleShortInput
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPredicateStmtAccess().getInShortInputParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShortInput_in_rulePredicateStmt614);
            	    lv_in_3_0=ruleShortInput();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPredicateStmtRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"in",
            	              		lv_in_3_0, 
            	              		"ShortInput");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePredicateStmt628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPredicateStmtAccess().getRightSquareBracketKeyword_3());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:346:1: ( (lv_predicate_5_0= rulePredicate ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:347:1: (lv_predicate_5_0= rulePredicate )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:347:1: (lv_predicate_5_0= rulePredicate )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:348:3: lv_predicate_5_0= rulePredicate
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPredicateStmtAccess().getPredicatePredicateParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePredicate_in_rulePredicateStmt649);
            lv_predicate_5_0=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPredicateStmtRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"Predicate");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePredicateStmt661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPredicateStmtAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateStmt"


    // $ANTLR start "entryRuleShortInput"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:376:1: entryRuleShortInput returns [EObject current=null] : iv_ruleShortInput= ruleShortInput EOF ;
    public final EObject entryRuleShortInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortInput = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:377:2: (iv_ruleShortInput= ruleShortInput EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:378:2: iv_ruleShortInput= ruleShortInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShortInputRule()); 
            }
            pushFollow(FOLLOW_ruleShortInput_in_entryRuleShortInput697);
            iv_ruleShortInput=ruleShortInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShortInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortInput707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShortInput"


    // $ANTLR start "ruleShortInput"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:385:1: ruleShortInput returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleShortInput() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:388:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:389:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:389:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:389:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:389:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:390:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getShortInputAccess().getInputPortAction_0(),
                          current);
                  
            }

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:398:2: ( (lv_name_1_0= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:399:1: (lv_name_1_0= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:399:1: (lv_name_1_0= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:400:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleShortInput761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getShortInputAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getShortInputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleShortInput778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getShortInputAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:420:1: ( (lv_width_3_0= RULE_INT ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:421:1: (lv_width_3_0= RULE_INT )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:421:1: (lv_width_3_0= RULE_INT )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:422:3: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleShortInput795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_width_3_0, grammarAccess.getShortInputAccess().getWidthINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getShortInputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"width",
                      		lv_width_3_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleShortInput812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getShortInputAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShortInput"


    // $ANTLR start "entryRuleShortOutput"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:450:1: entryRuleShortOutput returns [EObject current=null] : iv_ruleShortOutput= ruleShortOutput EOF ;
    public final EObject entryRuleShortOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortOutput = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:451:2: (iv_ruleShortOutput= ruleShortOutput EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:452:2: iv_ruleShortOutput= ruleShortOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShortOutputRule()); 
            }
            pushFollow(FOLLOW_ruleShortOutput_in_entryRuleShortOutput848);
            iv_ruleShortOutput=ruleShortOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShortOutput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortOutput858); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShortOutput"


    // $ANTLR start "ruleShortOutput"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:459:1: ruleShortOutput returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleShortOutput() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:462:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:463:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:463:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:463:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:463:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:464:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getShortOutputAccess().getOutputPortAction_0(),
                          current);
                  
            }

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:472:2: ( (lv_name_1_0= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:473:1: (lv_name_1_0= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:473:1: (lv_name_1_0= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:474:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleShortOutput912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getShortOutputAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getShortOutputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleShortOutput929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getShortOutputAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:494:1: ( (lv_width_3_0= RULE_INT ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:495:1: (lv_width_3_0= RULE_INT )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:495:1: (lv_width_3_0= RULE_INT )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:496:3: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleShortOutput946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_width_3_0, grammarAccess.getShortOutputAccess().getWidthINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getShortOutputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"width",
                      		lv_width_3_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleShortOutput963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getShortOutputAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShortOutput"


    // $ANTLR start "entryRuleFSM"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:524:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:525:2: (iv_ruleFSM= ruleFSM EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:526:2: iv_ruleFSM= ruleFSM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFSMRule()); 
            }
            pushFollow(FOLLOW_ruleFSM_in_entryRuleFSM999);
            iv_ruleFSM=ruleFSM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFSM; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFSM1009); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:533:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'fsm' ( (lv_name_2_0= RULE_ID ) ) ( (lv_layout_3_0= ruleLayoutInfo ) ) otherlv_4= '{' ( ( (lv_in_5_0= ruleInput ) ) | ( (lv_out_6_0= ruleOutput ) ) )+ (otherlv_7= 'codeWidth' otherlv_8= '=' ( (lv_width_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'reset' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? ( (lv_states_15_0= ruleState ) )* otherlv_16= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_width_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_layout_3_0 = null;

        EObject lv_in_5_0 = null;

        EObject lv_out_6_0 = null;

        EObject lv_states_15_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:536:28: ( ( () otherlv_1= 'fsm' ( (lv_name_2_0= RULE_ID ) ) ( (lv_layout_3_0= ruleLayoutInfo ) ) otherlv_4= '{' ( ( (lv_in_5_0= ruleInput ) ) | ( (lv_out_6_0= ruleOutput ) ) )+ (otherlv_7= 'codeWidth' otherlv_8= '=' ( (lv_width_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'reset' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? ( (lv_states_15_0= ruleState ) )* otherlv_16= '}' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:537:1: ( () otherlv_1= 'fsm' ( (lv_name_2_0= RULE_ID ) ) ( (lv_layout_3_0= ruleLayoutInfo ) ) otherlv_4= '{' ( ( (lv_in_5_0= ruleInput ) ) | ( (lv_out_6_0= ruleOutput ) ) )+ (otherlv_7= 'codeWidth' otherlv_8= '=' ( (lv_width_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'reset' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? ( (lv_states_15_0= ruleState ) )* otherlv_16= '}' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:537:1: ( () otherlv_1= 'fsm' ( (lv_name_2_0= RULE_ID ) ) ( (lv_layout_3_0= ruleLayoutInfo ) ) otherlv_4= '{' ( ( (lv_in_5_0= ruleInput ) ) | ( (lv_out_6_0= ruleOutput ) ) )+ (otherlv_7= 'codeWidth' otherlv_8= '=' ( (lv_width_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'reset' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? ( (lv_states_15_0= ruleState ) )* otherlv_16= '}' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:537:2: () otherlv_1= 'fsm' ( (lv_name_2_0= RULE_ID ) ) ( (lv_layout_3_0= ruleLayoutInfo ) ) otherlv_4= '{' ( ( (lv_in_5_0= ruleInput ) ) | ( (lv_out_6_0= ruleOutput ) ) )+ (otherlv_7= 'codeWidth' otherlv_8= '=' ( (lv_width_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'reset' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? ( (lv_states_15_0= ruleState ) )* otherlv_16= '}'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:537:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:538:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFSMAccess().getFSMAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleFSM1058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFsmKeyword_1());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:550:1: ( (lv_name_2_0= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:551:1: (lv_name_2_0= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:551:1: (lv_name_2_0= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:552:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFSM1075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getFSMAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFSMRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:568:2: ( (lv_layout_3_0= ruleLayoutInfo ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:569:1: (lv_layout_3_0= ruleLayoutInfo )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:569:1: (lv_layout_3_0= ruleLayoutInfo )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:570:3: lv_layout_3_0= ruleLayoutInfo
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFSMAccess().getLayoutLayoutInfoParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLayoutInfo_in_ruleFSM1101);
            lv_layout_3_0=ruleLayoutInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFSMRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_3_0, 
                      		"LayoutInfo");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFSM1113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:590:1: ( ( (lv_in_5_0= ruleInput ) ) | ( (lv_out_6_0= ruleOutput ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }
                else if ( (LA6_0==23) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:590:2: ( (lv_in_5_0= ruleInput ) )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:590:2: ( (lv_in_5_0= ruleInput ) )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:591:1: (lv_in_5_0= ruleInput )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:591:1: (lv_in_5_0= ruleInput )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:592:3: lv_in_5_0= ruleInput
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFSMAccess().getInInputParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInput_in_ruleFSM1135);
            	    lv_in_5_0=ruleInput();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFSMRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"in",
            	              		lv_in_5_0, 
            	              		"Input");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:609:6: ( (lv_out_6_0= ruleOutput ) )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:609:6: ( (lv_out_6_0= ruleOutput ) )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:610:1: (lv_out_6_0= ruleOutput )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:610:1: (lv_out_6_0= ruleOutput )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:611:3: lv_out_6_0= ruleOutput
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFSMAccess().getOutOutputParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOutput_in_ruleFSM1162);
            	    lv_out_6_0=ruleOutput();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFSMRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"out",
            	              		lv_out_6_0, 
            	              		"Output");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:627:4: (otherlv_7= 'codeWidth' otherlv_8= '=' ( (lv_width_9_0= RULE_INT ) ) otherlv_10= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:627:6: otherlv_7= 'codeWidth' otherlv_8= '=' ( (lv_width_9_0= RULE_INT ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleFSM1177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getCodeWidthKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleFSM1189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFSMAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:635:1: ( (lv_width_9_0= RULE_INT ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:636:1: (lv_width_9_0= RULE_INT )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:636:1: (lv_width_9_0= RULE_INT )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:637:3: lv_width_9_0= RULE_INT
                    {
                    lv_width_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFSM1206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_width_9_0, grammarAccess.getFSMAccess().getWidthINTTerminalRuleCall_6_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFSMRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"width",
                              		lv_width_9_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleFSM1223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getFSMAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:657:3: (otherlv_11= 'reset' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:657:5: otherlv_11= 'reset' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleFSM1238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getFSMAccess().getResetKeyword_7_0());
                          
                    }
                    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleFSM1250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getFSMAccess().getEqualsSignKeyword_7_1());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:665:1: ( (otherlv_13= RULE_ID ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:666:1: (otherlv_13= RULE_ID )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:666:1: (otherlv_13= RULE_ID )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:667:3: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFSMRule());
                      	        }
                              
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFSM1274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_13, grammarAccess.getFSMAccess().getStartStateCrossReference_7_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleFSM1286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getFSMAccess().getSemicolonKeyword_7_3());
                          
                    }

                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:685:3: ( (lv_states_15_0= ruleState ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:686:1: (lv_states_15_0= ruleState )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:686:1: (lv_states_15_0= ruleState )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:687:3: lv_states_15_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFSMAccess().getStatesStateParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleFSM1309);
            	    lv_states_15_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFSMRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"states",
            	              		lv_states_15_0, 
            	              		"State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleFSM1322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleInput"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:717:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:718:2: (iv_ruleInput= ruleInput EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:719:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput1360);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput1370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:726:1: ruleInput returns [EObject current=null] : ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_width_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_layout_6_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:729:28: ( ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:730:1: ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:730:1: ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:730:2: () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:730:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:731:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInputAccess().getInputPortAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleInput1419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInKeyword_1());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:743:1: ( (lv_name_2_0= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:744:1: (lv_name_2_0= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:744:1: (lv_name_2_0= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:745:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInput1436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:761:2: (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:761:4: otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleInput1454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_3_0());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:765:1: ( (lv_width_4_0= RULE_INT ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:766:1: (lv_width_4_0= RULE_INT )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:766:1: (lv_width_4_0= RULE_INT )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:767:3: lv_width_4_0= RULE_INT
                    {
                    lv_width_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInput1471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_width_4_0, grammarAccess.getInputAccess().getWidthINTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInputRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"width",
                              		lv_width_4_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInput1488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getRightSquareBracketKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:787:3: ( (lv_layout_6_0= ruleLayoutInfo ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:788:1: (lv_layout_6_0= ruleLayoutInfo )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:788:1: (lv_layout_6_0= ruleLayoutInfo )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:789:3: lv_layout_6_0= ruleLayoutInfo
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputAccess().getLayoutLayoutInfoParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLayoutInfo_in_ruleInput1511);
            lv_layout_6_0=ruleLayoutInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_6_0, 
                      		"LayoutInfo");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInput1523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInputAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:817:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:818:2: (iv_ruleOutput= ruleOutput EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:819:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput1559);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput1569); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:826:1: ruleOutput returns [EObject current=null] : ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_width_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_layout_6_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:829:28: ( ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:830:1: ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:830:1: ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:830:2: () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:830:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:831:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOutputAccess().getOutputPortAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleOutput1618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getOutKeyword_1());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:843:1: ( (lv_name_2_0= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:844:1: (lv_name_2_0= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:844:1: (lv_name_2_0= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:845:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutput1635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getOutputAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:861:2: (otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:861:4: otherlv_3= '[' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleOutput1653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_3_0());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:865:1: ( (lv_width_4_0= RULE_INT ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:866:1: (lv_width_4_0= RULE_INT )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:866:1: (lv_width_4_0= RULE_INT )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:867:3: lv_width_4_0= RULE_INT
                    {
                    lv_width_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOutput1670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_width_4_0, grammarAccess.getOutputAccess().getWidthINTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOutputRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"width",
                              		lv_width_4_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleOutput1687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getRightSquareBracketKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:887:3: ( (lv_layout_6_0= ruleLayoutInfo ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:888:1: (lv_layout_6_0= ruleLayoutInfo )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:888:1: (lv_layout_6_0= ruleLayoutInfo )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:889:3: lv_layout_6_0= ruleLayoutInfo
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputAccess().getLayoutLayoutInfoParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLayoutInfo_in_ruleOutput1710);
            lv_layout_6_0=ruleLayoutInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutputRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_6_0, 
                      		"LayoutInfo");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleOutput1722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOutputAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommandList"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:917:1: entryRuleCommandList returns [EObject current=null] : iv_ruleCommandList= ruleCommandList EOF ;
    public final EObject entryRuleCommandList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandList = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:918:2: (iv_ruleCommandList= ruleCommandList EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:919:2: iv_ruleCommandList= ruleCommandList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandListRule()); 
            }
            pushFollow(FOLLOW_ruleCommandList_in_entryRuleCommandList1758);
            iv_ruleCommandList=ruleCommandList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandList1768); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandList"


    // $ANTLR start "ruleCommandList"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:926:1: ruleCommandList returns [EObject current=null] : ( () (otherlv_1= 'commands' ( (lv_layout_2_0= ruleLayoutInfo ) ) otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleCommandList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_layout_2_0 = null;

        EObject lv_commands_4_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:929:28: ( ( () (otherlv_1= 'commands' ( (lv_layout_2_0= ruleLayoutInfo ) ) otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' )? ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:930:1: ( () (otherlv_1= 'commands' ( (lv_layout_2_0= ruleLayoutInfo ) ) otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' )? )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:930:1: ( () (otherlv_1= 'commands' ( (lv_layout_2_0= ruleLayoutInfo ) ) otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' )? )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:930:2: () (otherlv_1= 'commands' ( (lv_layout_2_0= ruleLayoutInfo ) ) otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' )?
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:930:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:931:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommandListAccess().getCommandListAction_0(),
                          current);
                  
            }

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:939:2: (otherlv_1= 'commands' ( (lv_layout_2_0= ruleLayoutInfo ) ) otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:939:4: otherlv_1= 'commands' ( (lv_layout_2_0= ruleLayoutInfo ) ) otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCommandList1818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCommandListAccess().getCommandsKeyword_1_0());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:943:1: ( (lv_layout_2_0= ruleLayoutInfo ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:944:1: (lv_layout_2_0= ruleLayoutInfo )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:944:1: (lv_layout_2_0= ruleLayoutInfo )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:945:3: lv_layout_2_0= ruleLayoutInfo
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandListAccess().getLayoutLayoutInfoParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLayoutInfo_in_ruleCommandList1839);
                    lv_layout_2_0=ruleLayoutInfo();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandListRule());
                      	        }
                             		set(
                             			current, 
                             			"layout",
                              		lv_layout_2_0, 
                              		"LayoutInfo");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleCommandList1851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCommandListAccess().getLeftCurlyBracketKeyword_1_2());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:965:1: ( (lv_commands_4_0= ruleCommand ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:966:1: (lv_commands_4_0= ruleCommand )
                    	    {
                    	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:966:1: (lv_commands_4_0= ruleCommand )
                    	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:967:3: lv_commands_4_0= ruleCommand
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCommandListAccess().getCommandsCommandParserRuleCall_1_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleCommandList1872);
                    	    lv_commands_4_0=ruleCommand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCommandListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"commands",
                    	              		lv_commands_4_0, 
                    	              		"Command");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCommandList1885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCommandListAccess().getRightCurlyBracketKeyword_1_4());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandList"


    // $ANTLR start "entryRuleLayoutInfo"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:995:1: entryRuleLayoutInfo returns [EObject current=null] : iv_ruleLayoutInfo= ruleLayoutInfo EOF ;
    public final EObject entryRuleLayoutInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutInfo = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:996:2: (iv_ruleLayoutInfo= ruleLayoutInfo EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:997:2: iv_ruleLayoutInfo= ruleLayoutInfo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLayoutInfoRule()); 
            }
            pushFollow(FOLLOW_ruleLayoutInfo_in_entryRuleLayoutInfo1923);
            iv_ruleLayoutInfo=ruleLayoutInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLayoutInfo; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutInfo1933); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayoutInfo"


    // $ANTLR start "ruleLayoutInfo"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1004:1: ruleLayoutInfo returns [EObject current=null] : ( () (otherlv_1= '@[' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) ) )? otherlv_9= ']' )? ) ;
    public final EObject ruleLayoutInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;
        Token lv_width_6_0=null;
        Token otherlv_7=null;
        Token lv_height_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1007:28: ( ( () (otherlv_1= '@[' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) ) )? otherlv_9= ']' )? ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1008:1: ( () (otherlv_1= '@[' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) ) )? otherlv_9= ']' )? )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1008:1: ( () (otherlv_1= '@[' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) ) )? otherlv_9= ']' )? )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1008:2: () (otherlv_1= '@[' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) ) )? otherlv_9= ']' )?
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1008:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1009:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLayoutInfoAccess().getLayoutInfoAction_0(),
                          current);
                  
            }

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1017:2: (otherlv_1= '@[' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) ) )? otherlv_9= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1017:4: otherlv_1= '@[' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) ) )? otherlv_9= ']'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLayoutInfo1983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLayoutInfoAccess().getCommercialAtLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1021:1: ( (lv_x_2_0= RULE_INT ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1022:1: (lv_x_2_0= RULE_INT )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1022:1: (lv_x_2_0= RULE_INT )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1023:3: lv_x_2_0= RULE_INT
                    {
                    lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLayoutInfo2000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_x_2_0, grammarAccess.getLayoutInfoAccess().getXINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLayoutInfoRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"x",
                              		lv_x_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleLayoutInfo2017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getLayoutInfoAccess().getCommaKeyword_1_2());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1043:1: ( (lv_y_4_0= RULE_INT ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1044:1: (lv_y_4_0= RULE_INT )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1044:1: (lv_y_4_0= RULE_INT )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1045:3: lv_y_4_0= RULE_INT
                    {
                    lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLayoutInfo2034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_y_4_0, grammarAccess.getLayoutInfoAccess().getYINTTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLayoutInfoRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"y",
                              		lv_y_4_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1061:2: (otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==13) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1061:4: otherlv_5= ',' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_height_8_0= RULE_INT ) )
                            {
                            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleLayoutInfo2052); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getLayoutInfoAccess().getCommaKeyword_1_4_0());
                                  
                            }
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1065:1: ( (lv_width_6_0= RULE_INT ) )
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1066:1: (lv_width_6_0= RULE_INT )
                            {
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1066:1: (lv_width_6_0= RULE_INT )
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1067:3: lv_width_6_0= RULE_INT
                            {
                            lv_width_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLayoutInfo2069); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_width_6_0, grammarAccess.getLayoutInfoAccess().getWidthINTTerminalRuleCall_1_4_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLayoutInfoRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"width",
                                      		lv_width_6_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }

                            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleLayoutInfo2086); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getLayoutInfoAccess().getCommaKeyword_1_4_2());
                                  
                            }
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1087:1: ( (lv_height_8_0= RULE_INT ) )
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1088:1: (lv_height_8_0= RULE_INT )
                            {
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1088:1: (lv_height_8_0= RULE_INT )
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1089:3: lv_height_8_0= RULE_INT
                            {
                            lv_height_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLayoutInfo2103); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_height_8_0, grammarAccess.getLayoutInfoAccess().getHeightINTTerminalRuleCall_1_4_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLayoutInfoRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"height",
                                      		lv_height_8_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleLayoutInfo2122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getLayoutInfoAccess().getRightSquareBracketKeyword_1_5());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutInfo"


    // $ANTLR start "entryRuleState"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1117:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1118:2: (iv_ruleState= ruleState EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1119:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState2160);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState2170); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1126:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_code_4_0= RULE_BIN ) ) )? ( (lv_layout_5_0= ruleLayoutInfo ) ) otherlv_6= '{' (otherlv_7= 'code' otherlv_8= '=' ( (lv_code_9_0= RULE_BIN ) ) otherlv_10= ';' )? ( (lv_commandList_11_0= ruleCommandList ) ) (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transition_14_0= ruleTransition ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_code_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_code_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_layout_5_0 = null;

        EObject lv_commandList_11_0 = null;

        EObject lv_transition_14_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1129:28: ( ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_code_4_0= RULE_BIN ) ) )? ( (lv_layout_5_0= ruleLayoutInfo ) ) otherlv_6= '{' (otherlv_7= 'code' otherlv_8= '=' ( (lv_code_9_0= RULE_BIN ) ) otherlv_10= ';' )? ( (lv_commandList_11_0= ruleCommandList ) ) (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transition_14_0= ruleTransition ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1130:1: ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_code_4_0= RULE_BIN ) ) )? ( (lv_layout_5_0= ruleLayoutInfo ) ) otherlv_6= '{' (otherlv_7= 'code' otherlv_8= '=' ( (lv_code_9_0= RULE_BIN ) ) otherlv_10= ';' )? ( (lv_commandList_11_0= ruleCommandList ) ) (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transition_14_0= ruleTransition ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1130:1: ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_code_4_0= RULE_BIN ) ) )? ( (lv_layout_5_0= ruleLayoutInfo ) ) otherlv_6= '{' (otherlv_7= 'code' otherlv_8= '=' ( (lv_code_9_0= RULE_BIN ) ) otherlv_10= ';' )? ( (lv_commandList_11_0= ruleCommandList ) ) (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transition_14_0= ruleTransition ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1130:2: () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_code_4_0= RULE_BIN ) ) )? ( (lv_layout_5_0= ruleLayoutInfo ) ) otherlv_6= '{' (otherlv_7= 'code' otherlv_8= '=' ( (lv_code_9_0= RULE_BIN ) ) otherlv_10= ';' )? ( (lv_commandList_11_0= ruleCommandList ) ) (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transition_14_0= ruleTransition ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1130:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1131:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateAccess().getStateAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleState2219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1143:1: ( (lv_name_2_0= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1144:1: (lv_name_2_0= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1144:1: (lv_name_2_0= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1145:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState2236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1161:2: (otherlv_3= '=' ( (lv_code_4_0= RULE_BIN ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1161:4: otherlv_3= '=' ( (lv_code_4_0= RULE_BIN ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleState2254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1165:1: ( (lv_code_4_0= RULE_BIN ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1166:1: (lv_code_4_0= RULE_BIN )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1166:1: (lv_code_4_0= RULE_BIN )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1167:3: lv_code_4_0= RULE_BIN
                    {
                    lv_code_4_0=(Token)match(input,RULE_BIN,FOLLOW_RULE_BIN_in_ruleState2271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_code_4_0, grammarAccess.getStateAccess().getCodeBINTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"code",
                              		lv_code_4_0, 
                              		"BIN");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1183:4: ( (lv_layout_5_0= ruleLayoutInfo ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1184:1: (lv_layout_5_0= ruleLayoutInfo )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1184:1: (lv_layout_5_0= ruleLayoutInfo )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1185:3: lv_layout_5_0= ruleLayoutInfo
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateAccess().getLayoutLayoutInfoParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLayoutInfo_in_ruleState2299);
            lv_layout_5_0=ruleLayoutInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_5_0, 
                      		"LayoutInfo");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleState2311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1205:1: (otherlv_7= 'code' otherlv_8= '=' ( (lv_code_9_0= RULE_BIN ) ) otherlv_10= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1205:3: otherlv_7= 'code' otherlv_8= '=' ( (lv_code_9_0= RULE_BIN ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleState2324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCodeKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleState2336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getEqualsSignKeyword_6_1());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1213:1: ( (lv_code_9_0= RULE_BIN ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1214:1: (lv_code_9_0= RULE_BIN )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1214:1: (lv_code_9_0= RULE_BIN )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1215:3: lv_code_9_0= RULE_BIN
                    {
                    lv_code_9_0=(Token)match(input,RULE_BIN,FOLLOW_RULE_BIN_in_ruleState2353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_code_9_0, grammarAccess.getStateAccess().getCodeBINTerminalRuleCall_6_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"code",
                              		lv_code_9_0, 
                              		"BIN");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleState2370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getSemicolonKeyword_6_3());
                          
                    }

                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1235:3: ( (lv_commandList_11_0= ruleCommandList ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1236:1: (lv_commandList_11_0= ruleCommandList )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1236:1: (lv_commandList_11_0= ruleCommandList )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1237:3: lv_commandList_11_0= ruleCommandList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateAccess().getCommandListCommandListParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommandList_in_ruleState2393);
            lv_commandList_11_0=ruleCommandList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateRule());
              	        }
                     		set(
                     			current, 
                     			"commandList",
                      		lv_commandList_11_0, 
                      		"CommandList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1253:2: (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transition_14_0= ruleTransition ) )* otherlv_15= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1253:4: otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transition_14_0= ruleTransition ) )* otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleState2406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStateAccess().getTransitionsKeyword_8_0());
                          
                    }
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleState2418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_8_1());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1261:1: ( (lv_transition_14_0= ruleTransition ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||(LA18_0>=29 && LA18_0<=30)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1262:1: (lv_transition_14_0= ruleTransition )
                    	    {
                    	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1262:1: (lv_transition_14_0= ruleTransition )
                    	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1263:3: lv_transition_14_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_8_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleState2439);
                    	    lv_transition_14_0=ruleTransition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"transition",
                    	              		lv_transition_14_0, 
                    	              		"Transition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleState2452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleState2466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1295:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1296:2: (iv_ruleTransition= ruleTransition EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1297:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2502);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2512); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1304:1: ruleTransition returns [EObject current=null] : ( ( ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '->' ) | otherlv_2= 'goto' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'when' ( (lv_predicate_5_0= rulePredicate ) ) )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_predicate_5_0 = null;

        EObject lv_layout_6_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1307:28: ( ( ( ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '->' ) | otherlv_2= 'goto' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'when' ( (lv_predicate_5_0= rulePredicate ) ) )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1308:1: ( ( ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '->' ) | otherlv_2= 'goto' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'when' ( (lv_predicate_5_0= rulePredicate ) ) )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1308:1: ( ( ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '->' ) | otherlv_2= 'goto' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'when' ( (lv_predicate_5_0= rulePredicate ) ) )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1308:2: ( ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '->' ) | otherlv_2= 'goto' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'when' ( (lv_predicate_5_0= rulePredicate ) ) )? ( (lv_layout_6_0= ruleLayoutInfo ) ) otherlv_7= ';'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1308:2: ( ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '->' ) | otherlv_2= 'goto' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==29) ) {
                alt21=1;
            }
            else if ( (LA21_0==30) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1308:3: ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '->' )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1308:3: ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '->' )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1308:4: ( (otherlv_0= RULE_ID ) )? otherlv_1= '->'
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1308:4: ( (otherlv_0= RULE_ID ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1309:1: (otherlv_0= RULE_ID )
                            {
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1309:1: (otherlv_0= RULE_ID )
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1310:3: otherlv_0= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getTransitionRule());
                              	        }
                                      
                            }
                            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition2563); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getSrcStateCrossReference_0_0_0_0()); 
                              	
                            }

                            }


                            }
                            break;

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleTransition2576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1329:7: otherlv_2= 'goto'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleTransition2595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getGotoKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1333:2: ( (otherlv_3= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1334:1: (otherlv_3= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1334:1: (otherlv_3= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1335:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition2620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getDstStateCrossReference_1_0()); 
              	
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1349:2: (otherlv_4= 'when' ( (lv_predicate_5_0= rulePredicate ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1349:4: otherlv_4= 'when' ( (lv_predicate_5_0= rulePredicate ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleTransition2633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getWhenKeyword_2_0());
                          
                    }
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1353:1: ( (lv_predicate_5_0= rulePredicate ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1354:1: (lv_predicate_5_0= rulePredicate )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1354:1: (lv_predicate_5_0= rulePredicate )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1355:3: lv_predicate_5_0= rulePredicate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getPredicatePredicateParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePredicate_in_ruleTransition2654);
                    lv_predicate_5_0=rulePredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"predicate",
                              		lv_predicate_5_0, 
                              		"Predicate");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1371:4: ( (lv_layout_6_0= ruleLayoutInfo ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1372:1: (lv_layout_6_0= ruleLayoutInfo )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1372:1: (lv_layout_6_0= ruleLayoutInfo )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1373:3: lv_layout_6_0= ruleLayoutInfo
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getLayoutLayoutInfoParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLayoutInfo_in_ruleTransition2677);
            lv_layout_6_0=ruleLayoutInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_6_0, 
                      		"LayoutInfo");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleTransition2689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleCommand"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1401:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1402:2: (iv_ruleCommand= ruleCommand EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1403:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand2725);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand2735); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1410:1: ruleCommand returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleOr ) ) otherlv_3= ';' ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1413:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleOr ) ) otherlv_3= ';' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1414:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleOr ) ) otherlv_3= ';' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1414:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleOr ) ) otherlv_3= ';' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1414:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleOr ) ) otherlv_3= ';'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1414:2: ( (otherlv_0= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1415:1: (otherlv_0= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1415:1: (otherlv_0= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1416:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCommandRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand2784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getNameOutputPortCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleCommand2796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getEqualsSignKeyword_1());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1434:1: ( (lv_value_2_0= ruleOr ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1435:1: (lv_value_2_0= ruleOr )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1435:1: (lv_value_2_0= ruleOr )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1436:3: lv_value_2_0= ruleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandAccess().getValueOrParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOr_in_ruleCommand2817);
            lv_value_2_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Or");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCommand2829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleRef"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1464:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1465:2: (iv_ruleRef= ruleRef EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1466:2: iv_ruleRef= ruleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefRule()); 
            }
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef2865);
            iv_ruleRef=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef2875); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1473:1: ruleRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_range_2_0= ruleRange ) )? ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1476:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_range_2_0= ruleRange ) )? ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1477:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_range_2_0= ruleRange ) )? )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1477:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_range_2_0= ruleRange ) )? )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1477:2: () ( (otherlv_1= RULE_ID ) ) ( (lv_range_2_0= ruleRange ) )?
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1477:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1478:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRefAccess().getPortRefAction_0(),
                          current);
                  
            }

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1486:2: ( (otherlv_1= RULE_ID ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1487:1: (otherlv_1= RULE_ID )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1487:1: (otherlv_1= RULE_ID )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1488:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRefRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef2936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getRefAccess().getPortPortCrossReference_1_0()); 
              	
            }

            }


            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1502:2: ( (lv_range_2_0= ruleRange ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1503:1: (lv_range_2_0= ruleRange )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1503:1: (lv_range_2_0= ruleRange )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1504:3: lv_range_2_0= ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRefAccess().getRangeRangeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRange_in_ruleRef2957);
                    lv_range_2_0=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRefRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_2_0, 
                              		"Range");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleRange"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1528:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1529:2: (iv_ruleRange= ruleRange EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1530:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange2994);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3004); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1537:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_ub_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_lb_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ub_1_0=null;
        Token otherlv_2=null;
        Token lv_lb_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1540:28: ( (otherlv_0= '[' ( ( (lv_ub_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_lb_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1541:1: (otherlv_0= '[' ( ( (lv_ub_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_lb_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1541:1: (otherlv_0= '[' ( ( (lv_ub_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_lb_3_0= RULE_INT ) ) otherlv_4= ']' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1541:3: otherlv_0= '[' ( ( (lv_ub_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_lb_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleRange3041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1545:1: ( ( (lv_ub_1_0= RULE_INT ) ) otherlv_2= ':' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==32) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1545:2: ( (lv_ub_1_0= RULE_INT ) ) otherlv_2= ':'
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1545:2: ( (lv_ub_1_0= RULE_INT ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1546:1: (lv_ub_1_0= RULE_INT )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1546:1: (lv_ub_1_0= RULE_INT )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1547:3: lv_ub_1_0= RULE_INT
                    {
                    lv_ub_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange3059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ub_1_0, grammarAccess.getRangeAccess().getUbINTTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRangeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ub",
                              		lv_ub_1_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleRange3076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getColonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1567:3: ( (lv_lb_3_0= RULE_INT ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1568:1: (lv_lb_3_0= RULE_INT )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1568:1: (lv_lb_3_0= RULE_INT )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1569:3: lv_lb_3_0= RULE_INT
            {
            lv_lb_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange3095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lb_3_0, grammarAccess.getRangeAccess().getLbINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRangeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lb",
                      		lv_lb_3_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleRange3112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRulePredicate"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1597:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1598:2: (iv_rulePredicate= rulePredicate EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1599:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate3148);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate3158); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1606:1: rulePredicate returns [EObject current=null] : (this_Default_0= ruleDefault | this_Or_1= ruleOr ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_Default_0 = null;

        EObject this_Or_1 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1609:28: ( (this_Default_0= ruleDefault | this_Or_1= ruleOr ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1610:1: (this_Default_0= ruleDefault | this_Or_1= ruleOr )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1610:1: (this_Default_0= ruleDefault | this_Or_1= ruleOr )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID||LA25_0==RULE_BIN||LA25_0==38||LA25_0==40) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1611:2: this_Default_0= ruleDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredicateAccess().getDefaultParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefault_in_rulePredicate3208);
                    this_Default_0=ruleDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Default_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1624:2: this_Or_1= ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredicateAccess().getOrParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOr_in_rulePredicate3238);
                    this_Or_1=ruleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Or_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleDefault"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1643:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1644:2: (iv_ruleDefault= ruleDefault EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1645:2: iv_ruleDefault= ruleDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleDefault_in_entryRuleDefault3273);
            iv_ruleDefault=ruleDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefault; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefault3283); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1652:1: ruleDefault returns [EObject current=null] : ( () otherlv_1= 'default' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1655:28: ( ( () otherlv_1= 'default' ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1656:1: ( () otherlv_1= 'default' )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1656:1: ( () otherlv_1= 'default' )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1656:2: () otherlv_1= 'default'
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1656:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1657:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultAccess().getDefaultPredicateAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleDefault3332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getDefaultKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleOr"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1677:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1678:2: (iv_ruleOr= ruleOr EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1679:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr3368);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr3378); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1686:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '+' ( (lv_args_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_args_3_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1689:28: ( (this_And_0= ruleAnd ( () otherlv_2= '+' ( (lv_args_3_0= ruleAnd ) ) )* ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1690:1: (this_And_0= ruleAnd ( () otherlv_2= '+' ( (lv_args_3_0= ruleAnd ) ) )* )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1690:1: (this_And_0= ruleAnd ( () otherlv_2= '+' ( (lv_args_3_0= ruleAnd ) ) )* )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1691:2: this_And_0= ruleAnd ( () otherlv_2= '+' ( (lv_args_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr3428);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1702:1: ( () otherlv_2= '+' ( (lv_args_3_0= ruleAnd ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1702:2: () otherlv_2= '+' ( (lv_args_3_0= ruleAnd ) )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1702:2: ()
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1703:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getOrAccess().getOrExprArgsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleOr3452); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getPlusSignKeyword_1_1());
            	          
            	    }
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1715:1: ( (lv_args_3_0= ruleAnd ) )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1716:1: (lv_args_3_0= ruleAnd )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1716:1: (lv_args_3_0= ruleAnd )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1717:3: lv_args_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getArgsAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr3473);
            	    lv_args_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"args",
            	              		lv_args_3_0, 
            	              		"And");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1741:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1742:2: (iv_ruleAnd= ruleAnd EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1743:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd3511);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd3521); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1750:1: ruleAnd returns [EObject current=null] : (this_Cmp_0= ruleCmp ( () otherlv_2= '.' ( (lv_args_3_0= ruleCmp ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Cmp_0 = null;

        EObject lv_args_3_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1753:28: ( (this_Cmp_0= ruleCmp ( () otherlv_2= '.' ( (lv_args_3_0= ruleCmp ) ) )* ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1754:1: (this_Cmp_0= ruleCmp ( () otherlv_2= '.' ( (lv_args_3_0= ruleCmp ) ) )* )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1754:1: (this_Cmp_0= ruleCmp ( () otherlv_2= '.' ( (lv_args_3_0= ruleCmp ) ) )* )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1755:2: this_Cmp_0= ruleCmp ( () otherlv_2= '.' ( (lv_args_3_0= ruleCmp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getCmpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCmp_in_ruleAnd3571);
            this_Cmp_0=ruleCmp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Cmp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1766:1: ( () otherlv_2= '.' ( (lv_args_3_0= ruleCmp ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1766:2: () otherlv_2= '.' ( (lv_args_3_0= ruleCmp ) )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1766:2: ()
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1767:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getAndAccess().getAndExprArgsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleAnd3595); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1779:1: ( (lv_args_3_0= ruleCmp ) )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1780:1: (lv_args_3_0= ruleCmp )
            	    {
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1780:1: (lv_args_3_0= ruleCmp )
            	    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1781:3: lv_args_3_0= ruleCmp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getArgsCmpParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCmp_in_ruleAnd3616);
            	    lv_args_3_0=ruleCmp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"args",
            	              		lv_args_3_0, 
            	              		"Cmp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleCmp"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1805:1: entryRuleCmp returns [EObject current=null] : iv_ruleCmp= ruleCmp EOF ;
    public final EObject entryRuleCmp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmp = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1806:2: (iv_ruleCmp= ruleCmp EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1807:2: iv_ruleCmp= ruleCmp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCmpRule()); 
            }
            pushFollow(FOLLOW_ruleCmp_in_entryRuleCmp3654);
            iv_ruleCmp=ruleCmp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCmp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmp3664); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmp"


    // $ANTLR start "ruleCmp"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1814:1: ruleCmp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) ) ) ( (lv_args_3_0= rulePrimary ) ) )? ) ;
    public final EObject ruleCmp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_args_3_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1817:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) ) ) ( (lv_args_3_0= rulePrimary ) ) )? ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1818:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) ) ) ( (lv_args_3_0= rulePrimary ) ) )? )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1818:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) ) ) ( (lv_args_3_0= rulePrimary ) ) )? )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1819:2: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) ) ) ( (lv_args_3_0= rulePrimary ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCmpAccess().getPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleCmp3714);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Primary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1830:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) ) ) ( (lv_args_3_0= rulePrimary ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=36 && LA29_0<=37)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1830:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) ) ) ( (lv_args_3_0= rulePrimary ) )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1830:2: ()
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1831:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCmpAccess().getCmpExprArgsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1839:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1840:1: ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1840:1: ( (lv_op_2_1= '==' | lv_op_2_2= '/=' ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1841:1: (lv_op_2_1= '==' | lv_op_2_2= '/=' )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1841:1: (lv_op_2_1= '==' | lv_op_2_2= '/=' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==36) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==37) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1842:3: lv_op_2_1= '=='
                            {
                            lv_op_2_1=(Token)match(input,36,FOLLOW_36_in_ruleCmp3746); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getCmpAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCmpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1854:8: lv_op_2_2= '/='
                            {
                            lv_op_2_2=(Token)match(input,37,FOLLOW_37_in_ruleCmp3775); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getCmpAccess().getOpSolidusEqualsSignKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCmpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1869:2: ( (lv_args_3_0= rulePrimary ) )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1870:1: (lv_args_3_0= rulePrimary )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1870:1: (lv_args_3_0= rulePrimary )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1871:3: lv_args_3_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCmpAccess().getArgsPrimaryParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimary_in_ruleCmp3812);
                    lv_args_3_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCmpRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_3_0, 
                              		"Primary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmp"


    // $ANTLR start "entryRulePrimary"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1895:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1896:2: (iv_rulePrimary= rulePrimary EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1897:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3850);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3860); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1904:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_Constant_3= ruleConstant | this_Not_4= ruleNot | this_Ref_5= ruleRef ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Or_1 = null;

        EObject this_Constant_3 = null;

        EObject this_Not_4 = null;

        EObject this_Ref_5 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1907:28: ( ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_Constant_3= ruleConstant | this_Not_4= ruleNot | this_Ref_5= ruleRef ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1908:1: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_Constant_3= ruleConstant | this_Not_4= ruleNot | this_Ref_5= ruleRef )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1908:1: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_Constant_3= ruleConstant | this_Not_4= ruleNot | this_Ref_5= ruleRef )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt30=1;
                }
                break;
            case RULE_BIN:
                {
                alt30=2;
                }
                break;
            case 40:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1908:2: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    {
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1908:2: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1908:4: otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulePrimary3898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getOrParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOr_in_rulePrimary3923);
                    this_Or_1=ruleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Or_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_rulePrimary3934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1930:2: this_Constant_3= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getConstantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_rulePrimary3966);
                    this_Constant_3=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constant_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1943:2: this_Not_4= ruleNot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getNotParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNot_in_rulePrimary3996);
                    this_Not_4=ruleNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Not_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1956:2: this_Ref_5= ruleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getRefParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRef_in_rulePrimary4026);
                    this_Ref_5=ruleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ref_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleNot"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1975:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1976:2: (iv_ruleNot= ruleNot EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1977:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot4061);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot4071); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1984:1: ruleNot returns [EObject current=null] : ( () otherlv_1= '/' ( (lv_args_2_0= rulePrimary ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1987:28: ( ( () otherlv_1= '/' ( (lv_args_2_0= rulePrimary ) ) ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1988:1: ( () otherlv_1= '/' ( (lv_args_2_0= rulePrimary ) ) )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1988:1: ( () otherlv_1= '/' ( (lv_args_2_0= rulePrimary ) ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1988:2: () otherlv_1= '/' ( (lv_args_2_0= rulePrimary ) )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1988:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:1989:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotAccess().getNotExprAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleNot4120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNotAccess().getSolidusKeyword_1());
                  
            }
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2001:1: ( (lv_args_2_0= rulePrimary ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2002:1: (lv_args_2_0= rulePrimary )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2002:1: (lv_args_2_0= rulePrimary )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2003:3: lv_args_2_0= rulePrimary
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotAccess().getArgsPrimaryParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleNot4141);
            lv_args_2_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotRule());
              	        }
                     		add(
                     			current, 
                     			"args",
                      		lv_args_2_0, 
                      		"Primary");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleConstant"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2027:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2028:2: (iv_ruleConstant= ruleConstant EOF )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2029:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant4177);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant4187); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2036:1: ruleConstant returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BIN ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2039:28: ( ( () ( (lv_value_1_0= RULE_BIN ) ) ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2040:1: ( () ( (lv_value_1_0= RULE_BIN ) ) )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2040:1: ( () ( (lv_value_1_0= RULE_BIN ) ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2040:2: () ( (lv_value_1_0= RULE_BIN ) )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2040:2: ()
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2041:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstantAccess().getConstantAction_0(),
                          current);
                  
            }

            }

            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2049:2: ( (lv_value_1_0= RULE_BIN ) )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2050:1: (lv_value_1_0= RULE_BIN )
            {
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2050:1: (lv_value_1_0= RULE_BIN )
            // ../logisim-evolution/src-gen/com/cburch/logisim/statemachine/parser/antlr/internal/InternalFSMDSL.g:2051:3: lv_value_1_0= RULE_BIN
            {
            lv_value_1_0=(Token)match(input,RULE_BIN,FOLLOW_RULE_BIN_in_ruleConstant4241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getConstantAccess().getValueBINTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"BIN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\17\uffff";
    static final String DFA1_minS =
        "\1\14\1\uffff\1\4\1\14\1\5\1\16\1\15\2\4\1\14\2\uffff\1\5\1\16\1\15";
    static final String DFA1_maxS =
        "\1\20\1\uffff\1\4\1\14\1\5\2\16\1\4\1\50\1\14\2\uffff\1\5\2\16";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\10\uffff\1\3\1\2\3\uffff";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\3\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\1\10",
            "\1\11",
            "\1\12\1\uffff\1\12\5\uffff\1\13\24\uffff\1\12\4\uffff\1\12\1\uffff\1\12",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\7\1\10"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "86:1: (this_FSM_0= ruleFSM | this_CommandStmt_1= ruleCommandStmt | this_PredicateStmt_2= rulePredicateStmt )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTOP_in_entryRuleTOP81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOP91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFSM_in_ruleTOP141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStmt_in_ruleTOP171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateStmt_in_ruleTOP201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStmt_in_entryRuleCommandStmt236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandStmt246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCommandStmt283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleShortInput_in_ruleCommandStmt304 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleCommandStmt317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleShortInput_in_ruleCommandStmt338 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleCommandStmt352 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCommandStmt364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleShortOutput_in_ruleCommandStmt385 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleCommandStmt398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleShortOutput_in_ruleCommandStmt419 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleCommandStmt433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommandStmt454 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommandStmt475 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePredicateStmt_in_entryRulePredicateStmt512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateStmt522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePredicateStmt559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleShortInput_in_rulePredicateStmt580 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePredicateStmt593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleShortInput_in_rulePredicateStmt614 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_rulePredicateStmt628 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_rulePredicate_in_rulePredicateStmt649 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePredicateStmt661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortInput_in_entryRuleShortInput697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortInput707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleShortInput761 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleShortInput778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleShortInput795 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleShortInput812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortOutput_in_entryRuleShortOutput848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortOutput858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleShortOutput912 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleShortOutput929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleShortOutput946 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleShortOutput963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFSM_in_entryRuleFSM999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFSM1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFSM1058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFSM1075 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_ruleLayoutInfo_in_ruleFSM1101 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFSM1113 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleInput_in_ruleFSM1135 = new BitSet(new long[]{0x0000000004F40000L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleFSM1162 = new BitSet(new long[]{0x0000000004F40000L});
    public static final BitSet FOLLOW_18_in_ruleFSM1177 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFSM1189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFSM1206 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFSM1223 = new BitSet(new long[]{0x0000000004300000L});
    public static final BitSet FOLLOW_20_in_ruleFSM1238 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFSM1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFSM1274 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFSM1286 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_ruleState_in_ruleFSM1309 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleFSM1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInput1419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInput1436 = new BitSet(new long[]{0x0000000002009000L});
    public static final BitSet FOLLOW_12_in_ruleInput1454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInput1471 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInput1488 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_ruleLayoutInfo_in_ruleInput1511 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInput1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput1559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOutput1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutput1635 = new BitSet(new long[]{0x0000000002009000L});
    public static final BitSet FOLLOW_12_in_ruleOutput1653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOutput1670 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOutput1687 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_ruleLayoutInfo_in_ruleOutput1710 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOutput1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandList_in_entryRuleCommandList1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandList1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCommandList1818 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_ruleLayoutInfo_in_ruleCommandList1839 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCommandList1851 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommandList1872 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleCommandList1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutInfo_in_entryRuleLayoutInfo1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutInfo1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLayoutInfo1983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLayoutInfo2000 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLayoutInfo2017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLayoutInfo2034 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleLayoutInfo2052 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLayoutInfo2069 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLayoutInfo2086 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLayoutInfo2103 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLayoutInfo2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleState2219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState2236 = new BitSet(new long[]{0x00000000020A0000L});
    public static final BitSet FOLLOW_19_in_ruleState2254 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BIN_in_ruleState2271 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_ruleLayoutInfo_in_ruleState2299 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState2311 = new BitSet(new long[]{0x0000000019200000L});
    public static final BitSet FOLLOW_27_in_ruleState2324 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleState2336 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BIN_in_ruleState2353 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleState2370 = new BitSet(new long[]{0x0000000011200000L});
    public static final BitSet FOLLOW_ruleCommandList_in_ruleState2393 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleState2406 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState2418 = new BitSet(new long[]{0x0000000060200010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState2439 = new BitSet(new long[]{0x0000000060200010L});
    public static final BitSet FOLLOW_21_in_ruleState2452 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleState2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2563 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTransition2576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30_in_ruleTransition2595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2620 = new BitSet(new long[]{0x0000000082008000L});
    public static final BitSet FOLLOW_31_in_ruleTransition2633 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleTransition2654 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_ruleLayoutInfo_in_ruleTransition2677 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTransition2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand2725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand2784 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCommand2796 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_ruleOr_in_ruleCommand2817 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCommand2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef2865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef2936 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleRef2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange2994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRange3041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange3059 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRange3076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange3095 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRange3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate3148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_rulePredicate3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rulePredicate3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_entryRuleDefault3273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefault3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDefault3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr3368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr3428 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleOr3452 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr3473 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd3511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmp_in_ruleAnd3571 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleAnd3595 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_ruleCmp_in_ruleAnd3616 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleCmp_in_entryRuleCmp3654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmp3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleCmp3714 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleCmp3746 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_37_in_ruleCmp3775 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleCmp3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimary3898 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_ruleOr_in_rulePrimary3923 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePrimary3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rulePrimary3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rulePrimary3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rulePrimary4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot4061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNot4120 = new BitSet(new long[]{0x0000014200000050L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleNot4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant4177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIN_in_ruleConstant4241 = new BitSet(new long[]{0x0000000000000002L});

}