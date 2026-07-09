package mr;

import com.amazonaws.services.s3.internal.Constants;
import okhttp3.internal.ws.RealWebSocket;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f116925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f116926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f116927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f116928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f116929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ k[] f116930g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f116931a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    enum a extends k {
        a(String str, int i11, long j11) {
            super(str, i11, j11, null);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        f116925b = aVar;
        k kVar = new k("GIGABYTES", 1, Constants.GB) { // from class: mr.k.b
            {
                a aVar2 = null;
            }
        };
        f116926c = kVar;
        k kVar2 = new k("MEGABYTES", 2, 1048576L) { // from class: mr.k.c
            {
                a aVar2 = null;
            }
        };
        f116927d = kVar2;
        k kVar3 = new k("KILOBYTES", 3, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) { // from class: mr.k.d
            {
                a aVar2 = null;
            }
        };
        f116928e = kVar3;
        k kVar4 = new k("BYTES", 4, 1L) { // from class: mr.k.e
            {
                a aVar2 = null;
            }
        };
        f116929f = kVar4;
        f116930g = new k[]{aVar, kVar, kVar2, kVar3, kVar4};
    }

    /* synthetic */ k(String str, int i11, long j11, a aVar) {
        this(str, i11, j11);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f116930g.clone();
    }

    public long a(long j11) {
        return (j11 * this.f116931a) / f116928e.f116931a;
    }

    private k(String str, int i11, long j11) {
        this.f116931a = j11;
    }
}
