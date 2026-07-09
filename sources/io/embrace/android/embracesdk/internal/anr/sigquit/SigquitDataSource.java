package io.embrace.android.embracesdk.internal.anr.sigquit;

import io.embrace.android.embracesdk.internal.arch.datasource.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/embrace/android/embracesdk/internal/anr/sigquit/SigquitDataSource;", "Lio/embrace/android/embracesdk/internal/arch/datasource/a;", "Lq90/c;", "", "timestamp", "", "saveSigquit", "(J)V", "embrace-android-features_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SigquitDataSource extends a {
    /* synthetic */ boolean captureData(@NotNull Function0 function0, @NotNull Function1 function1);

    @Override // io.embrace.android.embracesdk.internal.arch.datasource.a
    /* synthetic */ void disableDataCapture();

    @Override // io.embrace.android.embracesdk.internal.arch.datasource.a
    /* synthetic */ void enableDataCapture();

    @Override // io.embrace.android.embracesdk.internal.arch.datasource.a
    /* synthetic */ void resetDataCaptureLimits();

    void saveSigquit(long timestamp);
}
