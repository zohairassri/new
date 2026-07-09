package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pf0.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Lpf0/f;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ClassBasedDeclarationContainer extends f {
    @NotNull
    Class<?> getJClass();

    @NotNull
    /* synthetic */ Collection getMembers();
}
