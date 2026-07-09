package com.theathletic.ui.markdown;

import android.text.style.URLSpan;
import android.view.View;
import com.amazonaws.services.s3.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/theathletic/ui/markdown/ClickableUrlSpan;", "Landroid/text/style/URLSpan;", "", Constants.URL_ENCODING, "Lcom/theathletic/ui/markdown/ClickableUrlSpan$a;", "clickListener", "<init>", "(Ljava/lang/String;Lcom/theathletic/ui/markdown/ClickableUrlSpan$a;)V", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "a", "Lcom/theathletic/ui/markdown/ClickableUrlSpan$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClickableUrlSpan extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a clickListener;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/theathletic/ui/markdown/ClickableUrlSpan$a;", "", "", Constants.URL_ENCODING, "", "a", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(String url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableUrlSpan(String url, a aVar) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.clickListener = aVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        a aVar = this.clickListener;
        if (aVar == null) {
            super.onClick(widget);
            return;
        }
        String url = getURL();
        Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
        aVar.a(url);
    }
}
