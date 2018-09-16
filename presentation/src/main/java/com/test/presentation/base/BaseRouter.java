package com.test.presentation.base;

import android.util.Log;
import android.widget.Toast;

import com.test.domain.entity.Error;
import com.test.firstaidkit.R;

public class BaseRouter<A extends BaseActivity> {

    private A activity;

    public BaseRouter(A activity) {
        this.activity = activity;
    }

    public void goBack() {
        activity.onBackPressed();
    }

    public void showError(Throwable throwable) {

        if(throwable instanceof Error) {

            Error error = (Error)throwable;
            switch (error.getType()) {
                case INTERNET_IS_NOT_AVAILABLE:{
                    showTostError(R.string.error_internet_not_available);
                    break;
                }
                case SERVER_IS_NOT_AVAILABLE: {
                    showTostError(R.string.error_server_not_available);
                    break;
                }
                case SERVER_ERROR: {
                    showTostError(R.string.error_server);
                    break;
                }
                default: {
                    Log.e(activity.getClass().getSimpleName(),
                            "забыл указать тип ошибки " + throwable.toString());
                    showTostError(R.string.error);
                }
            }
        } else {
            Log.e(activity.getClass().getSimpleName(),
                    "ужасная проблема " + throwable.toString());
            showTostError(R.string.error);
        }
    }

    private void showTostError(int messageErrorId) {
        Toast.makeText(activity, messageErrorId, Toast.LENGTH_SHORT)
                .show();
    }
}

