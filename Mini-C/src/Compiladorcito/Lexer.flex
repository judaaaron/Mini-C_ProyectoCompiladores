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
MAIN = "main"
NUMEROS ={DIGITOS}+
PARENTESISIZ = "("
PARENTESISDE = ")"
LLAVEIZ = "{"
LLAVEDER = "}"
OPREL = "<"|">"|"<="|">="|"!="|"=="
ASIGNACION = "="
COMA = ","
PORCENTAJED = "%d"
PORCENTAJEC = "%c"
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
LineComment = "//" {InputCharacter}* {LineTerminator}?
BlockComment = "/*"(.|{LineTerminator})*"*/" 
TERNARIO = "?"
COMILLAS = \"
COMILLA = '
DOSPUNTOS = :
AMPERSAND = &


%{
    public String lexeme;
%}

%%
<YYINITIAL> {

   /* Palabras reservadas */
    {MAIN} {lexeme=yytext(); return MAIN;}
    {CHAR} {lexeme=yytext(); return CHAR;}
    {INT} {lexeme=yytext(); return INT;}
    {IF} {lexeme=yytext(); return IF;}
    {INTP} {lexeme=yytext(); return INTP;}
    {CHARP} {lexeme=yytext(); return CHARP;}
    {ELSE} {lexeme=yytext(); return ELSE;}
    {WHILE} {lexeme=yytext(); return WHILE;}
    {FOR} {lexeme=yytext(); return FOR;}
    {RETURN} {lexeme=yytext(); return RETURN;}
    {BREAK} {lexeme=yytext(); return BREAK; }
    {NUMEROS} {lexeme=yytext(); return NUMEROS; }
    {PORCENTAJED} {lexeme=yytext(); return PORCENTAJED; }
    {PORCENTAJEC} {lexeme=yytext(); return PORCENTAJEC; }
    ( "\n" ) {return Linea;}

    /* Unarios */

    {INCREMENT} {lexeme=yytext(); return INCREMENT;}
    {DECREMENT} {lexeme=yytext(); return DECREMENT;}

    /*Comentarios*/
    {BlockComment}              { /* skip it */ }
    {LineComment}              { /* skip it */ }

    /* Operadores logicos */
    
    {ASIGNACION} {lexeme=yytext(); return ASIGNACION;}
    {OPREL} { lexeme=yytext(); return OPREL;}
    {TERNARIO}  {lexeme=yytext(); return TERNARIO;}

     /* Arithmetic Operators */

    {OPADICION} {lexeme=yytext(); return OPADICION;}
    {OPMULTI} {lexeme=yytext(); return OPMULTI;}


     /* Overloaded */

    {AND} {lexeme=yytext(); return AND; }
    {OR} {lexeme=yytext(); return OR; }
    {AMPERSAND} {lexeme=yytext(); return AMPERSAND; }

    
       /* Separators */
    {COMILLAS} {lexeme=yytext(); return COMILLAS; }
    {COMILLA} {lexeme=yytext(); return COMILLA; }
    {COMA} {lexeme=yytext(); return COMA; }
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
    {LETRAS} {lexeme=yytext(); return LETRAS; }

      

    {BlankSpace}            { /* skip it */ }
    
    
    . {return ERROR;}
 
}
