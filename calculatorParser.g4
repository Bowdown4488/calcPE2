parser grammar calculatorParser;

//beginEquation
//   : expression expression
//   ;
//
//expression
//   :  expression  POW expression
//   |  expression  (TIMES | DIV)  expression
//   |  expression  (PLUS | MINUS) expression
//   |  LPAREN expression RPAREN
//   |  (PLUS | MINUS)* NUM
//   ;

expression
    : term
    | term  PLUS expression
    | term  MINUS expression
   ;

term
    : fact
    | fact  DIV term
    | fact  TIMES term
   ;

fact
    : NUM
    | LPAREN expression RPAREN
   ;
