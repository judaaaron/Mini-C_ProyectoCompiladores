package Compiladorcito;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%column
%char



DIGITOS = [0-9]
LETRAS = [a-zA-Z_]
CHAR = "char"
IF = "if"
ELSE = "else"
MAIN = "main"
NUMEROS ={DIGITOS}+
INT = "int"
WHILE = "while"
INTP = "int*"
CHARP = "char*"
FOR = "for"            
RETURN = "return"        
BREAK = "break"  
PARENTESISIZ = "("
PARENTESISDE = ")"
LLAVEIZ = "{"
LLAVEDER = "}"
OPREL = "<"|">"|"<="|">="|"!="|"=="
ID = {LETRAS}({LETRAS}|{DIGITOS})*|{LETRAS}({LETRAS}|{DIGITOS})*
PRINTF = "printf"
SCANF = "scanf"
AND = "&&"
OR = "||"
ASIGNACION = "="
OPADICION = "+"|"-"
OPMULTI = "*"|"/"
PUNTOCOMA = ;
INCREMENT = "++"
DECREMENT = --
Comment = "/" [^] ~"/" | "/" "*"+ "/"
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
BlankSpace = {LineTerminator} | [ \t\f]
SALTO = "\n";
LineComment = "//" {InputCharacter}* {LineTerminator}?
BlockComment = "/*"(.|{LineTerminator})*"*/" 
DOSPUNTOS = :
TERNARIO = "?"

%{
    public String lexeme;
    String cadena="";
    ArrayList erroresLexicos = new ArrayList();
%}

%%
<YYINITIAL> {

   /* Palabras reservadas */
    
    {ELSE} {return new Symbol(sym.TKN_ELSE           ,yyline+1, yycolumn+1, yytext());}
    {CHAR} {return new Symbol(sym.TKN_CHAR           ,yyline+1 ,yycolumn+1 ,yytext());}
    {INT}  {return new Symbol(sym.TKN_INT           ,yyline+1 ,yycolumn+1 ,yytext());}
    {MAIN} {return new Symbol(sym.TKN_MAIN           ,yyline+1 ,yycolumn+1 ,yytext());}
    {IF} {return new Symbol(sym.TKN_IF           ,yyline+1 ,yycolumn+1 ,yytext());}
    {WHILE} {return new Symbol(sym.TKN_WHILE           ,yyline+1 ,yycolumn+1 ,yytext());}
    {FOR} {return new Symbol(sym.TKN_FOR           ,yyline+1 ,yycolumn+1 ,yytext());}
    {RETURN} {return new Symbol(sym.TKN_RETURN           ,yyline+1 ,yycolumn+1 ,yytext());}
    {NUMEROS} {return new Symbol(sym.TKN_NUM           ,yyline+1 ,yycolumn+1 ,yytext());}
     {INTP} {return new Symbol(sym.TKN_INTP           ,yyline+1 ,yycolumn+1 ,yytext());}
    {CHARP} {return new Symbol(sym.TKN_CHARP           ,yyline+1 ,yycolumn+1 ,yytext());}

    {ASIGNACION}         {return new Symbol(sym.TKN_IGUAL        ,yyline+1 ,yycolumn+1 ,yytext());}
    ( "\n" ) {return new Symbol(sym.TKN_SALTO        ,yyline+1 ,yycolumn+1 ,yytext());}

    /* Unarios */
    {INCREMENT} {return new Symbol(sym.TKN_INCREMENT           ,yyline+1, yycolumn+1, yytext());}
    {DECREMENT} {return new Symbol(sym.TKN_DECREMENT           ,yyline+1, yycolumn+1, yytext());}
    
    /* Operadores logicos */

    {OPREL} {return new Symbol(sym.TKN_OPREL           ,yyline+1 ,yycolumn+1 ,yytext());}
     {TERNARIO}  {return new Symbol(sym.TKN_TERNARIO           ,yyline+1 ,yycolumn+1 ,yytext());}
    {LineComment}              { /* skip it */ }
    {BlockComment}              { /* skip it */ }

     /* Arithmetic Operators */

    {OPADICION} {return new Symbol(sym.TKN_OPADICION           ,yyline+1 ,yycolumn+1 ,yytext());}
    {OPMULTI} {return new Symbol(sym.TKN_OPMULTI           ,yyline+1 ,yycolumn+1 ,yytext());}


     /* Overloaded */

    {AND} {return new Symbol(sym.TKN_AND           ,yyline+1 ,yycolumn+1 ,yytext());}
    {OR} {return new Symbol(sym.TKN_OR           ,yyline+1 ,yycolumn+1 ,yytext());}
    {DIGITOS} {return new Symbol(sym.TKN_DIGITOS       ,yyline+1 ,yycolumn+1 ,yytext());}
    
       /* Separators */

    {PUNTOCOMA} {return new Symbol(sym.TKN_PUNTOCOMA           ,yyline+1 ,yycolumn+1 ,yytext());}
    {DOSPUNTOS} {return new Symbol(sym.TKN_DOSPUNTOS           ,yyline+1 ,yycolumn+1 ,yytext());}
    {LLAVEIZ} {return new Symbol(sym.TKN_LLAVEIZ           ,yyline+1 ,yycolumn+1 ,yytext());}
    {LLAVEDER} {return new Symbol(sym.TKN_LLAVEDER           ,yyline+1 ,yycolumn+1 ,yytext());}
    {PARENTESISIZ} {return new Symbol(sym.TKN_PARENTESISIZ           ,yyline+1 ,yycolumn+1 ,yytext());}
    {PARENTESISDE} {return new Symbol(sym.TKN_PARENTESISDE           ,yyline+1 ,yycolumn+1 ,yytext());}

     /* Funciones */
     {PRINTF} {return new Symbol(sym.TKN_PRINTF           ,yyline+1 ,yycolumn+1 ,yytext());}
     {SCANF} {return new Symbol(sym.TKN_SCANF           ,yyline+1 ,yycolumn+1 ,yytext());}

  

       /* Ids */

    {ID} {return new Symbol(sym.TKN_ID           ,yyline+1 ,yycolumn+1 ,yytext());}

      

        {BlankSpace}            { /* skip it */ }
    
    
    .  { erroresLexicos.add("Error lexico en linea: "+ (yyline+1) +" y columna " + (yycolumn+1) +" y en el texto: "+yytext()); }
 
}