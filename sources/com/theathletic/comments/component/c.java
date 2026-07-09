package com.theathletic.comments.component;

import kotlin.Metadata;
import p00.Team;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/theathletic/comments/component/c;", "", "<init>", "()V", "", "isTeamSpecificComment", "Lp00/o;", "team", "useLegacy", "", "a", "(ZLp00/o;Z)Ljava/lang/String;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    public final String a(boolean isTeamSpecificComment, Team team, boolean useLegacy) {
        if (!isTeamSpecificComment || team == null) {
            return null;
        }
        return useLegacy ? team.getLegacyId() : team.getId();
    }
}
