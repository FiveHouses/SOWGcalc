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

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.EditText;

public class SOWGEditText extends EditText {
	private boolean drawn = false;
	
	public SOWGEditText(Context context) {
		super(context);
	}

	public SOWGEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SOWGEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		
		//resize text
		if (!drawn)
		{
			drawn = true;
			this.setTextSize(TypedValue.COMPLEX_UNIT_PX, (int)(0.6 * (double)this.getHeight()));
		}
	}
}
