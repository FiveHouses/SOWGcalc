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

//class to contain all ANTLR grammar references
package com.sowg.calc;

import org.antlr.runtime.*;

public class CalcGrammar {
	
	public CalcGrammar() {}

	public static String evalGrammar(String input)
	{
		String expr = "";
		
		//go from string down to parse
    	CharStream cs = new ANTLRStringStream(input);
    	CalcLexer cLex = new CalcLexer(cs);
    	CommonTokenStream tokens = new CommonTokenStream();
    	tokens.setTokenSource(cLex);
    	CalcParser cParse = new CalcParser(tokens);
    	
    	try {
    		//and back to string
			cParse.ultimate();
			expr = cParse.result;
		} catch (RecognitionException e) {
			expr = "Error";
		}
		
		return expr;
	}
}
