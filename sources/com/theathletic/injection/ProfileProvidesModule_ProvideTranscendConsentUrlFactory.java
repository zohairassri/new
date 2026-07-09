package com.theathletic.injection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
public final class ProfileProvidesModule_ProvideTranscendConsentUrlFactory implements h90.d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class InstanceHolder {
        static final ProfileProvidesModule_ProvideTranscendConsentUrlFactory INSTANCE = new ProfileProvidesModule_ProvideTranscendConsentUrlFactory();

        private InstanceHolder() {
        }
    }

    public static String b() {
        return (String) h90.h.e(ProfileProvidesModule.INSTANCE.a());
    }

    @Override // ve0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
