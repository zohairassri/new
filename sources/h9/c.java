package h9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f100547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileChannel f100548b;

    public c(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.f100547a = filename + ".lck";
    }

    public final void a() throws IOException {
        if (this.f100548b != null) {
            return;
        }
        try {
            File file = new File(this.f100547a);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f100548b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = this.f100548b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f100548b = null;
            throw new IllegalStateException("Unable to lock file: '" + this.f100547a + "'.", th2);
        }
    }

    public final void b() {
        FileChannel fileChannel = this.f100548b;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.f100548b = null;
        }
    }
}
