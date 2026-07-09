package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f22559a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f22560b = new LinkedBlockingQueue();

    public IBinder a(long j11, TimeUnit timeUnit) throws TimeoutException {
        com.google.android.gms.common.internal.n.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f22559a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f22559a = true;
        IBinder iBinder = (IBinder) this.f22560b.poll(j11, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22560b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
