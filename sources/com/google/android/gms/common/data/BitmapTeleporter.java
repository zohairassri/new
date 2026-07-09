package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ParcelFileDescriptor f22625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f22626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f22627d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22628e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f22629f;

    BitmapTeleporter(int i11, ParcelFileDescriptor parcelFileDescriptor, int i12) {
        this.f22624a = i11;
        this.f22625b = parcelFileDescriptor;
        this.f22626c = i12;
    }

    private static final void j(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e11) {
            Log.w("BitmapTeleporter", "Could not close stream", e11);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        if (this.f22625b == null) {
            Bitmap bitmap = (Bitmap) n.l(this.f22627d);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            File file = this.f22629f;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.f22625b = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                        } catch (IOException e11) {
                            throw new IllegalStateException("Could not write into unlinked file", e11);
                        }
                    } finally {
                        j(dataOutputStream);
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e12) {
                throw new IllegalStateException("Could not create temporary file", e12);
            }
        }
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f22624a);
        um.a.s(parcel, 2, this.f22625b, i11 | 1, false);
        um.a.l(parcel, 3, this.f22626c);
        um.a.b(parcel, iA);
        this.f22625b = null;
    }
}
