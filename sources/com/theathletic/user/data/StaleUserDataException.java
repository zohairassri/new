package com.theathletic.user.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/theathletic/user/data/StaleUserDataException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StaleUserDataException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaleUserDataException(@NotNull String msg, Throwable th2) {
        super(msg, th2);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public /* synthetic */ StaleUserDataException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }
}
