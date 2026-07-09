package io.agora.base.internal.voiceengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class WebRtcAudioUtils {
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = 16000;
    private static boolean isDefaultSampleRateOverridden = false;
    private static boolean useWebRtcBasedAcousticEchoCanceler = false;
    private static boolean useWebRtcBasedNoiseSuppressor = false;
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];
    private static final String[] BLACKLISTED_AGC_MODELS = new String[0];

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    private static String deviceTypeToString(int i11) {
        switch (i11) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForAgcUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        return defaultSampleRateHz;
    }

    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        return isDefaultSampleRateOverridden;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    @TargetApi(23)
    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        if (runningOnMarshmallowOrHigher()) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            if (devices.length == 0) {
                return;
            }
            Logging.d(str, "Audio Devices: ");
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  ");
                sb2.append(deviceTypeToString(audioDeviceInfo.getType()));
                sb2.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    sb2.append("channels=");
                    sb2.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                    sb2.append(", ");
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    sb2.append("encodings=");
                    sb2.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                    sb2.append(", ");
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    sb2.append("sample rates=");
                    sb2.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                    sb2.append(", ");
                }
                sb2.append("id=");
                sb2.append(audioDeviceInfo.getId());
                Logging.d(str, sb2.toString());
            }
        }
    }

    static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        Logging.d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    @SuppressLint({"NewApi"})
    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        boolean zIsVolumeFixed;
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        if (runningOnLollipopOrHigher()) {
            zIsVolumeFixed = audioManager.isVolumeFixed();
            Logging.d(str, "  fixed volume=" + zIsVolumeFixed);
        } else {
            zIsVolumeFixed = false;
        }
        if (zIsVolumeFixed) {
            return;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  " + streamTypeToString(i12) + ": ");
            sb2.append("volume=");
            sb2.append(audioManager.getStreamVolume(i12));
            sb2.append(", max=");
            sb2.append(audioManager.getStreamMaxVolume(i12));
            logIsStreamMute(str, audioManager, i12, sb2);
            Logging.d(str, sb2.toString());
        }
    }

    static void logDeviceInfo(String str) {
        Logging.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    @TargetApi(23)
    private static void logIsStreamMute(String str, AudioManager audioManager, int i11, StringBuilder sb2) {
        if (runningOnMarshmallowOrHigher()) {
            sb2.append(", muted=");
            sb2.append(audioManager.isStreamMute(i11));
        }
    }

    static String modeToString(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static boolean runningOnJellyBeanMR1OrHigher() {
        return true;
    }

    public static boolean runningOnJellyBeanMR2OrHigher() {
        return true;
    }

    public static boolean runningOnLollipopOrHigher() {
        return true;
    }

    public static boolean runningOnMarshmallowOrHigher() {
        return true;
    }

    public static boolean runningOnNougatOrHigher() {
        return true;
    }

    public static boolean runningOnOreoMR1OrHigher() {
        return true;
    }

    public static boolean runningOnOreoOrHigher() {
        return true;
    }

    public static synchronized void setDefaultSampleRateHz(int i11) {
        isDefaultSampleRateOverridden = true;
        defaultSampleRateHz = i11;
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z11) {
        useWebRtcBasedAcousticEchoCanceler = z11;
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z11) {
        Logging.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z11) {
        useWebRtcBasedNoiseSuppressor = z11;
    }

    static String sourceToString(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 6 ? i11 != 7 ? i11 != 9 ? "SOURCE_INVALID" : "SOURCE_VOICE_UNPROCESSED" : "SOURCE_VOICE_COMMUNICATION" : "SOURCE_VOICE_RECOGNITION" : "SOURCE_VOICE_CALL" : "SOURCE_VOICE_DOWNLINK" : "SOURCE_VOICE_UPLINK" : "SOURCE_MIC";
    }

    private static String streamTypeToString(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        try {
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return useWebRtcBasedAcousticEchoCanceler;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        try {
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return useWebRtcBasedNoiseSuppressor;
    }
}
