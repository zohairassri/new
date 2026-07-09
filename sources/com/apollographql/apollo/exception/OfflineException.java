package com.apollographql.apollo.exception;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/exception/OfflineException;", "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OfflineException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OfflineException f18717a = new OfflineException();

    private OfflineException() {
        super("The device is offline");
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof OfflineException);
    }

    public int hashCode() {
        return -155984151;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "OfflineException";
    }
}
