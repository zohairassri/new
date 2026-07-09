package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f19166a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f19167b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface Reader {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class EndOfFileException extends IOException {
            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i11);

        short c();

        long skip(long j11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f19168a;

        a(ByteBuffer byteBuffer) {
            this.f19168a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return c() | (c() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i11) {
            int iMin = Math.min(i11, this.f19168a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f19168a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws Reader.EndOfFileException {
            if (this.f19168a.remaining() >= 1) {
                return (short) (this.f19168a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j11) {
            int iMin = (int) Math.min(this.f19168a.remaining(), j11);
            ByteBuffer byteBuffer = this.f19168a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f19169a;

        b(byte[] bArr, int i11) {
            this.f19169a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i11);
        }

        private boolean c(int i11, int i12) {
            return this.f19169a.remaining() - i11 >= i12;
        }

        short a(int i11) {
            if (c(i11, 2)) {
                return this.f19169a.getShort(i11);
            }
            return (short) -1;
        }

        int b(int i11) {
            if (c(i11, 4)) {
                return this.f19169a.getInt(i11);
            }
            return -1;
        }

        int d() {
            return this.f19169a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f19169a.order(byteOrder);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f19170a;

        c(InputStream inputStream) {
            this.f19170a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return c() | (c() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i11) throws Reader.EndOfFileException {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11 && (i13 = this.f19170a.read(bArr, i12, i11 - i12)) != -1) {
                i12 += i13;
            }
            if (i12 == 0 && i13 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i12;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws IOException {
            int i11 = this.f19170a.read();
            if (i11 != -1) {
                return (short) i11;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j11) throws IOException {
            if (j11 < 0) {
                return 0L;
            }
            long j12 = j11;
            while (j12 > 0) {
                long jSkip = this.f19170a.skip(j12);
                if (jSkip <= 0) {
                    if (this.f19170a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j12 -= jSkip;
            }
            return j11 - j12;
        }
    }

    private static int e(int i11, int i12) {
        return i11 + 2 + (i12 * 12);
    }

    private int f(Reader reader, hd.b bVar) {
        try {
            if (!h(reader.a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iJ = j(reader);
            if (iJ == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(iJ, byte[].class);
            try {
                return l(reader, bArr, iJ);
            } finally {
                bVar.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType g(Reader reader) {
        try {
            int iA = reader.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | reader.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | reader.c();
            if (iC2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 != 1380533830) {
                return m(reader, iC2);
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA2 = (reader.a() << 16) | reader.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i11 = iA2 & 255;
            if (i11 == 88) {
                reader.skip(4L);
                short sC = reader.c();
                return (sC & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i11 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i11) {
        return (i11 & 65496) == 65496 || i11 == 19789 || i11 == 18761;
    }

    private boolean i(byte[] bArr, int i11) {
        boolean z11 = bArr != null && i11 > f19166a.length;
        if (z11) {
            int i12 = 0;
            while (true) {
                byte[] bArr2 = f19166a;
                if (i12 >= bArr2.length) {
                    break;
                }
                if (bArr[i12] != bArr2[i12]) {
                    return false;
                }
                i12++;
            }
        }
        return z11;
    }

    private int j(Reader reader) {
        while (reader.c() == 255) {
            short sC = reader.c();
            if (sC == 218) {
                return -1;
            }
            if (sC == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iA = reader.a() - 2;
            if (sC == 225) {
                return iA;
            }
            long j11 = iA;
            if (reader.skip(j11) != j11) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short sA = bVar.a(6);
        if (sA == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sA != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i11 = 0; i11 < sA2; i11++) {
            int iE = e(iB, i11);
            if (bVar.a(iE) == 274) {
                short sA3 = bVar.a(iE + 2);
                if (sA3 < 1 || sA3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iB2 = bVar.b(iE + 4);
                    if (iB2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i12 = iB2 + f19167b[sA3];
                        if (i12 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i13 = iE + 8;
                            if (i13 < 0 || i13 > bVar.d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i12 >= 0 && i12 + i13 <= bVar.d()) {
                                    return bVar.a(i13);
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private int l(Reader reader, byte[] bArr, int i11) {
        if (reader.b(bArr, i11) != i11) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (i(bArr, i11)) {
            return k(new b(bArr, i11));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    private ImageHeaderParser.ImageType m(Reader reader, int i11) {
        if (((reader.a() << 16) | reader.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iA = (reader.a() << 16) | reader.a();
        if (iA == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i12 = 0;
        boolean z11 = iA == 1635150182;
        reader.skip(4L);
        int i13 = i11 - 16;
        if (i13 % 4 == 0) {
            while (i12 < 5 && i13 > 0) {
                int iA2 = (reader.a() << 16) | reader.a();
                if (iA2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iA2 == 1635150182) {
                    z11 = true;
                }
                i12++;
                i13 -= 4;
            }
        }
        return z11 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(InputStream inputStream, hd.b bVar) {
        return f(new c((InputStream) zd.k.d(inputStream)), (hd.b) zd.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) zd.k.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return g(new c((InputStream) zd.k.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(ByteBuffer byteBuffer, hd.b bVar) {
        return f(new a((ByteBuffer) zd.k.d(byteBuffer)), (hd.b) zd.k.d(bVar));
    }
}
