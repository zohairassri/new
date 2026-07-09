package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f7340a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7341b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private u(Context context) {
        this.f7341b = context;
    }

    public static u i(Context context) {
        return new u(context);
    }

    public u a(Intent intent) {
        this.f7340a.add(intent);
        return this;
    }

    public u b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f7341b.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u d(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = i.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f7341b.getPackageManager());
            }
            e(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public u e(ComponentName componentName) {
        int size = this.f7340a.size();
        try {
            Intent intentB = i.b(this.f7341b, componentName);
            while (intentB != null) {
                this.f7340a.add(size, intentB);
                intentB = i.b(this.f7341b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f7340a.iterator();
    }

    public Intent j(int i11) {
        return (Intent) this.f7340a.get(i11);
    }

    public int l() {
        return this.f7340a.size();
    }

    public void m() {
        p(null);
    }

    public void p(Bundle bundle) {
        if (this.f7340a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f7340a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (l4.a.n(this.f7341b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f7341b.startActivity(intent);
    }
}
