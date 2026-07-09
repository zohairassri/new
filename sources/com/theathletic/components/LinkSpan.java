package com.theathletic.components;

import android.text.style.URLSpan;
import android.view.View;
import com.amazonaws.services.s3.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0006\u0010\u000bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/theathletic/components/LinkSpan;", "Landroid/text/style/URLSpan;", "", Constants.URL_ENCODING, "Lkotlin/Function1;", "", "onClick", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "widget", "(Landroid/view/View;)V", "a", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkSpan extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1 onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkSpan(String url, Function1 onClick) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClick = onClick;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Function1 function1 = this.onClick;
        String url = getURL();
        Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
        function1.invoke(url);
    }
}
