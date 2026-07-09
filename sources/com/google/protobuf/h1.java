package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f47391a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class a {
        a() {
        }

        abstract int a(CharSequence charSequence, byte[] bArr, int i11, int i12);

        final boolean b(byte[] bArr, int i11, int i12) {
            return c(0, bArr, i11, i12) == 0;
        }

        abstract int c(int i11, byte[] bArr, int i12, int i13);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends a {
        b() {
        }

        private static int d(byte[] bArr, int i11, int i12) {
            while (i11 < i12 && bArr[i11] >= 0) {
                i11++;
            }
            if (i11 >= i12) {
                return 0;
            }
            return e(bArr, i11, i12);
        }

        private static int e(byte[] bArr, int i11, int i12) {
            while (i11 < i12) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i13 >= i12) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            i11 += 2;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b11 >= -16) {
                        if (i13 >= i12 - 2) {
                            return h1.k(bArr, i13, i12);
                        }
                        int i14 = i11 + 2;
                        byte b12 = bArr[i13];
                        if (b12 <= -65 && (((b11 << 28) + (b12 + 112)) >> 30) == 0) {
                            int i15 = i11 + 3;
                            if (bArr[i14] <= -65) {
                                i11 += 4;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i13 >= i12 - 1) {
                        return h1.k(bArr, i13, i12);
                    }
                    int i16 = i11 + 2;
                    byte b13 = bArr[i13];
                    if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                        i11 += 3;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                i11 = i13;
            }
            return 0;
        }

        @Override // com.google.protobuf.h1.a
        int a(CharSequence charSequence, byte[] bArr, int i11, int i12) {
            int i13;
            int i14;
            char cCharAt;
            int length = charSequence.length();
            int i15 = i12 + i11;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i11) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
                bArr[i14] = (byte) cCharAt;
                i16++;
            }
            if (i16 == length) {
                return i11 + length;
            }
            int i17 = i11 + i16;
            while (i16 < length) {
                char cCharAt2 = charSequence.charAt(i16);
                if (cCharAt2 < 128 && i17 < i15) {
                    bArr[i17] = (byte) cCharAt2;
                    i17++;
                } else if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                    i17 += 2;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i17 > i15 - 3) {
                        if (i17 > i15 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                throw new c(i16, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                        }
                        int i19 = i16 + 1;
                        if (i19 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i19);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i21 = i17 + 3;
                                bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 += 4;
                                bArr[i21] = (byte) ((codePoint & 63) | 128);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new c(i16 - 1, length);
                    }
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i22 = i17 + 2;
                    bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i17 += 3;
                    bArr[i22] = (byte) ((cCharAt2 & '?') | 128);
                }
                i16++;
            }
            return i17;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r7[r8] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r7[r8] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r7[r6] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.h1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int c(int r6, byte[] r7, int r8, int r9) {
            /*
                r5 = this;
                if (r6 == 0) goto L86
                if (r8 < r9) goto L5
                return r6
            L5:
                byte r5 = (byte) r6
                r0 = -32
                r1 = -1
                r2 = -65
                if (r5 >= r0) goto L1c
                r6 = -62
                if (r5 < r6) goto L1b
                int r5 = r8 + 1
                r6 = r7[r8]
                if (r6 <= r2) goto L18
                goto L1b
            L18:
                r8 = r5
                goto L86
            L1b:
                return r1
            L1c:
                r3 = -16
                if (r5 >= r3) goto L49
                int r6 = r6 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L34
                int r6 = r8 + 1
                r8 = r7[r8]
                if (r6 < r9) goto L31
                int r5 = com.google.protobuf.h1.a(r5, r8)
                return r5
            L31:
                r4 = r8
                r8 = r6
                r6 = r4
            L34:
                if (r6 > r2) goto L48
                r3 = -96
                if (r5 != r0) goto L3c
                if (r6 < r3) goto L48
            L3c:
                r0 = -19
                if (r5 != r0) goto L42
                if (r6 >= r3) goto L48
            L42:
                int r5 = r8 + 1
                r6 = r7[r8]
                if (r6 <= r2) goto L18
            L48:
                return r1
            L49:
                int r0 = r6 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L5c
                int r6 = r8 + 1
                r0 = r7[r8]
                if (r6 < r9) goto L5a
                int r5 = com.google.protobuf.h1.a(r5, r0)
                return r5
            L5a:
                r8 = 0
                goto L62
            L5c:
                int r6 = r6 >> 16
                byte r6 = (byte) r6
                r4 = r8
                r8 = r6
                r6 = r4
            L62:
                if (r8 != 0) goto L72
                int r8 = r6 + 1
                r6 = r7[r6]
                if (r8 < r9) goto L6f
                int r5 = com.google.protobuf.h1.b(r5, r0, r6)
                return r5
            L6f:
                r4 = r8
                r8 = r6
                r6 = r4
            L72:
                if (r0 > r2) goto L85
                int r5 = r5 << 28
                int r0 = r0 + 112
                int r5 = r5 + r0
                int r5 = r5 >> 30
                if (r5 != 0) goto L85
                if (r8 > r2) goto L85
                int r8 = r6 + 1
                r5 = r7[r6]
                if (r5 <= r2) goto L86
            L85:
                return r1
            L86:
                int r5 = d(r7, r8, r9)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h1.b.c(int, byte[], int, int):int");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c extends IllegalArgumentException {
        c(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class d extends a {
        d() {
        }

        static boolean d() {
            return g1.E() && g1.F();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int e(byte[] r10, long r11, int r13) {
            /*
                int r0 = f(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.protobuf.g1.u(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.protobuf.g1.u(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = g(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.g1.u(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.protobuf.g1.u(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = g(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.g1.u(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.protobuf.g1.u(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.protobuf.g1.u(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h1.d.e(byte[], long, int):int");
        }

        private static int f(byte[] bArr, long j11, int i11) {
            int i12 = 0;
            if (i11 < 16) {
                return 0;
            }
            int i13 = 8 - (((int) j11) & 7);
            while (i12 < i13) {
                long j12 = 1 + j11;
                if (g1.u(bArr, j11) < 0) {
                    return i12;
                }
                i12++;
                j11 = j12;
            }
            while (true) {
                int i14 = i12 + 8;
                if (i14 > i11 || (g1.A(bArr, g1.f47372h + j11) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j11 += 8;
                i12 = i14;
            }
            while (i12 < i11) {
                long j13 = j11 + 1;
                if (g1.u(bArr, j11) < 0) {
                    return i12;
                }
                i12++;
                j11 = j13;
            }
            return i11;
        }

        private static int g(byte[] bArr, int i11, long j11, int i12) {
            if (i12 == 0) {
                return h1.h(i11);
            }
            if (i12 == 1) {
                return h1.i(i11, g1.u(bArr, j11));
            }
            if (i12 == 2) {
                return h1.j(i11, g1.u(bArr, j11), g1.u(bArr, j11 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.h1.a
        int a(CharSequence charSequence, byte[] bArr, int i11, int i12) {
            long j11;
            long j12;
            long j13;
            int i13;
            char cCharAt;
            long j14 = i11;
            long j15 = ((long) i12) + j14;
            int length = charSequence.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i11 + i12));
            }
            int i14 = 0;
            while (true) {
                j11 = 1;
                if (i14 >= length || (cCharAt = charSequence.charAt(i14)) >= 128) {
                    break;
                }
                g1.K(bArr, j14, (byte) cCharAt);
                i14++;
                j14 = 1 + j14;
            }
            if (i14 == length) {
                return (int) j14;
            }
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 < 128 && j14 < j15) {
                    g1.K(bArr, j14, (byte) cCharAt2);
                    j13 = j15;
                    j12 = j11;
                    j14 += j11;
                } else if (cCharAt2 >= 2048 || j14 > j15 - 2) {
                    j12 = j11;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j14 > j15 - 3) {
                        j13 = j15;
                        if (j14 > j13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                throw new c(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j14);
                        }
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char cCharAt3 = charSequence.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                g1.K(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                g1.K(bArr, j14 + j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j16 = j14 + 3;
                                g1.K(bArr, j14 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j14 += 4;
                                g1.K(bArr, j16, (byte) ((codePoint & 63) | 128));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new c(i14 - 1, length);
                    }
                    g1.K(bArr, j14, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j17 = j14 + 2;
                    j13 = j15;
                    g1.K(bArr, j14 + j12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j14 += 3;
                    g1.K(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j12 = j11;
                    long j18 = j14 + j12;
                    g1.K(bArr, j14, (byte) ((cCharAt2 >>> 6) | 960));
                    j14 += 2;
                    g1.K(bArr, j18, (byte) ((cCharAt2 & '?') | 128));
                    j13 = j15;
                }
                i14++;
                j11 = j12;
                j15 = j13;
            }
            return (int) j14;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.g1.u(r11, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.g1.u(r11, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.h1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int c(int r10, byte[] r11, int r12, int r13) {
            /*
                r9 = this;
                r9 = r12 | r13
                int r0 = r11.length
                int r0 = r0 - r13
                r9 = r9 | r0
                if (r9 < 0) goto La8
                long r0 = (long) r12
                long r12 = (long) r13
                if (r10 == 0) goto La1
                int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                if (r9 < 0) goto L10
                return r10
            L10:
                byte r9 = (byte) r10
                r2 = -32
                r3 = -1
                r4 = -65
                r5 = 1
                if (r9 >= r2) goto L2a
                r10 = -62
                if (r9 < r10) goto L29
                long r5 = r5 + r0
                byte r9 = com.google.protobuf.g1.u(r11, r0)
                if (r9 <= r4) goto L26
                goto L29
            L26:
                r0 = r5
                goto La1
            L29:
                return r3
            L2a:
                r7 = -16
                if (r9 >= r7) goto L5e
                int r10 = r10 >> 8
                int r10 = ~r10
                byte r10 = (byte) r10
                if (r10 != 0) goto L44
                long r7 = r0 + r5
                byte r10 = com.google.protobuf.g1.u(r11, r0)
                int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r0 < 0) goto L43
                int r9 = com.google.protobuf.h1.a(r9, r10)
                return r9
            L43:
                r0 = r7
            L44:
                if (r10 > r4) goto L5d
                r7 = -96
                if (r9 != r2) goto L4c
                if (r10 < r7) goto L5d
            L4c:
                r2 = -19
                if (r9 != r2) goto L52
                if (r10 >= r7) goto L5d
            L52:
                long r9 = r0 + r5
                byte r0 = com.google.protobuf.g1.u(r11, r0)
                if (r0 <= r4) goto L5b
                goto L5d
            L5b:
                r0 = r9
                goto La1
            L5d:
                return r3
            L5e:
                int r2 = r10 >> 8
                int r2 = ~r2
                byte r2 = (byte) r2
                if (r2 != 0) goto L76
                long r7 = r0 + r5
                byte r2 = com.google.protobuf.g1.u(r11, r0)
                int r10 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r10 < 0) goto L73
                int r9 = com.google.protobuf.h1.a(r9, r2)
                return r9
            L73:
                r10 = 0
                r0 = r7
                goto L79
            L76:
                int r10 = r10 >> 16
                byte r10 = (byte) r10
            L79:
                if (r10 != 0) goto L8b
                long r7 = r0 + r5
                byte r10 = com.google.protobuf.g1.u(r11, r0)
                int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r9 = com.google.protobuf.h1.b(r9, r2, r10)
                return r9
            L8a:
                r0 = r7
            L8b:
                if (r2 > r4) goto La0
                int r9 = r9 << 28
                int r2 = r2 + 112
                int r9 = r9 + r2
                int r9 = r9 >> 30
                if (r9 != 0) goto La0
                if (r10 > r4) goto La0
                long r9 = r0 + r5
                byte r0 = com.google.protobuf.g1.u(r11, r0)
                if (r0 <= r4) goto L5b
            La0:
                return r3
            La1:
                long r12 = r12 - r0
                int r9 = (int) r12
                int r9 = e(r11, r0, r9)
                return r9
            La8:
                java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException
                int r10 = r11.length
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
                java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r12}
                java.lang.String r11 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r10 = java.lang.String.format(r11, r10)
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h1.d.c(int, byte[], int, int):int");
        }
    }

    static {
        f47391a = (!d.d() || com.google.protobuf.d.c()) ? new b() : new d();
    }

    static int e(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        return f47391a.a(charSequence, bArr, i11, i12);
    }

    static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int iG = length;
        while (true) {
            if (i11 < length) {
                char cCharAt = charSequence.charAt(i11);
                if (cCharAt >= 2048) {
                    iG += g(charSequence, i11);
                    break;
                }
                iG += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                break;
            }
        }
        if (iG >= length) {
            return iG;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iG) + 4294967296L));
    }

    private static int g(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) < 65536) {
                        throw new c(i11, length);
                    }
                    i11++;
                }
            }
            i11++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            return h(b11);
        }
        if (i13 == 1) {
            return i(b11, bArr[i11]);
        }
        if (i13 == 2) {
            return j(b11, bArr[i11], bArr[i11 + 1]);
        }
        throw new AssertionError();
    }

    static boolean l(byte[] bArr) {
        return f47391a.b(bArr, 0, bArr.length);
    }

    static boolean m(byte[] bArr, int i11, int i12) {
        return f47391a.b(bArr, i11, i12);
    }
}
