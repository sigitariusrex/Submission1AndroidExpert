package com.kingleoners.cinemagit;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private int cover;
    private String name;
    private String description;

    protected Film(Parcel in) {
        cover = in.readInt();
        name = in.readString();
        description = in.readString();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(cover);
        dest.writeString(name);
        dest.writeString(description);
    }
}
