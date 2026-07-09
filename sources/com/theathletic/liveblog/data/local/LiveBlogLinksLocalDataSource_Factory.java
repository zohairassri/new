package com.theathletic.liveblog.data.local;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
public final class LiveBlogLinksLocalDataSource_Factory implements h90.d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class InstanceHolder {
        static final LiveBlogLinksLocalDataSource_Factory INSTANCE = new LiveBlogLinksLocalDataSource_Factory();

        private InstanceHolder() {
        }
    }

    public static LiveBlogLinksLocalDataSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LiveBlogLinksLocalDataSource newInstance() {
        return new LiveBlogLinksLocalDataSource();
    }

    @Override // ve0.a
    public LiveBlogLinksLocalDataSource get() {
        return newInstance();
    }
}
