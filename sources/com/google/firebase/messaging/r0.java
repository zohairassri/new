package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f46675d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46678c;

    private r0(String str, String str2) {
        this.f46676a = d(str2, str);
        this.f46677b = str;
        this.f46678c = str + "!" + str2;
    }

    static r0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new r0(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f46675d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f46677b;
    }

    public String c() {
        return this.f46676a;
    }

    public String e() {
        return this.f46678c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f46676a.equals(r0Var.f46676a) && this.f46677b.equals(r0Var.f46677b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.m.b(this.f46677b, this.f46676a);
    }
}
