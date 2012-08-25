// $ANTLR 3.2 Sep 23, 2009 12:02:23 CalcParser.g 2012-08-25 08:09:19
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

public class CalcParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "SIN", "COS", "TAN", "LN", "LOG", "FACT", "POWER", "E", "PI", "SQRT", "DECIMALPOINT", "DIGIT", "DECIMAL", "WHITESPACE"
    };
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


        public CalcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CalcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CalcParser.tokenNames; }
    public String getGrammarFileName() { return "CalcParser.g"; }

    private final int trigRound = 15;
    public String result;


    // $ANTLR start "ultimate"
    // CalcParser.g:32:1: ultimate : expr ;
    public final void ultimate() throws RecognitionException {
        double expr1 = 0.0;


        try {
            // CalcParser.g:32:9: ( expr )
            // CalcParser.g:32:11: expr
            {
            pushFollow(FOLLOW_expr_in_ultimate33);
            expr1=expr();

            state._fsp--;

            result = Helper.doubleFormatted(expr1);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ultimate"


    // $ANTLR start "expr"
    // CalcParser.g:34:1: expr returns [double value] : a= multExpr ( PLUS b= multExpr | MINUS b= multExpr )* ;
    public final double expr() throws RecognitionException {
        double value = 0.0;

        double a = 0.0;

        double b = 0.0;


        try {
            // CalcParser.g:35:1: (a= multExpr ( PLUS b= multExpr | MINUS b= multExpr )* )
            // CalcParser.g:35:3: a= multExpr ( PLUS b= multExpr | MINUS b= multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_expr52);
            a=multExpr();

            state._fsp--;

            value = a;
            // CalcParser.g:36:1: ( PLUS b= multExpr | MINUS b= multExpr )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PLUS) ) {
                    alt1=1;
                }
                else if ( (LA1_0==MINUS) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // CalcParser.g:36:2: PLUS b= multExpr
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_expr59); 
            	    pushFollow(FOLLOW_multExpr_in_expr65);
            	    b=multExpr();

            	    state._fsp--;

            	    value += b;

            	    }
            	    break;
            	case 2 :
            	    // CalcParser.g:38:1: MINUS b= multExpr
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_expr72); 
            	    pushFollow(FOLLOW_multExpr_in_expr78);
            	    b=multExpr();

            	    state._fsp--;

            	    value -= b;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "expr"


    // $ANTLR start "multExpr"
    // CalcParser.g:40:1: multExpr returns [double value] : a= powExpr ( MULT b= powExpr | DIV b= powExpr )* ;
    public final double multExpr() throws RecognitionException {
        double value = 0.0;

        double a = 0.0;

        double b = 0.0;


        try {
            // CalcParser.g:41:1: (a= powExpr ( MULT b= powExpr | DIV b= powExpr )* )
            // CalcParser.g:41:3: a= powExpr ( MULT b= powExpr | DIV b= powExpr )*
            {
            pushFollow(FOLLOW_powExpr_in_multExpr98);
            a=powExpr();

            state._fsp--;

            value = a;
            // CalcParser.g:42:1: ( MULT b= powExpr | DIV b= powExpr )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MULT) ) {
                    alt2=1;
                }
                else if ( (LA2_0==DIV) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // CalcParser.g:42:2: MULT b= powExpr
            	    {
            	    match(input,MULT,FOLLOW_MULT_in_multExpr105); 
            	    pushFollow(FOLLOW_powExpr_in_multExpr111);
            	    b=powExpr();

            	    state._fsp--;

            	    value *= b;

            	    }
            	    break;
            	case 2 :
            	    // CalcParser.g:44:1: DIV b= powExpr
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_multExpr118); 
            	    pushFollow(FOLLOW_powExpr_in_multExpr126);
            	    b=powExpr();

            	    state._fsp--;

            	    value /= b;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "multExpr"


    // $ANTLR start "powExpr"
    // CalcParser.g:46:1: powExpr returns [double value] : a= minusExpr ( POWER b= minusExpr )? ;
    public final double powExpr() throws RecognitionException {
        double value = 0.0;

        double a = 0.0;

        double b = 0.0;


        try {
            // CalcParser.g:47:1: (a= minusExpr ( POWER b= minusExpr )? )
            // CalcParser.g:47:3: a= minusExpr ( POWER b= minusExpr )?
            {
            pushFollow(FOLLOW_minusExpr_in_powExpr146);
            a=minusExpr();

            state._fsp--;

            value = a;
            // CalcParser.g:48:1: ( POWER b= minusExpr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==POWER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // CalcParser.g:48:2: POWER b= minusExpr
                    {
                    match(input,POWER,FOLLOW_POWER_in_powExpr153); 
                    pushFollow(FOLLOW_minusExpr_in_powExpr159);
                    b=minusExpr();

                    state._fsp--;

                    value = Math.pow(a, b);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "powExpr"


    // $ANTLR start "minusExpr"
    // CalcParser.g:50:1: minusExpr returns [double value] : ( (min+= MINUS )+ multTerms | multTerms );
    public final double minusExpr() throws RecognitionException {
        double value = 0.0;

        Token min=null;
        List list_min=null;
        double multTerms2 = 0.0;

        double multTerms3 = 0.0;


        try {
            // CalcParser.g:51:1: ( (min+= MINUS )+ multTerms | multTerms )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==MINUS) ) {
                alt5=1;
            }
            else if ( (LA5_0==LPAREN||(LA5_0>=SIN && LA5_0<=LOG)||(LA5_0>=E && LA5_0<=SQRT)||LA5_0==DECIMAL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // CalcParser.g:51:3: (min+= MINUS )+ multTerms
                    {
                    // CalcParser.g:51:3: (min+= MINUS )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==MINUS) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // CalcParser.g:51:4: min+= MINUS
                    	    {
                    	    min=(Token)match(input,MINUS,FOLLOW_MINUS_in_minusExpr179); 
                    	    if (list_min==null) list_min=new ArrayList();
                    	    list_min.add(min);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    pushFollow(FOLLOW_multTerms_in_minusExpr183);
                    multTerms2=multTerms();

                    state._fsp--;

                    if (list_min != null)
                    {
                    	int negOrPos = (list_min.size() % 2 == 0) ? 1 : -1;
                    	value = multTerms2 * negOrPos;
                    }

                    }
                    break;
                case 2 :
                    // CalcParser.g:58:3: multTerms
                    {
                    pushFollow(FOLLOW_multTerms_in_minusExpr190);
                    multTerms3=multTerms();

                    state._fsp--;

                    value = multTerms3;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "minusExpr"


    // $ANTLR start "multTerms"
    // CalcParser.g:60:1: multTerms returns [double value] : ( unaryExpr )+ ;
    public final double multTerms() throws RecognitionException {
        double value = 0.0;

        double unaryExpr4 = 0.0;


        ArrayList<Double> termList = new ArrayList<Double>();
        try {
            // CalcParser.g:62:1: ( ( unaryExpr )+ )
            // CalcParser.g:63:1: ( unaryExpr )+
            {
            // CalcParser.g:63:1: ( unaryExpr )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==LPAREN||(LA6_0>=SIN && LA6_0<=LOG)||(LA6_0>=E && LA6_0<=SQRT)||LA6_0==DECIMAL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // CalcParser.g:63:2: unaryExpr
            	    {
            	    pushFollow(FOLLOW_unaryExpr_in_multTerms218);
            	    unaryExpr4=unaryExpr();

            	    state._fsp--;

            	    termList.add(new Double(unaryExpr4));

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

            value = Helper.multiplyList(termList);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "multTerms"


    // $ANTLR start "unaryExpr"
    // CalcParser.g:66:1: unaryExpr returns [double value] : ( (sqrt+= SQRT )+ factExpr | factExpr );
    public final double unaryExpr() throws RecognitionException {
        double value = 0.0;

        Token sqrt=null;
        List list_sqrt=null;
        double factExpr5 = 0.0;

        double factExpr6 = 0.0;


        try {
            // CalcParser.g:67:1: ( (sqrt+= SQRT )+ factExpr | factExpr )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==SQRT) ) {
                alt8=1;
            }
            else if ( (LA8_0==LPAREN||(LA8_0>=SIN && LA8_0<=LOG)||(LA8_0>=E && LA8_0<=PI)||LA8_0==DECIMAL) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // CalcParser.g:67:3: (sqrt+= SQRT )+ factExpr
                    {
                    // CalcParser.g:67:3: (sqrt+= SQRT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==SQRT) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // CalcParser.g:67:4: sqrt+= SQRT
                    	    {
                    	    sqrt=(Token)match(input,SQRT,FOLLOW_SQRT_in_unaryExpr251); 
                    	    if (list_sqrt==null) list_sqrt=new ArrayList();
                    	    list_sqrt.add(sqrt);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    pushFollow(FOLLOW_factExpr_in_unaryExpr255);
                    factExpr5=factExpr();

                    state._fsp--;

                    value = Helper.squareRoot(factExpr5, list_sqrt.size());

                    }
                    break;
                case 2 :
                    // CalcParser.g:68:3: factExpr
                    {
                    pushFollow(FOLLOW_factExpr_in_unaryExpr261);
                    factExpr6=factExpr();

                    state._fsp--;

                    value = factExpr6;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "unaryExpr"


    // $ANTLR start "factExpr"
    // CalcParser.g:70:1: factExpr returns [double value] : term (fact+= FACT )* ;
    public final double factExpr() throws RecognitionException {
        double value = 0.0;

        Token fact=null;
        List list_fact=null;
        double term7 = 0.0;


        try {
            // CalcParser.g:71:1: ( term (fact+= FACT )* )
            // CalcParser.g:71:3: term (fact+= FACT )*
            {
            pushFollow(FOLLOW_term_in_factExpr278);
            term7=term();

            state._fsp--;

            // CalcParser.g:71:8: (fact+= FACT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==FACT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // CalcParser.g:71:9: fact+= FACT
            	    {
            	    fact=(Token)match(input,FACT,FOLLOW_FACT_in_factExpr285); 
            	    if (list_fact==null) list_fact=new ArrayList();
            	    list_fact.add(fact);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if (list_fact == null) //no factorial
            	value = term7;
            else
            	value = Helper.factorial(term7, list_fact.size());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "factExpr"


    // $ANTLR start "term"
    // CalcParser.g:78:1: term returns [double value] : ( LPAREN expr RPAREN | LN LPAREN expr RPAREN | LOG LPAREN expr RPAREN | SIN LPAREN expr RPAREN | COS LPAREN expr RPAREN | TAN LPAREN expr RPAREN | DECIMAL | PI | E );
    public final double term() throws RecognitionException {
        double value = 0.0;

        Token DECIMAL14=null;
        double expr8 = 0.0;

        double expr9 = 0.0;

        double expr10 = 0.0;

        double expr11 = 0.0;

        double expr12 = 0.0;

        double expr13 = 0.0;


        try {
            // CalcParser.g:79:1: ( LPAREN expr RPAREN | LN LPAREN expr RPAREN | LOG LPAREN expr RPAREN | SIN LPAREN expr RPAREN | COS LPAREN expr RPAREN | TAN LPAREN expr RPAREN | DECIMAL | PI | E )
            int alt10=9;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt10=1;
                }
                break;
            case LN:
                {
                alt10=2;
                }
                break;
            case LOG:
                {
                alt10=3;
                }
                break;
            case SIN:
                {
                alt10=4;
                }
                break;
            case COS:
                {
                alt10=5;
                }
                break;
            case TAN:
                {
                alt10=6;
                }
                break;
            case DECIMAL:
                {
                alt10=7;
                }
                break;
            case PI:
                {
                alt10=8;
                }
                break;
            case E:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // CalcParser.g:79:3: LPAREN expr RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_term301); 
                    pushFollow(FOLLOW_expr_in_term303);
                    expr8=expr();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_term305); 
                    value = expr8;

                    }
                    break;
                case 2 :
                    // CalcParser.g:80:3: LN LPAREN expr RPAREN
                    {
                    match(input,LN,FOLLOW_LN_in_term311); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_term313); 
                    pushFollow(FOLLOW_expr_in_term315);
                    expr9=expr();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_term317); 
                    value = Math.log(expr9);

                    }
                    break;
                case 3 :
                    // CalcParser.g:81:3: LOG LPAREN expr RPAREN
                    {
                    match(input,LOG,FOLLOW_LOG_in_term323); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_term325); 
                    pushFollow(FOLLOW_expr_in_term327);
                    expr10=expr();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_term329); 
                    value = Math.log10(expr10);

                    }
                    break;
                case 4 :
                    // CalcParser.g:82:3: SIN LPAREN expr RPAREN
                    {
                    match(input,SIN,FOLLOW_SIN_in_term334); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_term336); 
                    pushFollow(FOLLOW_expr_in_term338);
                    expr11=expr();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_term340); 
                    value = Helper.round(Math.sin(expr11), trigRound);

                    }
                    break;
                case 5 :
                    // CalcParser.g:83:3: COS LPAREN expr RPAREN
                    {
                    match(input,COS,FOLLOW_COS_in_term345); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_term347); 
                    pushFollow(FOLLOW_expr_in_term349);
                    expr12=expr();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_term351); 
                    value = Helper.round(Math.cos(expr12), trigRound);

                    }
                    break;
                case 6 :
                    // CalcParser.g:84:3: TAN LPAREN expr RPAREN
                    {
                    match(input,TAN,FOLLOW_TAN_in_term356); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_term358); 
                    pushFollow(FOLLOW_expr_in_term360);
                    expr13=expr();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_term362); 
                    value = Helper.round(Math.tan(expr13), trigRound);

                    }
                    break;
                case 7 :
                    // CalcParser.g:85:3: DECIMAL
                    {
                    DECIMAL14=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_term367); 
                    value = Helper.DecimalToDouble((DECIMAL14!=null?DECIMAL14.getText():null));

                    }
                    break;
                case 8 :
                    // CalcParser.g:86:3: PI
                    {
                    match(input,PI,FOLLOW_PI_in_term376); 
                    value = Math.PI;

                    }
                    break;
                case 9 :
                    // CalcParser.g:87:3: E
                    {
                    match(input,E,FOLLOW_E_in_term386); 
                    value = Math.E;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "term"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_ultimate33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr52 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_PLUS_in_expr59 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_multExpr_in_expr65 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_MINUS_in_expr72 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_multExpr_in_expr78 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_powExpr_in_multExpr98 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_MULT_in_multExpr105 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_powExpr_in_multExpr111 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_DIV_in_multExpr118 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_powExpr_in_multExpr126 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_minusExpr_in_powExpr146 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_POWER_in_powExpr153 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_minusExpr_in_powExpr159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_minusExpr179 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_multTerms_in_minusExpr183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multTerms_in_minusExpr190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_multTerms218 = new BitSet(new long[]{0x00000000004E7D22L});
    public static final BitSet FOLLOW_SQRT_in_unaryExpr251 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_factExpr_in_unaryExpr255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factExpr_in_unaryExpr261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_factExpr278 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_FACT_in_factExpr285 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_LPAREN_in_term301 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_expr_in_term303 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_term305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LN_in_term311 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_term313 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_expr_in_term315 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_term317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_in_term323 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_term325 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_expr_in_term327 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_term329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIN_in_term334 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_term336 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_expr_in_term338 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_term340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COS_in_term345 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_term347 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_expr_in_term349 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_term351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAN_in_term356 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_term358 = new BitSet(new long[]{0x00000000004E7D20L});
    public static final BitSet FOLLOW_expr_in_term360 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_term362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_term367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PI_in_term376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_E_in_term386 = new BitSet(new long[]{0x0000000000000002L});

}