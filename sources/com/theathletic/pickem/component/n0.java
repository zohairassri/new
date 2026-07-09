package com.theathletic.pickem.component;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002H¦B¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/pickem/component/n0;", "", "", "isFollowsSearch", "", "league", "excludeAlreadyPicked", "Lwe0/t;", "", "a", "(ZLjava/lang/String;ZLaf0/c;)Ljava/lang/Object;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ Object b(n0 n0Var, boolean z11, String str, boolean z12, af0.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke-BWLJW6A");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return n0Var.a(z11, str, z12, cVar);
    }

    Object a(boolean z11, String str, boolean z12, af0.c cVar);
}
