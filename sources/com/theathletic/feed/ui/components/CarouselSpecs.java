package com.theathletic.feed.ui.components;

import com.chartbeat.androidsdk.QueryKeys;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.theathletic.feed.ui.components.t, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017¨\u0006\""}, d2 = {"Lcom/theathletic/feed/ui/components/t;", "", "Lz3/h;", "layoutWidth", "", "visibleItemCount", "spacing", "maxItemWidth", "minPeekWidth", "<init>", "(FIFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getLayoutWidth-D9Ej5fM", "()F", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, "getVisibleItemCount", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getSpacing-D9Ej5fM", QueryKeys.SUBDOMAIN, "getMaxItemWidth-D9Ej5fM", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "getMinPeekWidth-D9Ej5fM", "itemWidth", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarouselSpecs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSpecs.kt\ncom/theathletic/feed/ui/components/CarouselSpecs\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,47:1\n113#2:48\n113#2:49\n113#2:50\n131#2:55\n68#3:51\n49#3:52\n52#3:53\n60#3:54\n*S KotlinDebug\n*F\n+ 1 CarouselSpecs.kt\ncom/theathletic/feed/ui/components/CarouselSpecs\n*L\n10#1:48\n11#1:49\n12#1:50\n23#1:55\n17#1:51\n19#1:52\n20#1:53\n21#1:54\n*E\n"})
public final /* data */ class CarouselSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float layoutWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int visibleItemCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float maxItemWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float minPeekWidth;

    public /* synthetic */ CarouselSpecs(float f11, int i11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, i11, f12, f13, f14);
    }

    public final float a() {
        return z3.h.h(Math.min(this.maxItemWidth, z3.h.h(z3.h.h(this.layoutWidth - z3.h.h(z3.h.h(this.spacing * (this.visibleItemCount + 1)) + this.minPeekWidth)) / this.visibleItemCount)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselSpecs)) {
            return false;
        }
        CarouselSpecs carouselSpecs = (CarouselSpecs) other;
        return z3.h.k(this.layoutWidth, carouselSpecs.layoutWidth) && this.visibleItemCount == carouselSpecs.visibleItemCount && z3.h.k(this.spacing, carouselSpecs.spacing) && z3.h.k(this.maxItemWidth, carouselSpecs.maxItemWidth) && z3.h.k(this.minPeekWidth, carouselSpecs.minPeekWidth);
    }

    public int hashCode() {
        return (((((((z3.h.l(this.layoutWidth) * 31) + Integer.hashCode(this.visibleItemCount)) * 31) + z3.h.l(this.spacing)) * 31) + z3.h.l(this.maxItemWidth)) * 31) + z3.h.l(this.minPeekWidth);
    }

    public String toString() {
        return "CarouselSpecs(layoutWidth=" + z3.h.n(this.layoutWidth) + ", visibleItemCount=" + this.visibleItemCount + ", spacing=" + z3.h.n(this.spacing) + ", maxItemWidth=" + z3.h.n(this.maxItemWidth) + ", minPeekWidth=" + z3.h.n(this.minPeekWidth) + ")";
    }

    private CarouselSpecs(float f11, int i11, float f12, float f13, float f14) {
        this.layoutWidth = f11;
        this.visibleItemCount = i11;
        this.spacing = f12;
        this.maxItemWidth = f13;
        this.minPeekWidth = f14;
    }

    public /* synthetic */ CarouselSpecs(float f11, int i11, float f12, float f13, float f14, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, (i12 & 2) != 0 ? 2 : i11, (i12 & 4) != 0 ? z3.h.h(16) : f12, (i12 & 8) != 0 ? z3.h.h(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEINNERCORNER) : f13, (i12 & 16) != 0 ? z3.h.h(32) : f14, null);
    }
}
