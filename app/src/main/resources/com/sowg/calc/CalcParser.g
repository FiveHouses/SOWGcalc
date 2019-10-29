parser grammar CalcParser;

options
{tokenVocab = CalcLexer;}

@header
{/**
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
 
 package com.sowg.calc;}

@members
{private final int trigRound = 15;
public String result;}

ultimate: expr			{result = Helper.doubleFormatted($expr.value);};

expr returns[double value]
: a = multExpr			{$value = $a.value;}
(PLUS b = multExpr		{$value += $b.value;}
|
MINUS b = multExpr		{$value -= $b.value;})*;

multExpr returns[double value]
: a = powExpr			{$value = $a.value;}
(MULT b = powExpr		{$value *= $b.value;}
|
DIV   b = powExpr		{$value /= $b.value;})*;

powExpr returns[double value]
: a = minusExpr			{$value = $a.value;}
(POWER b = minusExpr	{$value = Math.pow($a.value, $b.value);})?;

minusExpr returns[double value]
: (min += MINUS)+ multTerms
{if ($min != null)
{
	int negOrPos = ($min.size() \% 2 == 0) ? 1 : -1;
	$value = $multTerms.value * negOrPos;
}}

| multTerms				{$value = $multTerms.value;};

multTerms returns[double value]
@init						{ArrayList<Double> termList = new ArrayList<Double>();}
: 
(unaryExpr					{termList.add(new Double($unaryExpr.value));})+
							{$value = Helper.multiplyList(termList);};

unaryExpr returns[double value]
: (sqrt += SQRT)+ factExpr	{$value = Helper.squareRoot($factExpr.value, $sqrt.size());}
| factExpr					{$value = $factExpr.value;};

factExpr returns[double value]
: term (fact += FACT)*

{if ($fact == null) //no factorial
	$value = $term.value;
else
	$value = Helper.factorial($term.value, $fact.size());};

term returns[double value]
: LPAREN expr RPAREN	{$value = $expr.value;}
| LN LPAREN expr RPAREN	{$value = Math.log($expr.value);}
| LOG LPAREN expr RPAREN{$value = Math.log10($expr.value);}
| SIN LPAREN expr RPAREN{$value = Helper.round(Math.sin($expr.value), trigRound);}
| COS LPAREN expr RPAREN{$value = Helper.round(Math.cos($expr.value), trigRound);}
| TAN LPAREN expr RPAREN{$value = Helper.round(Math.tan($expr.value), trigRound);}
| DECIMAL				{$value = Helper.DecimalToDouble($DECIMAL.text);}
| PI					{$value = Math.PI;}
| E						{$value = Math.E;};