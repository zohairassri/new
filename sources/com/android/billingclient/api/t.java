package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f18666b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f18668b;

        /* synthetic */ a(x1 x1Var) {
        }

        public t a() {
            String str = this.f18667a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f18668b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            t tVar = new t();
            tVar.f18665a = str;
            tVar.f18666b = this.f18668b;
            return tVar;
        }

        public a b(List list) {
            this.f18668b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.f18667a = str;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f18665a;
    }

    public List b() {
        return this.f18666b;
    }
}
