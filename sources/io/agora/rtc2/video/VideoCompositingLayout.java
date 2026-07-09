package io.agora.rtc2.video;

import android.graphics.Color;
import io.agora.utils2.internal.Logging;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class VideoCompositingLayout {
    public String backgroundColor;
    public int canvasHeight;
    public int canvasWidth;
    public Region[] regions = null;
    public byte[] appData = null;

    public static class Builder {
        public String appData;
        public Canvas canvas = new Canvas();
        public List<Region> regionsList;

        public Builder addWindow(Region region) {
            if (this.regionsList == null) {
                this.regionsList = new ArrayList();
            }
            this.regionsList.add(region);
            return this;
        }

        public VideoCompositingLayout create() {
            VideoCompositingLayout videoCompositingLayout = new VideoCompositingLayout();
            Canvas canvas = this.canvas;
            videoCompositingLayout.canvasWidth = canvas.width;
            videoCompositingLayout.canvasHeight = canvas.height;
            videoCompositingLayout.backgroundColor = canvas.bgColor;
            List<Region> list = this.regionsList;
            if (list != null && list.size() > 0) {
                List<Region> list2 = this.regionsList;
                videoCompositingLayout.regions = (Region[]) list2.toArray(new Region[list2.size()]);
            }
            String str = this.appData;
            if (str != null) {
                videoCompositingLayout.appData = str.getBytes();
            }
            return videoCompositingLayout;
        }

        public final int regionCount() {
            List<Region> list = this.regionsList;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Builder removeWindowForUid(int i11) {
            if (this.regionsList == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList();
            for (Region region : this.regionsList) {
                if (region.uid == i11) {
                    arrayList.add(region);
                }
            }
            this.regionsList.removeAll(arrayList);
            return this;
        }

        public Builder resetWindows(List<Region> list) {
            this.regionsList = new ArrayList(list);
            return this;
        }

        public Builder setCanvas(int i11, int i12) {
            Canvas canvas = this.canvas;
            canvas.width = i11;
            canvas.height = i12;
            return this;
        }

        public Builder updateAppData(String str) {
            this.appData = str;
            return this;
        }

        public Builder setCanvas(int i11, int i12, String str) {
            if (VideoCompositingLayout.isValidColor(str)) {
                this.canvas.bgColor = str;
            } else {
                Logging.w("VideoCompositingLayout", "unknown color " + str + ", using default bgColor");
            }
            return setCanvas(i11, i12);
        }
    }

    public static class Canvas {
        public int width = 320;
        public int height = 640;
        public String bgColor = "#FF0000";
    }

    public static class Region {
        public double alpha;
        public double height;
        public int renderMode;
        public int uid;
        public String userId;
        public double width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public double f103973x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public double f103974y;
        public int zOrder;

        public Region alpha(double d11) {
            this.alpha = d11;
            return this;
        }

        public Region position(double d11, double d12) {
            this.f103973x = d11;
            this.f103974y = d12;
            return this;
        }

        public Region renderMode(int i11) {
            this.renderMode = i11;
            return this;
        }

        public Region size(double d11, double d12) {
            this.width = d11;
            this.height = d12;
            return this;
        }

        public Region uid(int i11) {
            this.uid = i11;
            return this;
        }

        public Region userId(String str) {
            this.userId = str;
            return this;
        }

        public Region zOrder(int i11) {
            this.zOrder = i11;
            return this;
        }
    }

    public static boolean isValidColor(String str) {
        try {
            Color.parseColor(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
