/* The following code was generated by JFlex 1.4.3 on 29/8/22 12:56 */

package Compiladorcito;
import java_cup.runtime.Symbol;
import java.util.ArrayList;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 29/8/22 12:56 from the specification file
 * <tt>./src/Compiladorcito/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 36, 35,  0, 36, 34,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    36, 25, 39,  0,  0,  0, 27,  0, 19, 20, 16, 30, 29, 31,  0, 32, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 37, 33, 23, 24, 23, 38, 
     0,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0,  0,  0,  0,  2, 
     0,  5,  2,  3,  2,  9,  8,  2,  4,  7,  2,  2, 10, 12, 13, 17, 
    26,  2,  6, 11, 14, 18,  2, 15,  2,  2,  2, 21, 28, 22,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\11\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\1\1\3\1\13\1\1\1\14"+
    "\2\15\1\4\1\16\3\17\1\20\1\21\1\1\1\3"+
    "\1\22\2\3\1\23\6\3\1\11\1\3\1\24\1\25"+
    "\1\26\1\27\1\0\1\30\1\22\1\3\2\0\2\3"+
    "\1\31\1\32\5\3\3\0\1\33\1\3\1\34\1\35"+
    "\1\3\1\36\2\3\1\17\1\37\1\3\1\40\1\41"+
    "\1\3\1\42\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\u0118"+
    "\0\u0140\0\u0168\0\u0190\0\u01b8\0\50\0\50\0\50\0\50"+
    "\0\50\0\u01e0\0\u01e0\0\u01e0\0\u0208\0\u0230\0\u0258\0\50"+
    "\0\u0280\0\u02a8\0\u02d0\0\50\0\u02f8\0\u0320\0\50\0\50"+
    "\0\50\0\u0348\0\u0370\0\50\0\u0398\0\u03c0\0\170\0\u03e8"+
    "\0\u0410\0\u0438\0\u0460\0\u0488\0\u04b0\0\50\0\u04d8\0\50"+
    "\0\50\0\50\0\50\0\u0500\0\50\0\u0528\0\u0550\0\u0578"+
    "\0\u05a0\0\u05c8\0\u05f0\0\u0618\0\170\0\u0640\0\u0668\0\u0690"+
    "\0\u06b8\0\u06e0\0\u0708\0\u0730\0\u0758\0\u0780\0\u07a8\0\50"+
    "\0\170\0\u07d0\0\170\0\u07f8\0\u0820\0\u0500\0\50\0\u0848"+
    "\0\170\0\170\0\u0870\0\170\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\4\1\6\1\7\1\10"+
    "\1\11\1\4\1\12\1\13\2\4\1\14\1\15\2\4"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\51\0\1\3\47\0"+
    "\1\43\16\4\1\0\2\4\7\0\1\4\14\0\1\44"+
    "\1\0\1\43\2\4\1\45\13\4\1\0\2\4\7\0"+
    "\1\4\14\0\1\44\1\0\1\43\7\4\1\46\6\4"+
    "\1\0\2\4\7\0\1\4\14\0\1\44\1\0\1\43"+
    "\6\4\1\47\4\4\1\50\2\4\1\0\2\4\7\0"+
    "\1\4\14\0\1\44\1\0\1\43\16\4\1\0\1\51"+
    "\1\4\7\0\1\4\14\0\1\44\1\0\1\43\10\4"+
    "\1\52\5\4\1\0\2\4\7\0\1\4\14\0\1\44"+
    "\1\0\1\43\1\4\1\53\14\4\1\0\2\4\7\0"+
    "\1\4\14\0\1\44\1\0\1\43\3\4\1\54\12\4"+
    "\1\0\2\4\7\0\1\4\14\0\1\44\1\0\1\43"+
    "\2\4\1\55\13\4\1\0\2\4\7\0\1\4\14\0"+
    "\1\44\30\0\1\56\20\0\1\43\4\4\1\57\11\4"+
    "\1\0\2\4\7\0\1\4\14\0\1\44\33\0\1\60"+
    "\50\0\1\61\51\0\1\62\50\0\1\63\30\0\1\64"+
    "\72\0\1\37\45\0\1\65\10\0\16\66\1\0\2\66"+
    "\7\0\1\66\16\0\17\67\1\0\2\67\4\0\1\70"+
    "\2\71\1\67\16\0\1\43\3\4\1\72\12\4\1\0"+
    "\2\4\7\0\1\4\14\0\1\44\1\0\1\43\14\4"+
    "\1\73\1\4\1\0\2\4\7\0\1\4\14\0\1\44"+
    "\1\0\1\43\14\4\1\74\1\4\1\0\2\4\7\0"+
    "\1\4\14\0\1\44\1\0\1\43\4\4\1\75\11\4"+
    "\1\0\2\4\7\0\1\4\14\0\1\44\1\0\1\43"+
    "\11\4\1\76\4\4\1\0\2\4\7\0\1\4\14\0"+
    "\1\44\1\0\1\43\3\4\1\77\12\4\1\0\2\4"+
    "\7\0\1\4\14\0\1\44\1\0\1\43\5\4\1\100"+
    "\10\4\1\0\2\4\7\0\1\4\14\0\1\44\1\0"+
    "\1\43\5\4\1\101\10\4\1\0\2\4\7\0\1\4"+
    "\14\0\1\44\1\0\1\43\5\4\1\102\10\4\1\0"+
    "\2\4\7\0\1\4\14\0\1\44\20\64\1\103\27\64"+
    "\1\0\17\66\1\0\2\66\7\0\1\66\16\0\17\67"+
    "\1\0\2\67\7\0\1\67\16\0\1\104\16\105\1\0"+
    "\2\105\5\0\1\105\1\0\1\105\14\0\1\44\30\0"+
    "\1\105\20\0\1\43\4\4\1\106\11\4\1\0\2\4"+
    "\7\0\1\4\14\0\1\44\1\0\1\43\16\4\1\0"+
    "\1\4\1\107\7\0\1\4\14\0\1\44\1\0\1\43"+
    "\16\4\1\110\2\4\7\0\1\4\14\0\1\44\1\0"+
    "\1\43\7\4\1\111\6\4\1\0\2\4\7\0\1\4"+
    "\14\0\1\44\1\0\1\43\13\4\1\112\2\4\1\0"+
    "\2\4\7\0\1\4\14\0\1\44\1\0\1\43\13\4"+
    "\1\113\2\4\1\0\2\4\7\0\1\4\14\0\1\44"+
    "\1\0\1\43\10\4\1\114\5\4\1\0\2\4\7\0"+
    "\1\4\14\0\1\44\1\0\1\43\13\4\1\115\2\4"+
    "\1\0\2\4\7\0\1\4\14\0\1\44\20\64\1\103"+
    "\17\64\1\116\7\64\27\0\1\70\2\71\17\0\1\104"+
    "\16\105\1\0\2\105\7\0\1\105\14\0\1\44\1\0"+
    "\1\43\16\4\1\117\2\4\7\0\1\4\14\0\1\44"+
    "\1\0\1\43\4\4\1\120\11\4\1\0\2\4\7\0"+
    "\1\4\14\0\1\44\1\0\1\43\6\4\1\121\7\4"+
    "\1\0\2\4\7\0\1\4\14\0\1\44\1\0\1\43"+
    "\7\4\1\122\6\4\1\0\2\4\7\0\1\4\14\0"+
    "\1\44\1\0\1\43\14\4\1\123\1\4\1\0\2\4"+
    "\7\0\1\4\14\0\1\44\1\0\1\43\13\4\1\124"+
    "\2\4\1\0\2\4\7\0\1\4\14\0\1\44\1\0"+
    "\1\43\6\4\1\125\7\4\1\0\2\4\7\0\1\4"+
    "\14\0\1\44";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2200];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\12\1\5\11\6\1\1\11\3\1\1\11"+
    "\2\1\3\11\2\1\1\11\11\1\1\11\1\1\4\11"+
    "\1\0\1\11\2\1\2\0\11\1\3\0\2\1\1\11"+
    "\6\1\1\11\6\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    String cadena="";
    ArrayList erroresLexicos = new ArrayList();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 11: 
          { return new Symbol(sym.tkn_ampersand          ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 36: break;
        case 22: 
          { return new Symbol(sym.tkn_increment           ,yyline+1, yycolumn+1, yytext());
          }
        case 37: break;
        case 7: 
          { return new Symbol(sym.tkn_llaveiz           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 38: break;
        case 17: 
          { return new Symbol(sym.tkn_ternario           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 39: break;
        case 31: 
          { return new Symbol(sym.tkn_charp           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 40: break;
        case 15: 
          { /* skip it */
          }
        case 41: break;
        case 2: 
          { return new Symbol(sym.tkn_num           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 42: break;
        case 9: 
          { return new Symbol(sym.tkn_oprel           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 43: break;
        case 29: 
          { return new Symbol(sym.tkn_else           ,yyline+1, yycolumn+1, yytext());
          }
        case 44: break;
        case 10: 
          { return new Symbol(sym.tkn_igual        ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 45: break;
        case 32: 
          { return new Symbol(sym.tkn_scanf           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 46: break;
        case 20: 
          { return new Symbol(sym.tkn_and           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 47: break;
        case 12: 
          { return new Symbol(sym.tkn_coma         ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 48: break;
        case 25: 
          { return new Symbol(sym.tkn_int           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 49: break;
        case 34: 
          { return new Symbol(sym.tkn_return           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 50: break;
        case 16: 
          { return new Symbol(sym.tkn_dospuntos           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 51: break;
        case 18: 
          { return new Symbol(sym.tkn_id2           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 52: break;
        case 19: 
          { return new Symbol(sym.tkn_if           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 53: break;
        case 33: 
          { return new Symbol(sym.tkn_while           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 54: break;
        case 27: 
          { return new Symbol(sym.tkn_char           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 55: break;
        case 14: 
          { return new Symbol(sym.tkn_puntocoma           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 56: break;
        case 6: 
          { return new Symbol(sym.tkn_parentesisde           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 57: break;
        case 3: 
          { return new Symbol(sym.tkn_id           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 58: break;
        case 13: 
          { return new Symbol(sym.tkn_opadicion           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 59: break;
        case 21: 
          { return new Symbol(sym.tkn_or           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 60: break;
        case 1: 
          { erroresLexicos.add("Error lexico en linea: "+ (yyline+1) +" y columna " + (yycolumn+1) +" y en el texto: "+yytext());
          }
        case 61: break;
        case 28: 
          { return new Symbol(sym.tkn_intp           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 62: break;
        case 5: 
          { return new Symbol(sym.tkn_parentesisiz           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 63: break;
        case 35: 
          { return new Symbol(sym.tkn_printf           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 64: break;
        case 26: 
          { return new Symbol(sym.tkn_for           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 65: break;
        case 23: 
          { return new Symbol(sym.tkn_decrement           ,yyline+1, yycolumn+1, yytext());
          }
        case 66: break;
        case 30: 
          { return new Symbol(sym.tkn_main           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 67: break;
        case 8: 
          { return new Symbol(sym.tkn_llaveder           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 68: break;
        case 24: 
          { 
          }
        case 69: break;
        case 4: 
          { return new Symbol(sym.tkn_opmulti           ,yyline+1 ,yycolumn+1 ,yytext());
          }
        case 70: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
