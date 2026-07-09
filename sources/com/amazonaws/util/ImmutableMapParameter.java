package com.amazonaws.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class ImmutableMapParameter<K, V> implements Map<K, V> {
    private static final String DUPLICATED_KEY_MESSAGE = "Duplicate keys are provided.";
    private static final String UNMODIFIABLE_MESSAGE = "This is an immutable map.";
    private final Map<K, V> map;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class Builder<K, V> {
        private final Map<K, V> entries = new HashMap();

        public ImmutableMapParameter<K, V> build() {
            HashMap map = new HashMap();
            map.putAll(this.entries);
            return new ImmutableMapParameter<>(map);
        }

        public Builder<K, V> put(K k11, V v11) {
            ImmutableMapParameter.putAndWarnDuplicateKeys(this.entries, k11, v11);
            return this;
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k11, V v11) {
        return new ImmutableMapParameter<>(Collections.singletonMap(k11, v11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void putAndWarnDuplicateKeys(Map<K, V> map, K k11, V v11) {
        if (map.containsKey(k11)) {
            throw new IllegalArgumentException(DUPLICATED_KEY_MESSAGE);
        }
        map.put(k11, v11);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.map.values();
    }

    private ImmutableMapParameter(Map<K, V> map) {
        this.map = map;
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k11, V v11, K k12, V v12) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k11, v11);
        putAndWarnDuplicateKeys(map, k12, v12);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k11, V v11, K k12, V v12, K k13, V v13) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k11, v11);
        putAndWarnDuplicateKeys(map, k12, v12);
        putAndWarnDuplicateKeys(map, k13, v13);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k11, v11);
        putAndWarnDuplicateKeys(map, k12, v12);
        putAndWarnDuplicateKeys(map, k13, v13);
        putAndWarnDuplicateKeys(map, k14, v14);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k11, v11);
        putAndWarnDuplicateKeys(map, k12, v12);
        putAndWarnDuplicateKeys(map, k13, v13);
        putAndWarnDuplicateKeys(map, k14, v14);
        putAndWarnDuplicateKeys(map, k15, v15);
        return new ImmutableMapParameter<>(map);
    }
}
