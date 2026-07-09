package io.agora.rtc2.internal;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class Marshallable {
    public static final int PROTO_PACKET_SIZE = 8192;
    private ByteBuffer mBuffer;

    public Marshallable() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(PROTO_PACKET_SIZE);
        this.mBuffer = byteBufferAllocate;
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        this.mBuffer.position(2);
    }

    public void clear() {
        this.mBuffer.position(10);
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public void marshall(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public byte[] popAll() {
        byte[] bArr = new byte[this.mBuffer.remaining()];
        this.mBuffer.get(bArr);
        return bArr;
    }

    public Boolean popBool() {
        return Boolean.valueOf(this.mBuffer.get() == 1);
    }

    public byte popByte() {
        return this.mBuffer.get();
    }

    public byte[] popBytes() {
        int i11 = this.mBuffer.getShort();
        byte[] bArr = new byte[0];
        if (i11 <= 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        this.mBuffer.get(bArr2);
        return bArr2;
    }

    public byte[] popBytes32() {
        int i11 = this.mBuffer.getInt();
        if (i11 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i11];
        this.mBuffer.get(bArr);
        return bArr;
    }

    public double popDouble() {
        return this.mBuffer.getDouble();
    }

    public int popInt() {
        return this.mBuffer.getInt();
    }

    public long popInt64() {
        return this.mBuffer.getLong();
    }

    public int[] popIntArray() {
        int iPopInt = popInt();
        int[] iArr = new int[iPopInt];
        for (int i11 = 0; i11 < iPopInt; i11++) {
            iArr[i11] = popInt();
        }
        return iArr;
    }

    public short popShort() {
        return this.mBuffer.getShort();
    }

    public short[] popShortArray() {
        int iPopInt = popInt();
        short[] sArr = new short[iPopInt];
        for (int i11 = 0; i11 < iPopInt; i11++) {
            sArr[i11] = popShort();
        }
        return sArr;
    }

    public String popString16() {
        int i11 = this.mBuffer.getShort();
        if (i11 <= 0) {
            return "";
        }
        byte[] bArr = new byte[i11];
        this.mBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public String popString16UTF8() {
        int i11 = this.mBuffer.getShort();
        if (i11 <= 0) {
            return "";
        }
        byte[] bArr = new byte[i11];
        this.mBuffer.get(bArr);
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public void pushBool(Boolean bool) {
        this.mBuffer.put(bool.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public void pushByte(byte b11) {
        this.mBuffer.put(b11);
    }

    public void pushBytes(byte[] bArr) {
        this.mBuffer.putShort((short) bArr.length);
        this.mBuffer.put(bArr);
    }

    public void pushBytes32(byte[] bArr) {
        this.mBuffer.putInt(bArr.length);
        this.mBuffer.put(bArr);
    }

    public void pushDouble(double d11) {
        this.mBuffer.putDouble(d11);
    }

    public void pushInt(int i11) {
        this.mBuffer.putInt(i11);
    }

    public void pushInt64(long j11) {
        this.mBuffer.putLong(j11);
    }

    public void pushIntArray(int[] iArr) {
        if (iArr == null) {
            pushInt(0);
            return;
        }
        pushInt(iArr.length);
        for (int i11 : iArr) {
            pushInt(i11);
        }
    }

    public void pushShort(short s11) {
        this.mBuffer.putShort(s11);
    }

    public void pushShortArray(short[] sArr) {
        if (sArr == null) {
            pushInt(0);
            return;
        }
        pushInt(sArr.length);
        for (short s11 : sArr) {
            pushShort(s11);
        }
    }

    public void pushString16(String str) {
        if (str == null) {
            this.mBuffer.putShort((short) 0);
            return;
        }
        this.mBuffer.putShort((short) str.getBytes().length);
        if (str.getBytes().length > 0) {
            this.mBuffer.put(str.getBytes());
        }
    }

    public void pushStringArray(ArrayList<String> arrayList) {
        if (arrayList == null) {
            pushInt(0);
            return;
        }
        int size = arrayList.size();
        pushShort((short) size);
        for (int i11 = 0; i11 < size; i11++) {
            pushBytes(arrayList.get(i11).getBytes());
        }
    }

    public void unmarshall(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] marshall() {
        int iPosition = (short) this.mBuffer.position();
        this.mBuffer.putShort(0, iPosition);
        byte[] bArr = new byte[iPosition];
        this.mBuffer.position(0);
        this.mBuffer.get(bArr);
        return bArr;
    }

    public void pushIntArray(Integer[] numArr) {
        if (numArr == null) {
            pushInt(0);
            return;
        }
        pushInt(numArr.length);
        for (Integer num : numArr) {
            pushInt(num.intValue());
        }
    }

    public void unmarshall(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.mBuffer = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        popShort();
    }
}
