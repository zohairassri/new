package d4;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HashMap f89157a = new HashMap();

    public float a(Object obj, String str, int i11) {
        HashMap map;
        float[] fArr;
        if (this.f89157a.containsKey(obj) && (map = (HashMap) this.f89157a.get(obj)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > i11) {
            return fArr[i11];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i11, float f11) {
        if (!this.f89157a.containsKey(obj)) {
            HashMap map = new HashMap();
            float[] fArr = new float[i11 + 1];
            fArr[i11] = f11;
            map.put(str, fArr);
            this.f89157a.put(obj, map);
            return;
        }
        HashMap map2 = (HashMap) this.f89157a.get(obj);
        if (map2 == null) {
            map2 = new HashMap();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i11 + 1];
            fArr2[i11] = f11;
            map2.put(str, fArr2);
            this.f89157a.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = (float[]) map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i11) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i11 + 1);
        }
        fArrCopyOf[i11] = f11;
        map2.put(str, fArrCopyOf);
    }
}
