package com.comscore.util.cpp;

import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class CppJavaBinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19460a = 0;

    static {
        Setup.setUp();
    }

    protected abstract void destroyCppObject();

    protected void finalize() throws Throwable {
        super.finalize();
        destroyCppObject();
    }

    protected int getExceptionCounter() {
        return this.f19460a;
    }

    protected void printException(Throwable th2) {
        Logger.e("Error using the native library: ", th2);
        this.f19460a++;
    }
}
