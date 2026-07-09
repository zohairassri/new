package d5;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import d5.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f89278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f89279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f89280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f89281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f89282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0943a f89283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f89284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected d5.b f89285h;

    /* JADX INFO: renamed from: d5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class C0943a extends ContentObserver {
        C0943a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            a.this.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f89278a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f89278a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z11) {
        e(context, cursor, z11 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // d5.b.a
    public Cursor c() {
        return this.f89280c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i11) {
        if ((i11 & 1) == 1) {
            i11 |= 2;
            this.f89279b = true;
        } else {
            this.f89279b = false;
        }
        boolean z11 = cursor != null;
        this.f89280c = cursor;
        this.f89278a = z11;
        this.f89281d = context;
        this.f89282e = z11 ? cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID) : -1;
        if ((i11 & 2) == 2) {
            this.f89283f = new C0943a();
            this.f89284g = new b();
        } else {
            this.f89283f = null;
            this.f89284g = null;
        }
        if (z11) {
            C0943a c0943a = this.f89283f;
            if (c0943a != null) {
                cursor.registerContentObserver(c0943a);
            }
            DataSetObserver dataSetObserver = this.f89284g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f89278a || (cursor = this.f89280c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f89278a) {
            return null;
        }
        this.f89280c.moveToPosition(i11);
        if (view == null) {
            view = f(this.f89281d, this.f89280c, viewGroup);
        }
        d(view, this.f89281d, this.f89280c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f89285h == null) {
            this.f89285h = new d5.b(this);
        }
        return this.f89285h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        Cursor cursor;
        if (!this.f89278a || (cursor = this.f89280c) == null) {
            return null;
        }
        cursor.moveToPosition(i11);
        return this.f89280c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        Cursor cursor;
        if (this.f89278a && (cursor = this.f89280c) != null && cursor.moveToPosition(i11)) {
            return this.f89280c.getLong(this.f89282e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f89278a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f89280c.moveToPosition(i11)) {
            if (view == null) {
                view = g(this.f89281d, this.f89280c, viewGroup);
            }
            d(view, this.f89281d, this.f89280c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i11);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f89279b || (cursor = this.f89280c) == null || cursor.isClosed()) {
            return;
        }
        this.f89278a = this.f89280c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f89280c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0943a c0943a = this.f89283f;
            if (c0943a != null) {
                cursor2.unregisterContentObserver(c0943a);
            }
            DataSetObserver dataSetObserver = this.f89284g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f89280c = cursor;
        if (cursor == null) {
            this.f89282e = -1;
            this.f89278a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0943a c0943a2 = this.f89283f;
        if (c0943a2 != null) {
            cursor.registerContentObserver(c0943a2);
        }
        DataSetObserver dataSetObserver2 = this.f89284g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f89282e = cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID);
        this.f89278a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
