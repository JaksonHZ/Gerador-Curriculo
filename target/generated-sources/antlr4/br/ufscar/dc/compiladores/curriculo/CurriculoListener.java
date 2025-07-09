// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.curriculo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CurriculoParser}.
 */
public interface CurriculoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CurriculoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CurriculoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#curriculo}.
	 * @param ctx the parse tree
	 */
	void enterCurriculo(CurriculoParser.CurriculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#curriculo}.
	 * @param ctx the parse tree
	 */
	void exitCurriculo(CurriculoParser.CurriculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campos_curriculo}.
	 * @param ctx the parse tree
	 */
	void enterCampos_curriculo(CurriculoParser.Campos_curriculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campos_curriculo}.
	 * @param ctx the parse tree
	 */
	void exitCampos_curriculo(CurriculoParser.Campos_curriculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campo_curriculo}.
	 * @param ctx the parse tree
	 */
	void enterCampo_curriculo(CurriculoParser.Campo_curriculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campo_curriculo}.
	 * @param ctx the parse tree
	 */
	void exitCampo_curriculo(CurriculoParser.Campo_curriculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#secoes}.
	 * @param ctx the parse tree
	 */
	void enterSecoes(CurriculoParser.SecoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#secoes}.
	 * @param ctx the parse tree
	 */
	void exitSecoes(CurriculoParser.SecoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#secao_educacao}.
	 * @param ctx the parse tree
	 */
	void enterSecao_educacao(CurriculoParser.Secao_educacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#secao_educacao}.
	 * @param ctx the parse tree
	 */
	void exitSecao_educacao(CurriculoParser.Secao_educacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#educacao_item}.
	 * @param ctx the parse tree
	 */
	void enterEducacao_item(CurriculoParser.Educacao_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#educacao_item}.
	 * @param ctx the parse tree
	 */
	void exitEducacao_item(CurriculoParser.Educacao_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campos_educacao}.
	 * @param ctx the parse tree
	 */
	void enterCampos_educacao(CurriculoParser.Campos_educacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campos_educacao}.
	 * @param ctx the parse tree
	 */
	void exitCampos_educacao(CurriculoParser.Campos_educacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campo_educacao}.
	 * @param ctx the parse tree
	 */
	void enterCampo_educacao(CurriculoParser.Campo_educacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campo_educacao}.
	 * @param ctx the parse tree
	 */
	void exitCampo_educacao(CurriculoParser.Campo_educacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#nivel_educacao}.
	 * @param ctx the parse tree
	 */
	void enterNivel_educacao(CurriculoParser.Nivel_educacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#nivel_educacao}.
	 * @param ctx the parse tree
	 */
	void exitNivel_educacao(CurriculoParser.Nivel_educacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#secao_experiencia}.
	 * @param ctx the parse tree
	 */
	void enterSecao_experiencia(CurriculoParser.Secao_experienciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#secao_experiencia}.
	 * @param ctx the parse tree
	 */
	void exitSecao_experiencia(CurriculoParser.Secao_experienciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#experiencia_item}.
	 * @param ctx the parse tree
	 */
	void enterExperiencia_item(CurriculoParser.Experiencia_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#experiencia_item}.
	 * @param ctx the parse tree
	 */
	void exitExperiencia_item(CurriculoParser.Experiencia_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campos_experiencia}.
	 * @param ctx the parse tree
	 */
	void enterCampos_experiencia(CurriculoParser.Campos_experienciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campos_experiencia}.
	 * @param ctx the parse tree
	 */
	void exitCampos_experiencia(CurriculoParser.Campos_experienciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campo_experiencia}.
	 * @param ctx the parse tree
	 */
	void enterCampo_experiencia(CurriculoParser.Campo_experienciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campo_experiencia}.
	 * @param ctx the parse tree
	 */
	void exitCampo_experiencia(CurriculoParser.Campo_experienciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#secao_habilidades}.
	 * @param ctx the parse tree
	 */
	void enterSecao_habilidades(CurriculoParser.Secao_habilidadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#secao_habilidades}.
	 * @param ctx the parse tree
	 */
	void exitSecao_habilidades(CurriculoParser.Secao_habilidadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#habilidade_item}.
	 * @param ctx the parse tree
	 */
	void enterHabilidade_item(CurriculoParser.Habilidade_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#habilidade_item}.
	 * @param ctx the parse tree
	 */
	void exitHabilidade_item(CurriculoParser.Habilidade_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campos_habilidade}.
	 * @param ctx the parse tree
	 */
	void enterCampos_habilidade(CurriculoParser.Campos_habilidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campos_habilidade}.
	 * @param ctx the parse tree
	 */
	void exitCampos_habilidade(CurriculoParser.Campos_habilidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campo_habilidade}.
	 * @param ctx the parse tree
	 */
	void enterCampo_habilidade(CurriculoParser.Campo_habilidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campo_habilidade}.
	 * @param ctx the parse tree
	 */
	void exitCampo_habilidade(CurriculoParser.Campo_habilidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#nivel_habilidade}.
	 * @param ctx the parse tree
	 */
	void enterNivel_habilidade(CurriculoParser.Nivel_habilidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#nivel_habilidade}.
	 * @param ctx the parse tree
	 */
	void exitNivel_habilidade(CurriculoParser.Nivel_habilidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#secao_idiomas}.
	 * @param ctx the parse tree
	 */
	void enterSecao_idiomas(CurriculoParser.Secao_idiomasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#secao_idiomas}.
	 * @param ctx the parse tree
	 */
	void exitSecao_idiomas(CurriculoParser.Secao_idiomasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#idioma_item}.
	 * @param ctx the parse tree
	 */
	void enterIdioma_item(CurriculoParser.Idioma_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#idioma_item}.
	 * @param ctx the parse tree
	 */
	void exitIdioma_item(CurriculoParser.Idioma_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campos_idioma}.
	 * @param ctx the parse tree
	 */
	void enterCampos_idioma(CurriculoParser.Campos_idiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campos_idioma}.
	 * @param ctx the parse tree
	 */
	void exitCampos_idioma(CurriculoParser.Campos_idiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campo_idioma}.
	 * @param ctx the parse tree
	 */
	void enterCampo_idioma(CurriculoParser.Campo_idiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campo_idioma}.
	 * @param ctx the parse tree
	 */
	void exitCampo_idioma(CurriculoParser.Campo_idiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#valor_booleano}.
	 * @param ctx the parse tree
	 */
	void enterValor_booleano(CurriculoParser.Valor_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#valor_booleano}.
	 * @param ctx the parse tree
	 */
	void exitValor_booleano(CurriculoParser.Valor_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(CurriculoParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(CurriculoParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#lista_strings}.
	 * @param ctx the parse tree
	 */
	void enterLista_strings(CurriculoParser.Lista_stringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#lista_strings}.
	 * @param ctx the parse tree
	 */
	void exitLista_strings(CurriculoParser.Lista_stringsContext ctx);
}