package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ft {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static MessageDigest f26560b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f26561a = new Object();

    abstract byte[] a(String str);

    protected final MessageDigest b() {
        synchronized (this.f26561a) {
            MessageDigest messageDigest = f26560b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i11 = 0; i11 < 2; i11++) {
                try {
                    f26560b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f26560b;
        }
    }
}
