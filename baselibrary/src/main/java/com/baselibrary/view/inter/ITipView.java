package com.baselibrary.view.inter;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:01
 */

@MainThread
public interface ITipView {
    void tip(@NonNull String var1);

    void tip(@StringRes int var1);

    void tip(@NonNull String var1, @NonNull ITipView.TipEnum var2);

    void tip(@StringRes int var1, @NonNull ITipView.TipEnum var2);

    public static enum TipEnum {
        Normal,
        Error,
        MsgBox;

        private TipEnum() {
        }
    }
}

