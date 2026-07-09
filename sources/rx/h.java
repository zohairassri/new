package rx;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h implements c, i {
    private static final Long NOT_SET = Long.MIN_VALUE;
    private d producer;
    private long requested;
    private final h subscriber;
    private final li0.h subscriptions;

    protected h() {
        this(null, false);
    }

    private void a(long j11) {
        if (this.requested == NOT_SET.longValue()) {
            this.requested = j11;
            return;
        }
        long j12 = this.requested + j11;
        if (j12 < 0) {
            this.requested = LongCompanionObject.MAX_VALUE;
        } else {
            this.requested = j12;
        }
    }

    public final void add(i iVar) {
        this.subscriptions.a(iVar);
    }

    @Override // rx.i
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    protected final void request(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j11);
        }
        synchronized (this) {
            d dVar = this.producer;
            if (dVar != null) {
                dVar.request(j11);
            } else {
                a(j11);
            }
        }
    }

    public void setProducer(d dVar) {
        long j11;
        boolean z11;
        synchronized (this) {
            try {
                j11 = this.requested;
                this.producer = dVar;
                z11 = this.subscriber != null && j11 == NOT_SET.longValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            this.subscriber.setProducer(this.producer);
        } else if (j11 == NOT_SET.longValue()) {
            this.producer.request(LongCompanionObject.MAX_VALUE);
        } else {
            this.producer.request(j11);
        }
    }

    @Override // rx.i
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    protected h(h hVar) {
        this(hVar, true);
    }

    protected h(h hVar, boolean z11) {
        this.requested = NOT_SET.longValue();
        this.subscriber = hVar;
        this.subscriptions = (!z11 || hVar == null) ? new li0.h() : hVar.subscriptions;
    }

    public void onStart() {
    }
}
