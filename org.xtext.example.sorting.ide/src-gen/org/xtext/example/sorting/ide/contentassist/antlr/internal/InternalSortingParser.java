package org.xtext.example.sorting.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.sorting.services.SortingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSortingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'String'", "'double'", "'long'", "'config:'", "'imports:'", "'components:'", "'transitions:'", "'.'", "'import'", "'.*'", "'['", "']'", "'source'", "'{'", "'out:'", "'}'", "'input-method:'", "'filter'", "'in:'", "'method:'", "'sink'", "'output-method:'", "'inst:'", "'call:'", "'args:'", "'=>'"
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

    	public void setGrammarAccess(SortingGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleConfig"
    // InternalSorting.g:53:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // InternalSorting.g:54:1: ( ruleConfig EOF )
            // InternalSorting.g:55:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalSorting.g:62:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:66:2: ( ( ( rule__Config__Group__0 ) ) )
            // InternalSorting.g:67:2: ( ( rule__Config__Group__0 ) )
            {
            // InternalSorting.g:67:2: ( ( rule__Config__Group__0 ) )
            // InternalSorting.g:68:3: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // InternalSorting.g:69:3: ( rule__Config__Group__0 )
            // InternalSorting.g:69:4: rule__Config__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSorting.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSorting.g:79:1: ( ruleQualifiedName EOF )
            // InternalSorting.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSorting.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSorting.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSorting.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSorting.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSorting.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalSorting.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalSorting.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalSorting.g:104:1: ( ruleImport EOF )
            // InternalSorting.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSorting.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalSorting.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalSorting.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalSorting.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalSorting.g:119:3: ( rule__Import__Group__0 )
            // InternalSorting.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSorting.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalSorting.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalSorting.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSorting.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalSorting.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalSorting.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalSorting.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalSorting.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalSorting.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalSorting.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSorting.g:154:1: ( ruleType EOF )
            // InternalSorting.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSorting.g:162:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:166:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalSorting.g:167:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalSorting.g:167:2: ( ( rule__Type__Group__0 ) )
            // InternalSorting.g:168:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalSorting.g:169:3: ( rule__Type__Group__0 )
            // InternalSorting.g:169:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleComponent"
    // InternalSorting.g:178:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalSorting.g:179:1: ( ruleComponent EOF )
            // InternalSorting.g:180:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSorting.g:187:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:191:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalSorting.g:192:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalSorting.g:192:2: ( ( rule__Component__Alternatives ) )
            // InternalSorting.g:193:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalSorting.g:194:3: ( rule__Component__Alternatives )
            // InternalSorting.g:194:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSource"
    // InternalSorting.g:203:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalSorting.g:204:1: ( ruleSource EOF )
            // InternalSorting.g:205:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalSorting.g:212:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:216:2: ( ( ( rule__Source__Group__0 ) ) )
            // InternalSorting.g:217:2: ( ( rule__Source__Group__0 ) )
            {
            // InternalSorting.g:217:2: ( ( rule__Source__Group__0 ) )
            // InternalSorting.g:218:3: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // InternalSorting.g:219:3: ( rule__Source__Group__0 )
            // InternalSorting.g:219:4: rule__Source__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleFilter"
    // InternalSorting.g:228:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalSorting.g:229:1: ( ruleFilter EOF )
            // InternalSorting.g:230:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalSorting.g:237:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:241:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalSorting.g:242:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalSorting.g:242:2: ( ( rule__Filter__Group__0 ) )
            // InternalSorting.g:243:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalSorting.g:244:3: ( rule__Filter__Group__0 )
            // InternalSorting.g:244:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleSink"
    // InternalSorting.g:253:1: entryRuleSink : ruleSink EOF ;
    public final void entryRuleSink() throws RecognitionException {
        try {
            // InternalSorting.g:254:1: ( ruleSink EOF )
            // InternalSorting.g:255:1: ruleSink EOF
            {
             before(grammarAccess.getSinkRule()); 
            pushFollow(FOLLOW_1);
            ruleSink();

            state._fsp--;

             after(grammarAccess.getSinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSink"


    // $ANTLR start "ruleSink"
    // InternalSorting.g:262:1: ruleSink : ( ( rule__Sink__Group__0 ) ) ;
    public final void ruleSink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:266:2: ( ( ( rule__Sink__Group__0 ) ) )
            // InternalSorting.g:267:2: ( ( rule__Sink__Group__0 ) )
            {
            // InternalSorting.g:267:2: ( ( rule__Sink__Group__0 ) )
            // InternalSorting.g:268:3: ( rule__Sink__Group__0 )
            {
             before(grammarAccess.getSinkAccess().getGroup()); 
            // InternalSorting.g:269:3: ( rule__Sink__Group__0 )
            // InternalSorting.g:269:4: rule__Sink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSink"


    // $ANTLR start "entryRuleInstance"
    // InternalSorting.g:278:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // InternalSorting.g:279:1: ( ruleInstance EOF )
            // InternalSorting.g:280:1: ruleInstance EOF
            {
             before(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalSorting.g:287:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:291:2: ( ( ( rule__Instance__Group__0 ) ) )
            // InternalSorting.g:292:2: ( ( rule__Instance__Group__0 ) )
            {
            // InternalSorting.g:292:2: ( ( rule__Instance__Group__0 ) )
            // InternalSorting.g:293:3: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // InternalSorting.g:294:3: ( rule__Instance__Group__0 )
            // InternalSorting.g:294:4: rule__Instance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleTransition"
    // InternalSorting.g:303:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalSorting.g:304:1: ( ruleTransition EOF )
            // InternalSorting.g:305:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalSorting.g:312:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:316:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalSorting.g:317:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalSorting.g:317:2: ( ( rule__Transition__Group__0 ) )
            // InternalSorting.g:318:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalSorting.g:319:3: ( rule__Transition__Group__0 )
            // InternalSorting.g:319:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__Type__TypeAlternatives_0_0"
    // InternalSorting.g:327:1: rule__Type__TypeAlternatives_0_0 : ( ( 'int' ) | ( 'String' ) | ( 'double' ) | ( 'long' ) );
    public final void rule__Type__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:331:1: ( ( 'int' ) | ( 'String' ) | ( 'double' ) | ( 'long' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
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
                    // InternalSorting.g:332:2: ( 'int' )
                    {
                    // InternalSorting.g:332:2: ( 'int' )
                    // InternalSorting.g:333:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSorting.g:338:2: ( 'String' )
                    {
                    // InternalSorting.g:338:2: ( 'String' )
                    // InternalSorting.g:339:3: 'String'
                    {
                     before(grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSorting.g:344:2: ( 'double' )
                    {
                    // InternalSorting.g:344:2: ( 'double' )
                    // InternalSorting.g:345:3: 'double'
                    {
                     before(grammarAccess.getTypeAccess().getTypeDoubleKeyword_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTypeDoubleKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSorting.g:350:2: ( 'long' )
                    {
                    // InternalSorting.g:350:2: ( 'long' )
                    // InternalSorting.g:351:3: 'long'
                    {
                     before(grammarAccess.getTypeAccess().getTypeLongKeyword_0_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTypeLongKeyword_0_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAlternatives_0_0"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalSorting.g:360:1: rule__Component__Alternatives : ( ( ruleSource ) | ( ruleSink ) | ( ruleFilter ) | ( ruleInstance ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:364:1: ( ( ruleSource ) | ( ruleSink ) | ( ruleFilter ) | ( ruleInstance ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSorting.g:365:2: ( ruleSource )
                    {
                    // InternalSorting.g:365:2: ( ruleSource )
                    // InternalSorting.g:366:3: ruleSource
                    {
                     before(grammarAccess.getComponentAccess().getSourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSource();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getSourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSorting.g:371:2: ( ruleSink )
                    {
                    // InternalSorting.g:371:2: ( ruleSink )
                    // InternalSorting.g:372:3: ruleSink
                    {
                     before(grammarAccess.getComponentAccess().getSinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSink();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getSinkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSorting.g:377:2: ( ruleFilter )
                    {
                    // InternalSorting.g:377:2: ( ruleFilter )
                    // InternalSorting.g:378:3: ruleFilter
                    {
                     before(grammarAccess.getComponentAccess().getFilterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFilter();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getFilterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSorting.g:383:2: ( ruleInstance )
                    {
                    // InternalSorting.g:383:2: ( ruleInstance )
                    // InternalSorting.g:384:3: ruleInstance
                    {
                     before(grammarAccess.getComponentAccess().getInstanceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInstance();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getInstanceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__Instance__Alternatives_3"
    // InternalSorting.g:393:1: rule__Instance__Alternatives_3 : ( ( ( rule__Instance__Group_3_0__0 ) ) | ( ( rule__Instance__Group_3_1__0 ) ) );
    public final void rule__Instance__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:397:1: ( ( ( rule__Instance__Group_3_0__0 ) ) | ( ( rule__Instance__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSorting.g:398:2: ( ( rule__Instance__Group_3_0__0 ) )
                    {
                    // InternalSorting.g:398:2: ( ( rule__Instance__Group_3_0__0 ) )
                    // InternalSorting.g:399:3: ( rule__Instance__Group_3_0__0 )
                    {
                     before(grammarAccess.getInstanceAccess().getGroup_3_0()); 
                    // InternalSorting.g:400:3: ( rule__Instance__Group_3_0__0 )
                    // InternalSorting.g:400:4: rule__Instance__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstanceAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSorting.g:404:2: ( ( rule__Instance__Group_3_1__0 ) )
                    {
                    // InternalSorting.g:404:2: ( ( rule__Instance__Group_3_1__0 ) )
                    // InternalSorting.g:405:3: ( rule__Instance__Group_3_1__0 )
                    {
                     before(grammarAccess.getInstanceAccess().getGroup_3_1()); 
                    // InternalSorting.g:406:3: ( rule__Instance__Group_3_1__0 )
                    // InternalSorting.g:406:4: rule__Instance__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstanceAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Alternatives_3"


    // $ANTLR start "rule__Config__Group__0"
    // InternalSorting.g:414:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:418:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // InternalSorting.g:419:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // InternalSorting.g:426:1: rule__Config__Group__0__Impl : ( () ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:430:1: ( ( () ) )
            // InternalSorting.g:431:1: ( () )
            {
            // InternalSorting.g:431:1: ( () )
            // InternalSorting.g:432:2: ()
            {
             before(grammarAccess.getConfigAccess().getConfigAction_0()); 
            // InternalSorting.g:433:2: ()
            // InternalSorting.g:433:3: 
            {
            }

             after(grammarAccess.getConfigAccess().getConfigAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // InternalSorting.g:441:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:445:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // InternalSorting.g:446:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // InternalSorting.g:453:1: rule__Config__Group__1__Impl : ( 'config:' ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:457:1: ( ( 'config:' ) )
            // InternalSorting.g:458:1: ( 'config:' )
            {
            // InternalSorting.g:458:1: ( 'config:' )
            // InternalSorting.g:459:2: 'config:'
            {
             before(grammarAccess.getConfigAccess().getConfigKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getConfigKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // InternalSorting.g:468:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:472:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // InternalSorting.g:473:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // InternalSorting.g:480:1: rule__Config__Group__2__Impl : ( ( rule__Config__NameAssignment_2 ) ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:484:1: ( ( ( rule__Config__NameAssignment_2 ) ) )
            // InternalSorting.g:485:1: ( ( rule__Config__NameAssignment_2 ) )
            {
            // InternalSorting.g:485:1: ( ( rule__Config__NameAssignment_2 ) )
            // InternalSorting.g:486:2: ( rule__Config__NameAssignment_2 )
            {
             before(grammarAccess.getConfigAccess().getNameAssignment_2()); 
            // InternalSorting.g:487:2: ( rule__Config__NameAssignment_2 )
            // InternalSorting.g:487:3: rule__Config__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Config__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // InternalSorting.g:495:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:499:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // InternalSorting.g:500:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // InternalSorting.g:507:1: rule__Config__Group__3__Impl : ( 'imports:' ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:511:1: ( ( 'imports:' ) )
            // InternalSorting.g:512:1: ( 'imports:' )
            {
            // InternalSorting.g:512:1: ( 'imports:' )
            // InternalSorting.g:513:2: 'imports:'
            {
             before(grammarAccess.getConfigAccess().getImportsKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getImportsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__4"
    // InternalSorting.g:522:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:526:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // InternalSorting.g:527:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4"


    // $ANTLR start "rule__Config__Group__4__Impl"
    // InternalSorting.g:534:1: rule__Config__Group__4__Impl : ( ( rule__Config__ImportsAssignment_4 ) ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:538:1: ( ( ( rule__Config__ImportsAssignment_4 ) ) )
            // InternalSorting.g:539:1: ( ( rule__Config__ImportsAssignment_4 ) )
            {
            // InternalSorting.g:539:1: ( ( rule__Config__ImportsAssignment_4 ) )
            // InternalSorting.g:540:2: ( rule__Config__ImportsAssignment_4 )
            {
             before(grammarAccess.getConfigAccess().getImportsAssignment_4()); 
            // InternalSorting.g:541:2: ( rule__Config__ImportsAssignment_4 )
            // InternalSorting.g:541:3: rule__Config__ImportsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Config__ImportsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getImportsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4__Impl"


    // $ANTLR start "rule__Config__Group__5"
    // InternalSorting.g:549:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:553:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // InternalSorting.g:554:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Config__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5"


    // $ANTLR start "rule__Config__Group__5__Impl"
    // InternalSorting.g:561:1: rule__Config__Group__5__Impl : ( 'components:' ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:565:1: ( ( 'components:' ) )
            // InternalSorting.g:566:1: ( 'components:' )
            {
            // InternalSorting.g:566:1: ( 'components:' )
            // InternalSorting.g:567:2: 'components:'
            {
             before(grammarAccess.getConfigAccess().getComponentsKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getComponentsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5__Impl"


    // $ANTLR start "rule__Config__Group__6"
    // InternalSorting.g:576:1: rule__Config__Group__6 : rule__Config__Group__6__Impl rule__Config__Group__7 ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:580:1: ( rule__Config__Group__6__Impl rule__Config__Group__7 )
            // InternalSorting.g:581:2: rule__Config__Group__6__Impl rule__Config__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Config__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6"


    // $ANTLR start "rule__Config__Group__6__Impl"
    // InternalSorting.g:588:1: rule__Config__Group__6__Impl : ( ( rule__Config__ComponentsAssignment_6 ) ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:592:1: ( ( ( rule__Config__ComponentsAssignment_6 ) ) )
            // InternalSorting.g:593:1: ( ( rule__Config__ComponentsAssignment_6 ) )
            {
            // InternalSorting.g:593:1: ( ( rule__Config__ComponentsAssignment_6 ) )
            // InternalSorting.g:594:2: ( rule__Config__ComponentsAssignment_6 )
            {
             before(grammarAccess.getConfigAccess().getComponentsAssignment_6()); 
            // InternalSorting.g:595:2: ( rule__Config__ComponentsAssignment_6 )
            // InternalSorting.g:595:3: rule__Config__ComponentsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Config__ComponentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getComponentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6__Impl"


    // $ANTLR start "rule__Config__Group__7"
    // InternalSorting.g:603:1: rule__Config__Group__7 : rule__Config__Group__7__Impl rule__Config__Group__8 ;
    public final void rule__Config__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:607:1: ( rule__Config__Group__7__Impl rule__Config__Group__8 )
            // InternalSorting.g:608:2: rule__Config__Group__7__Impl rule__Config__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Config__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__7"


    // $ANTLR start "rule__Config__Group__7__Impl"
    // InternalSorting.g:615:1: rule__Config__Group__7__Impl : ( 'transitions:' ) ;
    public final void rule__Config__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:619:1: ( ( 'transitions:' ) )
            // InternalSorting.g:620:1: ( 'transitions:' )
            {
            // InternalSorting.g:620:1: ( 'transitions:' )
            // InternalSorting.g:621:2: 'transitions:'
            {
             before(grammarAccess.getConfigAccess().getTransitionsKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getTransitionsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__7__Impl"


    // $ANTLR start "rule__Config__Group__8"
    // InternalSorting.g:630:1: rule__Config__Group__8 : rule__Config__Group__8__Impl ;
    public final void rule__Config__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:634:1: ( rule__Config__Group__8__Impl )
            // InternalSorting.g:635:2: rule__Config__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__8"


    // $ANTLR start "rule__Config__Group__8__Impl"
    // InternalSorting.g:641:1: rule__Config__Group__8__Impl : ( ( rule__Config__TransitionsAssignment_8 ) ) ;
    public final void rule__Config__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:645:1: ( ( ( rule__Config__TransitionsAssignment_8 ) ) )
            // InternalSorting.g:646:1: ( ( rule__Config__TransitionsAssignment_8 ) )
            {
            // InternalSorting.g:646:1: ( ( rule__Config__TransitionsAssignment_8 ) )
            // InternalSorting.g:647:2: ( rule__Config__TransitionsAssignment_8 )
            {
             before(grammarAccess.getConfigAccess().getTransitionsAssignment_8()); 
            // InternalSorting.g:648:2: ( rule__Config__TransitionsAssignment_8 )
            // InternalSorting.g:648:3: rule__Config__TransitionsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Config__TransitionsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getTransitionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__8__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSorting.g:657:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:661:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSorting.g:662:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSorting.g:669:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:673:1: ( ( RULE_ID ) )
            // InternalSorting.g:674:1: ( RULE_ID )
            {
            // InternalSorting.g:674:1: ( RULE_ID )
            // InternalSorting.g:675:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSorting.g:684:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:688:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSorting.g:689:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSorting.g:695:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:699:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSorting.g:700:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSorting.g:700:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSorting.g:701:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSorting.g:702:2: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSorting.g:702:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSorting.g:711:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:715:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSorting.g:716:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSorting.g:723:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:727:1: ( ( '.' ) )
            // InternalSorting.g:728:1: ( '.' )
            {
            // InternalSorting.g:728:1: ( '.' )
            // InternalSorting.g:729:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSorting.g:738:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:742:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSorting.g:743:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSorting.g:749:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:753:1: ( ( RULE_ID ) )
            // InternalSorting.g:754:1: ( RULE_ID )
            {
            // InternalSorting.g:754:1: ( RULE_ID )
            // InternalSorting.g:755:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalSorting.g:765:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:769:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalSorting.g:770:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalSorting.g:777:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:781:1: ( ( 'import' ) )
            // InternalSorting.g:782:1: ( 'import' )
            {
            // InternalSorting.g:782:1: ( 'import' )
            // InternalSorting.g:783:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalSorting.g:792:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:796:1: ( rule__Import__Group__1__Impl )
            // InternalSorting.g:797:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalSorting.g:803:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:807:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalSorting.g:808:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalSorting.g:808:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalSorting.g:809:2: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalSorting.g:810:2: ( rule__Import__NameAssignment_1 )
            // InternalSorting.g:810:3: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalSorting.g:819:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:823:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalSorting.g:824:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalSorting.g:831:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:835:1: ( ( ruleQualifiedName ) )
            // InternalSorting.g:836:1: ( ruleQualifiedName )
            {
            // InternalSorting.g:836:1: ( ruleQualifiedName )
            // InternalSorting.g:837:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalSorting.g:846:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:850:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalSorting.g:851:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalSorting.g:857:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:861:1: ( ( ( '.*' )? ) )
            // InternalSorting.g:862:1: ( ( '.*' )? )
            {
            // InternalSorting.g:862:1: ( ( '.*' )? )
            // InternalSorting.g:863:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSorting.g:864:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSorting.g:864:3: '.*'
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalSorting.g:873:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:877:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalSorting.g:878:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalSorting.g:885:1: rule__Type__Group__0__Impl : ( ( rule__Type__TypeAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:889:1: ( ( ( rule__Type__TypeAssignment_0 ) ) )
            // InternalSorting.g:890:1: ( ( rule__Type__TypeAssignment_0 ) )
            {
            // InternalSorting.g:890:1: ( ( rule__Type__TypeAssignment_0 ) )
            // InternalSorting.g:891:2: ( rule__Type__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_0()); 
            // InternalSorting.g:892:2: ( rule__Type__TypeAssignment_0 )
            // InternalSorting.g:892:3: rule__Type__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalSorting.g:900:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:904:1: ( rule__Type__Group__1__Impl )
            // InternalSorting.g:905:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalSorting.g:911:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:915:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // InternalSorting.g:916:1: ( ( rule__Type__Group_1__0 )? )
            {
            // InternalSorting.g:916:1: ( ( rule__Type__Group_1__0 )? )
            // InternalSorting.g:917:2: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // InternalSorting.g:918:2: ( rule__Type__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSorting.g:918:3: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalSorting.g:927:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:931:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalSorting.g:932:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalSorting.g:939:1: rule__Type__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:943:1: ( ( '[' ) )
            // InternalSorting.g:944:1: ( '[' )
            {
            // InternalSorting.g:944:1: ( '[' )
            // InternalSorting.g:945:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalSorting.g:954:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:958:1: ( rule__Type__Group_1__1__Impl )
            // InternalSorting.g:959:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalSorting.g:965:1: rule__Type__Group_1__1__Impl : ( ']' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:969:1: ( ( ']' ) )
            // InternalSorting.g:970:1: ( ']' )
            {
            // InternalSorting.g:970:1: ( ']' )
            // InternalSorting.g:971:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // InternalSorting.g:981:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:985:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalSorting.g:986:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Source__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0"


    // $ANTLR start "rule__Source__Group__0__Impl"
    // InternalSorting.g:993:1: rule__Source__Group__0__Impl : ( 'source' ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:997:1: ( ( 'source' ) )
            // InternalSorting.g:998:1: ( 'source' )
            {
            // InternalSorting.g:998:1: ( 'source' )
            // InternalSorting.g:999:2: 'source'
            {
             before(grammarAccess.getSourceAccess().getSourceKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getSourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0__Impl"


    // $ANTLR start "rule__Source__Group__1"
    // InternalSorting.g:1008:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1012:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // InternalSorting.g:1013:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Source__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1"


    // $ANTLR start "rule__Source__Group__1__Impl"
    // InternalSorting.g:1020:1: rule__Source__Group__1__Impl : ( ( rule__Source__NameAssignment_1 ) ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1024:1: ( ( ( rule__Source__NameAssignment_1 ) ) )
            // InternalSorting.g:1025:1: ( ( rule__Source__NameAssignment_1 ) )
            {
            // InternalSorting.g:1025:1: ( ( rule__Source__NameAssignment_1 ) )
            // InternalSorting.g:1026:2: ( rule__Source__NameAssignment_1 )
            {
             before(grammarAccess.getSourceAccess().getNameAssignment_1()); 
            // InternalSorting.g:1027:2: ( rule__Source__NameAssignment_1 )
            // InternalSorting.g:1027:3: rule__Source__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1__Impl"


    // $ANTLR start "rule__Source__Group__2"
    // InternalSorting.g:1035:1: rule__Source__Group__2 : rule__Source__Group__2__Impl rule__Source__Group__3 ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1039:1: ( rule__Source__Group__2__Impl rule__Source__Group__3 )
            // InternalSorting.g:1040:2: rule__Source__Group__2__Impl rule__Source__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Source__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2"


    // $ANTLR start "rule__Source__Group__2__Impl"
    // InternalSorting.g:1047:1: rule__Source__Group__2__Impl : ( '{' ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1051:1: ( ( '{' ) )
            // InternalSorting.g:1052:1: ( '{' )
            {
            // InternalSorting.g:1052:1: ( '{' )
            // InternalSorting.g:1053:2: '{'
            {
             before(grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2__Impl"


    // $ANTLR start "rule__Source__Group__3"
    // InternalSorting.g:1062:1: rule__Source__Group__3 : rule__Source__Group__3__Impl rule__Source__Group__4 ;
    public final void rule__Source__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1066:1: ( rule__Source__Group__3__Impl rule__Source__Group__4 )
            // InternalSorting.g:1067:2: rule__Source__Group__3__Impl rule__Source__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Source__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3"


    // $ANTLR start "rule__Source__Group__3__Impl"
    // InternalSorting.g:1074:1: rule__Source__Group__3__Impl : ( 'out:' ) ;
    public final void rule__Source__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1078:1: ( ( 'out:' ) )
            // InternalSorting.g:1079:1: ( 'out:' )
            {
            // InternalSorting.g:1079:1: ( 'out:' )
            // InternalSorting.g:1080:2: 'out:'
            {
             before(grammarAccess.getSourceAccess().getOutKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getOutKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3__Impl"


    // $ANTLR start "rule__Source__Group__4"
    // InternalSorting.g:1089:1: rule__Source__Group__4 : rule__Source__Group__4__Impl rule__Source__Group__5 ;
    public final void rule__Source__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1093:1: ( rule__Source__Group__4__Impl rule__Source__Group__5 )
            // InternalSorting.g:1094:2: rule__Source__Group__4__Impl rule__Source__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Source__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4"


    // $ANTLR start "rule__Source__Group__4__Impl"
    // InternalSorting.g:1101:1: rule__Source__Group__4__Impl : ( ( rule__Source__TypeAssignment_4 ) ) ;
    public final void rule__Source__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1105:1: ( ( ( rule__Source__TypeAssignment_4 ) ) )
            // InternalSorting.g:1106:1: ( ( rule__Source__TypeAssignment_4 ) )
            {
            // InternalSorting.g:1106:1: ( ( rule__Source__TypeAssignment_4 ) )
            // InternalSorting.g:1107:2: ( rule__Source__TypeAssignment_4 )
            {
             before(grammarAccess.getSourceAccess().getTypeAssignment_4()); 
            // InternalSorting.g:1108:2: ( rule__Source__TypeAssignment_4 )
            // InternalSorting.g:1108:3: rule__Source__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Source__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4__Impl"


    // $ANTLR start "rule__Source__Group__5"
    // InternalSorting.g:1116:1: rule__Source__Group__5 : rule__Source__Group__5__Impl rule__Source__Group__6 ;
    public final void rule__Source__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1120:1: ( rule__Source__Group__5__Impl rule__Source__Group__6 )
            // InternalSorting.g:1121:2: rule__Source__Group__5__Impl rule__Source__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Source__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__5"


    // $ANTLR start "rule__Source__Group__5__Impl"
    // InternalSorting.g:1128:1: rule__Source__Group__5__Impl : ( ( rule__Source__Group_5__0 )? ) ;
    public final void rule__Source__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1132:1: ( ( ( rule__Source__Group_5__0 )? ) )
            // InternalSorting.g:1133:1: ( ( rule__Source__Group_5__0 )? )
            {
            // InternalSorting.g:1133:1: ( ( rule__Source__Group_5__0 )? )
            // InternalSorting.g:1134:2: ( rule__Source__Group_5__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_5()); 
            // InternalSorting.g:1135:2: ( rule__Source__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSorting.g:1135:3: rule__Source__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__5__Impl"


    // $ANTLR start "rule__Source__Group__6"
    // InternalSorting.g:1143:1: rule__Source__Group__6 : rule__Source__Group__6__Impl ;
    public final void rule__Source__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1147:1: ( rule__Source__Group__6__Impl )
            // InternalSorting.g:1148:2: rule__Source__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__6"


    // $ANTLR start "rule__Source__Group__6__Impl"
    // InternalSorting.g:1154:1: rule__Source__Group__6__Impl : ( '}' ) ;
    public final void rule__Source__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1158:1: ( ( '}' ) )
            // InternalSorting.g:1159:1: ( '}' )
            {
            // InternalSorting.g:1159:1: ( '}' )
            // InternalSorting.g:1160:2: '}'
            {
             before(grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__6__Impl"


    // $ANTLR start "rule__Source__Group_5__0"
    // InternalSorting.g:1170:1: rule__Source__Group_5__0 : rule__Source__Group_5__0__Impl rule__Source__Group_5__1 ;
    public final void rule__Source__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1174:1: ( rule__Source__Group_5__0__Impl rule__Source__Group_5__1 )
            // InternalSorting.g:1175:2: rule__Source__Group_5__0__Impl rule__Source__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__Source__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5__0"


    // $ANTLR start "rule__Source__Group_5__0__Impl"
    // InternalSorting.g:1182:1: rule__Source__Group_5__0__Impl : ( 'input-method:' ) ;
    public final void rule__Source__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1186:1: ( ( 'input-method:' ) )
            // InternalSorting.g:1187:1: ( 'input-method:' )
            {
            // InternalSorting.g:1187:1: ( 'input-method:' )
            // InternalSorting.g:1188:2: 'input-method:'
            {
             before(grammarAccess.getSourceAccess().getInputMethodKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getInputMethodKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5__0__Impl"


    // $ANTLR start "rule__Source__Group_5__1"
    // InternalSorting.g:1197:1: rule__Source__Group_5__1 : rule__Source__Group_5__1__Impl rule__Source__Group_5__2 ;
    public final void rule__Source__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1201:1: ( rule__Source__Group_5__1__Impl rule__Source__Group_5__2 )
            // InternalSorting.g:1202:2: rule__Source__Group_5__1__Impl rule__Source__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Source__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5__1"


    // $ANTLR start "rule__Source__Group_5__1__Impl"
    // InternalSorting.g:1209:1: rule__Source__Group_5__1__Impl : ( ( rule__Source__MethodAssignment_5_1 ) ) ;
    public final void rule__Source__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1213:1: ( ( ( rule__Source__MethodAssignment_5_1 ) ) )
            // InternalSorting.g:1214:1: ( ( rule__Source__MethodAssignment_5_1 ) )
            {
            // InternalSorting.g:1214:1: ( ( rule__Source__MethodAssignment_5_1 ) )
            // InternalSorting.g:1215:2: ( rule__Source__MethodAssignment_5_1 )
            {
             before(grammarAccess.getSourceAccess().getMethodAssignment_5_1()); 
            // InternalSorting.g:1216:2: ( rule__Source__MethodAssignment_5_1 )
            // InternalSorting.g:1216:3: rule__Source__MethodAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__MethodAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getMethodAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5__1__Impl"


    // $ANTLR start "rule__Source__Group_5__2"
    // InternalSorting.g:1224:1: rule__Source__Group_5__2 : rule__Source__Group_5__2__Impl ;
    public final void rule__Source__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1228:1: ( rule__Source__Group_5__2__Impl )
            // InternalSorting.g:1229:2: rule__Source__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5__2"


    // $ANTLR start "rule__Source__Group_5__2__Impl"
    // InternalSorting.g:1235:1: rule__Source__Group_5__2__Impl : ( ( rule__Source__Group_5_2__0 )* ) ;
    public final void rule__Source__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1239:1: ( ( ( rule__Source__Group_5_2__0 )* ) )
            // InternalSorting.g:1240:1: ( ( rule__Source__Group_5_2__0 )* )
            {
            // InternalSorting.g:1240:1: ( ( rule__Source__Group_5_2__0 )* )
            // InternalSorting.g:1241:2: ( rule__Source__Group_5_2__0 )*
            {
             before(grammarAccess.getSourceAccess().getGroup_5_2()); 
            // InternalSorting.g:1242:2: ( rule__Source__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSorting.g:1242:3: rule__Source__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Source__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5__2__Impl"


    // $ANTLR start "rule__Source__Group_5_2__0"
    // InternalSorting.g:1251:1: rule__Source__Group_5_2__0 : rule__Source__Group_5_2__0__Impl rule__Source__Group_5_2__1 ;
    public final void rule__Source__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1255:1: ( rule__Source__Group_5_2__0__Impl rule__Source__Group_5_2__1 )
            // InternalSorting.g:1256:2: rule__Source__Group_5_2__0__Impl rule__Source__Group_5_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Source__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5_2__0"


    // $ANTLR start "rule__Source__Group_5_2__0__Impl"
    // InternalSorting.g:1263:1: rule__Source__Group_5_2__0__Impl : ( '.' ) ;
    public final void rule__Source__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1267:1: ( ( '.' ) )
            // InternalSorting.g:1268:1: ( '.' )
            {
            // InternalSorting.g:1268:1: ( '.' )
            // InternalSorting.g:1269:2: '.'
            {
             before(grammarAccess.getSourceAccess().getFullStopKeyword_5_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getFullStopKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5_2__0__Impl"


    // $ANTLR start "rule__Source__Group_5_2__1"
    // InternalSorting.g:1278:1: rule__Source__Group_5_2__1 : rule__Source__Group_5_2__1__Impl ;
    public final void rule__Source__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1282:1: ( rule__Source__Group_5_2__1__Impl )
            // InternalSorting.g:1283:2: rule__Source__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5_2__1"


    // $ANTLR start "rule__Source__Group_5_2__1__Impl"
    // InternalSorting.g:1289:1: rule__Source__Group_5_2__1__Impl : ( RULE_STRING ) ;
    public final void rule__Source__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1293:1: ( ( RULE_STRING ) )
            // InternalSorting.g:1294:1: ( RULE_STRING )
            {
            // InternalSorting.g:1294:1: ( RULE_STRING )
            // InternalSorting.g:1295:2: RULE_STRING
            {
             before(grammarAccess.getSourceAccess().getSTRINGTerminalRuleCall_5_2_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getSTRINGTerminalRuleCall_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_5_2__1__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalSorting.g:1305:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1309:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalSorting.g:1310:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalSorting.g:1317:1: rule__Filter__Group__0__Impl : ( 'filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1321:1: ( ( 'filter' ) )
            // InternalSorting.g:1322:1: ( 'filter' )
            {
            // InternalSorting.g:1322:1: ( 'filter' )
            // InternalSorting.g:1323:2: 'filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalSorting.g:1332:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1336:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalSorting.g:1337:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Filter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalSorting.g:1344:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__NameAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1348:1: ( ( ( rule__Filter__NameAssignment_1 ) ) )
            // InternalSorting.g:1349:1: ( ( rule__Filter__NameAssignment_1 ) )
            {
            // InternalSorting.g:1349:1: ( ( rule__Filter__NameAssignment_1 ) )
            // InternalSorting.g:1350:2: ( rule__Filter__NameAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getNameAssignment_1()); 
            // InternalSorting.g:1351:2: ( rule__Filter__NameAssignment_1 )
            // InternalSorting.g:1351:3: rule__Filter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // InternalSorting.g:1359:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl rule__Filter__Group__3 ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1363:1: ( rule__Filter__Group__2__Impl rule__Filter__Group__3 )
            // InternalSorting.g:1364:2: rule__Filter__Group__2__Impl rule__Filter__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Filter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // InternalSorting.g:1371:1: rule__Filter__Group__2__Impl : ( '{' ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1375:1: ( ( '{' ) )
            // InternalSorting.g:1376:1: ( '{' )
            {
            // InternalSorting.g:1376:1: ( '{' )
            // InternalSorting.g:1377:2: '{'
            {
             before(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__Filter__Group__3"
    // InternalSorting.g:1386:1: rule__Filter__Group__3 : rule__Filter__Group__3__Impl rule__Filter__Group__4 ;
    public final void rule__Filter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1390:1: ( rule__Filter__Group__3__Impl rule__Filter__Group__4 )
            // InternalSorting.g:1391:2: rule__Filter__Group__3__Impl rule__Filter__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Filter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__3"


    // $ANTLR start "rule__Filter__Group__3__Impl"
    // InternalSorting.g:1398:1: rule__Filter__Group__3__Impl : ( 'in:' ) ;
    public final void rule__Filter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1402:1: ( ( 'in:' ) )
            // InternalSorting.g:1403:1: ( 'in:' )
            {
            // InternalSorting.g:1403:1: ( 'in:' )
            // InternalSorting.g:1404:2: 'in:'
            {
             before(grammarAccess.getFilterAccess().getInKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__3__Impl"


    // $ANTLR start "rule__Filter__Group__4"
    // InternalSorting.g:1413:1: rule__Filter__Group__4 : rule__Filter__Group__4__Impl rule__Filter__Group__5 ;
    public final void rule__Filter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1417:1: ( rule__Filter__Group__4__Impl rule__Filter__Group__5 )
            // InternalSorting.g:1418:2: rule__Filter__Group__4__Impl rule__Filter__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Filter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__4"


    // $ANTLR start "rule__Filter__Group__4__Impl"
    // InternalSorting.g:1425:1: rule__Filter__Group__4__Impl : ( ( rule__Filter__InTypeAssignment_4 ) ) ;
    public final void rule__Filter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1429:1: ( ( ( rule__Filter__InTypeAssignment_4 ) ) )
            // InternalSorting.g:1430:1: ( ( rule__Filter__InTypeAssignment_4 ) )
            {
            // InternalSorting.g:1430:1: ( ( rule__Filter__InTypeAssignment_4 ) )
            // InternalSorting.g:1431:2: ( rule__Filter__InTypeAssignment_4 )
            {
             before(grammarAccess.getFilterAccess().getInTypeAssignment_4()); 
            // InternalSorting.g:1432:2: ( rule__Filter__InTypeAssignment_4 )
            // InternalSorting.g:1432:3: rule__Filter__InTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Filter__InTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getInTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__4__Impl"


    // $ANTLR start "rule__Filter__Group__5"
    // InternalSorting.g:1440:1: rule__Filter__Group__5 : rule__Filter__Group__5__Impl rule__Filter__Group__6 ;
    public final void rule__Filter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1444:1: ( rule__Filter__Group__5__Impl rule__Filter__Group__6 )
            // InternalSorting.g:1445:2: rule__Filter__Group__5__Impl rule__Filter__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Filter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__5"


    // $ANTLR start "rule__Filter__Group__5__Impl"
    // InternalSorting.g:1452:1: rule__Filter__Group__5__Impl : ( 'out:' ) ;
    public final void rule__Filter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1456:1: ( ( 'out:' ) )
            // InternalSorting.g:1457:1: ( 'out:' )
            {
            // InternalSorting.g:1457:1: ( 'out:' )
            // InternalSorting.g:1458:2: 'out:'
            {
             before(grammarAccess.getFilterAccess().getOutKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getOutKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__5__Impl"


    // $ANTLR start "rule__Filter__Group__6"
    // InternalSorting.g:1467:1: rule__Filter__Group__6 : rule__Filter__Group__6__Impl rule__Filter__Group__7 ;
    public final void rule__Filter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1471:1: ( rule__Filter__Group__6__Impl rule__Filter__Group__7 )
            // InternalSorting.g:1472:2: rule__Filter__Group__6__Impl rule__Filter__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Filter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__6"


    // $ANTLR start "rule__Filter__Group__6__Impl"
    // InternalSorting.g:1479:1: rule__Filter__Group__6__Impl : ( ( rule__Filter__OutTypeAssignment_6 ) ) ;
    public final void rule__Filter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1483:1: ( ( ( rule__Filter__OutTypeAssignment_6 ) ) )
            // InternalSorting.g:1484:1: ( ( rule__Filter__OutTypeAssignment_6 ) )
            {
            // InternalSorting.g:1484:1: ( ( rule__Filter__OutTypeAssignment_6 ) )
            // InternalSorting.g:1485:2: ( rule__Filter__OutTypeAssignment_6 )
            {
             before(grammarAccess.getFilterAccess().getOutTypeAssignment_6()); 
            // InternalSorting.g:1486:2: ( rule__Filter__OutTypeAssignment_6 )
            // InternalSorting.g:1486:3: rule__Filter__OutTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Filter__OutTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getOutTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__6__Impl"


    // $ANTLR start "rule__Filter__Group__7"
    // InternalSorting.g:1494:1: rule__Filter__Group__7 : rule__Filter__Group__7__Impl rule__Filter__Group__8 ;
    public final void rule__Filter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1498:1: ( rule__Filter__Group__7__Impl rule__Filter__Group__8 )
            // InternalSorting.g:1499:2: rule__Filter__Group__7__Impl rule__Filter__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Filter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__7"


    // $ANTLR start "rule__Filter__Group__7__Impl"
    // InternalSorting.g:1506:1: rule__Filter__Group__7__Impl : ( ( rule__Filter__Group_7__0 )? ) ;
    public final void rule__Filter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1510:1: ( ( ( rule__Filter__Group_7__0 )? ) )
            // InternalSorting.g:1511:1: ( ( rule__Filter__Group_7__0 )? )
            {
            // InternalSorting.g:1511:1: ( ( rule__Filter__Group_7__0 )? )
            // InternalSorting.g:1512:2: ( rule__Filter__Group_7__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_7()); 
            // InternalSorting.g:1513:2: ( rule__Filter__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSorting.g:1513:3: rule__Filter__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__7__Impl"


    // $ANTLR start "rule__Filter__Group__8"
    // InternalSorting.g:1521:1: rule__Filter__Group__8 : rule__Filter__Group__8__Impl ;
    public final void rule__Filter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1525:1: ( rule__Filter__Group__8__Impl )
            // InternalSorting.g:1526:2: rule__Filter__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__8"


    // $ANTLR start "rule__Filter__Group__8__Impl"
    // InternalSorting.g:1532:1: rule__Filter__Group__8__Impl : ( '}' ) ;
    public final void rule__Filter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1536:1: ( ( '}' ) )
            // InternalSorting.g:1537:1: ( '}' )
            {
            // InternalSorting.g:1537:1: ( '}' )
            // InternalSorting.g:1538:2: '}'
            {
             before(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__8__Impl"


    // $ANTLR start "rule__Filter__Group_7__0"
    // InternalSorting.g:1548:1: rule__Filter__Group_7__0 : rule__Filter__Group_7__0__Impl rule__Filter__Group_7__1 ;
    public final void rule__Filter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1552:1: ( rule__Filter__Group_7__0__Impl rule__Filter__Group_7__1 )
            // InternalSorting.g:1553:2: rule__Filter__Group_7__0__Impl rule__Filter__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__Filter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__0"


    // $ANTLR start "rule__Filter__Group_7__0__Impl"
    // InternalSorting.g:1560:1: rule__Filter__Group_7__0__Impl : ( 'method:' ) ;
    public final void rule__Filter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1564:1: ( ( 'method:' ) )
            // InternalSorting.g:1565:1: ( 'method:' )
            {
            // InternalSorting.g:1565:1: ( 'method:' )
            // InternalSorting.g:1566:2: 'method:'
            {
             before(grammarAccess.getFilterAccess().getMethodKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getMethodKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__0__Impl"


    // $ANTLR start "rule__Filter__Group_7__1"
    // InternalSorting.g:1575:1: rule__Filter__Group_7__1 : rule__Filter__Group_7__1__Impl rule__Filter__Group_7__2 ;
    public final void rule__Filter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1579:1: ( rule__Filter__Group_7__1__Impl rule__Filter__Group_7__2 )
            // InternalSorting.g:1580:2: rule__Filter__Group_7__1__Impl rule__Filter__Group_7__2
            {
            pushFollow(FOLLOW_10);
            rule__Filter__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__1"


    // $ANTLR start "rule__Filter__Group_7__1__Impl"
    // InternalSorting.g:1587:1: rule__Filter__Group_7__1__Impl : ( ( rule__Filter__MethodAssignment_7_1 ) ) ;
    public final void rule__Filter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1591:1: ( ( ( rule__Filter__MethodAssignment_7_1 ) ) )
            // InternalSorting.g:1592:1: ( ( rule__Filter__MethodAssignment_7_1 ) )
            {
            // InternalSorting.g:1592:1: ( ( rule__Filter__MethodAssignment_7_1 ) )
            // InternalSorting.g:1593:2: ( rule__Filter__MethodAssignment_7_1 )
            {
             before(grammarAccess.getFilterAccess().getMethodAssignment_7_1()); 
            // InternalSorting.g:1594:2: ( rule__Filter__MethodAssignment_7_1 )
            // InternalSorting.g:1594:3: rule__Filter__MethodAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__MethodAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getMethodAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__1__Impl"


    // $ANTLR start "rule__Filter__Group_7__2"
    // InternalSorting.g:1602:1: rule__Filter__Group_7__2 : rule__Filter__Group_7__2__Impl ;
    public final void rule__Filter__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1606:1: ( rule__Filter__Group_7__2__Impl )
            // InternalSorting.g:1607:2: rule__Filter__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__2"


    // $ANTLR start "rule__Filter__Group_7__2__Impl"
    // InternalSorting.g:1613:1: rule__Filter__Group_7__2__Impl : ( ( rule__Filter__Group_7_2__0 )* ) ;
    public final void rule__Filter__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1617:1: ( ( ( rule__Filter__Group_7_2__0 )* ) )
            // InternalSorting.g:1618:1: ( ( rule__Filter__Group_7_2__0 )* )
            {
            // InternalSorting.g:1618:1: ( ( rule__Filter__Group_7_2__0 )* )
            // InternalSorting.g:1619:2: ( rule__Filter__Group_7_2__0 )*
            {
             before(grammarAccess.getFilterAccess().getGroup_7_2()); 
            // InternalSorting.g:1620:2: ( rule__Filter__Group_7_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSorting.g:1620:3: rule__Filter__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Filter__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFilterAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7__2__Impl"


    // $ANTLR start "rule__Filter__Group_7_2__0"
    // InternalSorting.g:1629:1: rule__Filter__Group_7_2__0 : rule__Filter__Group_7_2__0__Impl rule__Filter__Group_7_2__1 ;
    public final void rule__Filter__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1633:1: ( rule__Filter__Group_7_2__0__Impl rule__Filter__Group_7_2__1 )
            // InternalSorting.g:1634:2: rule__Filter__Group_7_2__0__Impl rule__Filter__Group_7_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Filter__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7_2__0"


    // $ANTLR start "rule__Filter__Group_7_2__0__Impl"
    // InternalSorting.g:1641:1: rule__Filter__Group_7_2__0__Impl : ( '.' ) ;
    public final void rule__Filter__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1645:1: ( ( '.' ) )
            // InternalSorting.g:1646:1: ( '.' )
            {
            // InternalSorting.g:1646:1: ( '.' )
            // InternalSorting.g:1647:2: '.'
            {
             before(grammarAccess.getFilterAccess().getFullStopKeyword_7_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFullStopKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7_2__0__Impl"


    // $ANTLR start "rule__Filter__Group_7_2__1"
    // InternalSorting.g:1656:1: rule__Filter__Group_7_2__1 : rule__Filter__Group_7_2__1__Impl ;
    public final void rule__Filter__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1660:1: ( rule__Filter__Group_7_2__1__Impl )
            // InternalSorting.g:1661:2: rule__Filter__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7_2__1"


    // $ANTLR start "rule__Filter__Group_7_2__1__Impl"
    // InternalSorting.g:1667:1: rule__Filter__Group_7_2__1__Impl : ( RULE_STRING ) ;
    public final void rule__Filter__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1671:1: ( ( RULE_STRING ) )
            // InternalSorting.g:1672:1: ( RULE_STRING )
            {
            // InternalSorting.g:1672:1: ( RULE_STRING )
            // InternalSorting.g:1673:2: RULE_STRING
            {
             before(grammarAccess.getFilterAccess().getSTRINGTerminalRuleCall_7_2_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getSTRINGTerminalRuleCall_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_7_2__1__Impl"


    // $ANTLR start "rule__Sink__Group__0"
    // InternalSorting.g:1683:1: rule__Sink__Group__0 : rule__Sink__Group__0__Impl rule__Sink__Group__1 ;
    public final void rule__Sink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1687:1: ( rule__Sink__Group__0__Impl rule__Sink__Group__1 )
            // InternalSorting.g:1688:2: rule__Sink__Group__0__Impl rule__Sink__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__0"


    // $ANTLR start "rule__Sink__Group__0__Impl"
    // InternalSorting.g:1695:1: rule__Sink__Group__0__Impl : ( 'sink' ) ;
    public final void rule__Sink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1699:1: ( ( 'sink' ) )
            // InternalSorting.g:1700:1: ( 'sink' )
            {
            // InternalSorting.g:1700:1: ( 'sink' )
            // InternalSorting.g:1701:2: 'sink'
            {
             before(grammarAccess.getSinkAccess().getSinkKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getSinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__0__Impl"


    // $ANTLR start "rule__Sink__Group__1"
    // InternalSorting.g:1710:1: rule__Sink__Group__1 : rule__Sink__Group__1__Impl rule__Sink__Group__2 ;
    public final void rule__Sink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1714:1: ( rule__Sink__Group__1__Impl rule__Sink__Group__2 )
            // InternalSorting.g:1715:2: rule__Sink__Group__1__Impl rule__Sink__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Sink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__1"


    // $ANTLR start "rule__Sink__Group__1__Impl"
    // InternalSorting.g:1722:1: rule__Sink__Group__1__Impl : ( ( rule__Sink__NameAssignment_1 ) ) ;
    public final void rule__Sink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1726:1: ( ( ( rule__Sink__NameAssignment_1 ) ) )
            // InternalSorting.g:1727:1: ( ( rule__Sink__NameAssignment_1 ) )
            {
            // InternalSorting.g:1727:1: ( ( rule__Sink__NameAssignment_1 ) )
            // InternalSorting.g:1728:2: ( rule__Sink__NameAssignment_1 )
            {
             before(grammarAccess.getSinkAccess().getNameAssignment_1()); 
            // InternalSorting.g:1729:2: ( rule__Sink__NameAssignment_1 )
            // InternalSorting.g:1729:3: rule__Sink__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sink__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__1__Impl"


    // $ANTLR start "rule__Sink__Group__2"
    // InternalSorting.g:1737:1: rule__Sink__Group__2 : rule__Sink__Group__2__Impl rule__Sink__Group__3 ;
    public final void rule__Sink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1741:1: ( rule__Sink__Group__2__Impl rule__Sink__Group__3 )
            // InternalSorting.g:1742:2: rule__Sink__Group__2__Impl rule__Sink__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Sink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__2"


    // $ANTLR start "rule__Sink__Group__2__Impl"
    // InternalSorting.g:1749:1: rule__Sink__Group__2__Impl : ( '{' ) ;
    public final void rule__Sink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1753:1: ( ( '{' ) )
            // InternalSorting.g:1754:1: ( '{' )
            {
            // InternalSorting.g:1754:1: ( '{' )
            // InternalSorting.g:1755:2: '{'
            {
             before(grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__2__Impl"


    // $ANTLR start "rule__Sink__Group__3"
    // InternalSorting.g:1764:1: rule__Sink__Group__3 : rule__Sink__Group__3__Impl rule__Sink__Group__4 ;
    public final void rule__Sink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1768:1: ( rule__Sink__Group__3__Impl rule__Sink__Group__4 )
            // InternalSorting.g:1769:2: rule__Sink__Group__3__Impl rule__Sink__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Sink__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__3"


    // $ANTLR start "rule__Sink__Group__3__Impl"
    // InternalSorting.g:1776:1: rule__Sink__Group__3__Impl : ( 'in:' ) ;
    public final void rule__Sink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1780:1: ( ( 'in:' ) )
            // InternalSorting.g:1781:1: ( 'in:' )
            {
            // InternalSorting.g:1781:1: ( 'in:' )
            // InternalSorting.g:1782:2: 'in:'
            {
             before(grammarAccess.getSinkAccess().getInKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__3__Impl"


    // $ANTLR start "rule__Sink__Group__4"
    // InternalSorting.g:1791:1: rule__Sink__Group__4 : rule__Sink__Group__4__Impl rule__Sink__Group__5 ;
    public final void rule__Sink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1795:1: ( rule__Sink__Group__4__Impl rule__Sink__Group__5 )
            // InternalSorting.g:1796:2: rule__Sink__Group__4__Impl rule__Sink__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Sink__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__4"


    // $ANTLR start "rule__Sink__Group__4__Impl"
    // InternalSorting.g:1803:1: rule__Sink__Group__4__Impl : ( ( rule__Sink__InTypeAssignment_4 ) ) ;
    public final void rule__Sink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1807:1: ( ( ( rule__Sink__InTypeAssignment_4 ) ) )
            // InternalSorting.g:1808:1: ( ( rule__Sink__InTypeAssignment_4 ) )
            {
            // InternalSorting.g:1808:1: ( ( rule__Sink__InTypeAssignment_4 ) )
            // InternalSorting.g:1809:2: ( rule__Sink__InTypeAssignment_4 )
            {
             before(grammarAccess.getSinkAccess().getInTypeAssignment_4()); 
            // InternalSorting.g:1810:2: ( rule__Sink__InTypeAssignment_4 )
            // InternalSorting.g:1810:3: rule__Sink__InTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sink__InTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSinkAccess().getInTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__4__Impl"


    // $ANTLR start "rule__Sink__Group__5"
    // InternalSorting.g:1818:1: rule__Sink__Group__5 : rule__Sink__Group__5__Impl rule__Sink__Group__6 ;
    public final void rule__Sink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1822:1: ( rule__Sink__Group__5__Impl rule__Sink__Group__6 )
            // InternalSorting.g:1823:2: rule__Sink__Group__5__Impl rule__Sink__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Sink__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__5"


    // $ANTLR start "rule__Sink__Group__5__Impl"
    // InternalSorting.g:1830:1: rule__Sink__Group__5__Impl : ( ( rule__Sink__Group_5__0 )? ) ;
    public final void rule__Sink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1834:1: ( ( ( rule__Sink__Group_5__0 )? ) )
            // InternalSorting.g:1835:1: ( ( rule__Sink__Group_5__0 )? )
            {
            // InternalSorting.g:1835:1: ( ( rule__Sink__Group_5__0 )? )
            // InternalSorting.g:1836:2: ( rule__Sink__Group_5__0 )?
            {
             before(grammarAccess.getSinkAccess().getGroup_5()); 
            // InternalSorting.g:1837:2: ( rule__Sink__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSorting.g:1837:3: rule__Sink__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sink__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSinkAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__5__Impl"


    // $ANTLR start "rule__Sink__Group__6"
    // InternalSorting.g:1845:1: rule__Sink__Group__6 : rule__Sink__Group__6__Impl ;
    public final void rule__Sink__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1849:1: ( rule__Sink__Group__6__Impl )
            // InternalSorting.g:1850:2: rule__Sink__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sink__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__6"


    // $ANTLR start "rule__Sink__Group__6__Impl"
    // InternalSorting.g:1856:1: rule__Sink__Group__6__Impl : ( '}' ) ;
    public final void rule__Sink__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1860:1: ( ( '}' ) )
            // InternalSorting.g:1861:1: ( '}' )
            {
            // InternalSorting.g:1861:1: ( '}' )
            // InternalSorting.g:1862:2: '}'
            {
             before(grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group__6__Impl"


    // $ANTLR start "rule__Sink__Group_5__0"
    // InternalSorting.g:1872:1: rule__Sink__Group_5__0 : rule__Sink__Group_5__0__Impl rule__Sink__Group_5__1 ;
    public final void rule__Sink__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1876:1: ( rule__Sink__Group_5__0__Impl rule__Sink__Group_5__1 )
            // InternalSorting.g:1877:2: rule__Sink__Group_5__0__Impl rule__Sink__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__Sink__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5__0"


    // $ANTLR start "rule__Sink__Group_5__0__Impl"
    // InternalSorting.g:1884:1: rule__Sink__Group_5__0__Impl : ( 'output-method:' ) ;
    public final void rule__Sink__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1888:1: ( ( 'output-method:' ) )
            // InternalSorting.g:1889:1: ( 'output-method:' )
            {
            // InternalSorting.g:1889:1: ( 'output-method:' )
            // InternalSorting.g:1890:2: 'output-method:'
            {
             before(grammarAccess.getSinkAccess().getOutputMethodKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getOutputMethodKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5__0__Impl"


    // $ANTLR start "rule__Sink__Group_5__1"
    // InternalSorting.g:1899:1: rule__Sink__Group_5__1 : rule__Sink__Group_5__1__Impl rule__Sink__Group_5__2 ;
    public final void rule__Sink__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1903:1: ( rule__Sink__Group_5__1__Impl rule__Sink__Group_5__2 )
            // InternalSorting.g:1904:2: rule__Sink__Group_5__1__Impl rule__Sink__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Sink__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5__1"


    // $ANTLR start "rule__Sink__Group_5__1__Impl"
    // InternalSorting.g:1911:1: rule__Sink__Group_5__1__Impl : ( ( rule__Sink__MethodAssignment_5_1 ) ) ;
    public final void rule__Sink__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1915:1: ( ( ( rule__Sink__MethodAssignment_5_1 ) ) )
            // InternalSorting.g:1916:1: ( ( rule__Sink__MethodAssignment_5_1 ) )
            {
            // InternalSorting.g:1916:1: ( ( rule__Sink__MethodAssignment_5_1 ) )
            // InternalSorting.g:1917:2: ( rule__Sink__MethodAssignment_5_1 )
            {
             before(grammarAccess.getSinkAccess().getMethodAssignment_5_1()); 
            // InternalSorting.g:1918:2: ( rule__Sink__MethodAssignment_5_1 )
            // InternalSorting.g:1918:3: rule__Sink__MethodAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Sink__MethodAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSinkAccess().getMethodAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5__1__Impl"


    // $ANTLR start "rule__Sink__Group_5__2"
    // InternalSorting.g:1926:1: rule__Sink__Group_5__2 : rule__Sink__Group_5__2__Impl ;
    public final void rule__Sink__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1930:1: ( rule__Sink__Group_5__2__Impl )
            // InternalSorting.g:1931:2: rule__Sink__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sink__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5__2"


    // $ANTLR start "rule__Sink__Group_5__2__Impl"
    // InternalSorting.g:1937:1: rule__Sink__Group_5__2__Impl : ( ( rule__Sink__Group_5_2__0 )* ) ;
    public final void rule__Sink__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1941:1: ( ( ( rule__Sink__Group_5_2__0 )* ) )
            // InternalSorting.g:1942:1: ( ( rule__Sink__Group_5_2__0 )* )
            {
            // InternalSorting.g:1942:1: ( ( rule__Sink__Group_5_2__0 )* )
            // InternalSorting.g:1943:2: ( rule__Sink__Group_5_2__0 )*
            {
             before(grammarAccess.getSinkAccess().getGroup_5_2()); 
            // InternalSorting.g:1944:2: ( rule__Sink__Group_5_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSorting.g:1944:3: rule__Sink__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Sink__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSinkAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5__2__Impl"


    // $ANTLR start "rule__Sink__Group_5_2__0"
    // InternalSorting.g:1953:1: rule__Sink__Group_5_2__0 : rule__Sink__Group_5_2__0__Impl rule__Sink__Group_5_2__1 ;
    public final void rule__Sink__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1957:1: ( rule__Sink__Group_5_2__0__Impl rule__Sink__Group_5_2__1 )
            // InternalSorting.g:1958:2: rule__Sink__Group_5_2__0__Impl rule__Sink__Group_5_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Sink__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sink__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5_2__0"


    // $ANTLR start "rule__Sink__Group_5_2__0__Impl"
    // InternalSorting.g:1965:1: rule__Sink__Group_5_2__0__Impl : ( '.' ) ;
    public final void rule__Sink__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1969:1: ( ( '.' ) )
            // InternalSorting.g:1970:1: ( '.' )
            {
            // InternalSorting.g:1970:1: ( '.' )
            // InternalSorting.g:1971:2: '.'
            {
             before(grammarAccess.getSinkAccess().getFullStopKeyword_5_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getFullStopKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5_2__0__Impl"


    // $ANTLR start "rule__Sink__Group_5_2__1"
    // InternalSorting.g:1980:1: rule__Sink__Group_5_2__1 : rule__Sink__Group_5_2__1__Impl ;
    public final void rule__Sink__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1984:1: ( rule__Sink__Group_5_2__1__Impl )
            // InternalSorting.g:1985:2: rule__Sink__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sink__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5_2__1"


    // $ANTLR start "rule__Sink__Group_5_2__1__Impl"
    // InternalSorting.g:1991:1: rule__Sink__Group_5_2__1__Impl : ( RULE_STRING ) ;
    public final void rule__Sink__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:1995:1: ( ( RULE_STRING ) )
            // InternalSorting.g:1996:1: ( RULE_STRING )
            {
            // InternalSorting.g:1996:1: ( RULE_STRING )
            // InternalSorting.g:1997:2: RULE_STRING
            {
             before(grammarAccess.getSinkAccess().getSTRINGTerminalRuleCall_5_2_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getSTRINGTerminalRuleCall_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__Group_5_2__1__Impl"


    // $ANTLR start "rule__Instance__Group__0"
    // InternalSorting.g:2007:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2011:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // InternalSorting.g:2012:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Instance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0"


    // $ANTLR start "rule__Instance__Group__0__Impl"
    // InternalSorting.g:2019:1: rule__Instance__Group__0__Impl : ( 'inst:' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2023:1: ( ( 'inst:' ) )
            // InternalSorting.g:2024:1: ( 'inst:' )
            {
            // InternalSorting.g:2024:1: ( 'inst:' )
            // InternalSorting.g:2025:2: 'inst:'
            {
             before(grammarAccess.getInstanceAccess().getInstKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getInstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0__Impl"


    // $ANTLR start "rule__Instance__Group__1"
    // InternalSorting.g:2034:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2038:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // InternalSorting.g:2039:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Instance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1"


    // $ANTLR start "rule__Instance__Group__1__Impl"
    // InternalSorting.g:2046:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__ComponentAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2050:1: ( ( ( rule__Instance__ComponentAssignment_1 ) ) )
            // InternalSorting.g:2051:1: ( ( rule__Instance__ComponentAssignment_1 ) )
            {
            // InternalSorting.g:2051:1: ( ( rule__Instance__ComponentAssignment_1 ) )
            // InternalSorting.g:2052:2: ( rule__Instance__ComponentAssignment_1 )
            {
             before(grammarAccess.getInstanceAccess().getComponentAssignment_1()); 
            // InternalSorting.g:2053:2: ( rule__Instance__ComponentAssignment_1 )
            // InternalSorting.g:2053:3: rule__Instance__ComponentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getComponentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1__Impl"


    // $ANTLR start "rule__Instance__Group__2"
    // InternalSorting.g:2061:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2065:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // InternalSorting.g:2066:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Instance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2"


    // $ANTLR start "rule__Instance__Group__2__Impl"
    // InternalSorting.g:2073:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__NameAssignment_2 ) ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2077:1: ( ( ( rule__Instance__NameAssignment_2 ) ) )
            // InternalSorting.g:2078:1: ( ( rule__Instance__NameAssignment_2 ) )
            {
            // InternalSorting.g:2078:1: ( ( rule__Instance__NameAssignment_2 ) )
            // InternalSorting.g:2079:2: ( rule__Instance__NameAssignment_2 )
            {
             before(grammarAccess.getInstanceAccess().getNameAssignment_2()); 
            // InternalSorting.g:2080:2: ( rule__Instance__NameAssignment_2 )
            // InternalSorting.g:2080:3: rule__Instance__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Instance__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2__Impl"


    // $ANTLR start "rule__Instance__Group__3"
    // InternalSorting.g:2088:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2092:1: ( rule__Instance__Group__3__Impl )
            // InternalSorting.g:2093:2: rule__Instance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__3"


    // $ANTLR start "rule__Instance__Group__3__Impl"
    // InternalSorting.g:2099:1: rule__Instance__Group__3__Impl : ( ( rule__Instance__Alternatives_3 )? ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2103:1: ( ( ( rule__Instance__Alternatives_3 )? ) )
            // InternalSorting.g:2104:1: ( ( rule__Instance__Alternatives_3 )? )
            {
            // InternalSorting.g:2104:1: ( ( rule__Instance__Alternatives_3 )? )
            // InternalSorting.g:2105:2: ( rule__Instance__Alternatives_3 )?
            {
             before(grammarAccess.getInstanceAccess().getAlternatives_3()); 
            // InternalSorting.g:2106:2: ( rule__Instance__Alternatives_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=35 && LA13_0<=36)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSorting.g:2106:3: rule__Instance__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__3__Impl"


    // $ANTLR start "rule__Instance__Group_3_0__0"
    // InternalSorting.g:2115:1: rule__Instance__Group_3_0__0 : rule__Instance__Group_3_0__0__Impl rule__Instance__Group_3_0__1 ;
    public final void rule__Instance__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2119:1: ( rule__Instance__Group_3_0__0__Impl rule__Instance__Group_3_0__1 )
            // InternalSorting.g:2120:2: rule__Instance__Group_3_0__0__Impl rule__Instance__Group_3_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Instance__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0__0"


    // $ANTLR start "rule__Instance__Group_3_0__0__Impl"
    // InternalSorting.g:2127:1: rule__Instance__Group_3_0__0__Impl : ( 'call:' ) ;
    public final void rule__Instance__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2131:1: ( ( 'call:' ) )
            // InternalSorting.g:2132:1: ( 'call:' )
            {
            // InternalSorting.g:2132:1: ( 'call:' )
            // InternalSorting.g:2133:2: 'call:'
            {
             before(grammarAccess.getInstanceAccess().getCallKeyword_3_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getCallKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0__0__Impl"


    // $ANTLR start "rule__Instance__Group_3_0__1"
    // InternalSorting.g:2142:1: rule__Instance__Group_3_0__1 : rule__Instance__Group_3_0__1__Impl rule__Instance__Group_3_0__2 ;
    public final void rule__Instance__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2146:1: ( rule__Instance__Group_3_0__1__Impl rule__Instance__Group_3_0__2 )
            // InternalSorting.g:2147:2: rule__Instance__Group_3_0__1__Impl rule__Instance__Group_3_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Instance__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0__1"


    // $ANTLR start "rule__Instance__Group_3_0__1__Impl"
    // InternalSorting.g:2154:1: rule__Instance__Group_3_0__1__Impl : ( ( rule__Instance__MethodAssignment_3_0_1 ) ) ;
    public final void rule__Instance__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2158:1: ( ( ( rule__Instance__MethodAssignment_3_0_1 ) ) )
            // InternalSorting.g:2159:1: ( ( rule__Instance__MethodAssignment_3_0_1 ) )
            {
            // InternalSorting.g:2159:1: ( ( rule__Instance__MethodAssignment_3_0_1 ) )
            // InternalSorting.g:2160:2: ( rule__Instance__MethodAssignment_3_0_1 )
            {
             before(grammarAccess.getInstanceAccess().getMethodAssignment_3_0_1()); 
            // InternalSorting.g:2161:2: ( rule__Instance__MethodAssignment_3_0_1 )
            // InternalSorting.g:2161:3: rule__Instance__MethodAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__MethodAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getMethodAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0__1__Impl"


    // $ANTLR start "rule__Instance__Group_3_0__2"
    // InternalSorting.g:2169:1: rule__Instance__Group_3_0__2 : rule__Instance__Group_3_0__2__Impl ;
    public final void rule__Instance__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2173:1: ( rule__Instance__Group_3_0__2__Impl )
            // InternalSorting.g:2174:2: rule__Instance__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0__2"


    // $ANTLR start "rule__Instance__Group_3_0__2__Impl"
    // InternalSorting.g:2180:1: rule__Instance__Group_3_0__2__Impl : ( ( rule__Instance__Group_3_0_2__0 )* ) ;
    public final void rule__Instance__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2184:1: ( ( ( rule__Instance__Group_3_0_2__0 )* ) )
            // InternalSorting.g:2185:1: ( ( rule__Instance__Group_3_0_2__0 )* )
            {
            // InternalSorting.g:2185:1: ( ( rule__Instance__Group_3_0_2__0 )* )
            // InternalSorting.g:2186:2: ( rule__Instance__Group_3_0_2__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_3_0_2()); 
            // InternalSorting.g:2187:2: ( rule__Instance__Group_3_0_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSorting.g:2187:3: rule__Instance__Group_3_0_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Instance__Group_3_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getGroup_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0__2__Impl"


    // $ANTLR start "rule__Instance__Group_3_0_2__0"
    // InternalSorting.g:2196:1: rule__Instance__Group_3_0_2__0 : rule__Instance__Group_3_0_2__0__Impl rule__Instance__Group_3_0_2__1 ;
    public final void rule__Instance__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2200:1: ( rule__Instance__Group_3_0_2__0__Impl rule__Instance__Group_3_0_2__1 )
            // InternalSorting.g:2201:2: rule__Instance__Group_3_0_2__0__Impl rule__Instance__Group_3_0_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Instance__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group_3_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0_2__0"


    // $ANTLR start "rule__Instance__Group_3_0_2__0__Impl"
    // InternalSorting.g:2208:1: rule__Instance__Group_3_0_2__0__Impl : ( '.' ) ;
    public final void rule__Instance__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2212:1: ( ( '.' ) )
            // InternalSorting.g:2213:1: ( '.' )
            {
            // InternalSorting.g:2213:1: ( '.' )
            // InternalSorting.g:2214:2: '.'
            {
             before(grammarAccess.getInstanceAccess().getFullStopKeyword_3_0_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getFullStopKeyword_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__Instance__Group_3_0_2__1"
    // InternalSorting.g:2223:1: rule__Instance__Group_3_0_2__1 : rule__Instance__Group_3_0_2__1__Impl ;
    public final void rule__Instance__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2227:1: ( rule__Instance__Group_3_0_2__1__Impl )
            // InternalSorting.g:2228:2: rule__Instance__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group_3_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0_2__1"


    // $ANTLR start "rule__Instance__Group_3_0_2__1__Impl"
    // InternalSorting.g:2234:1: rule__Instance__Group_3_0_2__1__Impl : ( RULE_STRING ) ;
    public final void rule__Instance__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2238:1: ( ( RULE_STRING ) )
            // InternalSorting.g:2239:1: ( RULE_STRING )
            {
            // InternalSorting.g:2239:1: ( RULE_STRING )
            // InternalSorting.g:2240:2: RULE_STRING
            {
             before(grammarAccess.getInstanceAccess().getSTRINGTerminalRuleCall_3_0_2_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getSTRINGTerminalRuleCall_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__Instance__Group_3_1__0"
    // InternalSorting.g:2250:1: rule__Instance__Group_3_1__0 : rule__Instance__Group_3_1__0__Impl rule__Instance__Group_3_1__1 ;
    public final void rule__Instance__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2254:1: ( rule__Instance__Group_3_1__0__Impl rule__Instance__Group_3_1__1 )
            // InternalSorting.g:2255:2: rule__Instance__Group_3_1__0__Impl rule__Instance__Group_3_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Instance__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_1__0"


    // $ANTLR start "rule__Instance__Group_3_1__0__Impl"
    // InternalSorting.g:2262:1: rule__Instance__Group_3_1__0__Impl : ( 'args:' ) ;
    public final void rule__Instance__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2266:1: ( ( 'args:' ) )
            // InternalSorting.g:2267:1: ( 'args:' )
            {
            // InternalSorting.g:2267:1: ( 'args:' )
            // InternalSorting.g:2268:2: 'args:'
            {
             before(grammarAccess.getInstanceAccess().getArgsKeyword_3_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getArgsKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_1__0__Impl"


    // $ANTLR start "rule__Instance__Group_3_1__1"
    // InternalSorting.g:2277:1: rule__Instance__Group_3_1__1 : rule__Instance__Group_3_1__1__Impl ;
    public final void rule__Instance__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2281:1: ( rule__Instance__Group_3_1__1__Impl )
            // InternalSorting.g:2282:2: rule__Instance__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_1__1"


    // $ANTLR start "rule__Instance__Group_3_1__1__Impl"
    // InternalSorting.g:2288:1: rule__Instance__Group_3_1__1__Impl : ( ( rule__Instance__ArgsAssignment_3_1_1 )* ) ;
    public final void rule__Instance__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2292:1: ( ( ( rule__Instance__ArgsAssignment_3_1_1 )* ) )
            // InternalSorting.g:2293:1: ( ( rule__Instance__ArgsAssignment_3_1_1 )* )
            {
            // InternalSorting.g:2293:1: ( ( rule__Instance__ArgsAssignment_3_1_1 )* )
            // InternalSorting.g:2294:2: ( rule__Instance__ArgsAssignment_3_1_1 )*
            {
             before(grammarAccess.getInstanceAccess().getArgsAssignment_3_1_1()); 
            // InternalSorting.g:2295:2: ( rule__Instance__ArgsAssignment_3_1_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSorting.g:2295:3: rule__Instance__ArgsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Instance__ArgsAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_3_1__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalSorting.g:2304:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2308:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalSorting.g:2309:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalSorting.g:2316:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SourceAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2320:1: ( ( ( rule__Transition__SourceAssignment_0 ) ) )
            // InternalSorting.g:2321:1: ( ( rule__Transition__SourceAssignment_0 ) )
            {
            // InternalSorting.g:2321:1: ( ( rule__Transition__SourceAssignment_0 ) )
            // InternalSorting.g:2322:2: ( rule__Transition__SourceAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 
            // InternalSorting.g:2323:2: ( rule__Transition__SourceAssignment_0 )
            // InternalSorting.g:2323:3: rule__Transition__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalSorting.g:2331:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2335:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalSorting.g:2336:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalSorting.g:2343:1: rule__Transition__Group__1__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2347:1: ( ( '=>' ) )
            // InternalSorting.g:2348:1: ( '=>' )
            {
            // InternalSorting.g:2348:1: ( '=>' )
            // InternalSorting.g:2349:2: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalSorting.g:2358:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2362:1: ( rule__Transition__Group__2__Impl )
            // InternalSorting.g:2363:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalSorting.g:2369:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__TargetAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2373:1: ( ( ( rule__Transition__TargetAssignment_2 ) ) )
            // InternalSorting.g:2374:1: ( ( rule__Transition__TargetAssignment_2 ) )
            {
            // InternalSorting.g:2374:1: ( ( rule__Transition__TargetAssignment_2 ) )
            // InternalSorting.g:2375:2: ( rule__Transition__TargetAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_2()); 
            // InternalSorting.g:2376:2: ( rule__Transition__TargetAssignment_2 )
            // InternalSorting.g:2376:3: rule__Transition__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Config__NameAssignment_2"
    // InternalSorting.g:2385:1: rule__Config__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Config__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2389:1: ( ( RULE_ID ) )
            // InternalSorting.g:2390:2: ( RULE_ID )
            {
            // InternalSorting.g:2390:2: ( RULE_ID )
            // InternalSorting.g:2391:3: RULE_ID
            {
             before(grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__NameAssignment_2"


    // $ANTLR start "rule__Config__ImportsAssignment_4"
    // InternalSorting.g:2400:1: rule__Config__ImportsAssignment_4 : ( ruleImport ) ;
    public final void rule__Config__ImportsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2404:1: ( ( ruleImport ) )
            // InternalSorting.g:2405:2: ( ruleImport )
            {
            // InternalSorting.g:2405:2: ( ruleImport )
            // InternalSorting.g:2406:3: ruleImport
            {
             before(grammarAccess.getConfigAccess().getImportsImportParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getImportsImportParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__ImportsAssignment_4"


    // $ANTLR start "rule__Config__ComponentsAssignment_6"
    // InternalSorting.g:2415:1: rule__Config__ComponentsAssignment_6 : ( ruleComponent ) ;
    public final void rule__Config__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2419:1: ( ( ruleComponent ) )
            // InternalSorting.g:2420:2: ( ruleComponent )
            {
            // InternalSorting.g:2420:2: ( ruleComponent )
            // InternalSorting.g:2421:3: ruleComponent
            {
             before(grammarAccess.getConfigAccess().getComponentsComponentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getComponentsComponentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__ComponentsAssignment_6"


    // $ANTLR start "rule__Config__TransitionsAssignment_8"
    // InternalSorting.g:2430:1: rule__Config__TransitionsAssignment_8 : ( ruleTransition ) ;
    public final void rule__Config__TransitionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2434:1: ( ( ruleTransition ) )
            // InternalSorting.g:2435:2: ( ruleTransition )
            {
            // InternalSorting.g:2435:2: ( ruleTransition )
            // InternalSorting.g:2436:3: ruleTransition
            {
             before(grammarAccess.getConfigAccess().getTransitionsTransitionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getTransitionsTransitionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__TransitionsAssignment_8"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // InternalSorting.g:2445:1: rule__Import__NameAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2449:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalSorting.g:2450:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalSorting.g:2450:2: ( ruleQualifiedNameWithWildcard )
            // InternalSorting.g:2451:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getNameQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getNameQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_1"


    // $ANTLR start "rule__Type__TypeAssignment_0"
    // InternalSorting.g:2460:1: rule__Type__TypeAssignment_0 : ( ( rule__Type__TypeAlternatives_0_0 ) ) ;
    public final void rule__Type__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2464:1: ( ( ( rule__Type__TypeAlternatives_0_0 ) ) )
            // InternalSorting.g:2465:2: ( ( rule__Type__TypeAlternatives_0_0 ) )
            {
            // InternalSorting.g:2465:2: ( ( rule__Type__TypeAlternatives_0_0 ) )
            // InternalSorting.g:2466:3: ( rule__Type__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getTypeAccess().getTypeAlternatives_0_0()); 
            // InternalSorting.g:2467:3: ( rule__Type__TypeAlternatives_0_0 )
            // InternalSorting.g:2467:4: rule__Type__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_0"


    // $ANTLR start "rule__Source__NameAssignment_1"
    // InternalSorting.g:2475:1: rule__Source__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Source__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2479:1: ( ( RULE_ID ) )
            // InternalSorting.g:2480:2: ( RULE_ID )
            {
            // InternalSorting.g:2480:2: ( RULE_ID )
            // InternalSorting.g:2481:3: RULE_ID
            {
             before(grammarAccess.getSourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__NameAssignment_1"


    // $ANTLR start "rule__Source__TypeAssignment_4"
    // InternalSorting.g:2490:1: rule__Source__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Source__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2494:1: ( ( ruleType ) )
            // InternalSorting.g:2495:2: ( ruleType )
            {
            // InternalSorting.g:2495:2: ( ruleType )
            // InternalSorting.g:2496:3: ruleType
            {
             before(grammarAccess.getSourceAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__TypeAssignment_4"


    // $ANTLR start "rule__Source__MethodAssignment_5_1"
    // InternalSorting.g:2505:1: rule__Source__MethodAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Source__MethodAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2509:1: ( ( RULE_STRING ) )
            // InternalSorting.g:2510:2: ( RULE_STRING )
            {
            // InternalSorting.g:2510:2: ( RULE_STRING )
            // InternalSorting.g:2511:3: RULE_STRING
            {
             before(grammarAccess.getSourceAccess().getMethodSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getMethodSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__MethodAssignment_5_1"


    // $ANTLR start "rule__Filter__NameAssignment_1"
    // InternalSorting.g:2520:1: rule__Filter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Filter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2524:1: ( ( RULE_ID ) )
            // InternalSorting.g:2525:2: ( RULE_ID )
            {
            // InternalSorting.g:2525:2: ( RULE_ID )
            // InternalSorting.g:2526:3: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__NameAssignment_1"


    // $ANTLR start "rule__Filter__InTypeAssignment_4"
    // InternalSorting.g:2535:1: rule__Filter__InTypeAssignment_4 : ( ruleType ) ;
    public final void rule__Filter__InTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2539:1: ( ( ruleType ) )
            // InternalSorting.g:2540:2: ( ruleType )
            {
            // InternalSorting.g:2540:2: ( ruleType )
            // InternalSorting.g:2541:3: ruleType
            {
             before(grammarAccess.getFilterAccess().getInTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getInTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__InTypeAssignment_4"


    // $ANTLR start "rule__Filter__OutTypeAssignment_6"
    // InternalSorting.g:2550:1: rule__Filter__OutTypeAssignment_6 : ( ruleType ) ;
    public final void rule__Filter__OutTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2554:1: ( ( ruleType ) )
            // InternalSorting.g:2555:2: ( ruleType )
            {
            // InternalSorting.g:2555:2: ( ruleType )
            // InternalSorting.g:2556:3: ruleType
            {
             before(grammarAccess.getFilterAccess().getOutTypeTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getOutTypeTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__OutTypeAssignment_6"


    // $ANTLR start "rule__Filter__MethodAssignment_7_1"
    // InternalSorting.g:2565:1: rule__Filter__MethodAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Filter__MethodAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2569:1: ( ( RULE_STRING ) )
            // InternalSorting.g:2570:2: ( RULE_STRING )
            {
            // InternalSorting.g:2570:2: ( RULE_STRING )
            // InternalSorting.g:2571:3: RULE_STRING
            {
             before(grammarAccess.getFilterAccess().getMethodSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getMethodSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__MethodAssignment_7_1"


    // $ANTLR start "rule__Sink__NameAssignment_1"
    // InternalSorting.g:2580:1: rule__Sink__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2584:1: ( ( RULE_ID ) )
            // InternalSorting.g:2585:2: ( RULE_ID )
            {
            // InternalSorting.g:2585:2: ( RULE_ID )
            // InternalSorting.g:2586:3: RULE_ID
            {
             before(grammarAccess.getSinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__NameAssignment_1"


    // $ANTLR start "rule__Sink__InTypeAssignment_4"
    // InternalSorting.g:2595:1: rule__Sink__InTypeAssignment_4 : ( ruleType ) ;
    public final void rule__Sink__InTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2599:1: ( ( ruleType ) )
            // InternalSorting.g:2600:2: ( ruleType )
            {
            // InternalSorting.g:2600:2: ( ruleType )
            // InternalSorting.g:2601:3: ruleType
            {
             before(grammarAccess.getSinkAccess().getInTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSinkAccess().getInTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__InTypeAssignment_4"


    // $ANTLR start "rule__Sink__MethodAssignment_5_1"
    // InternalSorting.g:2610:1: rule__Sink__MethodAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Sink__MethodAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2614:1: ( ( RULE_STRING ) )
            // InternalSorting.g:2615:2: ( RULE_STRING )
            {
            // InternalSorting.g:2615:2: ( RULE_STRING )
            // InternalSorting.g:2616:3: RULE_STRING
            {
             before(grammarAccess.getSinkAccess().getMethodSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSinkAccess().getMethodSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sink__MethodAssignment_5_1"


    // $ANTLR start "rule__Instance__ComponentAssignment_1"
    // InternalSorting.g:2625:1: rule__Instance__ComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Instance__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2629:1: ( ( ( RULE_ID ) ) )
            // InternalSorting.g:2630:2: ( ( RULE_ID ) )
            {
            // InternalSorting.g:2630:2: ( ( RULE_ID ) )
            // InternalSorting.g:2631:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceAccess().getComponentComponentCrossReference_1_0()); 
            // InternalSorting.g:2632:3: ( RULE_ID )
            // InternalSorting.g:2633:4: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getComponentComponentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getComponentComponentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInstanceAccess().getComponentComponentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ComponentAssignment_1"


    // $ANTLR start "rule__Instance__NameAssignment_2"
    // InternalSorting.g:2644:1: rule__Instance__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2648:1: ( ( RULE_ID ) )
            // InternalSorting.g:2649:2: ( RULE_ID )
            {
            // InternalSorting.g:2649:2: ( RULE_ID )
            // InternalSorting.g:2650:3: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__NameAssignment_2"


    // $ANTLR start "rule__Instance__MethodAssignment_3_0_1"
    // InternalSorting.g:2659:1: rule__Instance__MethodAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__Instance__MethodAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2663:1: ( ( RULE_STRING ) )
            // InternalSorting.g:2664:2: ( RULE_STRING )
            {
            // InternalSorting.g:2664:2: ( RULE_STRING )
            // InternalSorting.g:2665:3: RULE_STRING
            {
             before(grammarAccess.getInstanceAccess().getMethodSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getMethodSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__MethodAssignment_3_0_1"


    // $ANTLR start "rule__Instance__ArgsAssignment_3_1_1"
    // InternalSorting.g:2674:1: rule__Instance__ArgsAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Instance__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2678:1: ( ( RULE_STRING ) )
            // InternalSorting.g:2679:2: ( RULE_STRING )
            {
            // InternalSorting.g:2679:2: ( RULE_STRING )
            // InternalSorting.g:2680:3: RULE_STRING
            {
             before(grammarAccess.getInstanceAccess().getArgsSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getArgsSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__Transition__SourceAssignment_0"
    // InternalSorting.g:2689:1: rule__Transition__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2693:1: ( ( ( RULE_ID ) ) )
            // InternalSorting.g:2694:2: ( ( RULE_ID ) )
            {
            // InternalSorting.g:2694:2: ( ( RULE_ID ) )
            // InternalSorting.g:2695:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceComponentCrossReference_0_0()); 
            // InternalSorting.g:2696:3: ( RULE_ID )
            // InternalSorting.g:2697:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSourceComponentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceComponentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceComponentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_0"


    // $ANTLR start "rule__Transition__TargetAssignment_2"
    // InternalSorting.g:2708:1: rule__Transition__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSorting.g:2712:1: ( ( ( RULE_ID ) ) )
            // InternalSorting.g:2713:2: ( ( RULE_ID ) )
            {
            // InternalSorting.g:2713:2: ( ( RULE_ID ) )
            // InternalSorting.g:2714:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetComponentCrossReference_2_0()); 
            // InternalSorting.g:2715:3: ( RULE_ID )
            // InternalSorting.g:2716:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetComponentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetComponentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetComponentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000521000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});

}