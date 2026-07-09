package aa;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class j implements z9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScriptHandlerBoundaryInterface f465a;

    private j(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f465a = scriptHandlerBoundaryInterface;
    }

    public static j a(InvocationHandler invocationHandler) {
        return new j((ScriptHandlerBoundaryInterface) wg0.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
