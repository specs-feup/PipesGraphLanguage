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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config:'", "'imports:'", "'components:'", "'transitions:'", "'.'", "'import'", "'.*'", "'int'", "'String'", "'double'", "'long'", "'['", "']'", "'source'", "'{'", "'out:'", "'input-method:'", "'}'", "'filter'", "'in:'", "'method:'", "'sink'", "'output-method:'", "'inst:'", "'call:'", "'args:'", "'=>'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    // InternalSorting.g:71:1: ruleConfig returns [EObject current=null] : ( () otherlv_1= 'config:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'imports:' ( (lv_imports_4_0= ruleImport ) ) otherlv_5= 'components:' ( (lv_components_6_0= ruleComponent ) ) otherlv_7= 'transitions:' ( (lv_transitions_8_0= ruleTransition ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_imports_4_0 = null;

        EObject lv_components_6_0 = null;

        EObject lv_transitions_8_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:77:2: ( ( () otherlv_1= 'config:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'imports:' ( (lv_imports_4_0= ruleImport ) ) otherlv_5= 'components:' ( (lv_components_6_0= ruleComponent ) ) otherlv_7= 'transitions:' ( (lv_transitions_8_0= ruleTransition ) ) ) )
            // InternalSorting.g:78:2: ( () otherlv_1= 'config:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'imports:' ( (lv_imports_4_0= ruleImport ) ) otherlv_5= 'components:' ( (lv_components_6_0= ruleComponent ) ) otherlv_7= 'transitions:' ( (lv_transitions_8_0= ruleTransition ) ) )
            {
            // InternalSorting.g:78:2: ( () otherlv_1= 'config:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'imports:' ( (lv_imports_4_0= ruleImport ) ) otherlv_5= 'components:' ( (lv_components_6_0= ruleComponent ) ) otherlv_7= 'transitions:' ( (lv_transitions_8_0= ruleTransition ) ) )
            // InternalSorting.g:79:3: () otherlv_1= 'config:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'imports:' ( (lv_imports_4_0= ruleImport ) ) otherlv_5= 'components:' ( (lv_components_6_0= ruleComponent ) ) otherlv_7= 'transitions:' ( (lv_transitions_8_0= ruleTransition ) )
            {
            // InternalSorting.g:79:3: ()
            // InternalSorting.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getConfigKeyword_1());
            		
            // InternalSorting.g:90:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSorting.g:91:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSorting.g:91:4: (lv_name_2_0= RULE_ID )
            // InternalSorting.g:92:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getImportsKeyword_3());
            		
            // InternalSorting.g:112:3: ( (lv_imports_4_0= ruleImport ) )
            // InternalSorting.g:113:4: (lv_imports_4_0= ruleImport )
            {
            // InternalSorting.g:113:4: (lv_imports_4_0= ruleImport )
            // InternalSorting.g:114:5: lv_imports_4_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getImportsImportParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_imports_4_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					add(
            						current,
            						"imports",
            						lv_imports_4_0,
            						"org.xtext.example.sorting.Sorting.Import");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getComponentsKeyword_5());
            		
            // InternalSorting.g:135:3: ( (lv_components_6_0= ruleComponent ) )
            // InternalSorting.g:136:4: (lv_components_6_0= ruleComponent )
            {
            // InternalSorting.g:136:4: (lv_components_6_0= ruleComponent )
            // InternalSorting.g:137:5: lv_components_6_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getComponentsComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_components_6_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_6_0,
            						"org.xtext.example.sorting.Sorting.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getConfigAccess().getTransitionsKeyword_7());
            		
            // InternalSorting.g:158:3: ( (lv_transitions_8_0= ruleTransition ) )
            // InternalSorting.g:159:4: (lv_transitions_8_0= ruleTransition )
            {
            // InternalSorting.g:159:4: (lv_transitions_8_0= ruleTransition )
            // InternalSorting.g:160:5: lv_transitions_8_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getTransitionsTransitionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_transitions_8_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					add(
            						current,
            						"transitions",
            						lv_transitions_8_0,
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSorting.g:181:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSorting.g:181:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSorting.g:182:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSorting.g:188:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSorting.g:194:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSorting.g:195:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSorting.g:195:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSorting.g:196:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSorting.g:203:3: (kw= '.' this_ID_2= RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSorting.g:204:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalSorting.g:221:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSorting.g:221:47: (iv_ruleImport= ruleImport EOF )
            // InternalSorting.g:222:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSorting.g:228:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:234:2: ( (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSorting.g:235:2: (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSorting.g:235:2: (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSorting.g:236:3: otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalSorting.g:240:3: ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSorting.g:241:4: (lv_name_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSorting.g:241:4: (lv_name_1_0= ruleQualifiedNameWithWildcard )
            // InternalSorting.g:242:5: lv_name_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getNameQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.sorting.Sorting.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSorting.g:263:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSorting.g:263:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSorting.g:264:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSorting.g:270:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:276:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSorting.g:277:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSorting.g:277:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSorting.g:278:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSorting.g:288:3: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSorting.g:289:4: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalSorting.g:299:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSorting.g:299:45: (iv_ruleType= ruleType EOF )
            // InternalSorting.g:300:2: iv_ruleType= ruleType EOF
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
    // InternalSorting.g:306:1: ruleType returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? ) ;
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
            // InternalSorting.g:312:2: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? ) )
            // InternalSorting.g:313:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? )
            {
            // InternalSorting.g:313:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? )
            // InternalSorting.g:314:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )?
            {
            // InternalSorting.g:314:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) )
            // InternalSorting.g:315:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) )
            {
            // InternalSorting.g:315:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) )
            // InternalSorting.g:316:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' )
            {
            // InternalSorting.g:316:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
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
                    // InternalSorting.g:317:6: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,18,FOLLOW_11); 

                    						newLeafNode(lv_type_0_1, grammarAccess.getTypeAccess().getTypeIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSorting.g:328:6: lv_type_0_2= 'String'
                    {
                    lv_type_0_2=(Token)match(input,19,FOLLOW_11); 

                    						newLeafNode(lv_type_0_2, grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSorting.g:339:6: lv_type_0_3= 'double'
                    {
                    lv_type_0_3=(Token)match(input,20,FOLLOW_11); 

                    						newLeafNode(lv_type_0_3, grammarAccess.getTypeAccess().getTypeDoubleKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSorting.g:350:6: lv_type_0_4= 'long'
                    {
                    lv_type_0_4=(Token)match(input,21,FOLLOW_11); 

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

            // InternalSorting.g:363:3: (otherlv_1= '[' otherlv_2= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSorting.g:364:4: otherlv_1= '[' otherlv_2= ']'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalSorting.g:377:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSorting.g:377:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSorting.g:378:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalSorting.g:384:1: ruleComponent returns [EObject current=null] : (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter | this_Instance_3= ruleInstance ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Source_0 = null;

        EObject this_Sink_1 = null;

        EObject this_Filter_2 = null;

        EObject this_Instance_3 = null;



        	enterRule();

        try {
            // InternalSorting.g:390:2: ( (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter | this_Instance_3= ruleInstance ) )
            // InternalSorting.g:391:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter | this_Instance_3= ruleInstance )
            {
            // InternalSorting.g:391:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter | this_Instance_3= ruleInstance )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSorting.g:392:3: this_Source_0= ruleSource
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
                    // InternalSorting.g:401:3: this_Sink_1= ruleSink
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
                    // InternalSorting.g:410:3: this_Filter_2= ruleFilter
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
                    // InternalSorting.g:419:3: this_Instance_3= ruleInstance
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
    // InternalSorting.g:431:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalSorting.g:431:47: (iv_ruleSource= ruleSource EOF )
            // InternalSorting.g:432:2: iv_ruleSource= ruleSource EOF
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
    // InternalSorting.g:438:1: ruleSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' ) ;
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
            // InternalSorting.g:444:2: ( (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' ) )
            // InternalSorting.g:445:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' )
            {
            // InternalSorting.g:445:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' )
            // InternalSorting.g:446:3: otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'out:' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceAccess().getSourceKeyword_0());
            		
            // InternalSorting.g:450:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:451:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:451:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:452:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSourceAccess().getOutKeyword_3());
            		
            // InternalSorting.g:476:3: ( (lv_type_4_0= ruleType ) )
            // InternalSorting.g:477:4: (lv_type_4_0= ruleType )
            {
            // InternalSorting.g:477:4: (lv_type_4_0= ruleType )
            // InternalSorting.g:478:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSourceAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalSorting.g:495:3: (otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSorting.g:496:4: otherlv_5= 'input-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )*
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getSourceAccess().getInputMethodKeyword_5_0());
                    			
                    // InternalSorting.g:500:4: ( (lv_method_6_0= RULE_STRING ) )
                    // InternalSorting.g:501:5: (lv_method_6_0= RULE_STRING )
                    {
                    // InternalSorting.g:501:5: (lv_method_6_0= RULE_STRING )
                    // InternalSorting.g:502:6: lv_method_6_0= RULE_STRING
                    {
                    lv_method_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

                    // InternalSorting.g:518:4: (otherlv_7= '.' this_STRING_8= RULE_STRING )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSorting.g:519:5: otherlv_7= '.' this_STRING_8= RULE_STRING
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSourceAccess().getFullStopKeyword_5_2_0());
                    	    				
                    	    this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    	    					newLeafNode(this_STRING_8, grammarAccess.getSourceAccess().getSTRINGTerminalRuleCall_5_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSorting.g:537:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalSorting.g:537:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalSorting.g:538:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalSorting.g:544:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) ;
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
            // InternalSorting.g:550:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) )
            // InternalSorting.g:551:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            {
            // InternalSorting.g:551:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            // InternalSorting.g:552:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) otherlv_5= 'out:' ( (lv_outType_6_0= ruleType ) ) (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalSorting.g:556:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:557:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:557:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:558:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getInKeyword_3());
            		
            // InternalSorting.g:582:3: ( (lv_inType_4_0= ruleType ) )
            // InternalSorting.g:583:4: (lv_inType_4_0= ruleType )
            {
            // InternalSorting.g:583:4: (lv_inType_4_0= ruleType )
            // InternalSorting.g:584:5: lv_inType_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getInTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getOutKeyword_5());
            		
            // InternalSorting.g:605:3: ( (lv_outType_6_0= ruleType ) )
            // InternalSorting.g:606:4: (lv_outType_6_0= ruleType )
            {
            // InternalSorting.g:606:4: (lv_outType_6_0= ruleType )
            // InternalSorting.g:607:5: lv_outType_6_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getOutTypeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalSorting.g:624:3: (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSorting.g:625:4: otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getMethodKeyword_7_0());
                    			
                    // InternalSorting.g:629:4: ( (lv_method_8_0= RULE_STRING ) )
                    // InternalSorting.g:630:5: (lv_method_8_0= RULE_STRING )
                    {
                    // InternalSorting.g:630:5: (lv_method_8_0= RULE_STRING )
                    // InternalSorting.g:631:6: lv_method_8_0= RULE_STRING
                    {
                    lv_method_8_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

                    // InternalSorting.g:647:4: (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSorting.g:648:5: otherlv_9= '.' this_STRING_10= RULE_STRING
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFilterAccess().getFullStopKeyword_7_2_0());
                    	    				
                    	    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    	    					newLeafNode(this_STRING_10, grammarAccess.getFilterAccess().getSTRINGTerminalRuleCall_7_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSorting.g:666:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalSorting.g:666:45: (iv_ruleSink= ruleSink EOF )
            // InternalSorting.g:667:2: iv_ruleSink= ruleSink EOF
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
    // InternalSorting.g:673:1: ruleSink returns [EObject current=null] : (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' ) ;
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
            // InternalSorting.g:679:2: ( (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' ) )
            // InternalSorting.g:680:2: (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' )
            {
            // InternalSorting.g:680:2: (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}' )
            // InternalSorting.g:681:3: otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inType_4_0= ruleType ) ) (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalSorting.g:685:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:686:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:686:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:687:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getInKeyword_3());
            		
            // InternalSorting.g:711:3: ( (lv_inType_4_0= ruleType ) )
            // InternalSorting.g:712:4: (lv_inType_4_0= ruleType )
            {
            // InternalSorting.g:712:4: (lv_inType_4_0= ruleType )
            // InternalSorting.g:713:5: lv_inType_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getInTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalSorting.g:730:3: (otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSorting.g:731:4: otherlv_5= 'output-method:' ( (lv_method_6_0= RULE_STRING ) ) (otherlv_7= '.' this_STRING_8= RULE_STRING )*
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getSinkAccess().getOutputMethodKeyword_5_0());
                    			
                    // InternalSorting.g:735:4: ( (lv_method_6_0= RULE_STRING ) )
                    // InternalSorting.g:736:5: (lv_method_6_0= RULE_STRING )
                    {
                    // InternalSorting.g:736:5: (lv_method_6_0= RULE_STRING )
                    // InternalSorting.g:737:6: lv_method_6_0= RULE_STRING
                    {
                    lv_method_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

                    // InternalSorting.g:753:4: (otherlv_7= '.' this_STRING_8= RULE_STRING )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSorting.g:754:5: otherlv_7= '.' this_STRING_8= RULE_STRING
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getFullStopKeyword_5_2_0());
                    	    				
                    	    this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    	    					newLeafNode(this_STRING_8, grammarAccess.getSinkAccess().getSTRINGTerminalRuleCall_5_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSorting.g:772:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalSorting.g:772:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalSorting.g:773:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalSorting.g:779:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )? ) ;
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
            // InternalSorting.g:785:2: ( (otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )? ) )
            // InternalSorting.g:786:2: (otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )? )
            {
            // InternalSorting.g:786:2: (otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )? )
            // InternalSorting.g:787:3: otherlv_0= 'inst:' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstKeyword_0());
            		
            // InternalSorting.g:791:3: ( (otherlv_1= RULE_ID ) )
            // InternalSorting.g:792:4: (otherlv_1= RULE_ID )
            {
            // InternalSorting.g:792:4: (otherlv_1= RULE_ID )
            // InternalSorting.g:793:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_1_0());
            				

            }


            }

            // InternalSorting.g:804:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSorting.g:805:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSorting.g:805:4: (lv_name_2_0= RULE_ID )
            // InternalSorting.g:806:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalSorting.g:822:3: ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* ) | (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalSorting.g:823:4: (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* )
                    {
                    // InternalSorting.g:823:4: (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* )
                    // InternalSorting.g:824:5: otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )*
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_17); 

                    					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getCallKeyword_3_0_0());
                    				
                    // InternalSorting.g:828:5: ( (lv_method_4_0= RULE_STRING ) )
                    // InternalSorting.g:829:6: (lv_method_4_0= RULE_STRING )
                    {
                    // InternalSorting.g:829:6: (lv_method_4_0= RULE_STRING )
                    // InternalSorting.g:830:7: lv_method_4_0= RULE_STRING
                    {
                    lv_method_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    // InternalSorting.g:846:5: (otherlv_5= '.' this_STRING_6= RULE_STRING )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSorting.g:847:6: otherlv_5= '.' this_STRING_6= RULE_STRING
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_17); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getFullStopKeyword_3_0_2_0());
                    	    					
                    	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    	    						newLeafNode(this_STRING_6, grammarAccess.getInstanceAccess().getSTRINGTerminalRuleCall_3_0_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSorting.g:858:4: (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* )
                    {
                    // InternalSorting.g:858:4: (otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )* )
                    // InternalSorting.g:859:5: otherlv_7= 'args:' ( (lv_args_8_0= RULE_STRING ) )*
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_23); 

                    					newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getArgsKeyword_3_1_0());
                    				
                    // InternalSorting.g:863:5: ( (lv_args_8_0= RULE_STRING ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_STRING) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSorting.g:864:6: (lv_args_8_0= RULE_STRING )
                    	    {
                    	    // InternalSorting.g:864:6: (lv_args_8_0= RULE_STRING )
                    	    // InternalSorting.g:865:7: lv_args_8_0= RULE_STRING
                    	    {
                    	    lv_args_8_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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
                    	    break loop13;
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
    // InternalSorting.g:887:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSorting.g:887:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalSorting.g:888:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalSorting.g:894:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSorting.g:900:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSorting.g:901:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSorting.g:901:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalSorting.g:902:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalSorting.g:902:3: ( (otherlv_0= RULE_ID ) )
            // InternalSorting.g:903:4: (otherlv_0= RULE_ID )
            {
            // InternalSorting.g:903:4: (otherlv_0= RULE_ID )
            // InternalSorting.g:904:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getSourceComponentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalSorting.g:919:3: ( (otherlv_2= RULE_ID ) )
            // InternalSorting.g:920:4: (otherlv_2= RULE_ID )
            {
            // InternalSorting.g:920:4: (otherlv_2= RULE_ID )
            // InternalSorting.g:921:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000521000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});

}