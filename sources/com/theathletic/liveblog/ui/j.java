package com.theathletic.liveblog.ui;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "linkForEmbed", "", "lightMode", "postId", "a", "(Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;", "mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final String a(String linkForEmbed, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(linkForEmbed, "linkForEmbed");
        Uri.Builder builderAppendQueryParameter = Uri.parse(linkForEmbed).buildUpon().appendQueryParameter("theme", z11 ? "light" : "dark");
        if (str != null) {
            builderAppendQueryParameter.appendPath(str);
            builderAppendQueryParameter.appendPath("");
        }
        String string = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
