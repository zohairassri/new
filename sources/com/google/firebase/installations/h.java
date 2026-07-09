package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f46515b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f46516c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static h f46517d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zq.a f46518a;

    private h(zq.a aVar) {
        this.f46518a = aVar;
    }

    public static h c() {
        return d(zq.b.b());
    }

    public static h d(zq.a aVar) {
        if (f46517d == null) {
            f46517d = new h(aVar);
        }
        return f46517d;
    }

    static boolean g(String str) {
        return f46516c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f46518a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(xq.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f46515b;
    }
}
