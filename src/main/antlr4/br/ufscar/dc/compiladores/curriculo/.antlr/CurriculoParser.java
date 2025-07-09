// Generated from c:/Users/jakso/Desktop/Trabalhos/Compiladores T6/T6/curriculo-compilador/src/main/antlr4/br/ufscar/dc/compiladores/curriculo/Curriculo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CurriculoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CURRICULO=1, SECAO=2, EDUCACAO=3, EXPERIENCIA=4, HABILIDADES=5, IDIOMAS=6, 
		HABILIDADE=7, IDIOMA=8, GRADUACAO=9, POS_GRADUACAO=10, TECNICO=11, AVANCADO=12, 
		INTERMEDIARIO=13, BASICO=14, TRUE=15, FALSE=16, NOME=17, EMAIL=18, TELEFONE=19, 
		ENDERECO=20, LINKEDIN=21, GITHUB=22, INSTITUICAO=23, CURSO=24, NIVEL=25, 
		INICIO=26, FIM=27, CONCLUIDO=28, NOTA=29, EMPRESA=30, CARGO=31, ATUAL=32, 
		DESCRICAO=33, TECNOLOGIAS=34, CATEGORIA=35, ABRE_CHAVE=36, FECHA_CHAVE=37, 
		DOIS_PONTOS=38, PONTO_VIRGULA=39, VIRGULA=40, ABRE_COL=41, FECHA_COL=42, 
		STRING=43, NUM_INT=44, NUM_REAL=45, IDENT=46, WS=47, COMENTARIO=48;
	public static final int
		RULE_programa = 0, RULE_curriculo = 1, RULE_campos_curriculo = 2, RULE_campo_curriculo = 3, 
		RULE_secoes = 4, RULE_secao_educacao = 5, RULE_educacao_item = 6, RULE_campos_educacao = 7, 
		RULE_campo_educacao = 8, RULE_nivel_educacao = 9, RULE_secao_experiencia = 10, 
		RULE_experiencia_item = 11, RULE_campos_experiencia = 12, RULE_campo_experiencia = 13, 
		RULE_secao_habilidades = 14, RULE_habilidade_item = 15, RULE_campos_habilidade = 16, 
		RULE_campo_habilidade = 17, RULE_nivel_habilidade = 18, RULE_secao_idiomas = 19, 
		RULE_idioma_item = 20, RULE_campos_idioma = 21, RULE_campo_idioma = 22, 
		RULE_valor_booleano = 23, RULE_numero = 24, RULE_lista_strings = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "curriculo", "campos_curriculo", "campo_curriculo", "secoes", 
			"secao_educacao", "educacao_item", "campos_educacao", "campo_educacao", 
			"nivel_educacao", "secao_experiencia", "experiencia_item", "campos_experiencia", 
			"campo_experiencia", "secao_habilidades", "habilidade_item", "campos_habilidade", 
			"campo_habilidade", "nivel_habilidade", "secao_idiomas", "idioma_item", 
			"campos_idioma", "campo_idioma", "valor_booleano", "numero", "lista_strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CURRICULO'", "'SECAO'", "'educacao'", "'experiencia'", "'habilidades'", 
			"'idiomas'", "'habilidade'", "'idioma'", "'GRADUACAO'", "'POS_GRADUACAO'", 
			"'TECNICO'", "'AVANCADO'", "'INTERMEDIARIO'", "'BASICO'", "'true'", "'false'", 
			"'nome'", "'email'", "'telefone'", "'endereco'", "'linkedin'", "'github'", 
			"'instituicao'", "'curso'", "'nivel'", "'inicio'", "'fim'", "'concluido'", 
			"'nota'", "'empresa'", "'cargo'", "'atual'", "'descricao'", "'tecnologias'", 
			"'categoria'", "'{'", "'}'", "':'", "';'", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CURRICULO", "SECAO", "EDUCACAO", "EXPERIENCIA", "HABILIDADES", 
			"IDIOMAS", "HABILIDADE", "IDIOMA", "GRADUACAO", "POS_GRADUACAO", "TECNICO", 
			"AVANCADO", "INTERMEDIARIO", "BASICO", "TRUE", "FALSE", "NOME", "EMAIL", 
			"TELEFONE", "ENDERECO", "LINKEDIN", "GITHUB", "INSTITUICAO", "CURSO", 
			"NIVEL", "INICIO", "FIM", "CONCLUIDO", "NOTA", "EMPRESA", "CARGO", "ATUAL", 
			"DESCRICAO", "TECNOLOGIAS", "CATEGORIA", "ABRE_CHAVE", "FECHA_CHAVE", 
			"DOIS_PONTOS", "PONTO_VIRGULA", "VIRGULA", "ABRE_COL", "FECHA_COL", "STRING", 
			"NUM_INT", "NUM_REAL", "IDENT", "WS", "COMENTARIO"
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

	@Override
	public String getGrammarFileName() { return "Curriculo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CurriculoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public CurriculoContext curriculo() {
			return getRuleContext(CurriculoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CurriculoParser.EOF, 0); }
		public List<SecoesContext> secoes() {
			return getRuleContexts(SecoesContext.class);
		}
		public SecoesContext secoes(int i) {
			return getRuleContext(SecoesContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			curriculo();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SECAO) {
				{
				{
				setState(53);
				secoes();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CurriculoContext extends ParserRuleContext {
		public TerminalNode CURRICULO() { return getToken(CurriculoParser.CURRICULO, 0); }
		public TerminalNode IDENT() { return getToken(CurriculoParser.IDENT, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public Campos_curriculoContext campos_curriculo() {
			return getRuleContext(Campos_curriculoContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public CurriculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curriculo; }
	}

	public final CurriculoContext curriculo() throws RecognitionException {
		CurriculoContext _localctx = new CurriculoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_curriculo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CURRICULO);
			setState(62);
			match(IDENT);
			setState(63);
			match(ABRE_CHAVE);
			setState(64);
			campos_curriculo();
			setState(65);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campos_curriculoContext extends ParserRuleContext {
		public List<Campo_curriculoContext> campo_curriculo() {
			return getRuleContexts(Campo_curriculoContext.class);
		}
		public Campo_curriculoContext campo_curriculo(int i) {
			return getRuleContext(Campo_curriculoContext.class,i);
		}
		public Campos_curriculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos_curriculo; }
	}

	public final Campos_curriculoContext campos_curriculo() throws RecognitionException {
		Campos_curriculoContext _localctx = new Campos_curriculoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_campos_curriculo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0)) {
				{
				{
				setState(67);
				campo_curriculo();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campo_curriculoContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(CurriculoParser.NOME, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(CurriculoParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(CurriculoParser.STRING, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CurriculoParser.PONTO_VIRGULA, 0); }
		public TerminalNode EMAIL() { return getToken(CurriculoParser.EMAIL, 0); }
		public TerminalNode TELEFONE() { return getToken(CurriculoParser.TELEFONE, 0); }
		public TerminalNode ENDERECO() { return getToken(CurriculoParser.ENDERECO, 0); }
		public TerminalNode LINKEDIN() { return getToken(CurriculoParser.LINKEDIN, 0); }
		public TerminalNode GITHUB() { return getToken(CurriculoParser.GITHUB, 0); }
		public Campo_curriculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_curriculo; }
	}

	public final Campo_curriculoContext campo_curriculo() throws RecognitionException {
		Campo_curriculoContext _localctx = new Campo_curriculoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_campo_curriculo);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(NOME);
				setState(74);
				match(DOIS_PONTOS);
				setState(75);
				match(STRING);
				setState(76);
				match(PONTO_VIRGULA);
				}
				break;
			case EMAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(EMAIL);
				setState(78);
				match(DOIS_PONTOS);
				setState(79);
				match(STRING);
				setState(80);
				match(PONTO_VIRGULA);
				}
				break;
			case TELEFONE:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(TELEFONE);
				setState(82);
				match(DOIS_PONTOS);
				setState(83);
				match(STRING);
				setState(84);
				match(PONTO_VIRGULA);
				}
				break;
			case ENDERECO:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(ENDERECO);
				setState(86);
				match(DOIS_PONTOS);
				setState(87);
				match(STRING);
				setState(88);
				match(PONTO_VIRGULA);
				}
				break;
			case LINKEDIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(LINKEDIN);
				setState(90);
				match(DOIS_PONTOS);
				setState(91);
				match(STRING);
				setState(92);
				match(PONTO_VIRGULA);
				}
				break;
			case GITHUB:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(GITHUB);
				setState(94);
				match(DOIS_PONTOS);
				setState(95);
				match(STRING);
				setState(96);
				match(PONTO_VIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SecoesContext extends ParserRuleContext {
		public Secao_educacaoContext secao_educacao() {
			return getRuleContext(Secao_educacaoContext.class,0);
		}
		public Secao_experienciaContext secao_experiencia() {
			return getRuleContext(Secao_experienciaContext.class,0);
		}
		public Secao_habilidadesContext secao_habilidades() {
			return getRuleContext(Secao_habilidadesContext.class,0);
		}
		public Secao_idiomasContext secao_idiomas() {
			return getRuleContext(Secao_idiomasContext.class,0);
		}
		public SecoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secoes; }
	}

	public final SecoesContext secoes() throws RecognitionException {
		SecoesContext _localctx = new SecoesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_secoes);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				secao_educacao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				secao_experiencia();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				secao_habilidades();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				secao_idiomas();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Secao_educacaoContext extends ParserRuleContext {
		public TerminalNode SECAO() { return getToken(CurriculoParser.SECAO, 0); }
		public TerminalNode EDUCACAO() { return getToken(CurriculoParser.EDUCACAO, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public List<Educacao_itemContext> educacao_item() {
			return getRuleContexts(Educacao_itemContext.class);
		}
		public Educacao_itemContext educacao_item(int i) {
			return getRuleContext(Educacao_itemContext.class,i);
		}
		public Secao_educacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secao_educacao; }
	}

	public final Secao_educacaoContext secao_educacao() throws RecognitionException {
		Secao_educacaoContext _localctx = new Secao_educacaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_secao_educacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(SECAO);
			setState(106);
			match(EDUCACAO);
			setState(107);
			match(ABRE_CHAVE);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EDUCACAO) {
				{
				{
				setState(108);
				educacao_item();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Educacao_itemContext extends ParserRuleContext {
		public TerminalNode EDUCACAO() { return getToken(CurriculoParser.EDUCACAO, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public Campos_educacaoContext campos_educacao() {
			return getRuleContext(Campos_educacaoContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public Educacao_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_educacao_item; }
	}

	public final Educacao_itemContext educacao_item() throws RecognitionException {
		Educacao_itemContext _localctx = new Educacao_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_educacao_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(EDUCACAO);
			setState(117);
			match(ABRE_CHAVE);
			setState(118);
			campos_educacao();
			setState(119);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campos_educacaoContext extends ParserRuleContext {
		public List<Campo_educacaoContext> campo_educacao() {
			return getRuleContexts(Campo_educacaoContext.class);
		}
		public Campo_educacaoContext campo_educacao(int i) {
			return getRuleContext(Campo_educacaoContext.class,i);
		}
		public Campos_educacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos_educacao; }
	}

	public final Campos_educacaoContext campos_educacao() throws RecognitionException {
		Campos_educacaoContext _localctx = new Campos_educacaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_campos_educacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1065353216L) != 0)) {
				{
				{
				setState(121);
				campo_educacao();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campo_educacaoContext extends ParserRuleContext {
		public TerminalNode INSTITUICAO() { return getToken(CurriculoParser.INSTITUICAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(CurriculoParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(CurriculoParser.STRING, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CurriculoParser.PONTO_VIRGULA, 0); }
		public TerminalNode CURSO() { return getToken(CurriculoParser.CURSO, 0); }
		public TerminalNode NIVEL() { return getToken(CurriculoParser.NIVEL, 0); }
		public Nivel_educacaoContext nivel_educacao() {
			return getRuleContext(Nivel_educacaoContext.class,0);
		}
		public TerminalNode INICIO() { return getToken(CurriculoParser.INICIO, 0); }
		public TerminalNode FIM() { return getToken(CurriculoParser.FIM, 0); }
		public TerminalNode CONCLUIDO() { return getToken(CurriculoParser.CONCLUIDO, 0); }
		public Valor_booleanoContext valor_booleano() {
			return getRuleContext(Valor_booleanoContext.class,0);
		}
		public TerminalNode NOTA() { return getToken(CurriculoParser.NOTA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Campo_educacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_educacao; }
	}

	public final Campo_educacaoContext campo_educacao() throws RecognitionException {
		Campo_educacaoContext _localctx = new Campo_educacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_campo_educacao);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSTITUICAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(INSTITUICAO);
				setState(128);
				match(DOIS_PONTOS);
				setState(129);
				match(STRING);
				setState(130);
				match(PONTO_VIRGULA);
				}
				break;
			case CURSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(CURSO);
				setState(132);
				match(DOIS_PONTOS);
				setState(133);
				match(STRING);
				setState(134);
				match(PONTO_VIRGULA);
				}
				break;
			case NIVEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(NIVEL);
				setState(136);
				match(DOIS_PONTOS);
				setState(137);
				nivel_educacao();
				setState(138);
				match(PONTO_VIRGULA);
				}
				break;
			case INICIO:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(INICIO);
				setState(141);
				match(DOIS_PONTOS);
				setState(142);
				match(STRING);
				setState(143);
				match(PONTO_VIRGULA);
				}
				break;
			case FIM:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(FIM);
				setState(145);
				match(DOIS_PONTOS);
				setState(146);
				match(STRING);
				setState(147);
				match(PONTO_VIRGULA);
				}
				break;
			case CONCLUIDO:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				match(CONCLUIDO);
				setState(149);
				match(DOIS_PONTOS);
				setState(150);
				valor_booleano();
				setState(151);
				match(PONTO_VIRGULA);
				}
				break;
			case NOTA:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				match(NOTA);
				setState(154);
				match(DOIS_PONTOS);
				setState(155);
				numero();
				setState(156);
				match(PONTO_VIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nivel_educacaoContext extends ParserRuleContext {
		public TerminalNode GRADUACAO() { return getToken(CurriculoParser.GRADUACAO, 0); }
		public TerminalNode POS_GRADUACAO() { return getToken(CurriculoParser.POS_GRADUACAO, 0); }
		public TerminalNode TECNICO() { return getToken(CurriculoParser.TECNICO, 0); }
		public Nivel_educacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivel_educacao; }
	}

	public final Nivel_educacaoContext nivel_educacao() throws RecognitionException {
		Nivel_educacaoContext _localctx = new Nivel_educacaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nivel_educacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Secao_experienciaContext extends ParserRuleContext {
		public TerminalNode SECAO() { return getToken(CurriculoParser.SECAO, 0); }
		public TerminalNode EXPERIENCIA() { return getToken(CurriculoParser.EXPERIENCIA, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public List<Experiencia_itemContext> experiencia_item() {
			return getRuleContexts(Experiencia_itemContext.class);
		}
		public Experiencia_itemContext experiencia_item(int i) {
			return getRuleContext(Experiencia_itemContext.class,i);
		}
		public Secao_experienciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secao_experiencia; }
	}

	public final Secao_experienciaContext secao_experiencia() throws RecognitionException {
		Secao_experienciaContext _localctx = new Secao_experienciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_secao_experiencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(SECAO);
			setState(163);
			match(EXPERIENCIA);
			setState(164);
			match(ABRE_CHAVE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPERIENCIA) {
				{
				{
				setState(165);
				experiencia_item();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Experiencia_itemContext extends ParserRuleContext {
		public TerminalNode EXPERIENCIA() { return getToken(CurriculoParser.EXPERIENCIA, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public Campos_experienciaContext campos_experiencia() {
			return getRuleContext(Campos_experienciaContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public Experiencia_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experiencia_item; }
	}

	public final Experiencia_itemContext experiencia_item() throws RecognitionException {
		Experiencia_itemContext _localctx = new Experiencia_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_experiencia_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(EXPERIENCIA);
			setState(174);
			match(ABRE_CHAVE);
			setState(175);
			campos_experiencia();
			setState(176);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campos_experienciaContext extends ParserRuleContext {
		public List<Campo_experienciaContext> campo_experiencia() {
			return getRuleContexts(Campo_experienciaContext.class);
		}
		public Campo_experienciaContext campo_experiencia(int i) {
			return getRuleContext(Campo_experienciaContext.class,i);
		}
		public Campos_experienciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos_experiencia; }
	}

	public final Campos_experienciaContext campos_experiencia() throws RecognitionException {
		Campos_experienciaContext _localctx = new Campos_experienciaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_campos_experiencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33353105408L) != 0)) {
				{
				{
				setState(178);
				campo_experiencia();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campo_experienciaContext extends ParserRuleContext {
		public TerminalNode EMPRESA() { return getToken(CurriculoParser.EMPRESA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(CurriculoParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(CurriculoParser.STRING, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CurriculoParser.PONTO_VIRGULA, 0); }
		public TerminalNode CARGO() { return getToken(CurriculoParser.CARGO, 0); }
		public TerminalNode INICIO() { return getToken(CurriculoParser.INICIO, 0); }
		public TerminalNode ATUAL() { return getToken(CurriculoParser.ATUAL, 0); }
		public Valor_booleanoContext valor_booleano() {
			return getRuleContext(Valor_booleanoContext.class,0);
		}
		public TerminalNode DESCRICAO() { return getToken(CurriculoParser.DESCRICAO, 0); }
		public TerminalNode TECNOLOGIAS() { return getToken(CurriculoParser.TECNOLOGIAS, 0); }
		public Lista_stringsContext lista_strings() {
			return getRuleContext(Lista_stringsContext.class,0);
		}
		public Campo_experienciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_experiencia; }
	}

	public final Campo_experienciaContext campo_experiencia() throws RecognitionException {
		Campo_experienciaContext _localctx = new Campo_experienciaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_campo_experiencia);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPRESA:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(EMPRESA);
				setState(185);
				match(DOIS_PONTOS);
				setState(186);
				match(STRING);
				setState(187);
				match(PONTO_VIRGULA);
				}
				break;
			case CARGO:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(CARGO);
				setState(189);
				match(DOIS_PONTOS);
				setState(190);
				match(STRING);
				setState(191);
				match(PONTO_VIRGULA);
				}
				break;
			case INICIO:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(INICIO);
				setState(193);
				match(DOIS_PONTOS);
				setState(194);
				match(STRING);
				setState(195);
				match(PONTO_VIRGULA);
				}
				break;
			case ATUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(ATUAL);
				setState(197);
				match(DOIS_PONTOS);
				setState(198);
				valor_booleano();
				setState(199);
				match(PONTO_VIRGULA);
				}
				break;
			case DESCRICAO:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(DESCRICAO);
				setState(202);
				match(DOIS_PONTOS);
				setState(203);
				match(STRING);
				setState(204);
				match(PONTO_VIRGULA);
				}
				break;
			case TECNOLOGIAS:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(TECNOLOGIAS);
				setState(206);
				match(DOIS_PONTOS);
				setState(207);
				lista_strings();
				setState(208);
				match(PONTO_VIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Secao_habilidadesContext extends ParserRuleContext {
		public TerminalNode SECAO() { return getToken(CurriculoParser.SECAO, 0); }
		public TerminalNode HABILIDADES() { return getToken(CurriculoParser.HABILIDADES, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public List<Habilidade_itemContext> habilidade_item() {
			return getRuleContexts(Habilidade_itemContext.class);
		}
		public Habilidade_itemContext habilidade_item(int i) {
			return getRuleContext(Habilidade_itemContext.class,i);
		}
		public Secao_habilidadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secao_habilidades; }
	}

	public final Secao_habilidadesContext secao_habilidades() throws RecognitionException {
		Secao_habilidadesContext _localctx = new Secao_habilidadesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_secao_habilidades);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(SECAO);
			setState(213);
			match(HABILIDADES);
			setState(214);
			match(ABRE_CHAVE);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HABILIDADE) {
				{
				{
				setState(215);
				habilidade_item();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Habilidade_itemContext extends ParserRuleContext {
		public TerminalNode HABILIDADE() { return getToken(CurriculoParser.HABILIDADE, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public Campos_habilidadeContext campos_habilidade() {
			return getRuleContext(Campos_habilidadeContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public Habilidade_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_habilidade_item; }
	}

	public final Habilidade_itemContext habilidade_item() throws RecognitionException {
		Habilidade_itemContext _localctx = new Habilidade_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_habilidade_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(HABILIDADE);
			setState(224);
			match(ABRE_CHAVE);
			setState(225);
			campos_habilidade();
			setState(226);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campos_habilidadeContext extends ParserRuleContext {
		public List<Campo_habilidadeContext> campo_habilidade() {
			return getRuleContexts(Campo_habilidadeContext.class);
		}
		public Campo_habilidadeContext campo_habilidade(int i) {
			return getRuleContext(Campo_habilidadeContext.class,i);
		}
		public Campos_habilidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos_habilidade; }
	}

	public final Campos_habilidadeContext campos_habilidade() throws RecognitionException {
		Campos_habilidadeContext _localctx = new Campos_habilidadeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_campos_habilidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34393423872L) != 0)) {
				{
				{
				setState(228);
				campo_habilidade();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campo_habilidadeContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(CurriculoParser.NOME, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(CurriculoParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(CurriculoParser.STRING, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CurriculoParser.PONTO_VIRGULA, 0); }
		public TerminalNode NIVEL() { return getToken(CurriculoParser.NIVEL, 0); }
		public Nivel_habilidadeContext nivel_habilidade() {
			return getRuleContext(Nivel_habilidadeContext.class,0);
		}
		public TerminalNode CATEGORIA() { return getToken(CurriculoParser.CATEGORIA, 0); }
		public Campo_habilidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_habilidade; }
	}

	public final Campo_habilidadeContext campo_habilidade() throws RecognitionException {
		Campo_habilidadeContext _localctx = new Campo_habilidadeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_campo_habilidade);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(NOME);
				setState(235);
				match(DOIS_PONTOS);
				setState(236);
				match(STRING);
				setState(237);
				match(PONTO_VIRGULA);
				}
				break;
			case NIVEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(NIVEL);
				setState(239);
				match(DOIS_PONTOS);
				setState(240);
				nivel_habilidade();
				setState(241);
				match(PONTO_VIRGULA);
				}
				break;
			case CATEGORIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(CATEGORIA);
				setState(244);
				match(DOIS_PONTOS);
				setState(245);
				match(STRING);
				setState(246);
				match(PONTO_VIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nivel_habilidadeContext extends ParserRuleContext {
		public TerminalNode AVANCADO() { return getToken(CurriculoParser.AVANCADO, 0); }
		public TerminalNode INTERMEDIARIO() { return getToken(CurriculoParser.INTERMEDIARIO, 0); }
		public TerminalNode BASICO() { return getToken(CurriculoParser.BASICO, 0); }
		public Nivel_habilidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivel_habilidade; }
	}

	public final Nivel_habilidadeContext nivel_habilidade() throws RecognitionException {
		Nivel_habilidadeContext _localctx = new Nivel_habilidadeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nivel_habilidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Secao_idiomasContext extends ParserRuleContext {
		public TerminalNode SECAO() { return getToken(CurriculoParser.SECAO, 0); }
		public TerminalNode IDIOMAS() { return getToken(CurriculoParser.IDIOMAS, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public List<Idioma_itemContext> idioma_item() {
			return getRuleContexts(Idioma_itemContext.class);
		}
		public Idioma_itemContext idioma_item(int i) {
			return getRuleContext(Idioma_itemContext.class,i);
		}
		public Secao_idiomasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secao_idiomas; }
	}

	public final Secao_idiomasContext secao_idiomas() throws RecognitionException {
		Secao_idiomasContext _localctx = new Secao_idiomasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_secao_idiomas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(SECAO);
			setState(252);
			match(IDIOMAS);
			setState(253);
			match(ABRE_CHAVE);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDIOMA) {
				{
				{
				setState(254);
				idioma_item();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Idioma_itemContext extends ParserRuleContext {
		public TerminalNode IDIOMA() { return getToken(CurriculoParser.IDIOMA, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(CurriculoParser.ABRE_CHAVE, 0); }
		public Campos_idiomaContext campos_idioma() {
			return getRuleContext(Campos_idiomaContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(CurriculoParser.FECHA_CHAVE, 0); }
		public Idioma_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idioma_item; }
	}

	public final Idioma_itemContext idioma_item() throws RecognitionException {
		Idioma_itemContext _localctx = new Idioma_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idioma_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IDIOMA);
			setState(263);
			match(ABRE_CHAVE);
			setState(264);
			campos_idioma();
			setState(265);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campos_idiomaContext extends ParserRuleContext {
		public List<Campo_idiomaContext> campo_idioma() {
			return getRuleContexts(Campo_idiomaContext.class);
		}
		public Campo_idiomaContext campo_idioma(int i) {
			return getRuleContext(Campo_idiomaContext.class,i);
		}
		public Campos_idiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos_idioma; }
	}

	public final Campos_idiomaContext campos_idioma() throws RecognitionException {
		Campos_idiomaContext _localctx = new Campos_idiomaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_campos_idioma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOME || _la==NIVEL) {
				{
				{
				setState(267);
				campo_idioma();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campo_idiomaContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(CurriculoParser.NOME, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(CurriculoParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(CurriculoParser.STRING, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CurriculoParser.PONTO_VIRGULA, 0); }
		public TerminalNode NIVEL() { return getToken(CurriculoParser.NIVEL, 0); }
		public Nivel_habilidadeContext nivel_habilidade() {
			return getRuleContext(Nivel_habilidadeContext.class,0);
		}
		public Campo_idiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_idioma; }
	}

	public final Campo_idiomaContext campo_idioma() throws RecognitionException {
		Campo_idiomaContext _localctx = new Campo_idiomaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_campo_idioma);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(NOME);
				setState(274);
				match(DOIS_PONTOS);
				setState(275);
				match(STRING);
				setState(276);
				match(PONTO_VIRGULA);
				}
				break;
			case NIVEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(NIVEL);
				setState(278);
				match(DOIS_PONTOS);
				setState(279);
				nivel_habilidade();
				setState(280);
				match(PONTO_VIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_booleanoContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CurriculoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CurriculoParser.FALSE, 0); }
		public Valor_booleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_booleano; }
	}

	public final Valor_booleanoContext valor_booleano() throws RecognitionException {
		Valor_booleanoContext _localctx = new Valor_booleanoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valor_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(CurriculoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(CurriculoParser.NUM_REAL, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==NUM_REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_stringsContext extends ParserRuleContext {
		public TerminalNode ABRE_COL() { return getToken(CurriculoParser.ABRE_COL, 0); }
		public TerminalNode FECHA_COL() { return getToken(CurriculoParser.FECHA_COL, 0); }
		public List<TerminalNode> STRING() { return getTokens(CurriculoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CurriculoParser.STRING, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CurriculoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CurriculoParser.VIRGULA, i);
		}
		public Lista_stringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_strings; }
	}

	public final Lista_stringsContext lista_strings() throws RecognitionException {
		Lista_stringsContext _localctx = new Lista_stringsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lista_strings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ABRE_COL);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(289);
				match(STRING);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(290);
					match(VIRGULA);
					setState(291);
					match(STRING);
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(299);
			match(FECHA_COL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000"+
		"\n\u0000\f\u0000:\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002"+
		"E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005n\b\u0005\n\u0005\f\u0005"+
		"q\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007"+
		"~\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009f\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a7\b\n\n\n\f\n\u00aa\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0005\f\u00b4\b\f\n\f\f\f\u00b7\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d3\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00d9\b\u000e\n\u000e"+
		"\f\u000e\u00dc\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0005\u0010\u00e6\b\u0010"+
		"\n\u0010\f\u0010\u00e9\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f8\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0100\b\u0013\n\u0013\f\u0013\u0103\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0005\u0015\u010d\b\u0015\n\u0015\f\u0015\u0110\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u011b\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0125\b\u0019\n\u0019\f\u0019\u0128\t\u0019\u0003\u0019\u012a\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02\u0000\u0004\u0001\u0000\t\u000b\u0001\u0000\f\u000e\u0001"+
		"\u0000\u000f\u0010\u0001\u0000,-\u0135\u00004\u0001\u0000\u0000\u0000"+
		"\u0002=\u0001\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000\u0006a"+
		"\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000"+
		"\u0000\ft\u0001\u0000\u0000\u0000\u000e|\u0001\u0000\u0000\u0000\u0010"+
		"\u009e\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000\u0000\u0000\u0014"+
		"\u00a2\u0001\u0000\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000\u0018"+
		"\u00b5\u0001\u0000\u0000\u0000\u001a\u00d2\u0001\u0000\u0000\u0000\u001c"+
		"\u00d4\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000\u0000\u0000 \u00e7"+
		"\u0001\u0000\u0000\u0000\"\u00f7\u0001\u0000\u0000\u0000$\u00f9\u0001"+
		"\u0000\u0000\u0000&\u00fb\u0001\u0000\u0000\u0000(\u0106\u0001\u0000\u0000"+
		"\u0000*\u010e\u0001\u0000\u0000\u0000,\u011a\u0001\u0000\u0000\u0000."+
		"\u011c\u0001\u0000\u0000\u00000\u011e\u0001\u0000\u0000\u00002\u0120\u0001"+
		"\u0000\u0000\u000048\u0003\u0002\u0001\u000057\u0003\b\u0004\u000065\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0000\u0000\u0001<\u0001\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0001\u0000\u0000>?\u0005.\u0000\u0000?@\u0005$\u0000\u0000@A\u0003\u0004"+
		"\u0002\u0000AB\u0005%\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CE\u0003"+
		"\u0006\u0003\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0005\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0011\u0000\u0000JK\u0005"+
		"&\u0000\u0000KL\u0005+\u0000\u0000Lb\u0005\'\u0000\u0000MN\u0005\u0012"+
		"\u0000\u0000NO\u0005&\u0000\u0000OP\u0005+\u0000\u0000Pb\u0005\'\u0000"+
		"\u0000QR\u0005\u0013\u0000\u0000RS\u0005&\u0000\u0000ST\u0005+\u0000\u0000"+
		"Tb\u0005\'\u0000\u0000UV\u0005\u0014\u0000\u0000VW\u0005&\u0000\u0000"+
		"WX\u0005+\u0000\u0000Xb\u0005\'\u0000\u0000YZ\u0005\u0015\u0000\u0000"+
		"Z[\u0005&\u0000\u0000[\\\u0005+\u0000\u0000\\b\u0005\'\u0000\u0000]^\u0005"+
		"\u0016\u0000\u0000^_\u0005&\u0000\u0000_`\u0005+\u0000\u0000`b\u0005\'"+
		"\u0000\u0000aI\u0001\u0000\u0000\u0000aM\u0001\u0000\u0000\u0000aQ\u0001"+
		"\u0000\u0000\u0000aU\u0001\u0000\u0000\u0000aY\u0001\u0000\u0000\u0000"+
		"a]\u0001\u0000\u0000\u0000b\u0007\u0001\u0000\u0000\u0000ch\u0003\n\u0005"+
		"\u0000dh\u0003\u0014\n\u0000eh\u0003\u001c\u000e\u0000fh\u0003&\u0013"+
		"\u0000gc\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000\u0000ij\u0005"+
		"\u0002\u0000\u0000jk\u0005\u0003\u0000\u0000ko\u0005$\u0000\u0000ln\u0003"+
		"\f\u0006\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rs\u0005%\u0000\u0000s\u000b\u0001\u0000\u0000"+
		"\u0000tu\u0005\u0003\u0000\u0000uv\u0005$\u0000\u0000vw\u0003\u000e\u0007"+
		"\u0000wx\u0005%\u0000\u0000x\r\u0001\u0000\u0000\u0000y{\u0003\u0010\b"+
		"\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u000f\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0017\u0000\u0000\u0080\u0081"+
		"\u0005&\u0000\u0000\u0081\u0082\u0005+\u0000\u0000\u0082\u009f\u0005\'"+
		"\u0000\u0000\u0083\u0084\u0005\u0018\u0000\u0000\u0084\u0085\u0005&\u0000"+
		"\u0000\u0085\u0086\u0005+\u0000\u0000\u0086\u009f\u0005\'\u0000\u0000"+
		"\u0087\u0088\u0005\u0019\u0000\u0000\u0088\u0089\u0005&\u0000\u0000\u0089"+
		"\u008a\u0003\u0012\t\u0000\u008a\u008b\u0005\'\u0000\u0000\u008b\u009f"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u001a\u0000\u0000\u008d\u008e"+
		"\u0005&\u0000\u0000\u008e\u008f\u0005+\u0000\u0000\u008f\u009f\u0005\'"+
		"\u0000\u0000\u0090\u0091\u0005\u001b\u0000\u0000\u0091\u0092\u0005&\u0000"+
		"\u0000\u0092\u0093\u0005+\u0000\u0000\u0093\u009f\u0005\'\u0000\u0000"+
		"\u0094\u0095\u0005\u001c\u0000\u0000\u0095\u0096\u0005&\u0000\u0000\u0096"+
		"\u0097\u0003.\u0017\u0000\u0097\u0098\u0005\'\u0000\u0000\u0098\u009f"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u001d\u0000\u0000\u009a\u009b"+
		"\u0005&\u0000\u0000\u009b\u009c\u00030\u0018\u0000\u009c\u009d\u0005\'"+
		"\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u007f\u0001\u0000"+
		"\u0000\u0000\u009e\u0083\u0001\u0000\u0000\u0000\u009e\u0087\u0001\u0000"+
		"\u0000\u0000\u009e\u008c\u0001\u0000\u0000\u0000\u009e\u0090\u0001\u0000"+
		"\u0000\u0000\u009e\u0094\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000"+
		"\u0000\u0000\u009f\u0011\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0000"+
		"\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0002"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000\u00a4\u00a8\u0005$\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0016\u000b\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005%\u0000\u0000"+
		"\u00ac\u0015\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0004\u0000\u0000"+
		"\u00ae\u00af\u0005$\u0000\u0000\u00af\u00b0\u0003\u0018\f\u0000\u00b0"+
		"\u00b1\u0005%\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0003\u001a\r\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u0019\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005\u001e\u0000\u0000\u00b9\u00ba\u0005"+
		"&\u0000\u0000\u00ba\u00bb\u0005+\u0000\u0000\u00bb\u00d3\u0005\'\u0000"+
		"\u0000\u00bc\u00bd\u0005\u001f\u0000\u0000\u00bd\u00be\u0005&\u0000\u0000"+
		"\u00be\u00bf\u0005+\u0000\u0000\u00bf\u00d3\u0005\'\u0000\u0000\u00c0"+
		"\u00c1\u0005\u001a\u0000\u0000\u00c1\u00c2\u0005&\u0000\u0000\u00c2\u00c3"+
		"\u0005+\u0000\u0000\u00c3\u00d3\u0005\'\u0000\u0000\u00c4\u00c5\u0005"+
		" \u0000\u0000\u00c5\u00c6\u0005&\u0000\u0000\u00c6\u00c7\u0003.\u0017"+
		"\u0000\u00c7\u00c8\u0005\'\u0000\u0000\u00c8\u00d3\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005!\u0000\u0000\u00ca\u00cb\u0005&\u0000\u0000\u00cb\u00cc"+
		"\u0005+\u0000\u0000\u00cc\u00d3\u0005\'\u0000\u0000\u00cd\u00ce\u0005"+
		"\"\u0000\u0000\u00ce\u00cf\u0005&\u0000\u0000\u00cf\u00d0\u00032\u0019"+
		"\u0000\u00d0\u00d1\u0005\'\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d2\u00b8\u0001\u0000\u0000\u0000\u00d2\u00bc\u0001\u0000\u0000\u0000"+
		"\u00d2\u00c0\u0001\u0000\u0000\u0000\u00d2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00c9\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0002\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6\u00da\u0005$\u0000\u0000\u00d7"+
		"\u00d9\u0003\u001e\u000f\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005%\u0000\u0000\u00de\u001d"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0007\u0000\u0000\u00e0\u00e1"+
		"\u0005$\u0000\u0000\u00e1\u00e2\u0003 \u0010\u0000\u00e2\u00e3\u0005%"+
		"\u0000\u0000\u00e3\u001f\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003\"\u0011"+
		"\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8!\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0011\u0000\u0000\u00eb\u00ec\u0005&\u0000\u0000\u00ec"+
		"\u00ed\u0005+\u0000\u0000\u00ed\u00f8\u0005\'\u0000\u0000\u00ee\u00ef"+
		"\u0005\u0019\u0000\u0000\u00ef\u00f0\u0005&\u0000\u0000\u00f0\u00f1\u0003"+
		"$\u0012\u0000\u00f1\u00f2\u0005\'\u0000\u0000\u00f2\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005#\u0000\u0000\u00f4\u00f5\u0005&\u0000\u0000"+
		"\u00f5\u00f6\u0005+\u0000\u0000\u00f6\u00f8\u0005\'\u0000\u0000\u00f7"+
		"\u00ea\u0001\u0000\u0000\u0000\u00f7\u00ee\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f8#\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0007\u0001\u0000\u0000\u00fa%\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"\u0002\u0000\u0000\u00fc\u00fd\u0005\u0006\u0000\u0000\u00fd\u0101\u0005"+
		"$\u0000\u0000\u00fe\u0100\u0003(\u0014\u0000\u00ff\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0105\u0005%\u0000\u0000"+
		"\u0105\'\u0001\u0000\u0000\u0000\u0106\u0107\u0005\b\u0000\u0000\u0107"+
		"\u0108\u0005$\u0000\u0000\u0108\u0109\u0003*\u0015\u0000\u0109\u010a\u0005"+
		"%\u0000\u0000\u010a)\u0001\u0000\u0000\u0000\u010b\u010d\u0003,\u0016"+
		"\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000"+
		"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f+\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u0011\u0000\u0000\u0112\u0113\u0005&\u0000\u0000\u0113"+
		"\u0114\u0005+\u0000\u0000\u0114\u011b\u0005\'\u0000\u0000\u0115\u0116"+
		"\u0005\u0019\u0000\u0000\u0116\u0117\u0005&\u0000\u0000\u0117\u0118\u0003"+
		"$\u0012\u0000\u0118\u0119\u0005\'\u0000\u0000\u0119\u011b\u0001\u0000"+
		"\u0000\u0000\u011a\u0111\u0001\u0000\u0000\u0000\u011a\u0115\u0001\u0000"+
		"\u0000\u0000\u011b-\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0002\u0000"+
		"\u0000\u011d/\u0001\u0000\u0000\u0000\u011e\u011f\u0007\u0003\u0000\u0000"+
		"\u011f1\u0001\u0000\u0000\u0000\u0120\u0129\u0005)\u0000\u0000\u0121\u0126"+
		"\u0005+\u0000\u0000\u0122\u0123\u0005(\u0000\u0000\u0123\u0125\u0005+"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u0121\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005*\u0000"+
		"\u0000\u012c3\u0001\u0000\u0000\u0000\u00128Fago|\u009e\u00a8\u00b5\u00d2"+
		"\u00da\u00e7\u00f7\u0101\u010e\u011a\u0126\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}