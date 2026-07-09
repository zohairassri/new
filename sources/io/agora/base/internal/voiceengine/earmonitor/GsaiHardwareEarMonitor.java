package io.agora.base.internal.voiceengine.earmonitor;

import android.content.Context;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ReflectUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class GsaiHardwareEarMonitor implements IHardwareEarMonitor {
    private String TAG;
    private HardwareEarMonitorListener mListener;
    private Class<?> mMediaClientClass;
    private Object mMediaClient = null;
    private volatile boolean mInitialized = false;
    private volatile boolean mEarMonitorEnabled = false;
    private Context mContext = ContextUtils.getApplicationContext();

    public GsaiHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener, String str) {
        this.TAG = str;
        this.mListener = hardwareEarMonitorListener;
        Logging.d(str, ">>ctor");
    }

    public static boolean hasEarMonitorClass() {
        return ReflectUtils.safeFindClass("com.itgsa.opensdk.media.MediaClient") != null;
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void destroy() {
        Logging.d(this.TAG, "karaoke kit destroy");
        this.mListener = null;
        if (this.mInitialized) {
            this.mInitialized = false;
            this.mEarMonitorEnabled = false;
            enableHardwareEarMonitor(false);
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int enableHardwareEarMonitor(boolean z11) {
        Logging.d(this.TAG, ">>enableHardwareEarMonitor " + z11);
        Class cls = Integer.TYPE;
        try {
            if (z11) {
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setMixerSoundType", new Class[]{cls}, new Object[]{Integer.valueOf(getMixerSoundType())});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setPlayFeedbackParam", new Class[]{cls}, new Object[]{1});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "openKTVDevice", new Class[0], new Object[0]);
            } else {
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setPlayFeedbackParam", new Class[]{cls}, new Object[]{0});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "closeKTVDevice", new Class[0], new Object[0]);
            }
            this.mEarMonitorEnabled = z11;
            return 0;
        } catch (Throwable th2) {
            Logging.e(this.TAG, "enableHardwareEarMonitor failed ", th2);
            return -1;
        }
    }

    protected abstract int getMixerSoundType();

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void initialize() {
        Logging.d(this.TAG, "HnAudioClient initialize");
        if (this.mContext == null) {
            Logging.e(this.TAG, "mContext is null!");
            return;
        }
        if (this.mInitialized) {
            Logging.w(this.TAG, "already initialized, ignore");
            return;
        }
        try {
            Class<?> clsSafeFindClass = ReflectUtils.safeFindClass("com.itgsa.opensdk.media.MediaClient");
            this.mMediaClientClass = clsSafeFindClass;
            this.mMediaClient = ReflectUtils.safeCallMethod(clsSafeFindClass, null, "initialize", new Class[]{Context.class}, new Object[]{this.mContext});
            this.mInitialized = true;
            HardwareEarMonitorListener hardwareEarMonitorListener = this.mListener;
            if (hardwareEarMonitorListener != null) {
                hardwareEarMonitorListener.onInitResult(0);
                this.mListener.onHardwareEarMonitorSupported(isHardwareEarMonitorSupported());
            }
            Logging.d(this.TAG, "MediaClient initialize success");
        } catch (Throwable unused) {
            Logging.d(this.TAG, "MediaClient initialize failed");
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public boolean isHardwareEarMonitorSupported() {
        try {
            boolean zBooleanValue = ((Boolean) ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "isSupported", new Class[0], new Object[0])).booleanValue();
            String str = this.TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Karaoke earMonitor is");
            sb2.append(zBooleanValue ? " " : " not ");
            sb2.append("support ");
            Logging.d(str, sb2.toString());
            return zBooleanValue;
        } catch (Throwable th2) {
            Logging.e(this.TAG, "isHardwareEarMonitorSupported false ", th2);
            return false;
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int setHardwareEarMonitorVolume(int i11) {
        if (!this.mEarMonitorEnabled) {
            return -7;
        }
        int i12 = (int) (((double) i11) * 0.15d);
        Logging.d(this.TAG, ">>setHardwareEarMonitorVolume " + i12);
        try {
            ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setMicVolParam", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i12)});
            return 0;
        } catch (Throwable th2) {
            Logging.e(this.TAG, "setHardwareEarMonitorVolume failed ", th2);
            return -1;
        }
    }
}
