package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    public static int a(AudioManager audioManager, androidx.media.a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (aVar != null) {
            return a.a(audioManager, aVar.b());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    public static int b(AudioManager audioManager, androidx.media.a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (aVar != null) {
            return a.b(audioManager, aVar.b());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
}
