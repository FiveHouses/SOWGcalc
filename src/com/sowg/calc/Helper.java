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

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

import cern.jet.stat.*;

//various static helper methods
public class Helper
{
	//is this char in this char array?
	public static boolean charInList(char check, char[] list)
    {
    	boolean retVal = false;
    	
    	for (char c : list)
    	{
    		if (c == check)
    		{
    			retVal = true;
    			break;
    		}
    	}
    	
    	return retVal;
    }
    
	//adds parentheses to the beginning or end of an incomplete string
    public static String addParentheses(String text)
    {
    	int numOpenParens = 0, numCloseParens = 0;
    	
    	//search string for parentheses
    	for (char c : text.toCharArray())
    	{
    		if (c == '(')
    		{
    			numOpenParens++;
    		}
    		else if (c == ')')
    		{
    			numCloseParens++;
    		}
    	}
    	
    	int diffParens = numOpenParens - numCloseParens;
    	
    	//construct a number of open/close parentheses depending on number
    	String textCorrected = "";
    	if (diffParens == 0)
    	{
    		textCorrected = text;
    	}
    	else if (diffParens < 0)
    	{
    		//add open parentheses at the beginning
    		String parens = repeatingChars('(', -diffParens);
    		textCorrected = parens + text;
    	}
    	else
    	{
    		//add close parentheses at the end
    		String parens = repeatingChars(')', diffParens);
    		textCorrected = text + parens;
    	}
    	
    	return textCorrected;
    }
    
    //returns a string filled with one repeating character
    public static String repeatingChars(char toRepeat, int number)
    {
    	char[] chars = new char[number];
    	Arrays.fill(chars, toRepeat);
    	return new String(chars);
    }

	//rounds a double to a specific precision
    public static double round(double d, int decimalPlace)
    {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
    
    //gamma function but bounded
    public static double boundedGamma(double val)
    {
    	double retVal = Double.NaN;
    	
    	if (val < 0.0)
    	{
    		retVal = Double.NaN;
    	}
    	else if (val > 200.0)
    	{
    		retVal = Double.POSITIVE_INFINITY;
    	}
    	else
    	{
    		retVal = Gamma.gamma(val);
    	}
    	
    	return retVal;
    }
    
    //factorial a number of times
    public static double factorial(double val, int n)
    {
    	double retVal = boundedGamma(val + 1.0);
    	
    	if (n > 1)
    	{
    		//recursion
    		retVal = factorial(retVal, n - 1);
    	}
    	
    	return retVal;
    }
    
    //square root a number of times
    public static double squareRoot(double val, int n)
    {
    	double retVal = Math.sqrt(val);
    	
    	if (n > 1)
    	{
    		//recursion
    		retVal = squareRoot(retVal, n - 1);
    	}
    	
    	return retVal;
    }
    
    //multiplies all doubles in a list
    public static double multiplyList(List<Double> list)
    {
    	//initialize to multiplicative identity 
    	double retVal = 1.0;
    	
    	//loop through the list and multiply all together
    	for (double val : list)
    	{
    		retVal *= val;
    	}
    	
    	return retVal;
    }
    
    //formats a double's string representation in a specific manner
    public static String doubleFormatted(double val)
    {
    	//quick not a number check
    	if (Double.isNaN(val))
    	{
    		return "Not a Number";
    	}
    	
	    NumberFormat formatter;
	    double absVal = Math.abs(val);
	    if (absVal != 0.0 && (absVal > 10000000000000.0 || absVal < 0.000000000001))
	    {
	    	formatter = new DecimalFormat("#.#########E0");
	    }
	    else
	    {
	    	formatter = new DecimalFormat("#.###########");
	    }
	    
	    return formatter.format(val);
    }
}
