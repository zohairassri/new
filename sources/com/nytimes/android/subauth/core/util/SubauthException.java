package com.nytimes.android.subauth.core.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/nytimes/android/subauth/core/util/SubauthException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class SubauthException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubauthException(String errorMessage) {
        super(errorMessage);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
