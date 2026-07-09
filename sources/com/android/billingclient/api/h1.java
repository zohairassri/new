package com.android.billingclient.api;

import com.android.billingclient.api.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class h1 {
    static final h A;
    static final h B;
    static final h C;
    static final h D;
    static final h E;
    static final h F;
    static final h G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final h f18561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final h f18562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final h f18563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final h f18564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final h f18565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final h f18566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final h f18567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final h f18568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final h f18569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final h f18570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final h f18571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final h f18572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final h f18573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final h f18574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final h f18575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final h f18576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final h f18577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final h f18578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final h f18579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final h f18580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final h f18581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final h f18582v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final h f18583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final h f18584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final h f18585y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final h f18586z;

    static {
        h.a aVarC = h.c();
        aVarC.c(3);
        aVarC.b("Google Play In-app Billing API version is less than 3");
        f18561a = aVarC.a();
        h.a aVarC2 = h.c();
        aVarC2.c(3);
        aVarC2.b("Google Play In-app Billing API version is less than 9");
        f18562b = aVarC2.a();
        h.a aVarC3 = h.c();
        aVarC3.c(3);
        aVarC3.b("Billing service unavailable on device.");
        f18563c = aVarC3.a();
        h.a aVarC4 = h.c();
        aVarC4.c(2);
        aVarC4.b("Billing service unavailable on device.");
        f18564d = aVarC4.a();
        h.a aVarC5 = h.c();
        aVarC5.c(5);
        aVarC5.b("Client is already in the process of connecting to billing service.");
        f18565e = aVarC5.a();
        h.a aVarC6 = h.c();
        aVarC6.c(5);
        aVarC6.b("The list of SKUs can't be empty.");
        f18566f = aVarC6.a();
        h.a aVarC7 = h.c();
        aVarC7.c(5);
        aVarC7.b("SKU type can't be empty.");
        f18567g = aVarC7.a();
        h.a aVarC8 = h.c();
        aVarC8.c(5);
        aVarC8.b("Product type can't be empty.");
        f18568h = aVarC8.a();
        h.a aVarC9 = h.c();
        aVarC9.c(-2);
        aVarC9.b("Client does not support extra params.");
        f18569i = aVarC9.a();
        h.a aVarC10 = h.c();
        aVarC10.c(5);
        aVarC10.b("Invalid purchase token.");
        f18570j = aVarC10.a();
        h.a aVarC11 = h.c();
        aVarC11.c(6);
        aVarC11.b("An internal error occurred.");
        f18571k = aVarC11.a();
        h.a aVarC12 = h.c();
        aVarC12.c(5);
        aVarC12.b("SKU can't be null.");
        aVarC12.a();
        h.a aVarC13 = h.c();
        aVarC13.c(0);
        f18572l = aVarC13.a();
        h.a aVarC14 = h.c();
        aVarC14.c(-1);
        aVarC14.b("Service connection is disconnected.");
        f18573m = aVarC14.a();
        h.a aVarC15 = h.c();
        aVarC15.c(2);
        aVarC15.b("Timeout communicating with service.");
        f18574n = aVarC15.a();
        h.a aVarC16 = h.c();
        aVarC16.c(-2);
        aVarC16.b("Client does not support subscriptions.");
        f18575o = aVarC16.a();
        h.a aVarC17 = h.c();
        aVarC17.c(-2);
        aVarC17.b("Client does not support subscriptions update.");
        f18576p = aVarC17.a();
        h.a aVarC18 = h.c();
        aVarC18.c(-2);
        aVarC18.b("Client does not support get purchase history.");
        f18577q = aVarC18.a();
        h.a aVarC19 = h.c();
        aVarC19.c(-2);
        aVarC19.b("Client does not support price change confirmation.");
        f18578r = aVarC19.a();
        h.a aVarC20 = h.c();
        aVarC20.c(-2);
        aVarC20.b("Play Store version installed does not support cross selling products.");
        f18579s = aVarC20.a();
        h.a aVarC21 = h.c();
        aVarC21.c(-2);
        aVarC21.b("Client does not support multi-item purchases.");
        f18580t = aVarC21.a();
        h.a aVarC22 = h.c();
        aVarC22.c(-2);
        aVarC22.b("Client does not support offer_id_token.");
        f18581u = aVarC22.a();
        h.a aVarC23 = h.c();
        aVarC23.c(-2);
        aVarC23.b("Client does not support ProductDetails.");
        f18582v = aVarC23.a();
        h.a aVarC24 = h.c();
        aVarC24.c(-2);
        aVarC24.b("Client does not support in-app messages.");
        f18583w = aVarC24.a();
        h.a aVarC25 = h.c();
        aVarC25.c(-2);
        aVarC25.b("Client does not support user choice billing.");
        aVarC25.a();
        h.a aVarC26 = h.c();
        aVarC26.c(-2);
        aVarC26.b("Play Store version installed does not support external offer.");
        f18584x = aVarC26.a();
        h.a aVarC27 = h.c();
        aVarC27.c(-2);
        aVarC27.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f18585y = aVarC27.a();
        h.a aVarC28 = h.c();
        aVarC28.c(5);
        aVarC28.b("Unknown feature");
        f18586z = aVarC28.a();
        h.a aVarC29 = h.c();
        aVarC29.c(-2);
        aVarC29.b("Play Store version installed does not support get billing config.");
        A = aVarC29.a();
        h.a aVarC30 = h.c();
        aVarC30.c(-2);
        aVarC30.b("Query product details with serialized docid is not supported.");
        B = aVarC30.a();
        h.a aVarC31 = h.c();
        aVarC31.c(4);
        aVarC31.b("Item is unavailable for purchase.");
        C = aVarC31.a();
        h.a aVarC32 = h.c();
        aVarC32.c(-2);
        aVarC32.b("Query product details with developer specified account is not supported.");
        D = aVarC32.a();
        h.a aVarC33 = h.c();
        aVarC33.c(-2);
        aVarC33.b("Play Store version installed does not support alternative billing only.");
        E = aVarC33.a();
        h.a aVarC34 = h.c();
        aVarC34.c(5);
        aVarC34.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        F = aVarC34.a();
        h.a aVarC35 = h.c();
        aVarC35.c(6);
        aVarC35.b("An error occurred while retrieving billing override.");
        G = aVarC35.a();
    }

    static h a(int i11, String str) {
        h.a aVarC = h.c();
        aVarC.c(i11);
        aVarC.b(str);
        return aVarC.a();
    }
}
