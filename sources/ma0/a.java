package ma0;

import io.agora.rtc2.internal.Marshallable;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f115990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f115991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f115992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OutputStream f115993d;

    public a(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f115990a = outputStream;
        this.f115991b = new ArrayList();
    }

    private final void a() throws IOException {
        if (this.f115992c) {
            return;
        }
        this.f115993d = c();
        Iterator it = this.f115991b.iterator();
        while (it.hasNext()) {
            byte bByteValue = ((Number) it.next()).byteValue();
            OutputStream outputStream = this.f115993d;
            if (outputStream == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                outputStream = null;
            }
            outputStream.write(bByteValue);
        }
        this.f115992c = true;
    }

    private final OutputStream c() {
        if (this.f115991b.isEmpty() || e(this.f115991b)) {
            OutputStream outputStream = this.f115990a;
            return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, Marshallable.PROTO_PACKET_SIZE);
        }
        OutputStream outputStream2 = this.f115990a;
        return new GZIPOutputStream(outputStream2 instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream2 : new BufferedOutputStream(outputStream2, Marshallable.PROTO_PACKET_SIZE));
    }

    private final boolean e(List list) {
        return list.size() >= 2 && ((Number) list.get(0)).byteValue() == 31 && ((Number) list.get(1)).byteValue() == -117;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        OutputStream outputStream = this.f115993d;
        if (outputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            outputStream = null;
        }
        outputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        OutputStream outputStream = this.f115993d;
        if (outputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            outputStream = null;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        if (this.f115991b.size() < 2) {
            this.f115991b.add(Byte.valueOf((byte) i11));
            return;
        }
        a();
        OutputStream outputStream = this.f115993d;
        if (outputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            outputStream = null;
        }
        outputStream.write(i11);
    }
}
