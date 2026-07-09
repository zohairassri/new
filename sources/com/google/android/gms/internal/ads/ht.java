package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f27931a = new ByteArrayOutputStream(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Base64OutputStream f27932b = new Base64OutputStream(this.f27931a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.f27932b.close();
        } catch (IOException e11) {
            int i11 = bm.k1.f14837b;
            cm.o.d("HashManager: Unable to convert to Base64.", e11);
        }
        try {
            try {
                this.f27931a.close();
                string = this.f27931a.toString();
            } catch (IOException e12) {
                int i12 = bm.k1.f14837b;
                cm.o.d("HashManager: Unable to convert to Base64.", e12);
                string = "";
            }
            return string;
        } finally {
            this.f27931a = null;
            this.f27932b = null;
        }
    }
}
