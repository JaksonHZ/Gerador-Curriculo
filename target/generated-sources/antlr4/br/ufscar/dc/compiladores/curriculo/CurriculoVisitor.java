// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.curriculo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CurriculoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CurriculoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CurriculoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#curriculo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurriculo(CurriculoParser.CurriculoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campos_curriculo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampos_curriculo(CurriculoParser.Campos_curriculoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campo_curriculo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo_curriculo(CurriculoParser.Campo_curriculoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#secoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecoes(CurriculoParser.SecoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#secao_educacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecao_educacao(CurriculoParser.Secao_educacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#educacao_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEducacao_item(CurriculoParser.Educacao_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campos_educacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampos_educacao(CurriculoParser.Campos_educacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campo_educacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo_educacao(CurriculoParser.Campo_educacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#nivel_educacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNivel_educacao(CurriculoParser.Nivel_educacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#secao_experiencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecao_experiencia(CurriculoParser.Secao_experienciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#experiencia_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExperiencia_item(CurriculoParser.Experiencia_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campos_experiencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampos_experiencia(CurriculoParser.Campos_experienciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campo_experiencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo_experiencia(CurriculoParser.Campo_experienciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#secao_habilidades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecao_habilidades(CurriculoParser.Secao_habilidadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#habilidade_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHabilidade_item(CurriculoParser.Habilidade_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campos_habilidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampos_habilidade(CurriculoParser.Campos_habilidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campo_habilidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo_habilidade(CurriculoParser.Campo_habilidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#nivel_habilidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNivel_habilidade(CurriculoParser.Nivel_habilidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#secao_idiomas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecao_idiomas(CurriculoParser.Secao_idiomasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#idioma_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdioma_item(CurriculoParser.Idioma_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campos_idioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampos_idioma(CurriculoParser.Campos_idiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campo_idioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo_idioma(CurriculoParser.Campo_idiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#valor_booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_booleano(CurriculoParser.Valor_booleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(CurriculoParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#lista_strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_strings(CurriculoParser.Lista_stringsContext ctx);
}