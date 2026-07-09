package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface u64 extends ExecutorService, AutoCloseable {
    com.google.common.util.concurrent.e M0(Callable callable);

    com.google.common.util.concurrent.e y(Runnable runnable);
}
