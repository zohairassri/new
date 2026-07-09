package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i93 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f28252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f28254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f28255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f28256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f28257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u93 f28258g;

    public i93(Handler handler, Context context, d93 d93Var, u93 u93Var) {
        super(handler);
        this.f28255d = new AtomicReference(Float.valueOf(-1.0f));
        this.f28256e = new AtomicBoolean(false);
        this.f28257f = Executors.newSingleThreadExecutor();
        this.f28252a = handler;
        this.f28253b = context;
        this.f28254c = (AudioManager) context.getSystemService("audio");
        this.f28258g = u93Var;
    }

    private final void h() {
        this.f28257f.submit(new h93(this));
    }

    public final void a() {
        h();
        this.f28253b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f28253b.getContentResolver().unregisterContentObserver(this);
    }

    final /* synthetic */ float c() {
        AudioManager audioManager = this.f28254c;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f11 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f11 = streamVolume / streamMaxVolume;
            if (f11 > 1.0f) {
                return 1.0f;
            }
        }
        return f11;
    }

    final /* synthetic */ Handler d() {
        return this.f28252a;
    }

    final /* synthetic */ AtomicReference e() {
        return this.f28255d;
    }

    final /* synthetic */ AtomicBoolean f() {
        return this.f28256e;
    }

    final /* synthetic */ u93 g() {
        return this.f28258g;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        if (this.f28256e.getAndSet(true)) {
            return;
        }
        h();
    }
}
