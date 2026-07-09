package com.theathletic.article.component.data;

import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0012\u0010\f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/theathletic/article/component/data/WebAsset;", "", "<init>", "()V", Constants.URL_ENCODING, "", "getUrl", "()Ljava/lang/String;", "contentType", "getContentType", "mime", "getMime", "encoding", "getEncoding", "Css", "Javascript", "Font", "Image", "Lcom/theathletic/article/component/data/WebAsset$Css;", "Lcom/theathletic/article/component/data/WebAsset$Font;", "Lcom/theathletic/article/component/data/WebAsset$Image;", "Lcom/theathletic/article/component/data/WebAsset$Javascript;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WebAsset {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/theathletic/article/component/data/WebAsset$Css;", "Lcom/theathletic/article/component/data/WebAsset;", Constants.URL_ENCODING, "", "text", "contentType", "mime", "encoding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "getContentType", "getMime", "getEncoding", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Css extends WebAsset {

        @NotNull
        private final String contentType;

        @NotNull
        private final String encoding;

        @NotNull
        private final String mime;
        private final String text;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Css(@NotNull String url, String str, @NotNull String contentType, @NotNull String mime, @NotNull String encoding) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(mime, "mime");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            this.url = url;
            this.text = str;
            this.contentType = contentType;
            this.mime = mime;
            this.encoding = encoding;
        }

        public static /* synthetic */ Css copy$default(Css css, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = css.url;
            }
            if ((i11 & 2) != 0) {
                str2 = css.text;
            }
            if ((i11 & 4) != 0) {
                str3 = css.contentType;
            }
            if ((i11 & 8) != 0) {
                str4 = css.mime;
            }
            if ((i11 & 16) != 0) {
                str5 = css.encoding;
            }
            String str6 = str5;
            String str7 = str3;
            return css.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMime() {
            return this.mime;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEncoding() {
            return this.encoding;
        }

        @NotNull
        public final Css copy(@NotNull String url, String text, @NotNull String contentType, @NotNull String mime, @NotNull String encoding) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(mime, "mime");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            return new Css(url, text, contentType, mime, encoding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Css)) {
                return false;
            }
            Css css = (Css) other;
            return Intrinsics.areEqual(this.url, css.url) && Intrinsics.areEqual(this.text, css.text) && Intrinsics.areEqual(this.contentType, css.contentType) && Intrinsics.areEqual(this.mime, css.mime) && Intrinsics.areEqual(this.encoding, css.encoding);
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getContentType() {
            return this.contentType;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getEncoding() {
            return this.encoding;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getMime() {
            return this.mime;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            String str = this.text;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contentType.hashCode()) * 31) + this.mime.hashCode()) * 31) + this.encoding.hashCode();
        }

        @NotNull
        public String toString() {
            return "Css(url=" + this.url + ", text=" + this.text + ", contentType=" + this.contentType + ", mime=" + this.mime + ", encoding=" + this.encoding + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/theathletic/article/component/data/WebAsset$Font;", "Lcom/theathletic/article/component/data/WebAsset;", Constants.URL_ENCODING, "", "bytes", "", "contentType", "mime", "encoding", "<init>", "(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getBytes", "()[B", "getContentType", "getMime", "getEncoding", "equals", "", "other", "", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Font extends WebAsset {
        private final byte[] bytes;

        @NotNull
        private final String contentType;

        @NotNull
        private final String encoding;

        @NotNull
        private final String mime;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Font(@NotNull String url, byte[] bArr, @NotNull String contentType, @NotNull String mime, @NotNull String encoding) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(mime, "mime");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            this.url = url;
            this.bytes = bArr;
            this.contentType = contentType;
            this.mime = mime;
            this.encoding = encoding;
        }

        public static /* synthetic */ Font copy$default(Font font, String str, byte[] bArr, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = font.url;
            }
            if ((i11 & 2) != 0) {
                bArr = font.bytes;
            }
            if ((i11 & 4) != 0) {
                str2 = font.contentType;
            }
            if ((i11 & 8) != 0) {
                str3 = font.mime;
            }
            if ((i11 & 16) != 0) {
                str4 = font.encoding;
            }
            String str5 = str4;
            String str6 = str2;
            return font.copy(str, bArr, str6, str3, str5);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final byte[] getBytes() {
            return this.bytes;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMime() {
            return this.mime;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEncoding() {
            return this.encoding;
        }

        @NotNull
        public final Font copy(@NotNull String url, byte[] bytes, @NotNull String contentType, @NotNull String mime, @NotNull String encoding) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(mime, "mime");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            return new Font(url, bytes, contentType, mime, encoding);
        }

        public boolean equals(Object other) {
            return (other instanceof WebAsset) && Intrinsics.areEqual(getUrl(), ((WebAsset) other).getUrl());
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getContentType() {
            return this.contentType;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getEncoding() {
            return this.encoding;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getMime() {
            return this.mime;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return getUrl().hashCode();
        }

        @NotNull
        public String toString() {
            return "Font(url=" + this.url + ", bytes=" + Arrays.toString(this.bytes) + ", contentType=" + this.contentType + ", mime=" + this.mime + ", encoding=" + this.encoding + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/theathletic/article/component/data/WebAsset$Image;", "Lcom/theathletic/article/component/data/WebAsset;", Constants.URL_ENCODING, "", "bytes", "", "contentType", "mime", "encoding", "<init>", "(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getBytes", "()[B", "getContentType", "getMime", "getEncoding", "equals", "", "other", "", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image extends WebAsset {
        private final byte[] bytes;

        @NotNull
        private final String contentType;

        @NotNull
        private final String encoding;

        @NotNull
        private final String mime;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(@NotNull String url, byte[] bArr, @NotNull String contentType, @NotNull String mime, @NotNull String encoding) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(mime, "mime");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            this.url = url;
            this.bytes = bArr;
            this.contentType = contentType;
            this.mime = mime;
            this.encoding = encoding;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, byte[] bArr, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.url;
            }
            if ((i11 & 2) != 0) {
                bArr = image.bytes;
            }
            if ((i11 & 4) != 0) {
                str2 = image.contentType;
            }
            if ((i11 & 8) != 0) {
                str3 = image.mime;
            }
            if ((i11 & 16) != 0) {
                str4 = image.encoding;
            }
            String str5 = str4;
            String str6 = str2;
            return image.copy(str, bArr, str6, str3, str5);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final byte[] getBytes() {
            return this.bytes;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMime() {
            return this.mime;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEncoding() {
            return this.encoding;
        }

        @NotNull
        public final Image copy(@NotNull String url, byte[] bytes, @NotNull String contentType, @NotNull String mime, @NotNull String encoding) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(mime, "mime");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            return new Image(url, bytes, contentType, mime, encoding);
        }

        public boolean equals(Object other) {
            return (other instanceof WebAsset) && Intrinsics.areEqual(getUrl(), ((WebAsset) other).getUrl());
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getContentType() {
            return this.contentType;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getEncoding() {
            return this.encoding;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getMime() {
            return this.mime;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return getUrl().hashCode();
        }

        @NotNull
        public String toString() {
            return "Image(url=" + this.url + ", bytes=" + Arrays.toString(this.bytes) + ", contentType=" + this.contentType + ", mime=" + this.mime + ", encoding=" + this.encoding + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/theathletic/article/component/data/WebAsset$Javascript;", "Lcom/theathletic/article/component/data/WebAsset;", Constants.URL_ENCODING, "", "text", "contentType", "mime", "encoding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "getContentType", "getMime", "getEncoding", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Javascript extends WebAsset {

        @NotNull
        private final String contentType;

        @NotNull
        private final String encoding;

        @NotNull
        private final String mime;
        private final String text;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Javascript(@NotNull String url, String str, @NotNull String contentType, @NotNull String mime, @NotNull String encoding) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(mime, "mime");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            this.url = url;
            this.text = str;
            this.contentType = contentType;
            this.mime = mime;
            this.encoding = encoding;
        }

        public static /* synthetic */ Javascript copy$default(Javascript javascript, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = javascript.url;
            }
            if ((i11 & 2) != 0) {
                str2 = javascript.text;
            }
            if ((i11 & 4) != 0) {
                str3 = javascript.contentType;
            }
            if ((i11 & 8) != 0) {
                str4 = javascript.mime;
            }
            if ((i11 & 16) != 0) {
                str5 = javascript.encoding;
            }
            String str6 = str5;
            String str7 = str3;
            return javascript.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMime() {
            return this.mime;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEncoding() {
            return this.encoding;
        }

        @NotNull
        public final Javascript copy(@NotNull String url, String text, @NotNull String contentType, @NotNull String mime, @NotNull String encoding) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(mime, "mime");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            return new Javascript(url, text, contentType, mime, encoding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Javascript)) {
                return false;
            }
            Javascript javascript = (Javascript) other;
            return Intrinsics.areEqual(this.url, javascript.url) && Intrinsics.areEqual(this.text, javascript.text) && Intrinsics.areEqual(this.contentType, javascript.contentType) && Intrinsics.areEqual(this.mime, javascript.mime) && Intrinsics.areEqual(this.encoding, javascript.encoding);
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getContentType() {
            return this.contentType;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getEncoding() {
            return this.encoding;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getMime() {
            return this.mime;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.theathletic.article.component.data.WebAsset
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            String str = this.text;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contentType.hashCode()) * 31) + this.mime.hashCode()) * 31) + this.encoding.hashCode();
        }

        @NotNull
        public String toString() {
            return "Javascript(url=" + this.url + ", text=" + this.text + ", contentType=" + this.contentType + ", mime=" + this.mime + ", encoding=" + this.encoding + ")";
        }
    }

    public /* synthetic */ WebAsset(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getContentType();

    @NotNull
    public abstract String getEncoding();

    @NotNull
    public abstract String getMime();

    @NotNull
    public abstract String getUrl();

    private WebAsset() {
    }
}
