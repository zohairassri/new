package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ql.e[] f22358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22359b;

    public zzz(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, ql.n.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(ql.n.AdsAttrs_adSize);
        String string2 = typedArrayObtainAttributes.getString(ql.n.AdsAttrs_adSizes);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f22358a = c(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f22358a = c(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(ql.n.AdsAttrs_adUnitId);
        this.f22359b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static ql.e[] c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        ql.e[] eVarArr = new ql.e[length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            String strTrim = strArrSplit[i11].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    String str2 = strArrSplit2[0];
                    int i12 = "FULL_WIDTH".equals(str2) ? -1 : Integer.parseInt(str2);
                    String str3 = strArrSplit2[1];
                    eVarArr[i11] = new ql.e(i12, "AUTO_HEIGHT".equals(str3) ? -2 : Integer.parseInt(str3));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                eVarArr[i11] = ql.e.f122812i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                eVarArr[i11] = ql.e.f122814k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                eVarArr[i11] = ql.e.f122813j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                eVarArr[i11] = ql.e.f122815l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                eVarArr[i11] = ql.e.f122816m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                eVarArr[i11] = ql.e.f122818o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                eVarArr[i11] = ql.e.f122817n;
            } else if ("FLUID".equals(strTrim)) {
                eVarArr[i11] = ql.e.f122819p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                eVarArr[i11] = ql.e.f122821r;
            }
        }
        if (length != 0) {
            return eVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final ql.e[] a(boolean z11) {
        if (z11 || this.f22358a.length == 1) {
            return this.f22358a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String b() {
        return this.f22359b;
    }
}
