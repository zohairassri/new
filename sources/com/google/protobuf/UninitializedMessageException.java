package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class UninitializedMessageException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f47311a;

    public UninitializedMessageException(i0 i0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f47311a = null;
    }
}
