package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class i extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f44471d = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f44472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44474c;

    public i() {
        Calendar calendarM = t.m();
        this.f44472a = calendarM;
        this.f44473b = calendarM.getMaximum(7);
        this.f44474c = calendarM.getFirstDayOfWeek();
    }

    private int b(int i11) {
        int i12 = i11 + this.f44474c;
        int i13 = this.f44473b;
        return i12 > i13 ? i12 - i13 : i12;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i11) {
        if (i11 >= this.f44473b) {
            return null;
        }
        return Integer.valueOf(b(i11));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44473b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(tn.i.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f44472a.set(7, b(i11));
        textView.setText(this.f44472a.getDisplayName(7, f44471d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(tn.k.mtrl_picker_day_of_week_column_header), this.f44472a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i11) {
        Calendar calendarM = t.m();
        this.f44472a = calendarM;
        this.f44473b = calendarM.getMaximum(7);
        this.f44474c = i11;
    }
}
