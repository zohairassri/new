package com.theathletic.debugtools;

import androidx.databinding.ObservableBoolean;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/theathletic/debugtools/DebugToolsDatabaseConverters;", "", "<init>", "()V", "Landroidx/databinding/ObservableBoolean;", VideoRepository.XML_ATTR_VALUE, "", QueryKeys.PAGE_LOAD_TIME, "(Landroidx/databinding/ObservableBoolean;)Z", "a", "(Z)Landroidx/databinding/ObservableBoolean;", "db_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DebugToolsDatabaseConverters {
    public final ObservableBoolean a(boolean value) {
        return new ObservableBoolean(value);
    }

    public final boolean b(ObservableBoolean value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.g();
    }
}
