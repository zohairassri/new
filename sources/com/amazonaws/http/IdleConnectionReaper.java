package com.amazonaws.http;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class IdleConnectionReaper extends Thread {
    private static final int MINUTE_IN_SECONDS = 60;
    private static final int PERIOD_MILLISECONDS = 60000;
    private static IdleConnectionReaper instance;
    private volatile boolean shuttingDown;
    private static final ArrayList<ClientConnectionManager> CONNECTION_MANAGERS = new ArrayList<>();
    static final Log log = LogFactory.getLog(IdleConnectionReaper.class);

    private IdleConnectionReaper() {
        super("java-sdk-http-connection-reaper");
        setDaemon(true);
    }

    private void markShuttingDown() {
        this.shuttingDown = true;
    }

    public static synchronized boolean registerConnectionManager(ClientConnectionManager clientConnectionManager) {
        try {
            if (instance == null) {
                IdleConnectionReaper idleConnectionReaper = new IdleConnectionReaper();
                instance = idleConnectionReaper;
                idleConnectionReaper.start();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return CONNECTION_MANAGERS.add(clientConnectionManager);
    }

    public static synchronized boolean removeConnectionManager(ClientConnectionManager clientConnectionManager) {
        boolean zRemove;
        ArrayList<ClientConnectionManager> arrayList = CONNECTION_MANAGERS;
        zRemove = arrayList.remove(clientConnectionManager);
        if (arrayList.isEmpty()) {
            shutdown();
        }
        return zRemove;
    }

    public static synchronized boolean shutdown() {
        IdleConnectionReaper idleConnectionReaper = instance;
        if (idleConnectionReaper == null) {
            return false;
        }
        idleConnectionReaper.markShuttingDown();
        instance.interrupt();
        CONNECTION_MANAGERS.clear();
        instance = null;
        return true;
    }

    static synchronized int size() {
        return CONNECTION_MANAGERS.size();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        List list;
        while (!this.shuttingDown) {
            try {
                Thread.sleep(60000L);
                synchronized (IdleConnectionReaper.class) {
                    list = (List) CONNECTION_MANAGERS.clone();
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((ClientConnectionManager) it.next()).closeIdleConnections(60L, TimeUnit.SECONDS);
                    } catch (Exception e11) {
                        log.warn("Unable to close idle connections", e11);
                    }
                }
            } catch (Throwable th2) {
                log.debug("Reaper thread: ", th2);
            }
        }
        log.debug("Shutting down reaper thread.");
    }
}
