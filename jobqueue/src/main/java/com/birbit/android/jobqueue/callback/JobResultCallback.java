package com.birbit.android.jobqueue.callback;

/**
 * Used to send job results ton ConsumerManager
 */
public interface JobResultCallback {
    public void onResult(int result);
}
