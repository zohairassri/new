package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f7151a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7152b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f7153c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SparseArray f7154d = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f7156b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7158d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f7157c = -1;
            this.f7158d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == f.State_android_id) {
                    this.f7155a = typedArrayObtainStyledAttributes.getResourceId(index, this.f7155a);
                } else if (index == f.State_constraints) {
                    this.f7157c = typedArrayObtainStyledAttributes.getResourceId(index, this.f7157c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7157c);
                    context.getResources().getResourceName(this.f7157c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f7158d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f7156b.add(bVar);
        }

        public int b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f7156b.size(); i11++) {
                if (((b) this.f7156b.get(i11)).a(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f7159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f7162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f7164f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f7159a = Float.NaN;
            this.f7160b = Float.NaN;
            this.f7161c = Float.NaN;
            this.f7162d = Float.NaN;
            this.f7163e = -1;
            this.f7164f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == f.Variant_constraints) {
                    this.f7163e = typedArrayObtainStyledAttributes.getResourceId(index, this.f7163e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7163e);
                    context.getResources().getResourceName(this.f7163e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f7164f = true;
                    }
                } else if (index == f.Variant_region_heightLessThan) {
                    this.f7162d = typedArrayObtainStyledAttributes.getDimension(index, this.f7162d);
                } else if (index == f.Variant_region_heightMoreThan) {
                    this.f7160b = typedArrayObtainStyledAttributes.getDimension(index, this.f7160b);
                } else if (index == f.Variant_region_widthLessThan) {
                    this.f7161c = typedArrayObtainStyledAttributes.getDimension(index, this.f7161c);
                } else if (index == f.Variant_region_widthMoreThan) {
                    this.f7159a = typedArrayObtainStyledAttributes.getDimension(index, this.f7159a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f11, float f12) {
            if (!Float.isNaN(this.f7159a) && f11 < this.f7159a) {
                return false;
            }
            if (!Float.isNaN(this.f7160b) && f12 < this.f7160b) {
                return false;
            }
            if (Float.isNaN(this.f7161c) || f11 <= this.f7161c) {
                return Float.isNaN(this.f7162d) || f12 <= this.f7162d;
            }
            return false;
        }
    }

    public h(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == f.StateSet_defaultState) {
                this.f7151a = typedArrayObtainStyledAttributes.getResourceId(index, this.f7151a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xmlPullParser);
                                this.f7154d.put(aVar.f7155a, aVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        } catch (XmlPullParserException e12) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e12);
        }
    }

    public int a(int i11, int i12, float f11, float f12) {
        a aVar = (a) this.f7154d.get(i12);
        if (aVar == null) {
            return i12;
        }
        int i13 = 0;
        if (f11 != -1.0f && f12 != -1.0f) {
            ArrayList arrayList = aVar.f7156b;
            int size = arrayList.size();
            b bVar = null;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                b bVar2 = (b) obj;
                if (bVar2.a(f11, f12)) {
                    if (i11 != bVar2.f7163e) {
                        bVar = bVar2;
                    }
                }
            }
            return bVar != null ? bVar.f7163e : aVar.f7157c;
        }
        if (aVar.f7157c != i11) {
            ArrayList arrayList2 = aVar.f7156b;
            int size2 = arrayList2.size();
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                if (i11 == ((b) obj2).f7163e) {
                }
            }
            return aVar.f7157c;
        }
        return i11;
    }

    public int c(int i11, int i12, int i13) {
        return d(-1, i11, i12, i13);
    }

    public int d(int i11, int i12, float f11, float f12) {
        int iB;
        if (i11 == i12) {
            a aVar = i12 == -1 ? (a) this.f7154d.valueAt(0) : (a) this.f7154d.get(this.f7152b);
            if (aVar == null) {
                return -1;
            }
            return ((this.f7153c == -1 || !((b) aVar.f7156b.get(i11)).a(f11, f12)) && i11 != (iB = aVar.b(f11, f12))) ? iB == -1 ? aVar.f7157c : ((b) aVar.f7156b.get(iB)).f7163e : i11;
        }
        a aVar2 = (a) this.f7154d.get(i12);
        if (aVar2 == null) {
            return -1;
        }
        int iB2 = aVar2.b(f11, f12);
        return iB2 == -1 ? aVar2.f7157c : ((b) aVar2.f7156b.get(iB2)).f7163e;
    }
}
