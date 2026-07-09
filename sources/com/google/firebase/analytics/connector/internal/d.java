package com.google.firebase.analytics.connector.internal;

import java.util.HashSet;
import java.util.Set;
import up.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Set f46413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.b f46414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private nn.a f46415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f46416d;

    public d(nn.a aVar, a.b bVar) {
        this.f46414b = bVar;
        this.f46415c = aVar;
        c cVar = new c(this);
        this.f46416d = cVar;
        this.f46415c.f(cVar);
        this.f46413a = new HashSet();
    }
}
