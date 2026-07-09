package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class dv4 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ev4 f25408a;

    dv4(ev4 ev4Var) {
        Objects.requireNonNull(ev4Var);
        this.f25408a = ev4Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            pu4 pu4Var = pu4.f33262c;
            ev4 ev4Var = this.f25408a;
            Mac mac = (Mac) pu4Var.b(ev4Var.b());
            mac.init(ev4Var.c());
            return mac;
        } catch (GeneralSecurityException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
