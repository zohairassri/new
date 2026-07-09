package n4;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class i {
    private static a a(a aVar, int i11, int i12, boolean z11, int i13) {
        return aVar != null ? aVar : z11 ? new a(i11, i13, i12) : new a(i11, i12);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, j4.c.GradientColor);
        float fJ = n.j(typedArrayS, xmlPullParser, "startX", j4.c.GradientColor_android_startX, 0.0f);
        float fJ2 = n.j(typedArrayS, xmlPullParser, "startY", j4.c.GradientColor_android_startY, 0.0f);
        float fJ3 = n.j(typedArrayS, xmlPullParser, "endX", j4.c.GradientColor_android_endX, 0.0f);
        float fJ4 = n.j(typedArrayS, xmlPullParser, "endY", j4.c.GradientColor_android_endY, 0.0f);
        float fJ5 = n.j(typedArrayS, xmlPullParser, "centerX", j4.c.GradientColor_android_centerX, 0.0f);
        float fJ6 = n.j(typedArrayS, xmlPullParser, "centerY", j4.c.GradientColor_android_centerY, 0.0f);
        int iK = n.k(typedArrayS, xmlPullParser, "type", j4.c.GradientColor_android_type, 0);
        int iF = n.f(typedArrayS, xmlPullParser, "startColor", j4.c.GradientColor_android_startColor, 0);
        boolean zR = n.r(xmlPullParser, "centerColor");
        int iF2 = n.f(typedArrayS, xmlPullParser, "centerColor", j4.c.GradientColor_android_centerColor, 0);
        int iF3 = n.f(typedArrayS, xmlPullParser, "endColor", j4.c.GradientColor_android_endColor, 0);
        int iK2 = n.k(typedArrayS, xmlPullParser, "tileMode", j4.c.GradientColor_android_tileMode, 0);
        float fJ7 = n.j(typedArrayS, xmlPullParser, "gradientRadius", j4.c.GradientColor_android_gradientRadius, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zR, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f117332a, aVarA.f117333b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f117332a, aVarA.f117333b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f117332a, aVarA.f117333b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new n4.i.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static n4.i.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = j4.c.GradientColorItem
            android.content.res.TypedArray r3 = n4.n.s(r9, r12, r11, r3)
            int r5 = j4.c.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = j4.c.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            n4.i$a r9 = new n4.i$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):n4.i$a");
    }

    private static Shader.TileMode d(int i11) {
        return i11 != 1 ? i11 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f117332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f117333b;

        a(List list, List list2) {
            int size = list.size();
            this.f117332a = new int[size];
            this.f117333b = new float[size];
            for (int i11 = 0; i11 < size; i11++) {
                this.f117332a[i11] = ((Integer) list.get(i11)).intValue();
                this.f117333b[i11] = ((Float) list2.get(i11)).floatValue();
            }
        }

        a(int i11, int i12) {
            this.f117332a = new int[]{i11, i12};
            this.f117333b = new float[]{0.0f, 1.0f};
        }

        a(int i11, int i12, int i13) {
            this.f117332a = new int[]{i11, i12, i13};
            this.f117333b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
