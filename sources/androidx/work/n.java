package androidx.work;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f13544c;

    public n(int i11, Notification notification, int i12) {
        this.f13542a = i11;
        this.f13544c = notification;
        this.f13543b = i12;
    }

    public int a() {
        return this.f13543b;
    }

    public Notification b() {
        return this.f13544c;
    }

    public int c() {
        return this.f13542a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f13542a == nVar.f13542a && this.f13543b == nVar.f13543b) {
            return this.f13544c.equals(nVar.f13544c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f13542a * 31) + this.f13543b) * 31) + this.f13544c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f13542a + ", mForegroundServiceType=" + this.f13543b + ", mNotification=" + this.f13544c + '}';
    }
}
