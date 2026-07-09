package com.theathletic.profile.component;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.profile.component.b, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/theathletic/profile/component/b;", "", "", "firstName", "lastName", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/theathletic/profile/component/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.SUBDOMAIN, QueryKeys.PAGE_LOAD_TIME, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Customer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76021d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    public Customer() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Customer b(Customer customer, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = customer.firstName;
        }
        if ((i11 & 2) != 0) {
            str2 = customer.lastName;
        }
        if ((i11 & 4) != 0) {
            str3 = customer.email;
        }
        return customer.a(str, str2, str3);
    }

    public final Customer a(String firstName, String lastName, String email) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        return new Customer(firstName, lastName, email);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) other;
        return Intrinsics.areEqual(this.firstName, customer.firstName) && Intrinsics.areEqual(this.lastName, customer.lastName) && Intrinsics.areEqual(this.email, customer.email);
    }

    public int hashCode() {
        return (((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode();
    }

    public String toString() {
        return "Customer(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ")";
    }

    public Customer(String firstName, String lastName, String email) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public /* synthetic */ Customer(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3);
    }
}
