package com.theathletic.links.data;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/theathletic/links/data/PendingLinkRepository;", "", "<init>", "()V", "pendingLink", "", "getPendingLink", "setPendingLink", "", "links_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingLinkRepository {
    private String pendingLink;

    public final String getPendingLink() {
        String str = this.pendingLink;
        this.pendingLink = null;
        return str;
    }

    public final void setPendingLink(String pendingLink) {
        this.pendingLink = pendingLink;
    }
}
