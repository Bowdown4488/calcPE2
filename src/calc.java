import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromString;

public class calc extends JFrame{
    private JTextField input;
    private JButton run;
    private JLabel answer;
    private JPanel panel;

    public calc (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setSize(400,150);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setVisible(true);

        run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = input.getText().toString().trim();
                initTokens(str);
//                try {
//                    SyntaxErrorListener listener = new SyntaxErrorListener();
//                    listener.isEmpty();
//                    JOptionPane.showMessageDialog(null,"Invalid Input Found");
//                }catch(ArrayIndexOutOfBoundsException er){
//                    recursiveDescent rd = new recursiveDescent(str);
//                    answer.setText("Output: " + str);
//                }
                recursiveDescent rd = new recursiveDescent(str);
                answer.setText("Output: " + str);
            }
        });
    }

    public static String getTokenType(int tokenType,String tokenString) {
        switch (tokenType) {
            case calculatorLexer.NUM:
                System.out.println("\t" +  tokenString + "\t\t" + "NUM");
                return "NUM";
            case calculatorLexer.LPAREN:
                System.out.println("\t" +  tokenString + "\t\t" + "LPAREN");
                return "LPAREN";
            case calculatorLexer.RPAREN:
                System.out.println("\t" +  tokenString + "\t\t" + "RPAREN");
                return "RPAREN";
            case calculatorLexer.PLUS:
                System.out.println("\t" +  tokenString + "\t\t" + "PLUS");
                return "PLUS";
            case calculatorLexer.MINUS:
                System.out.println("\t" +  tokenString + "\t\t" + "MINUS");
                return "MINUS";
            case calculatorLexer.TIMES:
                System.out.println("\t" +  tokenString + "\t\t" + "TIMES");
                return "TIMES";
            case calculatorLexer.POINT:
                System.out.println("\t" +  tokenString + "\t\t" + "POINT");
                return "POINT";
            case calculatorLexer.POW:
                System.out.println("\t" +  tokenString + "\t\t" + "POW");
                return "POW";
            default:
                System.out.println("\t" +  tokenString + "\t\t" + "Other");
                return "Other";
        }
    }

    public static void initTokens (String str){
        CharStream c = fromString(str);
        calculatorLexer lexer = new calculatorLexer(c);
        Token token = lexer.nextToken();
        ArrayList<Token> tokens = new ArrayList<>();
        ArrayList<String> tokentypes = new ArrayList<>();
        while (token.getType() != lexer.EOF) {
            tokens.add(token);
            tokentypes.add(getTokenType(token.getType(),token.getText()));
            token = lexer.nextToken();
        }
    }


}
