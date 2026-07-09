package c00;

import android.icu.text.MessageFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc00/b;", "Lr20/a;", "", "<init>", "()V", "formattable", "", "a", "(I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements r20.a<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16993a = 0;

    public String a(int formattable) {
        String str = new MessageFormat("{0,ordinal}", Locale.getDefault()).format(new Integer[]{Integer.valueOf(formattable)});
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
