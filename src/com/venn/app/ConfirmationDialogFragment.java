package com.venn.app;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * class ConfirmationDialogue
 * @author Shawn
 *
 * This class is reponsible for displaying a dialog fragment for any purpose of
 * user interaction. It is programmed to be rather general, which only plays as
 * a container of dialog. You need to creat the dialog you want and use
 * setDialog method to set the dialog to display.
 */
public class ConfirmationDialogFragment extends DialogFragment
{
    private Dialog dialog = null;

    // The following code is left as reference to show how to use bundle to pass
    // parameters. They are not useful.
    //
    // public static ConfirmationDialogFragment newInstance(int title)
    // {
        // ConfirmationDialogFragment confirmDialogFragment = new ConfirmationDialogFragment();

        // Bundle args = new Bundle();
        // args.putInt("title", title);
        // confirmDialogFragment.setArguments(args);
        // return confirmDialogFragment;
    // }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        return dialog;
    }

    public void setDialog(Dialog dialog)
    {
        this.dialog = dialog;
    }
}
