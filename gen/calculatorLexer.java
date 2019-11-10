// Generated from C:/Users/Paolo/IdeaProjects/calc\calculatorLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, LPAREN=2, RPAREN=3, PLUS=4, MINUS=5, TIMES=6, DIV=7, POINT=8, POW=9, 
		WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUM", "NUMBER", "UNSIGNED_INTEGER", "SIGN", "LPAREN", "RPAREN", "PLUS", 
			"MINUS", "TIMES", "DIV", "POINT", "POW", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "POINT", 
			"POW", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public calculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculatorLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fJ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\6\3!\n\3\r\3\16\3\"\3\3\3\3"+
		"\6\3\'\n\3\r\3\16\3(\5\3+\n\3\3\4\6\4.\n\4\r\4\16\4/\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16E\n"+
		"\16\r\16\16\16F\3\16\3\16\2\2\17\3\3\5\2\7\2\t\2\13\4\r\5\17\6\21\7\23"+
		"\b\25\t\27\n\31\13\33\f\3\2\4\4\2--//\5\2\13\f\17\17\"\"\2K\2\3\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5 \3\2\2"+
		"\2\7-\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21"+
		"9\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33D\3\2\2\2"+
		"\35\36\5\5\3\2\36\4\3\2\2\2\37!\4\62;\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2"+
		"\2\2\"#\3\2\2\2#*\3\2\2\2$&\7\60\2\2%\'\4\62;\2&%\3\2\2\2\'(\3\2\2\2("+
		"&\3\2\2\2()\3\2\2\2)+\3\2\2\2*$\3\2\2\2*+\3\2\2\2+\6\3\2\2\2,.\4\62;\2"+
		"-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\b\3\2\2\2\61\62\t\2\2\2"+
		"\62\n\3\2\2\2\63\64\7*\2\2\64\f\3\2\2\2\65\66\7+\2\2\66\16\3\2\2\2\67"+
		"8\7-\2\28\20\3\2\2\29:\7/\2\2:\22\3\2\2\2;<\7,\2\2<\24\3\2\2\2=>\7\61"+
		"\2\2>\26\3\2\2\2?@\7\60\2\2@\30\3\2\2\2AB\7`\2\2B\32\3\2\2\2CE\t\3\2\2"+
		"DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\16\2\2I\34\3\2"+
		"\2\2\b\2\"(*/F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}