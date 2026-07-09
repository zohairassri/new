package com.theathletic.utility;

import android.app.Activity;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/utility/j0;", "", "Landroid/app/Activity;", "activity", "", "requestCode", "Lkotlin/Function0;", "", "onDownloadComplete", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(Landroid/app/Activity;ILkotlin/jvm/functions/Function0;)V", QueryKeys.PAGE_LOAD_TIME, "(Lkotlin/jvm/functions/Function0;)V", "a", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j0 {
    void a();

    void b(Function0 onDownloadComplete);

    void c(Activity activity, int requestCode, Function0 onDownloadComplete);
}
