package com.theathletic.debugtools.compose.ui;

import com.theathletic.debugtools.compose.ui.DebugToolsViewModel_HiltModules;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
public final class DebugToolsViewModel_HiltModules_KeyModule_ProvideFactory implements h90.d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class InstanceHolder {
        static final DebugToolsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new DebugToolsViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static boolean b() {
        return DebugToolsViewModel_HiltModules.KeyModule.a();
    }

    @Override // ve0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
