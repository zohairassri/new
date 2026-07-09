package ql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f122833f = Arrays.asList("MA", "T", "PG", "G");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f122834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f122835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f122836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f122837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f122838e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f122839a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f122840b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f122841c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f122842d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b f122843e = b.DEFAULT;

        public o a() {
            return new o(this.f122839a, this.f122840b, this.f122841c, this.f122842d, this.f122843e, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f122848a;

        b(int i11) {
            this.f122848a = i11;
        }

        public int a() {
            return this.f122848a;
        }
    }

    /* synthetic */ o(int i11, int i12, String str, List list, b bVar, byte[] bArr) {
        this.f122834a = i11;
        this.f122835b = i12;
        this.f122836c = str;
        this.f122837d = list;
        this.f122838e = bVar;
    }

    public String a() {
        String str = this.f122836c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.f122838e;
    }

    public int c() {
        return this.f122834a;
    }

    public int d() {
        return this.f122835b;
    }

    public List e() {
        return new ArrayList(this.f122837d);
    }
}
