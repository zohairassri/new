package io.embrace.android.embracesdk.internal.capture.cpu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import w90.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lio/embrace/android/embracesdk/internal/capture/cpu/EmbraceCpuInfoNdkDelegate;", "Lw90/b;", "<init>", "()V", "", "getNativeCpuName", "()Ljava/lang/String;", "getNativeEgl", "embrace-android-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmbraceCpuInfoNdkDelegate implements b {
    @Override // w90.b
    @NotNull
    public native String getNativeCpuName();

    @Override // w90.b
    @NotNull
    public native String getNativeEgl();
}
