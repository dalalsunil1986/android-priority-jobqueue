package com.birbit.android.jobqueue.callback;

/***
 * Used to propagate job results from onR
 */
public interface JobCallback {
    public void onComplete();
    public void onError(Throwable throwable);
}
