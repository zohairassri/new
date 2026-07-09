package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f7007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0119a f7008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f7010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f7011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f7012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7013h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum EnumC0119a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0119a enumC0119a, Object obj, boolean z11) {
        this.f7007b = str;
        this.f7008c = enumC0119a;
        this.f7006a = z11;
        k(obj);
    }

    public static HashMap b(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e11);
            } catch (NoSuchMethodException e12) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e12);
            } catch (InvocationTargetException e13) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e13);
            }
        }
        return map2;
    }

    public static void i(Context context, XmlPullParser xmlPullParser, HashMap map) {
        EnumC0119a enumC0119a;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0119a enumC0119a2 = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == f.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == f.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z11 = true;
            } else if (index == f.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0119a2 = EnumC0119a.BOOLEAN_TYPE;
            } else {
                if (index == f.CustomAttribute_customColorValue) {
                    enumC0119a = EnumC0119a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == f.CustomAttribute_customColorDrawableValue) {
                    enumC0119a = EnumC0119a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == f.CustomAttribute_customPixelDimension) {
                    enumC0119a = EnumC0119a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == f.CustomAttribute_customDimension) {
                    enumC0119a = EnumC0119a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.CustomAttribute_customFloatValue) {
                    enumC0119a = EnumC0119a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == f.CustomAttribute_customIntegerValue) {
                    enumC0119a = EnumC0119a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == f.CustomAttribute_customStringValue) {
                    enumC0119a = EnumC0119a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.CustomAttribute_customReference) {
                    enumC0119a = EnumC0119a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0119a2 = enumC0119a;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new a(string, enumC0119a2, objValueOf2, z11));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void j(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            String str2 = aVar.f7006a ? str : "set" + str;
            try {
                int iOrdinal = aVar.f7008c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f7009d));
                        break;
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f7010e));
                        break;
                    case 2:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f7013h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f7013h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f7011f);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f7012g));
                        break;
                    case 6:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f7010e));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f7009d));
                        break;
                }
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e11);
            } catch (NoSuchMethodException e12) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e12);
            } catch (InvocationTargetException e13) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e13);
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f7007b;
        if (this.f7006a) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            int iOrdinal = this.f7008c.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            switch (iOrdinal) {
                case 0:
                case 7:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f7009d));
                    break;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f7010e));
                    break;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f7013h));
                    break;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f7013h);
                    method.invoke(view, colorDrawable);
                    break;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f7011f);
                    break;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f7012g));
                    break;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f7010e));
                    break;
            }
        } catch (IllegalAccessException e11) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e11);
        } catch (NoSuchMethodException e12) {
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e12);
        } catch (InvocationTargetException e13) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e13);
        }
    }

    public String c() {
        return this.f7007b;
    }

    public EnumC0119a d() {
        return this.f7008c;
    }

    public float e() {
        switch (this.f7008c) {
            case INT_TYPE:
                return this.f7009d;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f7010e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f7012g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void f(float[] fArr) {
        switch (this.f7008c) {
            case INT_TYPE:
                fArr[0] = this.f7009d;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f7010e;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i11 = (this.f7013h >> 24) & 255;
                float fPow = (float) Math.pow(((r9 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r9 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r9 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f7012g ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f7010e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int iOrdinal = this.f7008c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int h() {
        int iOrdinal = this.f7008c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void k(Object obj) {
        switch (this.f7008c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f7009d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f7010e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f7013h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f7011f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f7012g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f7010e = ((Float) obj).floatValue();
                break;
        }
    }

    public a(a aVar, Object obj) {
        this.f7006a = false;
        this.f7007b = aVar.f7007b;
        this.f7008c = aVar.f7008c;
        k(obj);
    }
}
