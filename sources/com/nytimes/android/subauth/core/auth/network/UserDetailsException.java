package com.nytimes.android.subauth.core.auth.network;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/nytimes/android/subauth/core/auth/network/UserDetailsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "", "cause", "", "isNetworkConnectivityError", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.MEMFLY_API_VERSION, "()Z", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserDetailsException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isNetworkConnectivityError;

    public /* synthetic */ UserDetailsException(String str, Throwable th2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : th2, (i11 & 4) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsNetworkConnectivityError() {
        return this.isNetworkConnectivityError;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public UserDetailsException(String str, Throwable th2, boolean z11) {
        super(str, th2);
        this.message = str;
        this.cause = th2;
        this.isNetworkConnectivityError = z11;
    }
}
