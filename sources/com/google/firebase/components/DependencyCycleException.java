package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f46424a;

    public DependencyCycleException(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f46424a = list;
    }
}
