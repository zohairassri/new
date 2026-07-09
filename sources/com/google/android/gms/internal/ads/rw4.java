package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class rw4 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Appendable f34369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qw4 f34370b = new qw4(null);

    rw4(Appendable appendable) {
        this.f34369a = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.f34369a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i11) throws IOException {
        this.f34369a.append((char) i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i11, int i12) throws IOException {
        Objects.requireNonNull(str);
        this.f34369a.append(str, i11, i12 + i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i11, int i12) throws IOException {
        this.f34369a.append(charSequence, i11, i12);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
        append(charSequence, i11, i12);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i11, int i12) throws IOException {
        qw4 qw4Var = this.f34370b;
        qw4Var.a(cArr);
        this.f34369a.append(qw4Var, i11, i12 + i11);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
