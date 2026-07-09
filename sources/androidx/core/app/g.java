package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f7240a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static HandlerThread f7241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Handler f7242f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseIntArray[] f7244b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f7245c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f7246d = new WindowOnFrameMetricsAvailableListenerC0124a();

        /* JADX INFO: renamed from: androidx.core.app.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class WindowOnFrameMetricsAvailableListenerC0124a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0124a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
                a aVar = a.this;
                if ((aVar.f7243a & 1) != 0) {
                    aVar.e(aVar.f7244b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f7243a & 2) != 0) {
                    aVar2.e(aVar2.f7244b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f7243a & 4) != 0) {
                    aVar3.e(aVar3.f7244b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f7243a & 8) != 0) {
                    aVar4.e(aVar4.f7244b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f7243a & 16) != 0) {
                    aVar5.e(aVar5.f7244b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f7243a & 64) != 0) {
                    aVar6.e(aVar6.f7244b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f7243a & 32) != 0) {
                    aVar7.e(aVar7.f7244b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f7243a & 128) != 0) {
                    aVar8.e(aVar8.f7244b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f7243a & 256) != 0) {
                    aVar9.e(aVar9.f7244b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i11) {
            this.f7243a = i11;
        }

        @Override // androidx.core.app.g.b
        public void a(Activity activity) {
            if (f7241e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f7241e = handlerThread;
                handlerThread.start();
                f7242f = new Handler(f7241e.getLooper());
            }
            for (int i11 = 0; i11 <= 8; i11++) {
                SparseIntArray[] sparseIntArrayArr = this.f7244b;
                if (sparseIntArrayArr[i11] == null && (this.f7243a & (1 << i11)) != 0) {
                    sparseIntArrayArr[i11] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f7246d, f7242f);
            this.f7245c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.g.b
        public SparseIntArray[] b() {
            return this.f7244b;
        }

        @Override // androidx.core.app.g.b
        public SparseIntArray[] c(Activity activity) {
            ArrayList arrayList = this.f7245c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() == activity) {
                    this.f7245c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f7246d);
            return this.f7244b;
        }

        @Override // androidx.core.app.g.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f7244b;
            this.f7244b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        void e(SparseIntArray sparseIntArray, long j11) {
            if (sparseIntArray != null) {
                int i11 = (int) ((500000 + j11) / 1000000);
                if (j11 >= 0) {
                    sparseIntArray.put(i11, sparseIntArray.get(i11) + 1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b {
        b() {
        }

        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();
    }

    public g() {
        this(1);
    }

    public void a(Activity activity) {
        this.f7240a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f7240a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f7240a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f7240a.d();
    }

    public g(int i11) {
        this.f7240a = new a(i11);
    }
}
