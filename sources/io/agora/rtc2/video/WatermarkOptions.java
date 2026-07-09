package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes7.dex */
public class WatermarkOptions {
    public boolean visibleInPreview = true;
    public Rectangle positionInLandscapeMode = new Rectangle();
    public Rectangle positionInPortraitMode = new Rectangle();

    public static class Rectangle {
        public int height;
        public int width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f103975x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f103976y;

        public Rectangle() {
            this.f103975x = 0;
            this.f103976y = 0;
            this.width = 0;
            this.height = 0;
        }

        public Rectangle(int i11, int i12, int i13, int i14) {
            this.f103975x = i11;
            this.f103976y = i12;
            this.width = i13;
            this.height = i14;
        }
    }
}
