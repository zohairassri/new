package g5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.databinding.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f98156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m.a f98157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f98158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f98159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f98160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f98161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LayoutInflater f98162g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends m.a {
        a() {
        }

        @Override // androidx.databinding.m.a
        public void d(m mVar) {
            g.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.m.a
        public void e(m mVar, int i11, int i12) {
            g.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.m.a
        public void f(m mVar, int i11, int i12) {
            g.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.m.a
        public void g(m mVar, int i11, int i12, int i13) {
            g.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.m.a
        public void h(m mVar, int i11, int i12) {
            g.this.notifyDataSetChanged();
        }
    }

    public g(Context context, List list, int i11, int i12, int i13) {
        this.f98158c = context;
        this.f98160e = i11;
        this.f98159d = i12;
        this.f98161f = i13;
        this.f98162g = i11 == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        b(list);
    }

    public View a(int i11, int i12, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i11 == 0 ? new TextView(this.f98158c) : this.f98162g.inflate(i11, viewGroup, false);
        }
        int i13 = this.f98161f;
        TextView textView = (TextView) (i13 == 0 ? view : view.findViewById(i13));
        Object obj = this.f98156a.get(i12);
        textView.setText(obj instanceof CharSequence ? (CharSequence) obj : String.valueOf(obj));
        return view;
    }

    public void b(List list) {
        List list2 = this.f98156a;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof m) {
            ((m) list2).J(this.f98157b);
        }
        this.f98156a = list;
        if (list instanceof m) {
            if (this.f98157b == null) {
                this.f98157b = new a();
            }
            ((m) this.f98156a).Q1(this.f98157b);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f98156a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        return a(this.f98159d, i11, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f98156a.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        return a(this.f98160e, i11, view, viewGroup);
    }
}
