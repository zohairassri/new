package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class d extends b implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q4.a f115391d;

    public d(Context context, q4.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f115391d = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f115391d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f115391d.addIntentOptions(i11, i12, i13, componentName, intentArr, intent, i14, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i15 = 0; i15 < length; i15++) {
                menuItemArr[i15] = c(menuItemArr2[i15]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f115391d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.f115391d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f115391d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i11) {
        return c(this.f115391d.findItem(i11));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i11) {
        return c(this.f115391d.getItem(i11));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f115391d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return this.f115391d.isShortcutKey(i11, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i11, int i12) {
        return this.f115391d.performIdentifierAction(i11, i12);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        return this.f115391d.performShortcut(i11, keyEvent, i12);
    }

    @Override // android.view.Menu
    public void removeGroup(int i11) {
        f(i11);
        this.f115391d.removeGroup(i11);
    }

    @Override // android.view.Menu
    public void removeItem(int i11) {
        g(i11);
        this.f115391d.removeItem(i11);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        this.f115391d.setGroupCheckable(i11, z11, z12);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i11, boolean z11) {
        this.f115391d.setGroupEnabled(i11, z11);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i11, boolean z11) {
        this.f115391d.setGroupVisible(i11, z11);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f115391d.setQwertyMode(z11);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f115391d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i11) {
        return c(this.f115391d.add(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11) {
        return d(this.f115391d.addSubMenu(i11));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return c(this.f115391d.add(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        return d(this.f115391d.addSubMenu(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, int i14) {
        return c(this.f115391d.add(i11, i12, i13, i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return d(this.f115391d.addSubMenu(i11, i12, i13, i14));
    }
}
