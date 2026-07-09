package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class e implements q4.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f1803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f1806e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f1815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f1816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f1817p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f1825x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1827z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1813l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1818q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1819r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1820s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1821t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1822u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f1823v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f1824w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1826y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f1807f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f1808g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1809h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f1810i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f1811j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1812k = true;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f1802a = context;
        this.f1803b = context.getResources();
        g0(true);
    }

    private static int D(int i11) {
        int i12 = ((-65536) & i11) >> 16;
        if (i12 >= 0) {
            int[] iArr = A;
            if (i12 < iArr.length) {
                return (i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i12] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void Q(int i11, boolean z11) {
        if (i11 < 0 || i11 >= this.f1807f.size()) {
            return;
        }
        this.f1807f.remove(i11);
        if (z11) {
            N(true);
        }
    }

    private void b0(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.f1817p = view;
            this.f1815n = null;
            this.f1816o = null;
        } else {
            if (i11 > 0) {
                this.f1815n = resourcesE.getText(i11);
            } else if (charSequence != null) {
                this.f1815n = charSequence;
            }
            if (i12 > 0) {
                this.f1816o = l4.a.e(w(), i12);
            } else if (drawable != null) {
                this.f1816o = drawable;
            }
            this.f1817p = null;
        }
        N(false);
    }

    private g g(int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        return new g(this, i11, i12, i13, i14, charSequence, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f1803b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f1802a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1802a
            boolean r3 = x4.u0.j(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f1805d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.g0(boolean):void");
    }

    private void i(boolean z11) {
        if (this.f1824w.isEmpty()) {
            return;
        }
        i0();
        for (WeakReference weakReference : this.f1824w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f1824w.remove(weakReference);
            } else {
                jVar.i(z11);
            }
        }
        h0();
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f1824w.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.f1824w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f1824w.remove(weakReference);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    jVar.f(parcelable);
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable parcelableH;
        if (this.f1824w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.f1824w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f1824w.remove(weakReference);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelableH = jVar.h()) != null) {
                    sparseArray.put(id2, parcelableH);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean l(m mVar, j jVar) {
        if (this.f1824w.isEmpty()) {
            return false;
        }
        boolean zG = jVar != null ? jVar.g(mVar) : false;
        for (WeakReference weakReference : this.f1824w) {
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f1824w.remove(weakReference);
            } else if (!zG) {
                zG = jVar2.g(mVar);
            }
        }
        return zG;
    }

    private static int p(ArrayList arrayList, int i11) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i11) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f1817p;
    }

    public ArrayList B() {
        t();
        return this.f1811j;
    }

    boolean C() {
        return this.f1821t;
    }

    Resources E() {
        return this.f1803b;
    }

    public ArrayList G() {
        if (!this.f1809h) {
            return this.f1808g;
        }
        this.f1808g.clear();
        int size = this.f1807f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f1807f.get(i11);
            if (gVar.isVisible()) {
                this.f1808g.add(gVar);
            }
        }
        this.f1809h = false;
        this.f1812k = true;
        return this.f1808g;
    }

    public boolean H() {
        return !this.f1818q;
    }

    public boolean I() {
        return this.f1826y;
    }

    boolean J() {
        return this.f1804c;
    }

    public boolean K() {
        return this.f1805d;
    }

    void L(g gVar) {
        this.f1812k = true;
        N(true);
    }

    void M(g gVar) {
        this.f1809h = true;
        N(true);
    }

    public void N(boolean z11) {
        if (this.f1818q) {
            this.f1819r = true;
            if (z11) {
                this.f1820s = true;
                return;
            }
            return;
        }
        if (z11) {
            this.f1809h = true;
            this.f1812k = true;
        }
        i(z11);
    }

    public boolean O(MenuItem menuItem, int i11) {
        return P(menuItem, null, i11);
    }

    public boolean P(MenuItem menuItem, j jVar, int i11) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        x4.b bVarB = gVar.b();
        boolean z11 = bVarB != null && bVarB.a();
        if (gVar.j()) {
            boolean zExpandActionView = gVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!gVar.hasSubMenu() && !z11) {
            if ((i11 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i11 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new m(w(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z11) {
            bVarB.e(mVar);
        }
        boolean zL = l(mVar, jVar) | zK;
        if (!zL) {
            e(true);
        }
        return zL;
    }

    public void R(j jVar) {
        for (WeakReference weakReference : this.f1824w) {
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f1824w.remove(weakReference);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).S(bundle);
            }
        }
        int i12 = bundle.getInt("android:menu:expandedactionview");
        if (i12 <= 0 || (menuItemFindItem = findItem(i12)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(a aVar) {
        this.f1806e = aVar;
    }

    public e X(int i11) {
        this.f1813l = i11;
        return this;
    }

    void Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1807f.size();
        i0();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f1807f.get(i11);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        h0();
    }

    protected e Z(int i11) {
        b0(0, null, i11, null, null);
        return this;
    }

    protected MenuItem a(int i11, int i12, int i13, CharSequence charSequence) {
        int iD = D(i13);
        g gVarG = g(i11, i12, i13, iD, charSequence, this.f1813l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1814m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f1807f;
        arrayList.add(p(arrayList, iD), gVarG);
        N(true);
        return gVarG;
    }

    protected e a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        PackageManager packageManager = this.f1802a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i16 = 0; i16 < size; i16++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i17 < 0 ? intent : intentArr[i17]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i11, i12, i13, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f1802a);
    }

    public void c(j jVar, Context context) {
        this.f1824w.add(new WeakReference(jVar));
        jVar.l(context, this);
        this.f1812k = true;
    }

    protected e c0(int i11) {
        b0(i11, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f1825x;
        if (gVar != null) {
            f(gVar);
        }
        this.f1807f.clear();
        N(true);
    }

    public void clearHeader() {
        this.f1816o = null;
        this.f1815n = null;
        this.f1817p = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1806e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    protected e d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    public final void e(boolean z11) {
        if (this.f1822u) {
            return;
        }
        this.f1822u = true;
        for (WeakReference weakReference : this.f1824w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f1824w.remove(weakReference);
            } else {
                jVar.c(this, z11);
            }
        }
        this.f1822u = false;
    }

    protected e e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    public boolean f(g gVar) {
        boolean zK = false;
        if (!this.f1824w.isEmpty() && this.f1825x == gVar) {
            i0();
            for (WeakReference weakReference : this.f1824w) {
                j jVar = (j) weakReference.get();
                if (jVar != null) {
                    zK = jVar.k(this, gVar);
                    if (zK) {
                        break;
                    }
                } else {
                    this.f1824w.remove(weakReference);
                }
            }
            h0();
            if (zK) {
                this.f1825x = null;
            }
        }
        return zK;
    }

    public void f0(boolean z11) {
        this.f1827z = z11;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i11) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = (g) this.f1807f.get(i12);
            if (gVar.getItemId() == i11) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i11)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i11) {
        return (MenuItem) this.f1807f.get(i11);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f1806e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void h0() {
        this.f1818q = false;
        if (this.f1819r) {
            this.f1819r = false;
            N(this.f1820s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1827z) {
            return true;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f1807f.get(i11)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i0() {
        if (this.f1818q) {
            return;
        }
        this.f1818q = true;
        this.f1819r = false;
        this.f1820s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return r(i11, keyEvent) != null;
    }

    public boolean m(g gVar) {
        boolean zD = false;
        if (this.f1824w.isEmpty()) {
            return false;
        }
        i0();
        for (WeakReference weakReference : this.f1824w) {
            j jVar = (j) weakReference.get();
            if (jVar != null) {
                zD = jVar.d(this, gVar);
                if (zD) {
                    break;
                }
            } else {
                this.f1824w.remove(weakReference);
            }
        }
        h0();
        if (zD) {
            this.f1825x = gVar;
        }
        return zD;
    }

    public int n(int i11) {
        return o(i11, 0);
    }

    public int o(int i11, int i12) {
        int size = size();
        if (i12 < 0) {
            i12 = 0;
        }
        while (i12 < size) {
            if (((g) this.f1807f.get(i12)).getGroupId() == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i11, int i12) {
        return O(findItem(i11), i12);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        g gVarR = r(i11, keyEvent);
        boolean zO = gVarR != null ? O(gVarR, i12) : false;
        if ((i12 & 2) != 0) {
            e(true);
        }
        return zO;
    }

    public int q(int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((g) this.f1807f.get(i12)).getItemId() == i11) {
                return i12;
            }
        }
        return -1;
    }

    g r(int i11, KeyEvent keyEvent) {
        ArrayList arrayList = this.f1823v;
        arrayList.clear();
        s(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean zJ = J();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = (g) arrayList.get(i12);
            char alphabeticShortcut = zJ ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i11 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i11) {
        int iN = n(i11);
        if (iN >= 0) {
            int size = this.f1807f.size() - iN;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size || ((g) this.f1807f.get(iN)).getGroupId() != i11) {
                    break;
                }
                Q(iN, false);
                i12 = i13;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i11) {
        Q(q(i11), true);
    }

    void s(List list, int i11, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i11 == 67) {
            int size = this.f1807f.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) this.f1807f.get(i12);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).s(list, i11, keyEvent);
                }
                char alphabeticShortcut = zJ ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zJ ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && i11 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        int size = this.f1807f.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = (g) this.f1807f.get(i12);
            if (gVar.getGroupId() == i11) {
                gVar.t(z12);
                gVar.setCheckable(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.f1826y = z11;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i11, boolean z11) {
        int size = this.f1807f.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = (g) this.f1807f.get(i12);
            if (gVar.getGroupId() == i11) {
                gVar.setEnabled(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i11, boolean z11) {
        int size = this.f1807f.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = (g) this.f1807f.get(i12);
            if (gVar.getGroupId() == i11 && gVar.y(z11)) {
                z12 = true;
            }
        }
        if (z12) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f1804c = z11;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1807f.size();
    }

    public void t() {
        ArrayList arrayListG = G();
        if (this.f1812k) {
            boolean zJ = false;
            for (WeakReference weakReference : this.f1824w) {
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f1824w.remove(weakReference);
                } else {
                    zJ |= jVar.j();
                }
            }
            if (zJ) {
                this.f1810i.clear();
                this.f1811j.clear();
                int size = arrayListG.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g gVar = (g) arrayListG.get(i11);
                    if (gVar.l()) {
                        this.f1810i.add(gVar);
                    } else {
                        this.f1811j.add(gVar);
                    }
                }
            } else {
                this.f1810i.clear();
                this.f1811j.clear();
                this.f1811j.addAll(G());
            }
            this.f1812k = false;
        }
    }

    public ArrayList u() {
        t();
        return this.f1810i;
    }

    protected String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f1802a;
    }

    public g x() {
        return this.f1825x;
    }

    public Drawable y() {
        return this.f1816o;
    }

    public CharSequence z() {
        return this.f1815n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11) {
        return a(0, 0, 0, this.f1803b.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, this.f1803b.getString(i11));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return a(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        g gVar = (g) a(i11, i12, i13, charSequence);
        m mVar = new m(this.f1802a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, int i14) {
        return a(i11, i12, i13, this.f1803b.getString(i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, this.f1803b.getString(i14));
    }

    public e F() {
        return this;
    }
}
