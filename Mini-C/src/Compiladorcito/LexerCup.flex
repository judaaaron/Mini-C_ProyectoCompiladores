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
PORCENTAJE = "%"
COMA = ","
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
COMILLA = '
TERNARIO = "?"


%{
    public String lexeme;
    String cadena="";
    ArrayList erroresLexicos = new ArrayList();
%}

%%
<YYINITIAL> {

   /* Palabras reservadas */
    
    {ELSE} {return new Symbol(sym.tkn_else           ,yyline+1, yycolumn+1, yytext());}
    {CHAR} {return new Symbol(sym.tkn_char           ,yyline+1 ,yycolumn+1 ,yytext());}
    {INT}  {return new Symbol(sym.tkn_int           ,yyline+1 ,yycolumn+1 ,yytext());}
    {MAIN} {return new Symbol(sym.tkn_main           ,yyline+1 ,yycolumn+1 ,yytext());}
    {IF} {return new Symbol(sym.tkn_if           ,yyline+1 ,yycolumn+1 ,yytext());}
    {WHILE} {return new Symbol(sym.tkn_while           ,yyline+1 ,yycolumn+1 ,yytext());}
    {FOR} {return new Symbol(sym.tkn_for           ,yyline+1 ,yycolumn+1 ,yytext());}
    {RETURN} {return new Symbol(sym.tkn_return           ,yyline+1 ,yycolumn+1 ,yytext());}
    {NUMEROS} {return new Symbol(sym.tkn_num           ,yyline+1 ,yycolumn+1 ,yytext());}
     {INTP} {return new Symbol(sym.tkn_intp           ,yyline+1 ,yycolumn+1 ,yytext());}
    {CHARP} {return new Symbol(sym.tkn_charp           ,yyline+1 ,yycolumn+1 ,yytext());}
    {PORCENTAJE} {return new Symbol(sym.tkn_porcentaje          ,yyline+1 ,yycolumn+1 ,yytext());}

    {ASIGNACION}         {return new Symbol(sym.tkn_igual        ,yyline+1 ,yycolumn+1 ,yytext());}
    

    /* Unarios */
    {INCREMENT} {return new Symbol(sym.tkn_increment           ,yyline+1, yycolumn+1, yytext());}
    {DECREMENT} {return new Symbol(sym.tkn_decrement           ,yyline+1, yycolumn+1, yytext());}
    
    /* Operadores logicos */

    {OPREL} {return new Symbol(sym.tkn_oprel           ,yyline+1 ,yycolumn+1 ,yytext());}
    {TERNARIO}  {return new Symbol(sym.tkn_ternario           ,yyline+1 ,yycolumn+1 ,yytext());}
    {BlockComment}              { /* skip it */ }

     /* Arithmetic Operators */

    {OPADICION} {return new Symbol(sym.tkn_opadicion           ,yyline+1 ,yycolumn+1 ,yytext());}
    {OPMULTI} {return new Symbol(sym.tkn_opmulti           ,yyline+1 ,yycolumn+1 ,yytext());}


     /* Overloaded */

    {AND} {return new Symbol(sym.tkn_and           ,yyline+1 ,yycolumn+1 ,yytext());}
    {OR} {return new Symbol(sym.tkn_or           ,yyline+1 ,yycolumn+1 ,yytext());}
    {DIGITOS} {return new Symbol(sym.tkn_digitos       ,yyline+1 ,yycolumn+1 ,yytext());}
    
       /* Separators */

    {COMILLA} {return new Symbol(sym.tkn_comilla           ,yyline+1 ,yycolumn+1 ,yytext());}
    {PUNTOCOMA} {return new Symbol(sym.tkn_puntocoma           ,yyline+1 ,yycolumn+1 ,yytext());}
    {COMA}          {return new Symbol(sym.tkn_coma         ,yyline+1 ,yycolumn+1 ,yytext());}
    {DOSPUNTOS} {return new Symbol(sym.tkn_dospuntos           ,yyline+1 ,yycolumn+1 ,yytext());}
    {LLAVEIZ} {return new Symbol(sym.tkn_llaveiz           ,yyline+1 ,yycolumn+1 ,yytext());}
    {LLAVEDER} {return new Symbol(sym.tkn_llaveder           ,yyline+1 ,yycolumn+1 ,yytext());}
    {PARENTESISIZ} {return new Symbol(sym.tkn_parentesisiz           ,yyline+1 ,yycolumn+1 ,yytext());}
    {PARENTESISDE} {return new Symbol(sym.tkn_parentesisde           ,yyline+1 ,yycolumn+1 ,yytext());}

     /* Funciones */
     {PRINTF} {return new Symbol(sym.tkn_printf           ,yyline+1 ,yycolumn+1 ,yytext());}
     {SCANF} {return new Symbol(sym.tkn_scanf           ,yyline+1 ,yycolumn+1 ,yytext());}

  

       /* Ids */

    {ID} {return new Symbol(sym.tkn_id           ,yyline+1 ,yycolumn+1 ,yytext());}
    {LETRAS} {return new Symbol(sym.tkn_letra           ,yyline+1 ,yycolumn+1 ,yytext());}

      

        {BlankSpace}            { /* skip it */ }
        {SALTO}                 {}
    
    .  { erroresLexicos.add("Error lexico en linea: "+ (yyline+1) +" y columna " + (yycolumn+1) +" y en el texto: "+yytext()); }
 
}