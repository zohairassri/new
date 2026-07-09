package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ri3 implements xi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f34226a;

    public ri3(byte[] bArr) {
        this.f34226a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final /* synthetic */ void a(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        try {
            return o34.a(inputStream);
        } catch (IOException e11) {
            throw new si3("Cannot read bytes.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final /* synthetic */ Object zzc() {
        return this.f34226a;
    }
}
