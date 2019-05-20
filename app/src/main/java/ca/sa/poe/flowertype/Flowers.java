package ca.sa.poe.flowertype;


import android.os.Parcel;
import android.os.Parcelable;

public class Flowers implements Parcelable {
    private String name, genus, photo, data, clade, order, jenis;

    public Flowers(){

    }

    protected Flowers(Parcel in) {
        name = in.readString();
        genus = in.readString();
        photo = in.readString();
        data = in.readString();
        clade= in.readString();
        order = in.readString();
        jenis = in.readString();
    }

    public static final Parcelable.Creator<Flowers> CREATOR = new Parcelable.Creator<Flowers>() {
        @Override
        public Flowers createFromParcel(Parcel in) {
            return new Flowers(in);
        }

        @Override
        public Flowers[] newArray(int size) {
            return new Flowers[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getClade() {
        return clade;
    }

    public void setClade(String clade) {
        this.clade = clade;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(genus);
        dest.writeString(photo);
        dest.writeString(data);
        dest.writeString(clade);
        dest.writeString(order);
        dest.writeString(jenis);
    }
}
