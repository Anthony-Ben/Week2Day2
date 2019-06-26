package com.example.week2day2;

import android.os.Parcel;
import android.os.Parcelable;

public class Car implements Parcelable {
    private String  year, make, model, color, engineSize, transmissionSize;

    public Car(){}

    public Car(String year, String make, String model, String color, String engineSize, String transmissionSize) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.engineSize = engineSize;
        this.transmissionSize = transmissionSize;
    }

    protected Car(Parcel in) {
        year = in.readString();
        make = in.readString();
        model = in.readString();
        color = in.readString();
        engineSize = in.readString();
        transmissionSize = in.readString();
    }

    public static final Creator<Car> CREATOR = new Creator<Car>() {
        @Override
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        @Override
        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    public String getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public String getTransmissionSize() {
        return transmissionSize;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(year);
        parcel.writeString(make);
        parcel.writeString(model);
        parcel.writeString(color);
        parcel.writeString(engineSize);
        parcel.writeString(transmissionSize);
    }
}
