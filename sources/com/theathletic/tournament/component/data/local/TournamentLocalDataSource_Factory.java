package com.theathletic.tournament.component.data.local;

import h90.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
public final class TournamentLocalDataSource_Factory implements d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class InstanceHolder {
        static final TournamentLocalDataSource_Factory INSTANCE = new TournamentLocalDataSource_Factory();

        private InstanceHolder() {
        }
    }

    public static TournamentLocalDataSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TournamentLocalDataSource newInstance() {
        return new TournamentLocalDataSource();
    }

    @Override // ve0.a
    public TournamentLocalDataSource get() {
        return newInstance();
    }
}
