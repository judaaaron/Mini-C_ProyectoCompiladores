package Compiladorcito;
import static Compiladorcito.Tokens.*;
%%
%class Lexer
%type Tokens


DIGITOS = [0-9]
LETRAS = [a-zA-Z_]
CHAR = "char"
IF = "if"
INT = "int"
ELSE = "else"
INTP = "int*"
CHARP = "char*"
WHILE = "while"
FOR = "for"            
RETURN = "return"        
BREAK = "break"  
PARENTESISIZ = "("
PARENTESISDE = ")"
LLAVEIZ = "{"
LLAVEDER = "}"
OPREL = "<"|">"|"<="|">="|"="|"!="|"=="
ID = {LETRAS}({LETRAS}|{DIGITOS})*|{LETRAS}({LETRAS}|{DIGITOS})*
PRINTF = "printf"
SCANF = "scanf"
AND = "&&"
OR = "||"
OPADICION = "+"|"-"
OPMULTI = "*"|"/"
PUNTOCOMA = ;
INCREMENT = "++"
DECREMENT = "--"
Comment = "/" [^] ~"/" | "/" "*"+ "/"
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
BlankSpace = {LineTerminator} | [ \t\f]
Comments = {LineComment} | {BlockComment}
LineComment = "//" {InputCharacter}* {LineTerminator}?
BlockComment = "/*"({LETRAS}|{DIGITOS})+"*/" 
TERNARIO = "?"
DOSPUNTOS = :

%{
    public String lexeme;
%}

%%
<YYINITIAL> {

   /* Palabras reservadas */

    {CHAR} {lexeme=yytext(); return CHAR;}
    {INT} {lexeme=yytext(); return INT;}
    {IF} {lexeme=yytext(); return IF;}
    {ELSE} {lexeme=yytext(); return ELSE;}
    {WHILE} {lexeme=yytext(); return WHILE;}
    {FOR} {lexeme=yytext(); return FOR;}
    {RETURN} {lexeme=yytext(); return RETURN;}
    {BREAK} {lexeme=yytext(); return BREAK; }

    /* Unarios */

    {INCREMENT} {lexeme=yytext(); return INCREMENT;}
    {DECREMENT} {lexeme=yytext(); return DECREMENT;}

    /* Operadores logicos */

    {OPREL} { return OPREL;}
    {TERNARIO}  {lexeme=yytext(); return TERNARIO;}

     /* Arithmetic Operators */

    {OPADICION} {lexeme=yytext(); return OPADICION;}
    {OPMULTI} {lexeme=yytext(); return OPMULTI;}


     /* Overloaded */

    {AND} {lexeme=yytext(); return AND; }
    {OR} {lexeme=yytext(); return OR; }

    
       /* Separators */

    {PUNTOCOMA} {lexeme=yytext(); return PUNTOCOMA; }
    {DOSPUNTOS} {lexeme=yytext(); return DOSPUNTOS; }
    {LLAVEIZ} {lexeme=yytext(); return LLAVEIZ; }
    {LLAVEDER} {lexeme=yytext(); return LLAVEDER; }
    {PARENTESISIZ} {lexeme=yytext(); return PARENTESISIZ; }
    {PARENTESISDE} {lexeme=yytext(); return PARENTESISDE; }

     /* Funciones */
       
    {PRINTF} {lexeme=yytext(); return PRINTF; }
    {SCANF} {lexeme=yytext(); return SCANF; }

       /* Ids */

    {ID} {lexeme=yytext(); return ID; }

      

    {BlankSpace}            { /* skip it */ }
    {Comments}              { /* skip it */ }
    
    . {return ERROR;}
 
}

