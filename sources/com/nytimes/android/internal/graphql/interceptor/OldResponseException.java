package com.nytimes.android.internal.graphql.interceptor;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/nytimes/android/internal/graphql/interceptor/OldResponseException;", "Ljava/io/IOException;", "operationName", "", "requestLastModification", "responseLastModification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OldResponseException extends IOException {
    public OldResponseException(String str, String str2, String str3) {
        super("Response Last-Modified=" + str3 + " is older than the If-Modified-Since=" + str2 + " of the most recent request for operation=" + str + InstructionFileId.DOT);
    }
}
