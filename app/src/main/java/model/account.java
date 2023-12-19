package model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class account implements Parcelable {
    private String username;
    private String password;

    public account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public account() {
    }

    protected account(Parcel in) {
        username = in.readString();
        password = in.readString();
    }

    public static final Creator<account> CREATOR = new Creator<account>() {
        @Override
        public account createFromParcel(Parcel in) {
            return new account(in);
        }

        @Override
        public account[] newArray(int size) {
            return new account[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static final Creator<account> creator = new Creator<account>() {
        @Override
        public account createFromParcel(Parcel source) {
            return new account(source);
        }

        @Override
        public account[] newArray(int size) {
            return new account[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(password);
    }
}
