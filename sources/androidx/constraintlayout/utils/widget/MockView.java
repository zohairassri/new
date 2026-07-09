package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f6836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f6837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f6838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f6841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f6842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6844i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f6846m;

    public MockView(Context context) {
        super(context);
        this.f6836a = new Paint();
        this.f6837b = new Paint();
        this.f6838c = new Paint();
        this.f6839d = true;
        this.f6840e = true;
        this.f6841f = null;
        this.f6842g = new Rect();
        this.f6843h = Color.argb(255, 0, 0, 0);
        this.f6844i = Color.argb(255, 200, 200, 200);
        this.f6845l = Color.argb(255, 50, 50, 50);
        this.f6846m = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == f.MockView_mock_label) {
                    this.f6841f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.MockView_mock_showDiagonals) {
                    this.f6839d = typedArrayObtainStyledAttributes.getBoolean(index, this.f6839d);
                } else if (index == f.MockView_mock_diagonalsColor) {
                    this.f6843h = typedArrayObtainStyledAttributes.getColor(index, this.f6843h);
                } else if (index == f.MockView_mock_labelBackgroundColor) {
                    this.f6845l = typedArrayObtainStyledAttributes.getColor(index, this.f6845l);
                } else if (index == f.MockView_mock_labelColor) {
                    this.f6844i = typedArrayObtainStyledAttributes.getColor(index, this.f6844i);
                } else if (index == f.MockView_mock_showLabel) {
                    this.f6840e = typedArrayObtainStyledAttributes.getBoolean(index, this.f6840e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f6841f == null) {
            try {
                this.f6841f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f6836a.setColor(this.f6843h);
        this.f6836a.setAntiAlias(true);
        this.f6837b.setColor(this.f6844i);
        this.f6837b.setAntiAlias(true);
        this.f6838c.setColor(this.f6845l);
        this.f6846m = Math.round(this.f6846m * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f6839d) {
            width--;
            height--;
            float f11 = width;
            float f12 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f11, f12, this.f6836a);
            canvas2.drawLine(0.0f, f12, f11, 0.0f, this.f6836a);
            canvas2.drawLine(0.0f, 0.0f, f11, 0.0f, this.f6836a);
            canvas2.drawLine(f11, 0.0f, f11, f12, this.f6836a);
            canvas2.drawLine(f11, f12, 0.0f, f12, this.f6836a);
            canvas2.drawLine(0.0f, f12, 0.0f, 0.0f, this.f6836a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f6841f;
        if (str == null || !this.f6840e) {
            return;
        }
        this.f6837b.getTextBounds(str, 0, str.length(), this.f6842g);
        float fWidth = (width - this.f6842g.width()) / 2.0f;
        float fHeight = ((height - this.f6842g.height()) / 2.0f) + this.f6842g.height();
        this.f6842g.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f6842g;
        int i11 = rect.left;
        int i12 = this.f6846m;
        rect.set(i11 - i12, rect.top - i12, rect.right + i12, rect.bottom + i12);
        canvas2.drawRect(this.f6842g, this.f6838c);
        canvas2.drawText(this.f6841f, fWidth, fHeight, this.f6837b);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6836a = new Paint();
        this.f6837b = new Paint();
        this.f6838c = new Paint();
        this.f6839d = true;
        this.f6840e = true;
        this.f6841f = null;
        this.f6842g = new Rect();
        this.f6843h = Color.argb(255, 0, 0, 0);
        this.f6844i = Color.argb(255, 200, 200, 200);
        this.f6845l = Color.argb(255, 50, 50, 50);
        this.f6846m = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6836a = new Paint();
        this.f6837b = new Paint();
        this.f6838c = new Paint();
        this.f6839d = true;
        this.f6840e = true;
        this.f6841f = null;
        this.f6842g = new Rect();
        this.f6843h = Color.argb(255, 0, 0, 0);
        this.f6844i = Color.argb(255, 200, 200, 200);
        this.f6845l = Color.argb(255, 50, 50, 50);
        this.f6846m = 4;
        a(context, attributeSet);
    }
}
