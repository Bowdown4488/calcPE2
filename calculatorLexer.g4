lexer grammar calculatorLexer;
NUM: NUMBER;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;

fragment SIGN
   : ('+' | '-')
   ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

TIMES
   : '*'
   ;

DIV
   : '/'
   ;

POINT
   : '.'
   ;

POW
   : '^'
   ;

WS
   : [ \r\n\t] + -> skip
   ;