package com.example.toastmessag;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

public class CustomToast {

    private static int textSize = 16; // text size in SP

    @SuppressLint("ShowToast")
    @CheckResult
    public static Toast customToast(@NonNull Context context, @NonNull CharSequence message, Drawable icon,
                                    @ColorInt int tintColor, int duration, boolean withIcon) {

        final Toast currentToast = Toast.makeText(context, "", duration);
        final View toast = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.toast, null);

        //  Toast Views >> Icon and Text
        final ImageView toastIcon = toast.findViewById(R.id.icon);
        final TextView toastText = toast.findViewById(R.id.text);

        Drawable toastBackgroundDrawable = Utils.drawableFrame(context, tintColor);
        Utils.setBackgroundDrawable(toast, toastBackgroundDrawable);

        // with icon OR with out icon
        if (withIcon) {
             Utils.setBackgroundDrawable(toastIcon, icon);
        } else {
            toastIcon.setVisibility(View.GONE);
        }

        // Text View Toast
        toastText.setText(message);
        toastText.setTextColor(Utils.getColor(context, R.color.defaultTextColor));
        toastText.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);

        currentToast.setView(toast);

        return currentToast;
    }
}
