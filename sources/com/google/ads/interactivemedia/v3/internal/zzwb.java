package com.google.ads.interactivemedia.v3.internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzwb extends zzvw {
    private final Object zza;

    public zzwb(Boolean bool) {
        Objects.requireNonNull(bool);
        this.zza = bool;
    }

    private static boolean zzl(zzwb zzwbVar) {
        Object obj = zzwbVar.zza;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzwb.class != obj.getClass()) {
            return false;
        }
        zzwb zzwbVar = (zzwb) obj;
        if (this.zza == null) {
            return zzwbVar.zza == null;
        }
        if (zzl(this) && zzl(zzwbVar)) {
            return ((this.zza instanceof BigInteger) || (zzwbVar.zza instanceof BigInteger)) ? zzg().equals(zzwbVar.zzg()) : zzd().longValue() == zzwbVar.zzd().longValue();
        }
        Object obj2 = this.zza;
        if (obj2 instanceof Number) {
            Object obj3 = zzwbVar.zza;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return zzf().compareTo(zzwbVar.zzf()) == 0;
                }
                double dZza = zza();
                double dZza2 = zzwbVar.zza();
                if (dZza != dZza2) {
                    return Double.isNaN(dZza) && Double.isNaN(dZza2);
                }
                return true;
            }
        }
        return obj2.equals(zzwbVar.zza);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.zza == null) {
            return 31;
        }
        if (zzl(this)) {
            jDoubleToLongBits = zzd().longValue();
        } else {
            Object obj = this.zza;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(zzd().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final double zza() {
        return this.zza instanceof Number ? zzd().doubleValue() : Double.parseDouble(zze());
    }

    public final int zzb() {
        return this.zza instanceof Number ? zzd().intValue() : Integer.parseInt(zze());
    }

    public final long zzc() {
        return this.zza instanceof Number ? zzd().longValue() : Long.parseLong(zze());
    }

    public final Number zzd() {
        Object obj = this.zza;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new zzxq((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String zze() {
        Object obj = this.zza;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return zzd().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(obj.getClass())));
    }

    public final BigDecimal zzf() {
        Object obj = this.zza;
        return obj instanceof BigDecimal ? (BigDecimal) obj : zzxz.zza(zze());
    }

    public final BigInteger zzg() {
        Object obj = this.zza;
        return obj instanceof BigInteger ? (BigInteger) obj : zzl(this) ? BigInteger.valueOf(zzd().longValue()) : zzxz.zzb(zze());
    }

    public final boolean zzh() {
        Object obj = this.zza;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(zze());
    }

    public final boolean zzi() {
        return this.zza instanceof Boolean;
    }

    public final boolean zzj() {
        return this.zza instanceof Number;
    }

    public final boolean zzk() {
        return this.zza instanceof String;
    }

    public zzwb(Number number) {
        Objects.requireNonNull(number);
        this.zza = number;
    }

    public zzwb(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }
}
