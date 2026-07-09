package com.theathletic.utility;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.analytics.data.ClickSource;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/utility/f0;", "", "Landroid/content/Context;", "context", "", "articleId", "Lcom/theathletic/analytics/data/ClickSource;", "source", "", "rawUrl", "", QueryKeys.PAGE_LOAD_TIME, "(Landroid/content/Context;JLcom/theathletic/analytics/data/ClickSource;Ljava/lang/String;)V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ void a(f0 f0Var, Context context, long j11, ClickSource clickSource, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startArticleActivity");
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        f0Var.b(context, j11, clickSource, str);
    }

    void b(Context context, long articleId, ClickSource source, String rawUrl);
}
