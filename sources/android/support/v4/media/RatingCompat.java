package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f1199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f1200c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i11) {
            return new RatingCompat[i11];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b {
        static float a(Rating rating) {
            return rating.getPercentRating();
        }

        static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        static float c(Rating rating) {
            return rating.getStarRating();
        }

        static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        static boolean e(Rating rating) {
            return rating.isRated();
        }

        static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        static Rating g(boolean z11) {
            return Rating.newHeartRating(z11);
        }

        static Rating h(float f11) {
            return Rating.newPercentageRating(f11);
        }

        static Rating i(int i11, float f11) {
            return Rating.newStarRating(i11, f11);
        }

        static Rating j(boolean z11) {
            return Rating.newThumbRating(z11);
        }

        static Rating k(int i11) {
            return Rating.newUnratedRating(i11);
        }
    }

    RatingCompat(int i11, float f11) {
        this.f1198a = i11;
        this.f1199b = f11;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompatG = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iB = b.b(rating);
            if (b.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompatG = b(b.d(rating));
                        break;
                    case 2:
                        ratingCompatG = f(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatG = d(iB, b.c(rating));
                        break;
                    case 6:
                        ratingCompatG = c(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatG = g(iB);
            }
            ratingCompatG.f1200c = obj;
        }
        return ratingCompatG;
    }

    public static RatingCompat b(boolean z11) {
        return new RatingCompat(1, z11 ? 1.0f : 0.0f);
    }

    public static RatingCompat c(float f11) {
        if (f11 >= 0.0f && f11 <= 100.0f) {
            return new RatingCompat(6, f11);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat d(int i11, float f11) {
        float f12;
        if (i11 == 3) {
            f12 = 3.0f;
        } else if (i11 == 4) {
            f12 = 4.0f;
        } else {
            if (i11 != 5) {
                Log.e("Rating", "Invalid rating style (" + i11 + ") for a star rating");
                return null;
            }
            f12 = 5.0f;
        }
        if (f11 >= 0.0f && f11 <= f12) {
            return new RatingCompat(i11, f11);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat f(boolean z11) {
        return new RatingCompat(2, z11 ? 1.0f : 0.0f);
    }

    public static RatingCompat g(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i11, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f1198a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f1198a);
        sb2.append(" rating=");
        float f11 = this.f1199b;
        sb2.append(f11 < 0.0f ? "unrated" : String.valueOf(f11));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1198a);
        parcel.writeFloat(this.f1199b);
    }
}
