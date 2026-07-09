package com.theathletic.pm.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "text", "intentPackage", "Landroid/content/Intent;", QueryKeys.SUBDOMAIN, "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "Landroid/content/Context;", "intent", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(Landroid/content/Context;Landroid/content/Intent;)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharingOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingOptions.kt\ncom/theathletic/share/ui/SharingOptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class q1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra == null) {
                return;
            }
            context.startActivity(e(stringExtra, null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent d(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.setPackage(str2);
        }
        Intent intentCreateChooser = str2 != null ? intent : null;
        if (intentCreateChooser == null) {
            intentCreateChooser = Intent.createChooser(intent, null);
        }
        intentCreateChooser.addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "apply(...)");
        return intentCreateChooser;
    }

    static /* synthetic */ Intent e(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return d(str, str2);
    }
}
