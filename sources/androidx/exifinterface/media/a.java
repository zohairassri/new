package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.b;
import com.comscore.util.crashreport.CrashReportManager;
import io.agora.rtc2.Constants;
import io.agora.rtc2.internal.Marshallable;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private static SimpleDateFormat T;
    private static SimpleDateFormat U;
    private static final d[] Y;
    private static final d[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final d[] f7978a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final d[] f7979b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final d[] f7980c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final d f7981d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final d[] f7982e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final d[] f7983f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final d[] f7984g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final d[] f7985h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final d[][] f7986i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final d[] f7987j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final HashMap[] f7988k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f7989l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashSet f7990m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashMap f7991n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final Charset f7992o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final byte[] f7993p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final byte[] f7994q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f7995r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f7996s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f7997t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f7999u0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f8006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f8007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap[] f8010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f8011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f8012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f8018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f7998u = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List f8000v = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f8001w = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f8002x = {8, 8, 8};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f8003y = {4};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f8004z = {8};
    static final byte[] A = {-1, -40, -1};
    private static final byte[] B = {102, 116, 121, 112};
    private static final byte[] C = {109, 105, 102, 49};
    private static final byte[] D = {104, 101, 105, 99};
    private static final byte[] E = {79, 76, 89, 77, 80, 0};
    private static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] H = {101, 88, 73, 102};
    private static final byte[] I = {73, 72, 68, 82};
    private static final byte[] J = {73, 69, 78, 68};
    private static final byte[] K = {82, 73, 70, 70};
    private static final byte[] L = {87, 69, 66, 80};
    private static final byte[] M = {69, 88, 73, 70};
    private static final byte[] N = {-99, 1, 42};
    private static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f8035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f8036d;

        c(int i11, int i12, byte[] bArr) {
            this(i11, i12, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f7992o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j11, ByteOrder byteOrder) {
            return c(new long[]{j11}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.W[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j11 : jArr) {
                byteBufferWrap.putInt((int) j11);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.W[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f8041a);
                byteBufferWrap.putInt((int) eVar.f8042b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c f(int i11, ByteOrder byteOrder) {
            return g(new int[]{i11}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.W[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i11 : iArr) {
                byteBufferWrap.putShort((short) i11);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double h(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                if (((long[]) objK).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                if (((int[]) objK).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objK;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i11 < jArr.length) {
                    sb2.append(jArr[i11]);
                    i11++;
                    if (i11 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i11 < iArr.length) {
                    sb2.append(iArr[i11]);
                    i11++;
                    if (i11 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i11 < dArr.length) {
                    sb2.append(dArr[i11]);
                    i11++;
                    if (i11 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objK instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objK;
            while (i11 < eVarArr.length) {
                sb2.append(eVarArr[i11].f8041a);
                sb2.append('/');
                sb2.append(eVarArr[i11].f8042b);
                i11++;
                if (i11 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:18:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:113:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object k(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.V[this.f8033a] + ", data length:" + this.f8036d.length + ")";
        }

        c(int i11, int i12, long j11, byte[] bArr) {
            this.f8033a = i11;
            this.f8034b = i12;
            this.f8035c = j11;
            this.f8036d = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8042b;

        e(long j11, long j12) {
            if (j12 == 0) {
                this.f8041a = 0L;
                this.f8042b = 1L;
            } else {
                this.f8041a = j11;
                this.f8042b = j12;
            }
        }

        public double a() {
            return this.f8041a / this.f8042b;
        }

        public String toString() {
            return this.f8041a + "/" + this.f8042b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", Constants.VIDEO_ORIENTATION_270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", FaceShapeAreaOptions.FACE_SHAPE_AREA_NOSETIP, 2), new d("DateTime", FaceShapeAreaOptions.FACE_SHAPE_AREA_NOSEGENERAL, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f7978a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f7979b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", Constants.VIDEO_ORIENTATION_270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", FaceShapeAreaOptions.FACE_SHAPE_AREA_NOSETIP, 2), new d("DateTime", FaceShapeAreaOptions.FACE_SHAPE_AREA_NOSEGENERAL, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f7980c0 = dVarArr5;
        f7981d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f7982e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f7983f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f7984g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f7985h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f7986i0 = dVarArr10;
        f7987j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f7988k0 = new HashMap[dVarArr10.length];
        f7989l0 = new HashMap[dVarArr10.length];
        f7990m0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f7991n0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f7992o0 = charsetForName;
        f7993p0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f7994q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i11 = 0;
        while (true) {
            d[][] dVarArr11 = f7986i0;
            if (i11 >= dVarArr11.length) {
                HashMap map = f7991n0;
                d[] dVarArr12 = f7987j0;
                map.put(Integer.valueOf(dVarArr12[0].f8037a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f8037a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f8037a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f8037a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f8037a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f8037a), 8);
                f7995r0 = Pattern.compile(".*[1-9].*");
                f7996s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f7997t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f7999u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f7988k0[i11] = new HashMap();
            f7989l0[i11] = new HashMap();
            for (d dVar : dVarArr11[i11]) {
                f7988k0[i11].put(Integer.valueOf(dVar.f8037a), dVar);
                f7989l0[i11].put(dVar.f8038b, dVar);
            }
            i11++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    private boolean A(HashMap map) throws Throwable {
        c cVar;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) cVar2.k(this.f8012h);
        int[] iArr2 = f8002x;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f8008d != 3 || (cVar = (c) map.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i11 = cVar.i(this.f8012h);
        return (i11 == 1 && Arrays.equals(iArr, f8004z)) || (i11 == 6 && Arrays.equals(iArr, iArr2));
    }

    private boolean B(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f8012h) <= 512 && cVar2.i(this.f8012h) <= 512;
    }

    private boolean C(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i11 >= bArr2.length) {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = L;
                    if (i12 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[K.length + i12 + 4] != bArr3[i12]) {
                        return false;
                    }
                    i12++;
                }
            } else {
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
    }

    private void D(InputStream inputStream) throws Throwable {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i11 = 0; i11 < f7986i0.length; i11++) {
            try {
                try {
                    this.f8010f[i11] = new HashMap();
                } catch (IOException | UnsupportedOperationException e11) {
                    boolean z11 = f7998u;
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e11);
                    }
                    a();
                    if (z11) {
                        F();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                a();
                if (f7998u) {
                    F();
                }
                throw th2;
            }
        }
        if (!this.f8009e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, CrashReportManager.TIME_WINDOW);
            this.f8008d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (M(this.f8008d)) {
            f fVar = new f(inputStream);
            if (this.f8009e) {
                n(fVar);
            } else {
                int i12 = this.f8008d;
                if (i12 == 12) {
                    e(fVar);
                } else if (i12 == 7) {
                    h(fVar);
                } else if (i12 == 10) {
                    m(fVar);
                } else {
                    k(fVar);
                }
            }
            fVar.h(this.f8020p);
            L(fVar);
        } else {
            b bVar = new b(inputStream);
            int i13 = this.f8008d;
            if (i13 == 4) {
                f(bVar, 0, 0);
            } else if (i13 == 13) {
                i(bVar);
            } else if (i13 == 9) {
                j(bVar);
            } else if (i13 == 14) {
                o(bVar);
            }
        }
        a();
        if (f7998u) {
            F();
        }
    }

    private void E(b bVar) throws IOException {
        ByteOrder byteOrderG = G(bVar);
        this.f8012h = byteOrderG;
        bVar.f(byteOrderG);
        int unsignedShort = bVar.readUnsignedShort();
        int i11 = this.f8008d;
        if (i11 != 7 && i11 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i12 = bVar.readInt();
        if (i12 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i12);
        }
        int i13 = i12 - 8;
        if (i13 > 0) {
            bVar.g(i13);
        }
    }

    private void F() throws Throwable {
        for (int i11 = 0; i11 < this.f8010f.length; i11++) {
            this.f8010f[i11].size();
            for (Map.Entry entry : this.f8010f[i11].entrySet()) {
                c cVar = (c) entry.getValue();
                cVar.toString();
                cVar.j(this.f8012h);
            }
        }
    }

    private ByteOrder G(b bVar) throws IOException {
        short s11 = bVar.readShort();
        if (s11 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s11 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s11));
    }

    private void H(byte[] bArr, int i11) throws IOException {
        f fVar = new f(bArr);
        E(fVar);
        I(fVar, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I(androidx.exifinterface.media.a.f r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.I(androidx.exifinterface.media.a$f, int):void");
    }

    private void J(int i11, String str, String str2) {
        if (this.f8010f[i11].isEmpty() || this.f8010f[i11].get(str) == null) {
            return;
        }
        HashMap map = this.f8010f[i11];
        map.put(str2, map.get(str));
        this.f8010f[i11].remove(str);
    }

    private void K(f fVar, int i11) throws Throwable {
        c cVar = (c) this.f8010f[i11].get("ImageLength");
        c cVar2 = (c) this.f8010f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f8010f[i11].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f8010f[i11].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i12 = cVar3.i(this.f8012h);
            int i13 = cVar3.i(this.f8012h);
            fVar.h(i12);
            byte[] bArr = new byte[i13];
            fVar.readFully(bArr);
            f(new b(bArr), i12, i11);
        }
    }

    private void L(b bVar) throws Throwable {
        HashMap map = this.f8010f[4];
        c cVar = (c) map.get("Compression");
        if (cVar == null) {
            this.f8019o = 6;
            p(bVar, map);
            return;
        }
        int i11 = cVar.i(this.f8012h);
        this.f8019o = i11;
        if (i11 != 1) {
            if (i11 == 6) {
                p(bVar, map);
                return;
            } else if (i11 != 7) {
                return;
            }
        }
        if (A(map)) {
            q(bVar, map);
        }
    }

    private static boolean M(int i11) {
        return (i11 == 4 || i11 == 9 || i11 == 13 || i11 == 14) ? false : true;
    }

    private void N(int i11, int i12) throws Throwable {
        if (this.f8010f[i11].isEmpty() || this.f8010f[i12].isEmpty()) {
            return;
        }
        c cVar = (c) this.f8010f[i11].get("ImageLength");
        c cVar2 = (c) this.f8010f[i11].get("ImageWidth");
        c cVar3 = (c) this.f8010f[i12].get("ImageLength");
        c cVar4 = (c) this.f8010f[i12].get("ImageWidth");
        if (cVar == null || cVar2 == null || cVar3 == null || cVar4 == null) {
            return;
        }
        int i13 = cVar.i(this.f8012h);
        int i14 = cVar2.i(this.f8012h);
        int i15 = cVar3.i(this.f8012h);
        int i16 = cVar4.i(this.f8012h);
        if (i13 >= i15 || i14 >= i16) {
            return;
        }
        HashMap[] mapArr = this.f8010f;
        HashMap map = mapArr[i11];
        mapArr[i11] = mapArr[i12];
        mapArr[i12] = map;
    }

    private void O(f fVar, int i11) throws Throwable {
        c cVarF;
        c cVarF2;
        c cVar = (c) this.f8010f[i11].get("DefaultCropSize");
        c cVar2 = (c) this.f8010f[i11].get("SensorTopBorder");
        c cVar3 = (c) this.f8010f[i11].get("SensorLeftBorder");
        c cVar4 = (c) this.f8010f[i11].get("SensorBottomBorder");
        c cVar5 = (c) this.f8010f[i11].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                K(fVar, i11);
                return;
            }
            int i12 = cVar2.i(this.f8012h);
            int i13 = cVar4.i(this.f8012h);
            int i14 = cVar5.i(this.f8012h);
            int i15 = cVar3.i(this.f8012h);
            if (i13 <= i12 || i14 <= i15) {
                return;
            }
            c cVarF3 = c.f(i13 - i12, this.f8012h);
            c cVarF4 = c.f(i14 - i15, this.f8012h);
            this.f8010f[i11].put("ImageLength", cVarF3);
            this.f8010f[i11].put("ImageWidth", cVarF4);
            return;
        }
        if (cVar.f8033a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f8012h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarF = c.d(eVarArr[0], this.f8012h);
            cVarF2 = c.d(eVarArr[1], this.f8012h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f8012h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarF = c.f(iArr[0], this.f8012h);
            cVarF2 = c.f(iArr[1], this.f8012h);
        }
        this.f8010f[i11].put("ImageWidth", cVarF);
        this.f8010f[i11].put("ImageLength", cVarF2);
    }

    private void P() throws Throwable {
        N(0, 5);
        N(0, 4);
        N(5, 4);
        c cVar = (c) this.f8010f[1].get("PixelXDimension");
        c cVar2 = (c) this.f8010f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f8010f[0].put("ImageWidth", cVar);
            this.f8010f[0].put("ImageLength", cVar2);
        }
        if (this.f8010f[4].isEmpty() && B(this.f8010f[5])) {
            HashMap[] mapArr = this.f8010f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        B(this.f8010f[4]);
        J(0, "ThumbnailOrientation", "Orientation");
        J(0, "ThumbnailImageLength", "ImageLength");
        J(0, "ThumbnailImageWidth", "ImageWidth");
        J(5, "ThumbnailOrientation", "Orientation");
        J(5, "ThumbnailImageLength", "ImageLength");
        J(5, "ThumbnailImageWidth", "ImageWidth");
        J(4, "Orientation", "ThumbnailOrientation");
        J(4, "ImageLength", "ThumbnailImageLength");
        J(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.f8010f[0].put("DateTime", c.a(strB));
        }
        if (b("ImageWidth") == null) {
            this.f8010f[0].put("ImageWidth", c.b(0L, this.f8012h));
        }
        if (b("ImageLength") == null) {
            this.f8010f[0].put("ImageLength", c.b(0L, this.f8012h));
        }
        if (b("Orientation") == null) {
            this.f8010f[0].put("Orientation", c.b(0L, this.f8012h));
        }
        if (b("LightSource") == null) {
            this.f8010f[1].put("LightSource", c.b(0L, this.f8012h));
        }
    }

    private c d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i11 = 0; i11 < f7986i0.length; i11++) {
            c cVar = (c) this.f8010f[i11].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void e(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0135b.a(mediaMetadataRetriever, new C0134a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f8010f[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata), this.f8012h));
                }
                if (strExtractMetadata2 != null) {
                    this.f8010f[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata2), this.f8012h));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    this.f8010f[0].put("Orientation", c.f(i11 != 90 ? i11 != 180 ? i11 != 270 ? 1 : 8 : 3 : 6, this.f8012h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.h(i12);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f7993p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    fVar.readFully(bArr2);
                    this.f8020p = i14;
                    H(bArr2, 0);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void f(androidx.exifinterface.media.a.b r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.f(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(CrashReportManager.TIME_WINDOW);
        byte[] bArr = new byte[CrashReportManager.TIME_WINDOW];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (u(bArr)) {
            return 4;
        }
        if (x(bArr)) {
            return 9;
        }
        if (t(bArr)) {
            return 12;
        }
        if (v(bArr)) {
            return 7;
        }
        if (y(bArr)) {
            return 10;
        }
        if (w(bArr)) {
            return 13;
        }
        return C(bArr) ? 14 : 0;
    }

    private void h(f fVar) throws Throwable {
        int i11;
        int i12;
        k(fVar);
        c cVar = (c) this.f8010f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f8036d);
            fVar2.f(this.f8012h);
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.h(0L);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.h(12L);
            }
            I(fVar2, 6);
            c cVar2 = (c) this.f8010f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f8010f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f8010f[5].put("JPEGInterchangeFormat", cVar2);
                this.f8010f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f8010f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f8012h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i13 = iArr[2];
                int i14 = iArr[0];
                if (i13 <= i14 || (i11 = iArr[3]) <= (i12 = iArr[1])) {
                    return;
                }
                int i15 = (i13 - i14) + 1;
                int i16 = (i11 - i12) + 1;
                if (i15 < i16) {
                    int i17 = i15 + i16;
                    i16 = i17 - i16;
                    i15 = i17 - i16;
                }
                c cVarF = c.f(i15, this.f8012h);
                c cVarF2 = c.f(i16, this.f8012h);
                this.f8010f[0].put("ImageWidth", cVarF);
                this.f8010f[0].put("ImageLength", cVarF2);
            }
        }
    }

    private void i(b bVar) throws Throwable {
        if (f7998u) {
            Objects.toString(bVar);
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        bVar.g(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i11 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i12 = length + 8;
                if (i12 == 16 && !Arrays.equals(bArr2, I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, J)) {
                    return;
                }
                if (Arrays.equals(bArr2, H)) {
                    byte[] bArr3 = new byte[i11];
                    bVar.readFully(bArr3);
                    int i13 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i13) {
                        this.f8020p = i12;
                        H(bArr3, 0);
                        P();
                        L(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i13 + ", calculated CRC value: " + crc32.getValue());
                }
                int i14 = i11 + 4;
                bVar.g(i14);
                length = i12 + i14;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) throws Throwable {
        if (f7998u) {
            Objects.toString(bVar);
        }
        bVar.g(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        int i13 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i12];
        bVar.g(i11 - bVar.c());
        bVar.readFully(bArr4);
        f(new b(bArr4), i11, 5);
        bVar.g(i13 - bVar.c());
        bVar.f(ByteOrder.BIG_ENDIAN);
        int i14 = bVar.readInt();
        for (int i15 = 0; i15 < i14; i15++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f7981d0.f8037a) {
                short s11 = bVar.readShort();
                short s12 = bVar.readShort();
                c cVarF = c.f(s11, this.f8012h);
                c cVarF2 = c.f(s12, this.f8012h);
                this.f8010f[0].put("ImageLength", cVarF);
                this.f8010f[0].put("ImageWidth", cVarF2);
                return;
            }
            bVar.g(unsignedShort2);
        }
    }

    private void k(f fVar) throws Throwable {
        c cVar;
        E(fVar);
        I(fVar, 0);
        O(fVar, 0);
        O(fVar, 5);
        O(fVar, 4);
        P();
        if (this.f8008d != 8 || (cVar = (c) this.f8010f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f8036d);
        fVar2.f(this.f8012h);
        fVar2.g(6);
        I(fVar2, 9);
        c cVar2 = (c) this.f8010f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f8010f[1].put("ColorSpace", cVar2);
        }
    }

    private void m(f fVar) throws Throwable {
        if (f7998u) {
            Objects.toString(fVar);
        }
        k(fVar);
        c cVar = (c) this.f8010f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f8036d), (int) cVar.f8035c, 5);
        }
        c cVar2 = (c) this.f8010f[0].get("ISO");
        c cVar3 = (c) this.f8010f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f8010f[1].put("PhotographicSensitivity", cVar2);
    }

    private void n(f fVar) throws IOException {
        byte[] bArr = f7993p0;
        fVar.g(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f8020p = bArr.length;
        H(bArr2, 0);
    }

    private void o(b bVar) throws Throwable {
        if (f7998u) {
            Objects.toString(bVar);
        }
        bVar.f(ByteOrder.LITTLE_ENDIAN);
        bVar.g(K.length);
        int i11 = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.g(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i12 = bVar.readInt();
                int i13 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArr3 = new byte[i12];
                    bVar.readFully(bArr3);
                    this.f8020p = i13;
                    H(bArr3, 0);
                    L(new b(bArr3));
                    return;
                }
                if (i12 % 2 == 1) {
                    i12++;
                }
                length = i13 + i12;
                if (length == i11) {
                    return;
                }
                if (length > i11) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.g(i12);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void p(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i11 = cVar.i(this.f8012h);
        int i12 = cVar2.i(this.f8012h);
        if (this.f8008d == 7) {
            i11 += this.f8021q;
        }
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f8013i = true;
        if (this.f8005a == null && this.f8007c == null && this.f8006b == null) {
            byte[] bArr = new byte[i12];
            bVar.g(i11);
            bVar.readFully(bArr);
            this.f8018n = bArr;
        }
        this.f8016l = i11;
        this.f8017m = i12;
    }

    private void q(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrA = androidx.exifinterface.media.b.a(cVar.k(this.f8012h));
        long[] jArrA2 = androidx.exifinterface.media.b.a(cVar2.k(this.f8012h));
        if (jArrA == null || jArrA.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrA2 == null || jArrA2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrA.length != jArrA2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j11 = 0;
        for (long j12 : jArrA2) {
            j11 += j12;
        }
        int i11 = (int) j11;
        byte[] bArr = new byte[i11];
        this.f8015k = true;
        this.f8014j = true;
        this.f8013i = true;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < jArrA.length; i14++) {
            int i15 = (int) jArrA[i14];
            int i16 = (int) jArrA2[i14];
            if (i14 < jArrA.length - 1 && i15 + i16 != jArrA[i14 + 1]) {
                this.f8015k = false;
            }
            int i17 = i15 - i12;
            if (i17 < 0) {
                return;
            }
            try {
                bVar.g(i17);
                int i18 = i12 + i17;
                byte[] bArr2 = new byte[i16];
                bVar.readFully(bArr2);
                i12 = i18 + i16;
                System.arraycopy(bArr2, 0, bArr, i13, i16);
                i13 += i16;
            } catch (EOFException unused) {
                return;
            }
        }
        this.f8018n = bArr;
        if (this.f8015k) {
            this.f8016l = (int) jArrA[0];
            this.f8017m = i11;
        }
    }

    private static boolean r(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f7993p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i11 = 0;
        while (true) {
            byte[] bArr3 = f7993p0;
            if (i11 >= bArr3.length) {
                return true;
            }
            if (bArr2[i11] != bArr3[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean t(byte[] bArr) throws Throwable {
        b bVar;
        long j11;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            long length = bVar.readInt();
            byte[] bArr2 = new byte[4];
            bVar.readFully(bArr2);
            if (!Arrays.equals(bArr2, B)) {
                bVar.close();
                return false;
            }
            if (length == 1) {
                length = bVar.readLong();
                j11 = 16;
                if (length < 16) {
                    bVar.close();
                    return false;
                }
            } else {
                j11 = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j12 = length - j11;
            if (j12 < 8) {
                bVar.close();
                return false;
            }
            byte[] bArr3 = new byte[4];
            boolean z11 = false;
            boolean z12 = false;
            for (long j13 = 0; j13 < j12 / 4; j13++) {
                try {
                    bVar.readFully(bArr3);
                    if (j13 != 1) {
                        if (Arrays.equals(bArr3, C)) {
                            z11 = true;
                        } else if (Arrays.equals(bArr3, D)) {
                            z12 = true;
                        }
                        if (z11 && z12) {
                            bVar.close();
                            return true;
                        }
                    }
                } catch (EOFException unused2) {
                    bVar.close();
                    return false;
                }
            }
            bVar.close();
        } catch (Exception unused3) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        return false;
    }

    private static boolean u(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = A;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean v(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderG = G(bVar2);
                this.f8012h = byteOrderG;
                bVar2.f(byteOrderG);
                short s11 = bVar2.readShort();
                boolean z11 = s11 == 20306 || s11 == 21330;
                bVar2.close();
                return z11;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean w(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = G;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean x(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i11 = 0; i11 < bytes.length; i11++) {
            if (bArr[i11] != bytes[i11]) {
                return false;
            }
        }
        return true;
    }

    private boolean y(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderG = G(bVar2);
                this.f8012h = byteOrderG;
                bVar2.f(byteOrderG);
                boolean z11 = bVar2.readShort() == 85;
                bVar2.close();
                return z11;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean z(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD != null) {
            if (!f7990m0.contains(str)) {
                return cVarD.j(this.f8012h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i11 = cVarD.f8033a;
                if (i11 != 5 && i11 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarD.f8033a);
                    return null;
                }
                e[] eVarArr = (e[]) cVarD.k(this.f8012h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f8041a / eVar.f8042b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f8041a / eVar2.f8042b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f8041a / eVar3.f8042b)));
            }
            try {
                return Double.toString(cVarD.h(this.f8012h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i11) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD != null) {
            try {
                return cVarD.i(this.f8012h);
            } catch (NumberFormatException unused) {
            }
        }
        return i11;
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return Constants.VIDEO_ORIENTATION_180;
            case 5:
            case 8:
                return Constants.VIDEO_ORIENTATION_270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public boolean s() {
        int iC = c("Orientation", 1);
        return iC == 2 || iC == 7 || iC == 4 || iC == 5;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final DataInputStream f8028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f8029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f8030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f8031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8032e;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f8032e = bArr.length;
        }

        public int a() {
            return this.f8032e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f8028a.available();
        }

        public int c() {
            return this.f8029b;
        }

        public long e() {
            return ((long) readInt()) & 4294967295L;
        }

        public void f(ByteOrder byteOrder) {
            this.f8030c = byteOrder;
        }

        public void g(int i11) throws IOException {
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i11 - i12;
                int iSkip = (int) this.f8028a.skip(i13);
                if (iSkip <= 0) {
                    if (this.f8031d == null) {
                        this.f8031d = new byte[Marshallable.PROTO_PACKET_SIZE];
                    }
                    iSkip = this.f8028a.read(this.f8031d, 0, Math.min(Marshallable.PROTO_PACKET_SIZE, i13));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i11 + " bytes.");
                    }
                }
                i12 += iSkip;
            }
            this.f8029b += i12;
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f8029b++;
            return this.f8028a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f8029b++;
            return this.f8028a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f8029b++;
            int i11 = this.f8028a.read();
            if (i11 >= 0) {
                return (byte) i11;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f8029b += 2;
            return this.f8028a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i11, int i12) throws IOException {
            this.f8029b += i12;
            this.f8028a.readFully(bArr, i11, i12);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f8029b += 4;
            int i11 = this.f8028a.read();
            int i12 = this.f8028a.read();
            int i13 = this.f8028a.read();
            int i14 = this.f8028a.read();
            if ((i11 | i12 | i13 | i14) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f8030c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i14 << 24) + (i13 << 16) + (i12 << 8) + i11;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
            }
            throw new IOException("Invalid byte order: " + this.f8030c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f8029b += 8;
            int i11 = this.f8028a.read();
            int i12 = this.f8028a.read();
            int i13 = this.f8028a.read();
            int i14 = this.f8028a.read();
            int i15 = this.f8028a.read();
            int i16 = this.f8028a.read();
            int i17 = this.f8028a.read();
            int i18 = this.f8028a.read();
            if ((i11 | i12 | i13 | i14 | i15 | i16 | i17 | i18) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f8030c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i18) << 56) + (((long) i17) << 48) + (((long) i16) << 40) + (((long) i15) << 32) + (((long) i14) << 24) + (((long) i13) << 16) + (((long) i12) << 8) + ((long) i11);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i11) << 56) + (((long) i12) << 48) + (((long) i13) << 40) + (((long) i14) << 32) + (((long) i15) << 24) + (((long) i16) << 16) + (((long) i17) << 8) + ((long) i18);
            }
            throw new IOException("Invalid byte order: " + this.f8030c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i11;
            this.f8029b += 2;
            int i12 = this.f8028a.read();
            int i13 = this.f8028a.read();
            if ((i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f8030c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                i11 = (i13 << 8) + i12;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    throw new IOException("Invalid byte order: " + this.f8030c);
                }
                i11 = (i12 << 8) + i13;
            }
            return (short) i11;
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f8029b += 2;
            return this.f8028a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f8029b++;
            return this.f8028a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f8029b += 2;
            int i11 = this.f8028a.read();
            int i12 = this.f8028a.read();
            if ((i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f8030c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i12 << 8) + i11;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i11 << 8) + i12;
            }
            throw new IOException("Invalid byte order: " + this.f8030c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i11) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = this.f8028a.read(bArr, i11, i12);
            this.f8029b += i13;
            return i13;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f8029b += bArr.length;
            this.f8028a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f8028a = dataInputStream;
            dataInputStream.mark(0);
            this.f8029b = 0;
            this.f8030c = byteOrder;
            this.f8032e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f8028a.mark(Integer.MAX_VALUE);
        }

        public void h(long j11) throws IOException {
            int i11 = this.f8029b;
            if (i11 > j11) {
                this.f8029b = 0;
                this.f8028a.reset();
            } else {
                j11 -= (long) i11;
            }
            g((int) j11);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f8028a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.io.InputStream r4, int r5) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.a$d[][] r0 = androidx.exifinterface.media.a.f7986i0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f8010f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f8011g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f8012h = r0
            if (r4 == 0) goto L6a
            r0 = 0
            r3.f8005a = r0
            r1 = 1
            if (r5 != r1) goto L3c
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = androidx.exifinterface.media.a.f7993p0
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = r(r5)
            if (r4 != 0) goto L34
            java.lang.String r3 = "ExifInterface"
            java.lang.String r4 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r3, r4)
            return
        L34:
            r3.f8009e = r1
            r3.f8007c = r0
            r3.f8006b = r0
            r4 = r5
            goto L66
        L3c:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L48
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f8007c = r5
            r3.f8006b = r0
            goto L66
        L48:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L62
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = z(r1)
            if (r1 == 0) goto L62
            r3.f8007c = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f8006b = r5
            goto L66
        L62:
            r3.f8007c = r0
            r3.f8006b = r0
        L66:
            r3.D(r4)
            return
        L6a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "inputStream cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.<init>(java.io.InputStream, int):void");
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8040d;

        d(String str, int i11, int i12) {
            this.f8038b = str;
            this.f8037a = i11;
            this.f8039c = i12;
            this.f8040d = -1;
        }

        boolean a(int i11) {
            int i12;
            int i13 = this.f8039c;
            if (i13 == 7 || i11 == 7 || i13 == i11 || (i12 = this.f8040d) == i11) {
                return true;
            }
            if ((i13 == 4 || i12 == 4) && i11 == 3) {
                return true;
            }
            if ((i13 == 9 || i12 == 9) && i11 == 8) {
                return true;
            }
            return (i13 == 12 || i12 == 12) && i11 == 11;
        }

        d(String str, int i11, int i12, int i13) {
            this.f8038b = str;
            this.f8037a = i11;
            this.f8039c = i12;
            this.f8040d = i13;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C0134a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f8025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f8026b;

        C0134a(f fVar) {
            this.f8026b = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j11, byte[] bArr, int i11, int i12) {
            if (i12 == 0) {
                return 0;
            }
            if (j11 < 0) {
                return -1;
            }
            try {
                long j12 = this.f8025a;
                if (j12 != j11) {
                    if (j12 >= 0 && j11 >= j12 + ((long) this.f8026b.available())) {
                        return -1;
                    }
                    this.f8026b.h(j11);
                    this.f8025a = j11;
                }
                if (i12 > this.f8026b.available()) {
                    i12 = this.f8026b.available();
                }
                int i13 = this.f8026b.read(bArr, i11, i12);
                if (i13 >= 0) {
                    this.f8025a += (long) i13;
                    return i13;
                }
            } catch (IOException unused) {
            }
            this.f8025a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
