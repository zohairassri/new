package kotlin.io;

import cf0.a;
import cf0.b;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "a", QueryKeys.PAGE_LOAD_TIME, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FileWalkDirection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FileWalkDirection f111740a = new FileWalkDirection("TOP_DOWN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FileWalkDirection f111741b = new FileWalkDirection("BOTTOM_UP", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ FileWalkDirection[] f111742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a f111743d;

    static {
        FileWalkDirection[] fileWalkDirectionArrA = a();
        f111742c = fileWalkDirectionArrA;
        f111743d = b.a(fileWalkDirectionArrA);
    }

    private FileWalkDirection(String str, int i11) {
    }

    private static final /* synthetic */ FileWalkDirection[] a() {
        return new FileWalkDirection[]{f111740a, f111741b};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f111742c.clone();
    }
}
