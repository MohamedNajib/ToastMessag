package com.example.toastmessag;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import static com.example.toastmessag.CustomToast.customToast;

public class ToastMessage {

    public static final int LENGTH_SHORT = android.widget.Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = android.widget.Toast.LENGTH_LONG;

    private ToastMessage() {

    }

    @CheckResult
    public static Toast setWarning(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return customToast(context, context.getString(message), Utils.getDrawable(context, R.drawable.ic_error_black_24dp),
                Utils.getColor(context, R.color.warningColor), duration, withIcon);
    }

    @CheckResult
    public static Toast setWarning(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return customToast(context, message, Utils.getDrawable(context, R.drawable.ic_error_black_24dp),
                Utils.getColor(context, R.color.warningColor),
                duration, withIcon);
    }

    @CheckResult
    public static Toast setInfo(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return customToast(context, context.getString(message), Utils.getDrawable(context, R.drawable.ic_announcement_black_24dp),
                Utils.getColor(context, R.color.infoColor), duration, withIcon);
    }

    @CheckResult
    public static Toast setInfo(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return customToast(context, message, Utils.getDrawable(context, R.drawable.ic_announcement_black_24dp),
                Utils.getColor(context, R.color.infoColor), duration, withIcon);
    }

    @CheckResult
    public static Toast setSuccess(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return customToast(context, context.getString(message), Utils.getDrawable(context, R.drawable.ic_check_circle_black_24dp),
                Utils.getColor(context, R.color.successColor), duration, withIcon);
    }

    @CheckResult
    public static Toast setSuccess(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return customToast(context, message, Utils.getDrawable(context, R.drawable.ic_check_circle_black_24dp),
                Utils.getColor(context, R.color.successColor), duration, withIcon);
    }

    @CheckResult
    public static Toast setError(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return customToast(context, context.getString(message), Utils.getDrawable(context, R.drawable.ic_cancel_black_24dp),
                Utils.getColor(context, R.color.errorColor), duration, withIcon);
    }

    @CheckResult
    public static Toast setError(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return customToast(context, message, Utils.getDrawable(context, R.drawable.ic_cancel_black_24dp),
                Utils.getColor(context, R.color.errorColor), duration, withIcon);
    }

    @CheckResult
    public static Toast setNormal(@NonNull Context context, @StringRes int message, int duration) {
        return customToast(context, context.getString(message), null,
                Utils.getColor(context, R.color.normalColor), duration, false);
    }

    @CheckResult
    public static Toast setNormal(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return customToast(context, message, null,
                Utils.getColor(context, R.color.normalColor), duration, false);
    }

}
