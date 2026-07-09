package io.agora.rtc2;

/* JADX INFO: loaded from: classes7.dex */
public interface IVideoEffectObject {

    public enum VIDEO_EFFECT_ACTION {
        SAVE(1),
        RESET(2);

        private final int value;

        VIDEO_EFFECT_ACTION(int i11) {
            this.value = i11;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VIDEO_EFFECT_NODE_ID {
        BEAUTY(1),
        STYLE_MAKEUP(2),
        FILTER(4),
        STICKER(8);

        private final int value;

        VIDEO_EFFECT_NODE_ID(int i11) {
            this.value = i11;
        }

        public int getValue() {
            return this.value;
        }
    }

    int addOrUpdateVideoEffect(int i11, String str);

    boolean getVideoEffectBoolParam(String str, String str2);

    float getVideoEffectFloatParam(String str, String str2);

    int getVideoEffectIntParam(String str, String str2);

    int performVideoEffectAction(int i11, VIDEO_EFFECT_ACTION video_effect_action);

    int removeVideoEffect(int i11);

    int setVideoEffectBoolParam(String str, String str2, boolean z11);

    int setVideoEffectFloatParam(String str, String str2, float f11);

    int setVideoEffectIntParam(String str, String str2, int i11);

    int setVideoEffectStringParam(String str, String str2, String str3);
}
