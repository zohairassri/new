package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClipboardManager f5737a;

    public k(ClipboardManager clipboardManager) {
        this.f5737a = clipboardManager;
    }

    public b1 a() {
        ClipData primaryClip = this.f5737a.getPrimaryClip();
        if (primaryClip != null) {
            return new b1(primaryClip);
        }
        return null;
    }

    public boolean b() {
        ClipDescription primaryClipDescription = this.f5737a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void c(b1 b1Var) {
        if (b1Var == null) {
            p0.a(this.f5737a);
        } else {
            this.f5737a.setPrimaryClip(b1Var.a());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
