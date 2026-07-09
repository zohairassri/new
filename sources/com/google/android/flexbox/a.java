package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
interface a {
    void f(View view, int i11, int i12, b bVar);

    int g(int i11, int i12, int i13);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    View h(int i11);

    int j(int i11, int i12, int i13);

    int k(View view);

    void l(b bVar);

    View m(int i11);

    void n(int i11, View view);

    int o(View view, int i11, int i12);

    boolean p();

    void setFlexLines(List list);
}
