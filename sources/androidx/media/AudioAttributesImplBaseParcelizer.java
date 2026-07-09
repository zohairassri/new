package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f8607a = versionedParcel.p(audioAttributesImplBase.f8607a, 1);
        audioAttributesImplBase.f8608b = versionedParcel.p(audioAttributesImplBase.f8608b, 2);
        audioAttributesImplBase.f8609c = versionedParcel.p(audioAttributesImplBase.f8609c, 3);
        audioAttributesImplBase.f8610d = versionedParcel.p(audioAttributesImplBase.f8610d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f8607a, 1);
        versionedParcel.F(audioAttributesImplBase.f8608b, 2);
        versionedParcel.F(audioAttributesImplBase.f8609c, 3);
        versionedParcel.F(audioAttributesImplBase.f8610d, 4);
    }
}
