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

//class to handle the M functions
public class Memory {
	private static double value = 0.0;
	
	public static void plus(double val)
	{
		value += val;
	}
	
	public static void minus(double val)
	{
		value -= val;
	}
	
	public static void clear()
	{
		value = 0.0;
	}
	
	public static double recall()
	{
		return value;
	}
}
