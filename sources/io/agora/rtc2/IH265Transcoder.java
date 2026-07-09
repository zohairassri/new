package io.agora.rtc2;

/* JADX INFO: loaded from: classes7.dex */
public interface IH265Transcoder {
    int enableTranscode(String str, String str2, int i11);

    int queryChannel(String str, String str2, int i11);

    int registerTranscoderObserver(IH265TranscoderObserver iH265TranscoderObserver);

    int triggerTranscode(String str, String str2, int i11);

    int unregisterTranscoderObserver(IH265TranscoderObserver iH265TranscoderObserver);
}
