package org.xtext.example.sorting.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.sorting.services.SortingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSortingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config:'", "'components:'", "'transitions:'", "'int'", "'String'", "'double'", "'long'", "'['", "']'", "'source'", "'{'", "'out:'", "'input-method:'", "'.'", "'}'", "'filter'", "'in:'", "'method:'", "'sink'", "'output-method:'", "'inst:'", "'call:'", "'args:'", "'=>'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSortingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSortingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSortingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSorting.g"; }



     	private SortingGrammarAccess grammarAccess;

        public InternalSortingParser(TokenStream input, SortingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Config";
       	}

       	@Override
       	protected SortingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfig"
    // InternalSorting.g:64:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalSorting.g:64:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalSorting.g:65:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalSorting.g:71:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'config:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'components:' ( (lv_components_3_0= ruleComponent ) ) otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:77:2: ( (otherlv_0= 'config:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'components:' ( (lv_components_3_0= ruleComponent ) ) otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) ) ) )
            // InternalSorting.g:78:2: (otherlv_0= 'config:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'components:' ( (lv_components_3_0= ruleComponent ) ) otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) ) )
            {
            // InternalSorting.g:78:2: (otherlv_0= 'config:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'components:' ( (lv_components_3_0= ruleComponent ) ) otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) ) )
            // InternalSorting.g:79:3: otherlv_0= 'config:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'components:' ( (lv_components_3_0= ruleComponent ) ) otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
            		
            // InternalSorting.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getComponentsKeyword_2());
            		
            // InternalSorting.g:105:3: ( (lv_components_3_0= ruleComponent ) )
            // InternalSorting.g:106:4: (lv_components_3_0= ruleComponent )
            {
            // InternalSorting.g:106:4: (lv_components_3_0= ruleComponent )
            // InternalSorting.g:107:5: lv_components_3_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getComponentsComponentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_components_3_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_3_0,
            						"org.xtext.example.sorting.Sorting.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getTransitionsKeyword_4());
            		
            // InternalSorting.g:128:3: ( (lv_transitions_5_0= ruleTransition ) )
            // InternalSorting.g:129:4: (lv_transitions_5_0= ruleTransition )
            {
            // InternalSorting.g:129:4: (lv_transitions_5_0= ruleTransition )
            // InternalSorting.g:130:5: lv_transitions_5_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getTransitionsTransitionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_transitions_5_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					add(
            						current,
            						"transitions",
            						lv_transitions_5_0,
            						"org.xtext.example.sorting.Sorting.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleType"
    // InternalSorting.g:151:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSorting.g:151:45: (iv_ruleType= ruleType EOF )
            // InternalSorting.g:152:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSorting.g:158:1: ruleType returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSorting.g:164:2: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? ) )
            // InternalSorting.g:165:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? )
            {
            // InternalSorting.g:165:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? )
            // InternalSorting.g:166:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )?
            {
            // InternalSorting.g:166:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) )
            // InternalSorting.g:167:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) )
            {
            // InternalSorting.g:167:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) )
            // InternalSorting.g:168:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' )
            {
            // InternalSorting.g:168:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSorting.g:169:6: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,14,FOLLOW_7); 

                    						newLeafNode(lv_type_0_1, grammarAccess.getTypeAccess().getTypeIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSorting.g:180:6: lv_type_0_2= 'String'
                    {
                    lv_type_0_2=(Token)match(input,15,FOLLOW_7); 

                    						newLeafNode(lv_type_0_2, grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSorting.g:191:6: lv_type_0_3= 'double'
                    {
                    lv_type_0_3=(Token)match(input,16,FOLLOW_7); 

                    						newLeafNode(lv_type_0_3, grammarAccess.getTypeAccess().getTypeDoubleKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSorting.g:202:6: lv_type_0_4= 'long'
                    {
                    lv_type_0_4=(Token)match(input,17,FOLLOW_7); 

                    						newLeafNode(lv_type_0_4, grammarAccess.getTypeAccess().getTypeLongKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSorting.g:215:3: (otherlv_1= '[' otherlv_2= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSorting.g:216:4: otherlv_1= '[' otherlv_2= ']'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleComponent"
    // InternalSorting.g:229:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSorting.g:229:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSorting.g:230:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSorting.g:236:1: ruleComponent returns [EObject current=null] : (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter | this_Instance_3= ruleInstance ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Source_0 = null;

        EObject this_Sink_1 = null;

        EObject this_Filter_2 = null;

        EObject this_Instance_3 = null;



        	enterRule();

        try {
            // InternalSorting.g:242:2: ( (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter | this_Instance_3= ruleInstance ) )
            // InternalSorting.g:243:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter | this_Instance_3= ruleInstance )
            {
            // InternalSorting.g:243:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter | this_Instance_3= ruleInstance )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSorting.g:244:3: this_Source_0= ruleSource
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getSourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Source_0=ruleSource();

                    state._fsp--;


                    			current = this_Source_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSorting.g:253:3: this_Sink_1= ruleSink
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getSinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sink_1=ruleSink();

                    state._fsp--;


                    			current = this_Sink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSorting.g:262:3: this_Filter_2= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_2=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSorting.g:271:3: this_Instance_3= ruleInstance
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getInstanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instance_3=ruleInstance();

                    state._fsp--;


                    			current = this_Instance_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSource"
    // InternalSorting.g:283:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalSorting.g:283:47: (iv_ruleSource= ruleSource EOF )
            // InternalSorting.g:284:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalSorting.g:290:1: ruleSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_method_6_0=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        Token otherlv_9=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:296:2: ( (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' ) )
            // InternalSorting.g:297:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' )
            {
            // InternalSorting.g:297:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' )
            // InternalSorting.g:298:3: otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceAccess().getSourceKeyword_0());
            		
            // InternalSorting.g:302:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:303:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:303:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:304:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSourceAccess().getOutKeyword_3());
            		
            // InternalSorting.g:328:3: ( (lv_type_4_0= ruleType ) )
            // InternalSorting.g:329:4: (lv_type_4_0= ruleType )
            {
            // InternalSorting.g:329:4: (lv_type_4_0= ruleType )
            // InternalSorting.g:330:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSourceAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSourceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.example.sorting.Sorting.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSorting.g:347:3: (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSorting.g:348:4: otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getSourceAccess().getInputMethodKeyword_5_0());
                    			
                    // InternalSorting.g:352:4: ( (lv_method_6_0= RULE_STRING ) )
                    // InternalSorting.g:353:5: (lv_method_6_0= RULE_STRING )
                    {
                    // InternalSorting.g:353:5: (lv_method_6_0= RULE_STRING )
                    // InternalSorting.g:354:6: lv_method_6_0= RULE_STRING
                    {
                    lv_method_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_method_6_0, grammarAccess.getSourceAccess().getMethodSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSorting.g:370:4: (otherlv_7= '.' this_STRING_8= RULE_STRING )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==24) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSorting.g:371:5: otherlv_7= '.' this_STRING_8= RULE_STRING
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSourceAccess().getFullStopKeyword_5_2_0());
                    	    				
                    	    this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    	    					newLeafNode(this_STRING_8, grammarAccess.getSourceAccess().getSTRINGTerminalRuleCall_5_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleFilter"
    // InternalSorting.g:389:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalSorting.g:389:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalSorting.g:390:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalSorting.g:396:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_method_8_0=null;
        Token otherlv_9=null;
        Token this_STRING_10=null;
        Token otherlv_11=null;
        EObject lv_inType_4_0 = null;

        EObject lv_outType_6_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:402:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) )
            // InternalSorting.g:403:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            {
            // InternalSorting.g:403:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            // InternalSorting.g:404:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalSorting.g:408:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:409:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:409:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:410:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getInKeyword_3());
            		
            // InternalSorting.g:434:3: ( (lv_inType_4_0= ruleType ) )
            // InternalSorting.g:435:4: (lv_inType_4_0= ruleType )
            {
            // InternalSorting.g:435:4: (lv_inType_4_0= ruleType )
            // InternalSorting.g:436:5: lv_inType_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getInTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_inType_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"inType",
            						lv_inType_4_0,
            						"org.xtext.example.sorting.Sorting.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getOutKeyword_5());
            		
            // InternalSorting.g:457:3: ( (lv_outType_6_0= ruleType ) )
            // InternalSorting.g:458:4: (lv_outType_6_0= ruleType )
            {
            // InternalSorting.g:458:4: (lv_outType_6_0= ruleType )
            // InternalSorting.g:459:5: lv_outType_6_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getOutTypeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_outType_6_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"outType",
            						lv_outType_6_0,
            						"org.xtext.example.sorting.Sorting.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSorting.g:476:3: (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSorting.g:477:4: otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getMethodKeyword_7_0());
                    			
                    // InternalSorting.g:481:4: ( (lv_method_8_0= RULE_STRING ) )
                    // InternalSorting.g:482:5: (lv_method_8_0= RULE_STRING )
                    {
                    // InternalSorting.g:482:5: (lv_method_8_0= RULE_STRING )
                    // InternalSorting.g:483:6: lv_method_8_0= RULE_STRING
                    {
                    lv_method_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_method_8_0, grammarAccess.getFilterAccess().getMethodSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSorting.g:499:4: (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSorting.g:500:5: otherlv_9= '.' this_STRING_10= RULE_STRING
                    	    {
                    	    otherlv_9=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFilterAccess().getFullStopKeyword_7_2_0());
                    	    				
                    	    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    	    					newLeafNode(this_STRING_10, grammarAccess.getFilterAccess().getSTRINGTerminalRuleCall_7_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleSink"
    // InternalSorting.g:518:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalSorting.g:518:45: (iv_ruleSink= ruleSink EOF )
            // InternalSorting.g:519:2: iv_ruleSink= ruleSink EOF
            {
             newCompositeNode(grammarAccess.getSinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSink=ruleSink();

            state._fsp--;

             current =iv_ruleSink; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSink"


    // $ANTLR start "ruleSink"
    // InternalSorting.g:525:1: ruleSink returns [EObject current=null] : (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' ) ;
    public final EObject ruleSink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_method_6_0=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        Token otherlv_9=null;
        EObject lv_inType_4_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:531:2: ( (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' ) )
            // InternalSorting.g:532:2: (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' )
            {
            // InternalSorting.g:532:2: (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' )
            // InternalSorting.g:533:3: otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalSorting.g:537:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:538:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:538:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:539:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getInKeyword_3());
            		
            // InternalSorting.g:563:3: ( (lv_inType_4_0= ruleType ) )
            // InternalSorting.g:564:4: (lv_inType_4_0= ruleType )
            {
            // InternalSorting.g:564:4: (lv_inType_4_0= ruleType )
            // InternalSorting.g:565:5: lv_inType_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getInTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_inType_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinkRule());
            					}
            					set(
            						current,
            						"inType",
            						lv_inType_4_0,
            						"org.xtext.example.sorting.Sorting.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSorting.g:582:3: (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSorting.g:583:4: otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )*
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getSinkAccess().getOutputMethodKeyword_5_0());
                    			
                    // InternalSorting.g:587:4: ( (lv_method_6_0= RULE_STRING ) )
                    // InternalSorting.g:588:5: (lv_method_6_0= RULE_STRING )
                    {
                    // InternalSorting.g:588:5: (lv_method_6_0= RULE_STRING )
                    // InternalSorting.g:589:6: lv_method_6_0= RULE_STRING
                    {
                    lv_method_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_method_6_0, grammarAccess.getSinkAccess().getMethodSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSorting.g:605:4: (otherlv_7= '.' this_STRING_8= RULE_STRING )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==24) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSorting.g:606:5: otherlv_7= '.' this_STRING_8= RULE_STRING
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getFullStopKeyword_5_2_0());
                    	    				
                    	    this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    	    					newLeafNode(this_STRING_8, grammarAccess.getSinkAccess().getSTRINGTerminalRuleCall_5_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSink"


    // $ANTLR start "entryRuleInstance"
    // InternalSorting.g:624:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalSorting.g:624:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalSorting.g:625:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalSorting.g:631:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )? ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_method_4_0=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        Token otherlv_7=null;
        Token lv_args_8_0=null;


        	enterRule();

        try {
            // InternalSorting.g:637:2: ( (otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )? ) )
            // InternalSorting.g:638:2: (otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )? )
            {
            // InternalSorting.g:638:2: (otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )? )
            // InternalSorting.g:639:3: otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstKeyword_0());
            		
            // InternalSorting.g:643:3: ( (otherlv_1= RULE_ID ) )
            // InternalSorting.g:644:4: (otherlv_1= RULE_ID )
            {
            // InternalSorting.g:644:4: (otherlv_1= RULE_ID )
            // InternalSorting.g:645:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_1_0());
            				

            }


            }

            // InternalSorting.g:656:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSorting.g:657:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSorting.g:657:4: (lv_name_2_0= RULE_ID )
            // InternalSorting.g:658:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSorting.g:674:3: ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            else if ( (LA12_0==33) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalSorting.g:675:4: (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* )
                    {
                    // InternalSorting.g:675:4: (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* )
                    // InternalSorting.g:676:5: otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )*
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_13); 

                    					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getCallKeyword_3_0_0());
                    				
                    // InternalSorting.g:680:5: ( (lv_method_4_0= RULE_STRING ) )
                    // InternalSorting.g:681:6: (lv_method_4_0= RULE_STRING )
                    {
                    // InternalSorting.g:681:6: (lv_method_4_0= RULE_STRING )
                    // InternalSorting.g:682:7: lv_method_4_0= RULE_STRING
                    {
                    lv_method_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    							newLeafNode(lv_method_4_0, grammarAccess.getInstanceAccess().getMethodSTRINGTerminalRuleCall_3_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInstanceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"method",
                    								lv_method_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    // InternalSorting.g:698:5: (otherlv_5= '.' this_STRING_6= RULE_STRING )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSorting.g:699:6: otherlv_5= '.' this_STRING_6= RULE_STRING
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_13); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getFullStopKeyword_3_0_2_0());
                    	    					
                    	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    	    						newLeafNode(this_STRING_6, grammarAccess.getInstanceAccess().getSTRINGTerminalRuleCall_3_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSorting.g:710:4: (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* )
                    {
                    // InternalSorting.g:710:4: (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* )
                    // InternalSorting.g:711:5: otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )*
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_20); 

                    					newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getArgsKeyword_3_1_0());
                    				
                    // InternalSorting.g:715:5: ( (lv_args_8_0= RULE_STRING ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_STRING) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSorting.g:716:6: (lv_args_8_0= RULE_STRING )
                    	    {
                    	    // InternalSorting.g:716:6: (lv_args_8_0= RULE_STRING )
                    	    // InternalSorting.g:717:7: lv_args_8_0= RULE_STRING
                    	    {
                    	    lv_args_8_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    	    							newLeafNode(lv_args_8_0, grammarAccess.getInstanceAccess().getArgsSTRINGTerminalRuleCall_3_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInstanceRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"args",
                    	    								lv_args_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleTransition"
    // InternalSorting.g:739:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSorting.g:739:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalSorting.g:740:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSorting.g:746:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSorting.g:752:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSorting.g:753:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSorting.g:753:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalSorting.g:754:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalSorting.g:754:3: ( (otherlv_0= RULE_ID ) )
            // InternalSorting.g:755:4: (otherlv_0= RULE_ID )
            {
            // InternalSorting.g:755:4: (otherlv_0= RULE_ID )
            // InternalSorting.g:756:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getSourceComponentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalSorting.g:771:3: ( (otherlv_2= RULE_ID ) )
            // InternalSorting.g:772:4: (otherlv_2= RULE_ID )
            {
            // InternalSorting.g:772:4: (otherlv_2= RULE_ID )
            // InternalSorting.g:773:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTargetComponentCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000A4100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});

}