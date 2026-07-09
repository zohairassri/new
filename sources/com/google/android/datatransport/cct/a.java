package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import lj.g;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f20007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f20008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f20010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f20011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f20012h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20014b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20007c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f20008d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20009e = strA3;
        f20010f = Collections.unmodifiableSet(new HashSet(Arrays.asList(jj.b.b("proto"), jj.b.b("json"))));
        f20011g = new a(strA, null);
        f20012h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f20013a = str;
        this.f20014b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // lj.g
    public Set a() {
        return f20010f;
    }

    public byte[] b() {
        String str = this.f20014b;
        if (str == null && this.f20013a == null) {
            return null;
        }
        String str2 = this.f20013a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f20014b;
    }

    public String e() {
        return this.f20013a;
    }

    @Override // lj.f
    public byte[] getExtras() {
        return b();
    }

    @Override // lj.f
    public String getName() {
        return "cct";
    }
}
