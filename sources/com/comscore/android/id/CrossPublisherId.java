package com.comscore.android.id;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class CrossPublisherId {
    public final String crossPublisherId;
    public final int source;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface Source {
        public static final int ADID = 1;
        public static final int ANDROIDBUILDSERIAL = 2;
        public static final int ANDROIDID = 3;
        public static final int NotPresent = 0;
    }

    CrossPublisherId(String str, int i11) {
        this.crossPublisherId = str;
        this.source = i11;
    }
}
