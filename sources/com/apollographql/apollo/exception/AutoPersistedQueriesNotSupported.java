package com.apollographql.apollo.exception;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/exception/AutoPersistedQueriesNotSupported;", "Lcom/apollographql/apollo/exception/ApolloException;", "<init>", "()V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoPersistedQueriesNotSupported extends ApolloException {
    public AutoPersistedQueriesNotSupported() {
        super("The server does not support auto persisted queries", null, 2, null);
    }
}
