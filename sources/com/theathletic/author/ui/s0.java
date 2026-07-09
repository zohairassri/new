package com.theathletic.author.ui;

import androidx.compose.runtime.d2;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR*\u0010\u0012\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theathletic/author/ui/s0;", "", "T", "Landroidx/compose/runtime/d2;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, "isNotInitialized", "newValue", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getValue", "()Ljava/lang/Object;", "setValue", VideoRepository.XML_ATTR_VALUE, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0<T> implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object initialValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isNotInitialized;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object value;

    public s0(Object initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        this.initialValue = initialValue;
        this.isNotInitialized = true;
        this.value = initialValue;
    }

    @Override // androidx.compose.runtime.d2, androidx.compose.runtime.i5
    public Object getValue() {
        return this.value;
    }

    @Override // androidx.compose.runtime.d2
    public void setValue(Object newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (!this.isNotInitialized || Intrinsics.areEqual(this.initialValue, newValue) || Intrinsics.areEqual(newValue, this.value)) {
            return;
        }
        this.isNotInitialized = false;
        this.value = newValue;
    }
}
