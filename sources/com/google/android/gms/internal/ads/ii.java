package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ii implements ji {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f28398b = Logger.getLogger(ii.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadLocal f28399a = new hi(this);

    @Override // com.google.android.gms.internal.ads.ji
    public final mi a(t65 t65Var, ni niVar) throws EOFException {
        int iP2;
        long jZzb;
        long jZzc = t65Var.zzc();
        ThreadLocal threadLocal = this.f28399a;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            iP2 = t65Var.p2((ByteBuffer) threadLocal.get());
            if (iP2 == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long jA = li.a((ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (jA < 8 && jA > 1) {
                    Logger logger = f28398b;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(jA);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jA == 1) {
                        ThreadLocal threadLocal2 = this.f28399a;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        t65Var.p2((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        jZzb = li.d((ByteBuffer) threadLocal2.get()) - 16;
                    } else {
                        jZzb = jA == 0 ? t65Var.zzb() - t65Var.zzc() : jA - 8;
                    }
                    if ("uuid".equals(str)) {
                        ThreadLocal threadLocal3 = this.f28399a;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        t65Var.p2((ByteBuffer) threadLocal3.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) threadLocal3.get()).position() - 16; iPosition < ((ByteBuffer) threadLocal3.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(iPosition);
                        }
                        jZzb -= 16;
                    }
                    long j11 = jZzb;
                    mi miVarB = b(str, bArr, niVar instanceof mi ? ((mi) niVar).zza() : "");
                    ThreadLocal threadLocal4 = this.f28399a;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    miVarB.a(t65Var, (ByteBuffer) threadLocal4.get(), j11, this);
                    return miVarB;
                } catch (UnsupportedEncodingException e11) {
                    throw new RuntimeException(e11);
                }
            }
        } while (iP2 >= 0);
        t65Var.r(jZzc);
        throw new EOFException();
    }

    public abstract mi b(String str, byte[] bArr, String str2);
}
