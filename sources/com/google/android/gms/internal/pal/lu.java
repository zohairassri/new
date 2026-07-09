package com.google.android.gms.internal.pal;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class lu extends hu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41545a;

    public lu(Boolean bool) {
        this.f41545a = bool;
    }

    private static boolean l(lu luVar) {
        Object obj = luVar.f41545a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.pal.hu
    public final int a() {
        return this.f41545a instanceof Number ? e().intValue() : Integer.parseInt(b());
    }

    @Override // com.google.android.gms.internal.pal.hu
    public final String b() {
        Object obj = this.f41545a;
        return !(obj instanceof Number) ? obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj : e().toString();
    }

    public final Number e() {
        Object obj = this.f41545a;
        return obj instanceof String ? new qu((String) obj) : (Number) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lu.class != obj.getClass()) {
            return false;
        }
        lu luVar = (lu) obj;
        if (l(this) && l(luVar)) {
            return e().longValue() == luVar.e().longValue();
        }
        Object obj2 = this.f41545a;
        if (!(obj2 instanceof Number) || !(luVar.f41545a instanceof Number)) {
            return obj2.equals(luVar.f41545a);
        }
        double dDoubleValue = e().doubleValue();
        double dDoubleValue2 = luVar.e().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (l(this)) {
            jDoubleToLongBits = e().longValue();
        } else {
            Object obj = this.f41545a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(e().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final boolean i() {
        return this.f41545a instanceof Boolean;
    }

    public final boolean j() {
        return this.f41545a instanceof Number;
    }

    public final boolean zzc() {
        Object obj = this.f41545a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(b());
    }

    public lu(Number number) {
        this.f41545a = number;
    }

    public lu(String str) {
        str.getClass();
        this.f41545a = str;
    }
}
