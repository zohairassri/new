package mi;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import io.agora.base.internal.video.FactorBitrateAdjuster;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Pattern f116289p0 = Pattern.compile("[^a-zA-Z0-9_]");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f116290q0 = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Set f116291r0 = N("500-599", "default");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Set f116292s0 = N("400-499", "default");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final String f116293t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final String f116294u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f116295v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f116296w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static Properties f116297x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final a f116298y0;
    private final boolean A;
    private final Set B;
    private final Set C;
    private final boolean D;
    private final String E;
    private final List F;
    private final List G;
    private final Integer H;
    private final Integer I;
    private final String J;
    private final Integer K;
    private final boolean L;
    private final String M;
    private final Integer N;
    private final boolean O;
    private final boolean P;
    private final String Q;
    private final String R;
    private final boolean S;
    private final List T;
    private final boolean U;
    private final Map V;
    private final Map W;
    private final Double X;
    private final Double Y;
    private final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f116299a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final String f116300a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f116301b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Map f116302b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f116303c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final int f116304c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f116305d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final boolean f116306d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f116307e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final int f116308e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f116309f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final String f116310f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f116311g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final int f116312g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f116313h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final String f116314h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f116315i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final String f116316i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f116317j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final int f116318j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f116319k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final String f116320k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f116321l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final String f116322l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f116323m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final int f116324m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f116325n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final int f116326n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f116327o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final int f116328o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f116329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f116330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Set f116331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set f116332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f116333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f116334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f116335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f116336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f116337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Integer f116338y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Integer f116339z;

    /* JADX INFO: renamed from: mi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum EnumC1443a {
        DATADOG,
        B3,
        B3MULTI,
        TRACECONTEXT,
        HAYSTACK
    }

    static {
        EnumC1443a enumC1443a = EnumC1443a.DATADOG;
        f116293t0 = enumC1443a.name();
        f116294u0 = enumC1443a.name();
        f116295v0 = null;
        f116296w0 = null;
        f116298y0 = new a();
    }

    a() {
        f116297x0 = K();
        this.f116299a = UUID.randomUUID().toString();
        this.f116301b = E("site", "datadoghq.com");
        this.f116303c = E("service", E("service.name", "unnamed-java-app"));
        Boolean bool = Boolean.TRUE;
        this.f116305d = d("trace.enabled", bool).booleanValue();
        this.f116307e = d("integrations.enabled", bool).booleanValue();
        this.f116309f = E("writer.type", "DDAgentWriter");
        this.f116311g = E("agent.host", "localhost");
        this.f116313h = j("trace.agent.port", j("agent.port", 8126)).intValue();
        this.f116315i = E("trace.agent.unix.domain.socket", f116290q0);
        this.f116317j = d("priority.sampling", bool).booleanValue();
        this.f116319k = d("trace.resolver.enabled", bool).booleanValue();
        this.f116321l = m("service.mapping", null);
        HashMap map = new HashMap(m("trace.global.tags", null));
        map.putAll(m("tags", null));
        this.f116323m = n(map, "env", "version");
        this.f116325n = m("trace.span.tags", null);
        this.f116327o = m("trace.jmx.tags", null);
        this.f116329p = k("trace.classes.exclude", null);
        this.f116330q = m("trace.header.tags", null);
        this.f116331r = i("http.server.error.statuses", f116291r0);
        this.f116332s = i("http.client.error.statuses", f116292s0);
        Boolean bool2 = Boolean.FALSE;
        this.f116333t = d("http.server.tag.query-string", bool2).booleanValue();
        this.f116334u = d("http.client.tag.query-string", bool2).booleanValue();
        this.f116335v = d("trace.http.client.split-by-domain", bool2).booleanValue();
        this.f116336w = d("trace.db.client.split-by-instance", bool2).booleanValue();
        this.f116337x = Collections.unmodifiableSet(new LinkedHashSet(k("trace.split-by-tags", "")));
        this.f116338y = j("trace.scope.depth.limit", 100);
        this.f116339z = j("trace.partial.flush.min.spans", Integer.valueOf(FactorBitrateAdjuster.FACTOR_BASE));
        this.A = d("trace.runtime.context.field.injection", bool).booleanValue();
        this.B = r("propagation.style.extract", f116293t0);
        this.C = r("propagation.style.inject", f116294u0);
        this.D = d("jmxfetch.enabled", bool).booleanValue();
        this.E = E("jmxfetch.config.dir", null);
        this.F = k("jmxfetch.config", null);
        this.G = k("jmxfetch.metrics-configs", null);
        this.H = j("jmxfetch.check-period", null);
        this.I = j("jmxfetch.refresh-beans-period", null);
        this.J = E("jmxfetch.statsd.host", null);
        this.K = j("jmxfetch.statsd.port", 8125);
        this.L = d("trace.health.metrics.enabled", bool2).booleanValue();
        this.M = E("trace.health.metrics.statsd.host", null);
        this.N = j("trace.health.metrics.statsd.port", null);
        this.O = d("logs.injection", bool2).booleanValue();
        this.P = d("trace.report-hostname", bool2).booleanValue();
        this.Q = E("trace.annotations", f116295v0);
        this.R = E("trace.methods", f116296w0);
        this.S = d("trace.executors.all", bool2).booleanValue();
        this.T = k("trace.executors", "");
        this.U = d("trace.analytics.enabled", bool2).booleanValue();
        this.V = m("trace.sampling.service.rules", null);
        this.W = m("trace.sampling.operation.rules", null);
        this.X = e("trace.sample.rate", null);
        this.Y = e("trace.rate.limit", Double.valueOf(100.0d));
        this.Z = d("profiling.enabled", bool2).booleanValue();
        this.f116300a0 = E("profiling.url", null);
        this.f116302b0 = m("profiling.tags", null);
        this.f116304c0 = j("profiling.start-delay", 10).intValue();
        this.f116306d0 = d("profiling.experimental.start-force-first", bool2).booleanValue();
        this.f116308e0 = j("profiling.upload.period", 60).intValue();
        this.f116310f0 = E("profiling.jfr-template-override-file", null);
        this.f116312g0 = j("profiling.upload.timeout", 30).intValue();
        this.f116314h0 = E("profiling.upload.compression", "on");
        this.f116316i0 = E("profiling.proxy.host", null);
        this.f116318j0 = j("profiling.proxy.port", 8080).intValue();
        this.f116320k0 = E("profiling.proxy.username", null);
        this.f116322l0 = E("profiling.proxy.password", null);
        Integer numValueOf = Integer.valueOf(Constants.MAXIMUM_UPLOAD_PARTS);
        this.f116324m0 = j("profiling.exception.sample.limit", numValueOf).intValue();
        this.f116326n0 = j("profiling.exception.histogram.top-items", 50).intValue();
        this.f116328o0 = j("profiling.exception.histogram.max-collection-size", numValueOf).intValue();
    }

    private Map A() {
        Map mapL = L(2);
        mapL.put("runtime-id", this.f116299a);
        return Collections.unmodifiableMap(mapL);
    }

    public static String E(String str, String str2) {
        String property = System.getProperties().getProperty(S(str));
        return property != null ? property : str2;
    }

    private static Object F(String str, Class cls, Object obj) {
        try {
            return T(E(str, null), cls, obj);
        } catch (NumberFormatException unused) {
            return obj;
        }
    }

    private static Properties K() {
        Properties properties = new Properties();
        String property = System.getProperty(S("trace.config"));
        if (property == null) {
            property = System.getenv(R("trace.config"));
        }
        if (property != null) {
            File file = new File(property.replaceFirst("^~", System.getProperty("user.home")));
            if (file.exists()) {
                try {
                    FileReader fileReader = new FileReader(file);
                    try {
                        properties.load(fileReader);
                        fileReader.close();
                        return properties;
                    } catch (Throwable th2) {
                        try {
                            fileReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException | IOException unused) {
                }
            }
        }
        return properties;
    }

    private static Map L(int i11) {
        return new HashMap(i11 + 1, 1.0f);
    }

    private static Map M(Map map, Properties properties, String... strArr) {
        HashMap map2 = new HashMap(map);
        for (String str : strArr) {
            String property = properties.getProperty(str, null);
            if (property != null) {
                map2.put(str, property);
            }
        }
        return Collections.unmodifiableMap(map2);
    }

    private static Set N(String str, String str2) {
        String strReplaceAll = str.replaceAll("\\s", "");
        if (!strReplaceAll.matches("\\d{3}(?:-\\d{3})?(?:,\\d{3}(?:-\\d{3})?)*")) {
            throw new NumberFormatException();
        }
        String[] strArrSplit = strReplaceAll.split(",", -1);
        HashSet hashSet = new HashSet();
        for (String str3 : strArrSplit) {
            String[] strArrSplit2 = str3.split("-", -1);
            if (strArrSplit2.length == 1) {
                hashSet.add(Integer.valueOf(Integer.parseInt(strArrSplit2[0])));
            } else if (strArrSplit2.length == 2) {
                int i11 = Integer.parseInt(strArrSplit2[0]);
                int i12 = Integer.parseInt(strArrSplit2[1]);
                int iMax = Math.max(i11, i12);
                for (int iMin = Math.min(i11, i12); iMin <= iMax; iMin++) {
                    hashSet.add(Integer.valueOf(iMin));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static List O(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = str.split(",", -1);
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            strArrSplit[i11] = strArrSplit[i11].trim();
        }
        return Collections.unmodifiableList(Arrays.asList(strArrSplit));
    }

    private static Map P(String str, String str2) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        if (!str.matches("(([^,:]+:[^,:]*,)*([^,:]+:[^,:]*),?)?")) {
            return Collections.EMPTY_MAP;
        }
        String[] strArrSplit = str.split(",", -1);
        Map mapL = L(strArrSplit.length);
        for (String str3 : strArrSplit) {
            String[] strArrSplit2 = str3.split(":", -1);
            if (strArrSplit2.length == 2) {
                String strTrim = strArrSplit2[0].trim();
                String strTrim2 = strArrSplit2[1].trim();
                if (strTrim2.length() > 0) {
                    mapL.put(strTrim, strTrim2);
                }
            }
        }
        return Collections.unmodifiableMap(mapL);
    }

    private static Set Q(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : str.split("[,\\s]+")) {
            if (!str2.isEmpty()) {
                linkedHashSet.add(str2);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private static String R(String str) {
        return f116289p0.matcher(S(str).toUpperCase(Locale.US)).replaceAll(QueryKeys.END_MARKER);
    }

    private static String S(String str) {
        return "dd." + str;
    }

    private static Object T(String str, Class cls, Object obj) {
        if (str == null || str.trim().isEmpty()) {
            return obj;
        }
        try {
            return cls.getMethod("valueOf", String.class).invoke(null, str);
        } catch (IllegalAccessException | NoSuchMethodException e11) {
            throw new NumberFormatException(e11.toString());
        } catch (NumberFormatException e12) {
            throw e12;
        } catch (Throwable th2) {
            throw new NumberFormatException(th2.toString());
        }
    }

    private static Set a(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(EnumC1443a.valueOf(((String) it.next()).toUpperCase(Locale.US)));
            } catch (IllegalArgumentException unused) {
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static a b() {
        return f116298y0;
    }

    public static a c(Properties properties) {
        return (properties == null || properties.isEmpty()) ? f116298y0 : new a(properties, f116298y0);
    }

    public static Boolean d(String str, Boolean bool) {
        return (Boolean) F(str, Boolean.class, bool);
    }

    private static Double e(String str, Double d11) {
        return (Double) F(str, Double.class, d11);
    }

    private Map f() {
        return this.f116323m;
    }

    private static String h() {
        String line = System.getProperty("os.name").startsWith("Windows") ? System.getenv("COMPUTERNAME") : System.getenv("HOSTNAME");
        if (line != null && !line.isEmpty()) {
            return line.trim();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("hostname").getInputStream()));
            try {
                line = bufferedReader.readLine();
                bufferedReader.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        if (line != null && !line.isEmpty()) {
            return line.trim();
        }
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException unused2) {
            return null;
        }
    }

    private static Set i(String str, Set set) {
        String strE = E(str, null);
        if (strE == null) {
            return set;
        }
        try {
            return N(strE, str);
        } catch (NumberFormatException unused) {
            return set;
        }
    }

    private static Integer j(String str, Integer num) {
        return (Integer) F(str, Integer.class, num);
    }

    private static List k(String str, String str2) {
        return O(E(str, str2));
    }

    private static Map m(String str, String str2) {
        return P(E(str, str2), S(str));
    }

    private static Map n(Map map, String... strArr) {
        HashMap map2 = new HashMap(map);
        for (String str : strArr) {
            String strE = E(str, null);
            if (strE != null) {
                map2.put(str, strE);
            }
        }
        return Collections.unmodifiableMap(map2);
    }

    private static Set q(Properties properties, String str) {
        String property = properties.getProperty(str);
        if (property == null) {
            return null;
        }
        Set setA = a(Q(property));
        if (setA.isEmpty()) {
            return null;
        }
        return setA;
    }

    private static Set r(String str, String str2) {
        Set setA = a(Q(E(str, str2)));
        return setA.isEmpty() ? a(Q(str2)) : setA;
    }

    private static Boolean u(Properties properties, String str, Boolean bool) {
        return (Boolean) T(properties.getProperty(str), Boolean.class, bool);
    }

    private static Double v(Properties properties, String str, Double d11) {
        return (Double) T(properties.getProperty(str), Double.class, d11);
    }

    private static Set w(Properties properties, String str, Set set) {
        String property = properties.getProperty(str);
        if (property == null) {
            return set;
        }
        try {
            return N(property, str);
        } catch (NumberFormatException unused) {
            return set;
        }
    }

    private static Integer x(Properties properties, String str, Integer num) {
        return (Integer) T(properties.getProperty(str), Integer.class, num);
    }

    private static List y(Properties properties, String str, List list) {
        String property = properties.getProperty(str);
        return (property == null || property.trim().isEmpty()) ? list : O(property);
    }

    private static Map z(Properties properties, String str, Map map) {
        String property = properties.getProperty(str);
        return (property == null || property.trim().isEmpty()) ? map : P(property, str);
    }

    public Integer B() {
        return this.f116338y;
    }

    public Map C() {
        return this.f116321l;
    }

    public String D() {
        return this.f116303c;
    }

    public Set G() {
        return this.f116337x;
    }

    public Double H() {
        return this.X;
    }

    public boolean I() {
        return this.f116317j;
    }

    public boolean J(String str) {
        String str2 = "trace." + str + ".enabled";
        Boolean bool = Boolean.TRUE;
        if (!d(str2, bool).booleanValue()) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("trace.");
        sb2.append(str.toLowerCase(Locale.US));
        sb2.append(".enabled");
        return d(sb2.toString(), bool).booleanValue();
    }

    public Map g() {
        return this.f116330q;
    }

    public Map l() {
        String strH;
        HashMap map = new HashMap(A());
        map.put("language", "jvm");
        if (this.P && (strH = h()) != null && !strH.isEmpty()) {
            map.put("_dd.hostname", strH);
        }
        return Collections.unmodifiableMap(map);
    }

    public Map o() {
        Map mapL = L(f().size() + this.f116325n.size());
        mapL.putAll(f());
        mapL.putAll(this.f116325n);
        return Collections.unmodifiableMap(mapL);
    }

    public Integer p() {
        return this.f116339z;
    }

    public Set s() {
        return this.B;
    }

    public Set t() {
        return this.C;
    }

    public String toString() {
        return "Config{runtimeId='" + this.f116299a + "', site='" + this.f116301b + "', serviceName='" + this.f116303c + "', traceEnabled=" + this.f116305d + ", integrationsEnabled=" + this.f116307e + ", writerType='" + this.f116309f + "', agentHost='" + this.f116311g + "', agentPort=" + this.f116313h + ", agentUnixDomainSocket='" + this.f116315i + "', prioritySamplingEnabled=" + this.f116317j + ", traceResolverEnabled=" + this.f116319k + ", serviceMapping=" + this.f116321l + ", tags=" + this.f116323m + ", spanTags=" + this.f116325n + ", jmxTags=" + this.f116327o + ", excludedClasses=" + this.f116329p + ", headerTags=" + this.f116330q + ", httpServerErrorStatuses=" + this.f116331r + ", httpClientErrorStatuses=" + this.f116332s + ", httpServerTagQueryString=" + this.f116333t + ", httpClientTagQueryString=" + this.f116334u + ", httpClientSplitByDomain=" + this.f116335v + ", dbClientSplitByInstance=" + this.f116336w + ", splitByTags=" + this.f116337x + ", scopeDepthLimit=" + this.f116338y + ", partialFlushMinSpans=" + this.f116339z + ", runtimeContextFieldInjection=" + this.A + ", propagationStylesToExtract=" + this.B + ", propagationStylesToInject=" + this.C + ", jmxFetchEnabled=" + this.D + ", jmxFetchConfigDir='" + this.E + "', jmxFetchConfigs=" + this.F + ", jmxFetchMetricsConfigs=" + this.G + ", jmxFetchCheckPeriod=" + this.H + ", jmxFetchRefreshBeansPeriod=" + this.I + ", jmxFetchStatsdHost='" + this.J + "', jmxFetchStatsdPort=" + this.K + ", healthMetricsEnabled=" + this.L + ", healthMetricsStatsdHost='" + this.M + "', healthMetricsStatsdPort=" + this.N + ", logsInjectionEnabled=" + this.O + ", reportHostName=" + this.P + ", traceAnnotations='" + this.Q + "', traceMethods='" + this.R + "', traceExecutorsAll=" + this.S + ", traceExecutors=" + this.T + ", traceAnalyticsEnabled=" + this.U + ", traceSamplingServiceRules=" + this.V + ", traceSamplingOperationRules=" + this.W + ", traceSampleRate=" + this.X + ", traceRateLimit=" + this.Y + ", profilingEnabled=" + this.Z + ", profilingUrl='" + this.f116300a0 + "', profilingTags=" + this.f116302b0 + ", profilingStartDelay=" + this.f116304c0 + ", profilingStartForceFirst=" + this.f116306d0 + ", profilingUploadPeriod=" + this.f116308e0 + ", profilingTemplateOverrideFile='" + this.f116310f0 + "', profilingUploadTimeout=" + this.f116312g0 + ", profilingUploadCompression='" + this.f116314h0 + "', profilingProxyHost='" + this.f116316i0 + "', profilingProxyPort=" + this.f116318j0 + ", profilingProxyUsername='" + this.f116320k0 + "', profilingProxyPassword='" + this.f116322l0 + "', profilingExceptionSampleLimit=" + this.f116324m0 + ", profilingExceptionHistogramTopItems=" + this.f116326n0 + ", profilingExceptionHistogramMaxCollectionSize=" + this.f116328o0 + '}';
    }

    private a(Properties properties, a aVar) {
        this.f116299a = aVar.f116299a;
        this.f116301b = properties.getProperty("site", aVar.f116301b);
        this.f116303c = properties.getProperty("service", properties.getProperty("service.name", aVar.f116303c));
        this.f116305d = u(properties, "trace.enabled", Boolean.valueOf(aVar.f116305d)).booleanValue();
        this.f116307e = u(properties, "integrations.enabled", Boolean.valueOf(aVar.f116307e)).booleanValue();
        this.f116309f = properties.getProperty("writer.type", aVar.f116309f);
        this.f116311g = properties.getProperty("agent.host", aVar.f116311g);
        this.f116313h = x(properties, "trace.agent.port", x(properties, "agent.port", Integer.valueOf(aVar.f116313h))).intValue();
        this.f116315i = properties.getProperty("trace.agent.unix.domain.socket", aVar.f116315i);
        this.f116317j = u(properties, "priority.sampling", Boolean.valueOf(aVar.f116317j)).booleanValue();
        this.f116319k = u(properties, "trace.resolver.enabled", Boolean.valueOf(aVar.f116319k)).booleanValue();
        this.f116321l = z(properties, "service.mapping", aVar.f116321l);
        HashMap map = new HashMap(z(properties, "trace.global.tags", Collections.EMPTY_MAP));
        map.putAll(z(properties, "tags", aVar.f116323m));
        this.f116323m = M(map, properties, "env", "version");
        this.f116325n = z(properties, "trace.span.tags", aVar.f116325n);
        this.f116327o = z(properties, "trace.jmx.tags", aVar.f116327o);
        this.f116329p = y(properties, "trace.classes.exclude", aVar.f116329p);
        this.f116330q = z(properties, "trace.header.tags", aVar.f116330q);
        this.f116331r = w(properties, "http.server.error.statuses", aVar.f116331r);
        this.f116332s = w(properties, "http.client.error.statuses", aVar.f116332s);
        this.f116333t = u(properties, "http.server.tag.query-string", Boolean.valueOf(aVar.f116333t)).booleanValue();
        this.f116334u = u(properties, "http.client.tag.query-string", Boolean.valueOf(aVar.f116334u)).booleanValue();
        this.f116335v = u(properties, "trace.http.client.split-by-domain", Boolean.valueOf(aVar.f116335v)).booleanValue();
        this.f116336w = u(properties, "trace.db.client.split-by-instance", Boolean.valueOf(aVar.f116336w)).booleanValue();
        this.f116337x = Collections.unmodifiableSet(new LinkedHashSet(y(properties, "trace.split-by-tags", new ArrayList(aVar.f116337x))));
        this.f116338y = x(properties, "trace.scope.depth.limit", aVar.f116338y);
        this.f116339z = x(properties, "trace.partial.flush.min.spans", aVar.f116339z);
        this.A = u(properties, "trace.runtime.context.field.injection", Boolean.valueOf(aVar.A)).booleanValue();
        Set setQ = q(properties, "propagation.style.extract");
        this.B = setQ == null ? aVar.B : setQ;
        Set setQ2 = q(properties, "propagation.style.inject");
        this.C = setQ2 == null ? aVar.C : setQ2;
        this.D = u(properties, "jmxfetch.enabled", Boolean.valueOf(aVar.D)).booleanValue();
        this.E = properties.getProperty("jmxfetch.config.dir", aVar.E);
        this.F = y(properties, "jmxfetch.config", aVar.F);
        this.G = y(properties, "jmxfetch.metrics-configs", aVar.G);
        this.H = x(properties, "jmxfetch.check-period", aVar.H);
        this.I = x(properties, "jmxfetch.refresh-beans-period", aVar.I);
        this.J = properties.getProperty("jmxfetch.statsd.host", aVar.J);
        this.K = x(properties, "jmxfetch.statsd.port", aVar.K);
        Boolean bool = Boolean.FALSE;
        this.L = u(properties, "trace.health.metrics.enabled", bool).booleanValue();
        this.M = properties.getProperty("trace.health.metrics.statsd.host", aVar.M);
        this.N = x(properties, "trace.health.metrics.statsd.port", aVar.N);
        this.O = d("logs.injection", bool).booleanValue();
        this.P = u(properties, "trace.report-hostname", Boolean.valueOf(aVar.P)).booleanValue();
        this.Q = properties.getProperty("trace.annotations", aVar.Q);
        this.R = properties.getProperty("trace.methods", aVar.R);
        this.S = u(properties, "trace.executors.all", Boolean.valueOf(aVar.S)).booleanValue();
        this.T = y(properties, "trace.executors", aVar.T);
        this.U = u(properties, "trace.analytics.enabled", Boolean.valueOf(aVar.U)).booleanValue();
        this.V = z(properties, "trace.sampling.service.rules", aVar.V);
        this.W = z(properties, "trace.sampling.operation.rules", aVar.W);
        this.X = v(properties, "trace.sample.rate", aVar.X);
        this.Y = v(properties, "trace.rate.limit", aVar.Y);
        this.Z = u(properties, "profiling.enabled", Boolean.valueOf(aVar.Z)).booleanValue();
        this.f116300a0 = properties.getProperty("profiling.url", aVar.f116300a0);
        this.f116302b0 = z(properties, "profiling.tags", aVar.f116302b0);
        this.f116304c0 = x(properties, "profiling.start-delay", Integer.valueOf(aVar.f116304c0)).intValue();
        this.f116306d0 = u(properties, "profiling.experimental.start-force-first", Boolean.valueOf(aVar.f116306d0)).booleanValue();
        this.f116308e0 = x(properties, "profiling.upload.period", Integer.valueOf(aVar.f116308e0)).intValue();
        this.f116310f0 = properties.getProperty("profiling.jfr-template-override-file", aVar.f116310f0);
        this.f116312g0 = x(properties, "profiling.upload.timeout", Integer.valueOf(aVar.f116312g0)).intValue();
        this.f116314h0 = properties.getProperty("profiling.upload.compression", aVar.f116314h0);
        this.f116316i0 = properties.getProperty("profiling.proxy.host", aVar.f116316i0);
        this.f116318j0 = x(properties, "profiling.proxy.port", Integer.valueOf(aVar.f116318j0)).intValue();
        this.f116320k0 = properties.getProperty("profiling.proxy.username", aVar.f116320k0);
        this.f116322l0 = properties.getProperty("profiling.proxy.password", aVar.f116322l0);
        this.f116324m0 = x(properties, "profiling.exception.sample.limit", Integer.valueOf(aVar.f116324m0)).intValue();
        this.f116326n0 = x(properties, "profiling.exception.histogram.top-items", Integer.valueOf(aVar.f116326n0)).intValue();
        this.f116328o0 = x(properties, "profiling.exception.histogram.max-collection-size", Integer.valueOf(aVar.f116328o0)).intValue();
    }
}
