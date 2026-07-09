package un;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f131538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f131539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f131540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f131541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f131542e;

    public i(long j11, long j12) {
        this.f131540c = null;
        this.f131541d = 0;
        this.f131542e = 1;
        this.f131538a = j11;
        this.f131539b = j12;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f131541d = valueAnimator.getRepeatCount();
        iVar.f131542e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f131524b : interpolator instanceof AccelerateInterpolator ? a.f131525c : interpolator instanceof DecelerateInterpolator ? a.f131526d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f131538a;
    }

    public long d() {
        return this.f131539b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f131540c;
        return timeInterpolator != null ? timeInterpolator : a.f131524b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f131541d;
    }

    public int h() {
        return this.f131542e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j11, long j12, TimeInterpolator timeInterpolator) {
        this.f131541d = 0;
        this.f131542e = 1;
        this.f131538a = j11;
        this.f131539b = j12;
        this.f131540c = timeInterpolator;
    }
}
