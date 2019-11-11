// Generated from C:/Users/DELL/IdeaProjects/calcPE2\calculatorParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(calculatorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(calculatorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(calculatorParser.FactContext ctx);
}