package com.example.josh.handlingactivitylifecycle.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class PersonParcel implements Parcelable {

    String name,age,gender;

    protected PersonParcel(Parcel in) {
        name = in.readString();
        age = in.readString();
        gender = in.readString();
    }

    public static final Creator<PersonParcel> CREATOR = new Creator<PersonParcel>() {
        @Override
        public PersonParcel createFromParcel(Parcel in) {
            return new PersonParcel(in);
        }

        @Override
        public PersonParcel[] newArray(int size) {
            return new PersonParcel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public PersonParcel(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonParcel{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(age);
        dest.writeString(gender);

    }
}
