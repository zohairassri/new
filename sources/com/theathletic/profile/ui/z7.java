package com.theathletic.profile.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/theathletic/profile/ui/z7;", "Lcom/theathletic/ui/l;", "", "Lcom/theathletic/ui/d1;", "carouselItemModels", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", "getStableId", "()Ljava/lang/String;", "stableId", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z7 implements com.theathletic.ui.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List carouselItemModels;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String stableId;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/theathletic/profile/ui/z7$a;", "", "", "Z1", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void Z1();
    }

    public z7(List carouselItemModels) {
        Intrinsics.checkNotNullParameter(carouselItemModels, "carouselItemModels");
        this.carouselItemModels = carouselItemModels;
        this.stableId = "PROFILE_FOLLOWING";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public List getCarouselItemModels() {
        return this.carouselItemModels;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }
}
