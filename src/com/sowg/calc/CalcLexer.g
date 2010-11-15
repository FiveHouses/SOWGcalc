lexer grammar CalcLexer;

@header {/**
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

PLUS: 	'+';
MINUS:	'-';
MULT:	'\u00D7' | '*';
DIV:	'\u00F7' | '/';
LPAREN:	'(';
RPAREN:	')';
SIN:	'sin';
COS:	'cos';
TAN:	'tan';
LN:		'ln';
LOG:	'log';
FACT:	'!';
POWER:	'^';
E:	'e';
PI:	'\u03C0' | 'pi';
SQRT:	'\u221A' | 'sqrt';

DECIMAL : (DIGIT+ ('.' DIGIT*)? | '.' DIGIT+) ('E' MINUS? DIGIT+)?;

WHITESPACE : ('\t' | ' ' | '\r' | '\n'| '\u000C')+ 	{ $channel = HIDDEN; };

fragment DIGIT	: '0'..'9';
