package oj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f120408c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f120410b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f120411a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f120412b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f120411a, Collections.unmodifiableList(this.f120412b));
        }

        public a b(List list) {
            this.f120412b = list;
            return this;
        }

        public a c(String str) {
            this.f120411a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f120409a = str;
        this.f120410b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f120410b;
    }

    public String b() {
        return this.f120409a;
    }
}
