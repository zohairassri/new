package yl;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class q1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f140778g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f140780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f140781j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f140783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f140784m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f140786o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f140772a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f140773b = new Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f140774c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f140775d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bundle f140776e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet f140777f = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f140779h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f140782k = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f140785n = 60000;

    final /* synthetic */ String A() {
        return this.f140780i;
    }

    final /* synthetic */ String a() {
        return this.f140781j;
    }

    final /* synthetic */ int b() {
        return this.f140782k;
    }

    final /* synthetic */ boolean c() {
        return this.f140783l;
    }

    final /* synthetic */ String d() {
        return this.f140784m;
    }

    final /* synthetic */ int e() {
        return this.f140785n;
    }

    final /* synthetic */ long f() {
        return this.f140786o;
    }

    public final void g(String str) {
        this.f140772a.add(str);
    }

    public final void h(Class cls, Bundle bundle) {
        this.f140773b.putBundle(cls.getName(), bundle);
    }

    public final void i(String str) {
        this.f140775d.add(str);
    }

    public final void j(String str) {
        this.f140775d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void k(String str) {
        this.f140778g = str;
    }

    public final void l(List list) {
        List list2 = this.f140779h;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                cm.o.f("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }

    public final void m(String str) {
        this.f140780i = str;
    }

    public final void n(String str) {
        this.f140781j = str;
    }

    public final void o(boolean z11) {
        this.f140782k = z11 ? 1 : 0;
    }

    public final void p(String str, String str2) {
        this.f140776e.putString(str, str2);
    }

    public final void q(String str) {
        this.f140777f.add(str);
    }

    public final void r(boolean z11) {
        this.f140783l = z11;
    }

    final /* synthetic */ HashSet s() {
        return this.f140772a;
    }

    final /* synthetic */ Bundle t() {
        return this.f140773b;
    }

    final /* synthetic */ HashMap u() {
        return this.f140774c;
    }

    final /* synthetic */ HashSet v() {
        return this.f140775d;
    }

    final /* synthetic */ Bundle w() {
        return this.f140776e;
    }

    final /* synthetic */ HashSet x() {
        return this.f140777f;
    }

    final /* synthetic */ String y() {
        return this.f140778g;
    }

    final /* synthetic */ List z() {
        return this.f140779h;
    }
}
