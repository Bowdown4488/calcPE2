// Generated from C:/Users/DELL/IdeaProjects/calcPE2\calculatorParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorParserListener extends ParseTreeListener {
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
	/**
	 * Enter a parse tree produced by {@link calculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(calculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(calculatorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(calculatorParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(calculatorParser.FactContext ctx);
}