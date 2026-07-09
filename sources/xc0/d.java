package xc0;

import java.util.StringJoiner;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d {
    d() {
    }

    public static e a() {
        return new e();
    }

    static d b(f fVar, String str, String str2, String str3, String str4, String str5) {
        return new b(fVar, str, str2, str3, str4, str5);
    }

    public abstract String c();

    public abstract f d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "InstrumentSelector{", "}");
        if (d() != null) {
            stringJoiner.add("instrumentType=" + d());
        }
        if (c() != null) {
            stringJoiner.add("instrumentName=" + c());
        }
        if (e() != null) {
            stringJoiner.add("instrumentUnit=" + e());
        }
        if (f() != null) {
            stringJoiner.add("meterName=" + f());
        }
        if (h() != null) {
            stringJoiner.add("meterVersion=" + h());
        }
        if (g() != null) {
            stringJoiner.add("meterSchemaUrl=" + g());
        }
        return stringJoiner.toString();
    }
}
