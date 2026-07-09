package org.alfonz.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v4.media.a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class EllipsizingTextView extends TextView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f120659l = Pattern.compile("[\\.,…;\\:\\s]*$", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f120660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f120661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f120662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f120663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f120664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f120665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f120666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f120667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Pattern f120668i;

    public EllipsizingTextView(@NonNull Context context) {
        this(context, null);
    }

    private Layout a(String str) {
        return new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f120666g, this.f120667h, false);
    }

    private void c() {
        boolean z11;
        int iLastIndexOf;
        String str = this.f120664e;
        Layout layoutA = a(str);
        int linesCount = getLinesCount();
        if (layoutA.getLineCount() > linesCount) {
            String strTrim = this.f120664e.substring(0, layoutA.getLineEnd(linesCount - 1)).trim();
            while (true) {
                if (a(strTrim + "…").getLineCount() <= linesCount || (iLastIndexOf = strTrim.lastIndexOf(32)) == -1) {
                    break;
                } else {
                    strTrim = strTrim.substring(0, iLastIndexOf);
                }
            }
            str = this.f120668i.matcher(strTrim).replaceFirst("") + "…";
            z11 = true;
        } else {
            z11 = false;
        }
        if (!str.equals(getText())) {
            this.f120663d = true;
            try {
                setText(str);
            } finally {
                this.f120663d = false;
            }
        }
        this.f120662c = false;
        if (z11 != this.f120661b) {
            this.f120661b = z11;
            Iterator it = this.f120660a.iterator();
            if (it.hasNext()) {
                a.a(it.next());
                throw null;
            }
        }
    }

    private int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / a("").getLineBottom(0);
    }

    private int getLinesCount() {
        if (!b()) {
            return this.f120665f;
        }
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    public boolean b() {
        return this.f120665f == Integer.MAX_VALUE;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.f120665f;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f120662c) {
            c();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (b()) {
            this.f120662c = true;
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        if (this.f120663d) {
            return;
        }
        this.f120664e = charSequence.toString();
        this.f120662c = true;
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.f120668i = pattern;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f11, float f12) {
        this.f120667h = f11;
        this.f120666g = f12;
        super.setLineSpacing(f11, f12);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        super.setMaxLines(i11);
        this.f120665f = i11;
        this.f120662c = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
        if (b()) {
            this.f120662c = true;
        }
    }

    public EllipsizingTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizingTextView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f120660a = new ArrayList();
        this.f120666g = 1.0f;
        this.f120667h = 0.0f;
        super.setEllipsize(null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxLines});
        setMaxLines(typedArrayObtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
        setEndPunctuationPattern(f120659l);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }
}
