package com.theathletic.links.data;

import h90.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
public final class PendingLinkRepository_Factory implements d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class InstanceHolder {
        static final PendingLinkRepository_Factory INSTANCE = new PendingLinkRepository_Factory();

        private InstanceHolder() {
        }
    }

    public static PendingLinkRepository_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PendingLinkRepository newInstance() {
        return new PendingLinkRepository();
    }

    @Override // ve0.a
    public PendingLinkRepository get() {
        return newInstance();
    }
}
