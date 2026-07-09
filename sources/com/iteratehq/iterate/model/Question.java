package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/iteratehq/iterate/model/Question;", "", "id", "", "prompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPrompt", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "iterate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Question {

    @NotNull
    private final String id;

    @NotNull
    private final String prompt;

    public Question(@NotNull String id2, @NotNull String prompt) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.id = id2;
        this.prompt = prompt;
    }

    public static /* synthetic */ Question copy$default(Question question, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = question.id;
        }
        if ((i11 & 2) != 0) {
            str2 = question.prompt;
        }
        return question.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    @NotNull
    public final Question copy(@NotNull String id2, @NotNull String prompt) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        return new Question(id2, prompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Question)) {
            return false;
        }
        Question question = (Question) other;
        return Intrinsics.areEqual(this.id, question.id) && Intrinsics.areEqual(this.prompt, question.prompt);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getPrompt() {
        return this.prompt;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.prompt.hashCode();
    }

    @NotNull
    public String toString() {
        return "Question(id=" + this.id + ", prompt=" + this.prompt + ")";
    }
}
