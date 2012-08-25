// $ANTLR 3.2 Sep 23, 2009 12:02:23 CalcLexer.g 2012-08-25 08:09:19
/**
 *  SOWGware, Copyright 2010
 * 
 *  This file is part of SOWGcalc.

    SOWGcalc is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    SOWGcalc is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with SOWGcalc.  If not, see <http://www.gnu.org/licenses/>.
 */
 
 package com.sowg.calc;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CalcLexer extends Lexer {
    public static final int E=17;
    public static final int LN=13;
    public static final int LOG=14;
    public static final int WHITESPACE=23;
    public static final int POWER=16;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int SQRT=19;
    public static final int EOF=-1;
    public static final int LPAREN=8;
    public static final int RPAREN=9;
    public static final int DECIMAL=22;
    public static final int SIN=10;
    public static final int COS=11;
    public static final int TAN=12;
    public static final int PLUS=4;
    public static final int PI=18;
    public static final int DIGIT=21;
    public static final int DIV=7;
    public static final int DECIMALPOINT=20;
    public static final int FACT=15;

    // delegates
    // delegators

    public CalcLexer() {;} 
    public CalcLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CalcLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "CalcLexer.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:24:5: ( '+' )
            // CalcLexer.g:24:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:25:6: ( '-' )
            // CalcLexer.g:25:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:26:5: ( '\\u00D7' | '*' )
            // CalcLexer.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='\u00D7' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:27:4: ( '\\u00F7' | '/' )
            // CalcLexer.g:
            {
            if ( input.LA(1)=='/'||input.LA(1)=='\u00F7' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:28:7: ( '(' )
            // CalcLexer.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:29:7: ( ')' )
            // CalcLexer.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "SIN"
    public final void mSIN() throws RecognitionException {
        try {
            int _type = SIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:30:4: ( 'sin' )
            // CalcLexer.g:30:6: 'sin'
            {
            match("sin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIN"

    // $ANTLR start "COS"
    public final void mCOS() throws RecognitionException {
        try {
            int _type = COS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:31:4: ( 'cos' )
            // CalcLexer.g:31:6: 'cos'
            {
            match("cos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COS"

    // $ANTLR start "TAN"
    public final void mTAN() throws RecognitionException {
        try {
            int _type = TAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:32:4: ( 'tan' )
            // CalcLexer.g:32:6: 'tan'
            {
            match("tan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAN"

    // $ANTLR start "LN"
    public final void mLN() throws RecognitionException {
        try {
            int _type = LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:33:3: ( 'ln' )
            // CalcLexer.g:33:6: 'ln'
            {
            match("ln"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LN"

    // $ANTLR start "LOG"
    public final void mLOG() throws RecognitionException {
        try {
            int _type = LOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:34:4: ( 'log' )
            // CalcLexer.g:34:6: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOG"

    // $ANTLR start "FACT"
    public final void mFACT() throws RecognitionException {
        try {
            int _type = FACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:35:5: ( '!' )
            // CalcLexer.g:35:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FACT"

    // $ANTLR start "POWER"
    public final void mPOWER() throws RecognitionException {
        try {
            int _type = POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:36:6: ( '^' )
            // CalcLexer.g:36:8: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POWER"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            int _type = E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:37:2: ( 'e' )
            // CalcLexer.g:37:4: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "PI"
    public final void mPI() throws RecognitionException {
        try {
            int _type = PI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:38:3: ( '\\u03C0' | 'pi' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\u03C0') ) {
                alt1=1;
            }
            else if ( (LA1_0=='p') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // CalcLexer.g:38:5: '\\u03C0'
                    {
                    match('\u03C0'); 

                    }
                    break;
                case 2 :
                    // CalcLexer.g:38:16: 'pi'
                    {
                    match("pi"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PI"

    // $ANTLR start "SQRT"
    public final void mSQRT() throws RecognitionException {
        try {
            int _type = SQRT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:39:5: ( '\\u221A' | 'sqrt' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\u221A') ) {
                alt2=1;
            }
            else if ( (LA2_0=='s') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // CalcLexer.g:39:7: '\\u221A'
                    {
                    match('\u221A'); 

                    }
                    break;
                case 2 :
                    // CalcLexer.g:39:18: 'sqrt'
                    {
                    match("sqrt"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQRT"

    // $ANTLR start "DECIMALPOINT"
    public final void mDECIMALPOINT() throws RecognitionException {
        try {
            int _type = DECIMALPOINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:40:13: ( '.' | ',' )
            // CalcLexer.g:
            {
            if ( input.LA(1)==','||input.LA(1)=='.' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMALPOINT"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:42:9: ( ( ( DIGIT )+ ( DECIMALPOINT ( DIGIT )* )? | DECIMALPOINT ( DIGIT )+ ) ( 'E' ( MINUS )? ( DIGIT )+ )? )
            // CalcLexer.g:42:11: ( ( DIGIT )+ ( DECIMALPOINT ( DIGIT )* )? | DECIMALPOINT ( DIGIT )+ ) ( 'E' ( MINUS )? ( DIGIT )+ )?
            {
            // CalcLexer.g:42:11: ( ( DIGIT )+ ( DECIMALPOINT ( DIGIT )* )? | DECIMALPOINT ( DIGIT )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0==','||LA7_0=='.') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // CalcLexer.g:42:12: ( DIGIT )+ ( DECIMALPOINT ( DIGIT )* )?
                    {
                    // CalcLexer.g:42:12: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // CalcLexer.g:42:12: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // CalcLexer.g:42:19: ( DECIMALPOINT ( DIGIT )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==','||LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // CalcLexer.g:42:20: DECIMALPOINT ( DIGIT )*
                            {
                            mDECIMALPOINT(); 
                            // CalcLexer.g:42:33: ( DIGIT )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // CalcLexer.g:42:33: DIGIT
                            	    {
                            	    mDIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CalcLexer.g:42:44: DECIMALPOINT ( DIGIT )+
                    {
                    mDECIMALPOINT(); 
                    // CalcLexer.g:42:57: ( DIGIT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // CalcLexer.g:42:57: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // CalcLexer.g:42:65: ( 'E' ( MINUS )? ( DIGIT )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='E') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // CalcLexer.g:42:66: 'E' ( MINUS )? ( DIGIT )+
                    {
                    match('E'); 
                    // CalcLexer.g:42:70: ( MINUS )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // CalcLexer.g:42:70: MINUS
                            {
                            mMINUS(); 

                            }
                            break;

                    }

                    // CalcLexer.g:42:77: ( DIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // CalcLexer.g:42:77: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CalcLexer.g:44:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // CalcLexer.g:44:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // CalcLexer.g:44:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||(LA11_0>='\f' && LA11_0<='\r')||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // CalcLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // CalcLexer.g:46:16: ( '0' .. '9' )
            // CalcLexer.g:46:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // CalcLexer.g:1:8: ( PLUS | MINUS | MULT | DIV | LPAREN | RPAREN | SIN | COS | TAN | LN | LOG | FACT | POWER | E | PI | SQRT | DECIMALPOINT | DECIMAL | WHITESPACE )
        int alt12=19;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // CalcLexer.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // CalcLexer.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // CalcLexer.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // CalcLexer.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // CalcLexer.g:1:30: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 6 :
                // CalcLexer.g:1:37: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 7 :
                // CalcLexer.g:1:44: SIN
                {
                mSIN(); 

                }
                break;
            case 8 :
                // CalcLexer.g:1:48: COS
                {
                mCOS(); 

                }
                break;
            case 9 :
                // CalcLexer.g:1:52: TAN
                {
                mTAN(); 

                }
                break;
            case 10 :
                // CalcLexer.g:1:56: LN
                {
                mLN(); 

                }
                break;
            case 11 :
                // CalcLexer.g:1:59: LOG
                {
                mLOG(); 

                }
                break;
            case 12 :
                // CalcLexer.g:1:63: FACT
                {
                mFACT(); 

                }
                break;
            case 13 :
                // CalcLexer.g:1:68: POWER
                {
                mPOWER(); 

                }
                break;
            case 14 :
                // CalcLexer.g:1:74: E
                {
                mE(); 

                }
                break;
            case 15 :
                // CalcLexer.g:1:76: PI
                {
                mPI(); 

                }
                break;
            case 16 :
                // CalcLexer.g:1:79: SQRT
                {
                mSQRT(); 

                }
                break;
            case 17 :
                // CalcLexer.g:1:84: DECIMALPOINT
                {
                mDECIMALPOINT(); 

                }
                break;
            case 18 :
                // CalcLexer.g:1:97: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 19 :
                // CalcLexer.g:1:105: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\20\uffff\1\26\6\uffff";
    static final String DFA12_eofS =
        "\27\uffff";
    static final String DFA12_minS =
        "\1\11\6\uffff\1\151\2\uffff\1\156\5\uffff\1\60\6\uffff";
    static final String DFA12_maxS =
        "\1\u221a\6\uffff\1\161\2\uffff\1\157\5\uffff\1\71\6\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\uffff\1\14"+
        "\1\15\1\16\1\17\1\20\1\uffff\1\22\1\23\1\7\1\12\1\13\1\21";
    static final String DFA12_specialS =
        "\27\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\22\1\uffff\2\22\22\uffff\1\22\1\13\6\uffff\1\5\1\6\1\3\1"+
            "\1\1\20\1\2\1\20\1\4\12\21\44\uffff\1\14\4\uffff\1\10\1\uffff"+
            "\1\15\6\uffff\1\12\3\uffff\1\16\2\uffff\1\7\1\11\142\uffff\1"+
            "\3\37\uffff\1\4\u02c8\uffff\1\16\u1e59\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\7\uffff\1\17",
            "",
            "",
            "\1\24\1\25",
            "",
            "",
            "",
            "",
            "",
            "\12\21",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | LPAREN | RPAREN | SIN | COS | TAN | LN | LOG | FACT | POWER | E | PI | SQRT | DECIMALPOINT | DECIMAL | WHITESPACE );";
        }
    }
 

}