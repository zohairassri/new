package h3;

import h3.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99854a;

    private /* synthetic */ m2(String str) {
        this.f99854a = str;
    }

    public static final /* synthetic */ m2 a(String str) {
        return new m2(str);
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof m2) && Intrinsics.areEqual(str, ((m2) obj).f());
    }

    public static int d(String str) {
        return str.hashCode();
    }

    public static String e(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f99854a, obj);
    }

    public final /* synthetic */ String f() {
        return this.f99854a;
    }

    public int hashCode() {
        return d(this.f99854a);
    }

    public String toString() {
        return e(this.f99854a);
    }

    public static String b(String str) {
        return str;
    }
}
