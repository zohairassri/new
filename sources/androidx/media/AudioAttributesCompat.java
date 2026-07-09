package androidx.media;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements x9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f8599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f8600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f8601d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f8602a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AudioAttributesImpl.a f8603a;

        public a() {
            if (AudioAttributesCompat.f8600c) {
                this.f8603a = new AudioAttributesImplBase.a();
            } else {
                this.f8603a = new AudioAttributesImplApi26.a();
            }
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f8603a.build());
        }

        public a b(int i11) {
            this.f8603a.b(i11);
            return this;
        }

        public a c(int i11) {
            this.f8603a.a(i11);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8599b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f8601d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    static int b(boolean z11, int i11, int i12) {
        if ((i11 & 1) == 1) {
            return z11 ? 1 : 7;
        }
        if ((i11 & 4) == 4) {
            return z11 ? 0 : 6;
        }
        switch (i12) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z11 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z11) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i12 + " in audio attributes");
        }
    }

    static String d(int i11) {
        switch (i11) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i11;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static AudioAttributesCompat e(Object obj) {
        if (f8600c) {
            return null;
        }
        return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
    }

    public Object c() {
        return this.f8602a.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f8602a;
        return audioAttributesImpl == null ? audioAttributesCompat.f8602a == null : audioAttributesImpl.equals(audioAttributesCompat.f8602a);
    }

    public int hashCode() {
        return this.f8602a.hashCode();
    }

    public String toString() {
        return this.f8602a.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f8602a = audioAttributesImpl;
    }
}
