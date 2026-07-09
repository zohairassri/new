package com.apollographql.cache.normalized.api;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/cache/normalized/api/OnErrorHaltException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "normalized-cache"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnErrorHaltException extends Exception {
    public OnErrorHaltException() {
        super("A field resolved to an error and OnError is set to HALT");
    }
}
