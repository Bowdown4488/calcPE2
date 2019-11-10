// Generated from C:/Users/Paolo/IdeaProjects/calc\calculatorParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#beginEquation}.
	 * @param ctx the parse tree
	 */
	void enterBeginEquation(calculatorParser.BeginEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#beginEquation}.
	 * @param ctx the parse tree
	 */
	void exitBeginEquation(calculatorParser.BeginEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(calculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(calculatorParser.ExpressionContext ctx);
}