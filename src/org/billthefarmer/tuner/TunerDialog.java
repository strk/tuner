////////////////////////////////////////////////////////////////////////////////
//
//  Tuner - An Android Tuner written in Java.
//
//  Copyright (C) 2013	Bill Farmer
//
//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU General Public License for more details.
//
//  You should have received a copy of the GNU General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
//  Bill Farmer	 william j farmer [at] yahoo [dot] co [dot] uk.
//
///////////////////////////////////////////////////////////////////////////////

package org.billthefarmer.tuner;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.view.MenuItem;

public class TunerDialog extends Dialog
{
    // Constructor

    public TunerDialog(Context context, int themeResId)
    {
	super(context, themeResId);

	// Enable back navigation on action bar

	ActionBar actionBar = getActionBar();
	actionBar.setDisplayHomeAsUpEnabled(true);
    }

    // On options item selected

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
	// Switch on item id

	switch (item.getItemId())
	{
	case android.R.id.home:
	    dismiss();
	    return true;

	default:
	    return super.onOptionsItemSelected(item);
	}
    }
}
