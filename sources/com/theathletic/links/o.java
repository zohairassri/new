package com.theathletic.links;

import com.theathletic.links.data.PendingLinkRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/theathletic/links/o;", "", "Lcom/theathletic/links/data/PendingLinkRepository;", "pendingLinkRepository", "<init>", "(Lcom/theathletic/links/data/PendingLinkRepository;)V", "", "pendingLink", "", "a", "(Ljava/lang/String;)V", "Lcom/theathletic/links/data/PendingLinkRepository;", "links_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PendingLinkRepository pendingLinkRepository;

    public o(PendingLinkRepository pendingLinkRepository) {
        Intrinsics.checkNotNullParameter(pendingLinkRepository, "pendingLinkRepository");
        this.pendingLinkRepository = pendingLinkRepository;
    }

    public final void a(String pendingLink) {
        this.pendingLinkRepository.setPendingLink(pendingLink);
    }
}
