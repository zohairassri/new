package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ProgressListenerCallbackExecutor {
    static ExecutorService executor = createNewExecutorService();
    private final ProgressListener listener;

    public ProgressListenerCallbackExecutor(ProgressListener progressListener) {
        this.listener = progressListener;
    }

    static ExecutorService createNewExecutorService() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.3
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("android-sdk-progress-listener-callback-thread");
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    protected static ExecutorService getExecutorService() {
        return executor;
    }

    public static Future<?> progressChanged(final ProgressListener progressListener, final ProgressEvent progressEvent) {
        if (progressListener == null) {
            return null;
        }
        return executor.submit(new Runnable() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.1
            @Override // java.lang.Runnable
            public void run() {
                progressListener.progressChanged(progressEvent);
            }
        });
    }

    public static ProgressListenerCallbackExecutor wrapListener(ProgressListener progressListener) {
        if (progressListener == null) {
            return null;
        }
        return new ProgressListenerCallbackExecutor(progressListener);
    }

    protected ProgressListener getListener() {
        return this.listener;
    }

    public void progressChanged(final ProgressEvent progressEvent) {
        if (this.listener == null) {
            return;
        }
        executor.submit(new Runnable() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.2
            @Override // java.lang.Runnable
            public void run() {
                ProgressListenerCallbackExecutor.this.listener.progressChanged(progressEvent);
            }
        });
    }

    public ProgressListenerCallbackExecutor() {
        this.listener = null;
    }
}
