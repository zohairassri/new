package aa;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class g extends z9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsReplyProxyBoundaryInterface f461a;

    public g(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f461a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new g(jsReplyProxyBoundaryInterface);
    }

    public static g b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) wg0.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (g) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: aa.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.a(jsReplyProxyBoundaryInterface);
            }
        });
    }
}
