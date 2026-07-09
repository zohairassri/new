package com.theathletic.pm;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/theathletic/share/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "label", "text", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/ClipboardManager;", "Landroid/content/ClipboardManager;", "clipboardManager", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClipboardManager clipboardManager;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        aVar.a(str, str2);
    }

    public final void a(String label, String text) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.clipboardManager != null) {
            this.clipboardManager.setPrimaryClip(ClipData.newPlainText(label, text));
        }
    }
}
