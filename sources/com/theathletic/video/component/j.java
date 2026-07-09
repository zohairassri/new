package com.theathletic.video.component;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001c\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/theathletic/video/component/j;", "Landroid/database/ContentObserver;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "", "onVolumeStateChanged", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "a", "()F", "", "selfChange", "onChange", "(Z)V", QueryKeys.PAGE_LOAD_TIME, "()V", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Lkotlin/jvm/functions/Function1;", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "audioManager", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "Landroid/content/ContentResolver;", "contentResolver", QueryKeys.SUBDOMAIN, "F", "lastVolume", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1 onVolumeStateChanged;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AudioManager audioManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ContentResolver contentResolver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float lastVolume;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Function1 onVolumeStateChanged) {
        super(new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onVolumeStateChanged, "onVolumeStateChanged");
        this.onVolumeStateChanged = onVolumeStateChanged;
        Object systemService = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        this.contentResolver = context.getContentResolver();
        this.lastVolume = a();
    }

    private final float a() {
        return this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3);
    }

    public final void b() {
        this.contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void c() {
        this.contentResolver.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
        float fA = a();
        if (fA == this.lastVolume) {
            return;
        }
        this.lastVolume = fA;
        this.onVolumeStateChanged.invoke(Float.valueOf(fA));
    }
}
