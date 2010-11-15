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
import android.util.AttributeSet;
import android.view.HapticFeedbackConstants;
import android.view.MotionEvent;
import android.widget.ImageButton;

public class SOWGButton extends ImageButton {
	private final int haptic = HapticFeedbackConstants.VIRTUAL_KEY;
	
	public SOWGButton(Context context) {
		super(context);
	}

	public SOWGButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SOWGButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event)
	{
		//vibrate on touchdown
		if (event.getAction() == MotionEvent.ACTION_DOWN)
		{
			this.performHapticFeedback(haptic);
		}
		
		return super.onTouchEvent(event);
	}
}
