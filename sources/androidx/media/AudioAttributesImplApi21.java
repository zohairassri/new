package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f8604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8605b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AudioAttributes.Builder f8606a = new AudioAttributes.Builder();

        a() {
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b(int i11) {
            this.f8606a.setContentType(i11);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f8605b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object a() {
        return this.f8604a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f8604a.equals(((AudioAttributesImplApi21) obj).f8604a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8604a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f8604a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i11) {
        this.f8604a = audioAttributes;
        this.f8605b = i11;
    }
}
