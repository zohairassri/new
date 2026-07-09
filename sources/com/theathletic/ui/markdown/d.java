package com.theathletic.ui.markdown;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001\u001eB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJq\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/theathletic/ui/markdown/d;", "Landroid/text/style/LeadingMarginSpan;", "", "bulletRadius", "gapWidth", "color", "<init>", "(III)V", "", "first", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "x", "dir", "top", "baseline", "bottom", "", "text", "start", "end", "Landroid/text/Layout;", "layout", "", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "a", QueryKeys.IDLING, "getBulletRadius", "()I", QueryKeys.PAGE_LOAD_TIME, "getGapWidth", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getColor", "Landroid/graphics/Path;", QueryKeys.SUBDOMAIN, "Landroid/graphics/Path;", "mBulletPath", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements LeadingMarginSpan {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83524f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int bulletRadius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int gapWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int color;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Path mBulletPath;

    public d() {
        this(0, 0, 0, 7, null);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int x11, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (((Spanned) text).getSpanStart(this) == start) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            float lineBaseline = layout != null ? layout.getLineBaseline(layout.getLineForOffset(start)) - (this.bulletRadius * 2.0f) : (top + bottom) / 2.0f;
            float f11 = x11 + (dir * this.bulletRadius);
            if (canvas.isHardwareAccelerated()) {
                if (this.mBulletPath == null) {
                    Path path = new Path();
                    this.mBulletPath = path;
                    Intrinsics.checkNotNull(path);
                    path.addCircle(0.0f, 0.0f, this.bulletRadius, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(f11, lineBaseline);
                Path path2 = this.mBulletPath;
                Intrinsics.checkNotNull(path2);
                canvas.drawPath(path2, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(f11, lineBaseline, this.bulletRadius, paint);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        return (this.bulletRadius * 2) + this.gapWidth;
    }

    public d(int i11, int i12, int i13) {
        this.bulletRadius = i11;
        this.gapWidth = i12;
        this.color = i13;
    }

    public /* synthetic */ d(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 4 : i11, (i14 & 2) != 0 ? 2 : i12, (i14 & 4) != 0 ? 0 : i13);
    }
}
