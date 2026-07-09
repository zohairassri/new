package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes7.dex */
public class AgoraImage {
    public double alpha;
    public int height;
    public String url;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f103971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f103972y;
    public int zOrder;

    public AgoraImage() {
        this.url = null;
        this.f103971x = 0;
        this.f103972y = 0;
        this.width = 0;
        this.height = 0;
        this.zOrder = 0;
        this.alpha = 1.0d;
    }

    public AgoraImage(String str) {
        this.url = str;
        this.f103971x = 0;
        this.f103972y = 0;
        this.width = 0;
        this.height = 0;
        this.zOrder = 0;
        this.alpha = 1.0d;
    }
}
