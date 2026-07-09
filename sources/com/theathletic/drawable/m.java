package com.theathletic.drawable;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(Ljava/lang/Throwable;)Z", "mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final boolean a(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if ((th2 instanceof SocketTimeoutException) || (th2 instanceof ConnectException) || (th2 instanceof UnknownHostException)) {
            return true;
        }
        return (th2 instanceof HttpException) && ((HttpException) th2).code() == 504;
    }
}
