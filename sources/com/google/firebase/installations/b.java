package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f46493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileLock f46494b;

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.f46493a = fileChannel;
        this.f46494b = fileLock;
    }

    static b a(Context context, String str) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
            } catch (IOException | Error | OverlappingFileLockException e11) {
                e = e11;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e12) {
            e = e12;
            channel = null;
            fileLockLock = null;
        }
        try {
            return new b(channel, fileLockLock);
        } catch (IOException | Error | OverlappingFileLockException e13) {
            e = e13;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLockLock != null) {
                try {
                    fileLockLock.release();
                } catch (IOException unused) {
                }
            }
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        }
    }

    void b() {
        try {
            this.f46494b.release();
            this.f46493a.close();
        } catch (IOException e11) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e11);
        }
    }
}
