package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f39206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f39208d;

    public zh(int i11, List list, int i12, InputStream inputStream) {
        this.f39205a = i11;
        this.f39206b = list;
        this.f39207c = i12;
        this.f39208d = inputStream;
    }

    public final int a() {
        return this.f39205a;
    }

    public final List b() {
        return Collections.unmodifiableList(this.f39206b);
    }

    public final int c() {
        return this.f39207c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f39208d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
