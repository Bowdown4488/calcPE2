import org.antlr.v4.runtime.CharStream;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class recursiveDescent {

    String expr = "";

    recursiveDescent(String expr){
        this.expr = expr;
        CharStream c = fromString(expr);
        calculatorLexer lexer = new calculatorLexer(c);
    }

    public boolean EXPR (){
        return true;
    }

    public boolean TERM (){
        return true;
    }
    public boolean FACTOR (){
        return true;
    }
}
