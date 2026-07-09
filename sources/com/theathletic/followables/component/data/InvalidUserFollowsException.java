package com.theathletic.followables.component.data;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theathletic/followables/component/data/InvalidUserFollowsException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "<init>", "()V", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class InvalidUserFollowsException extends IllegalArgumentException {
    public InvalidUserFollowsException() {
        super("Unable to retrieve user follows list parameter");
    }
}
