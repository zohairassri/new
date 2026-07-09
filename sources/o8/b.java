package o8;

import android.text.TextUtils;
import com.comscore.android.id.IdHelperAndroid;
import com.google.common.collect.a0;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f120103d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a0 f120104e = a0.C("auto", IdHelperAndroid.NO_ID_AVAILABLE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a0 f120105f = a0.D("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a0 f120106g = a0.C("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a0 f120107h = a0.D("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120110c;

    private b(int i11, int i12, int i13) {
        this.f120108a = i11;
        this.f120109b = i12;
        this.f120110c = i13;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = zo.c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(a0.x(TextUtils.split(strE, f120103d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o8.b b(com.google.common.collect.a0 r7) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.b.b(com.google.common.collect.a0):o8.b");
    }
}
