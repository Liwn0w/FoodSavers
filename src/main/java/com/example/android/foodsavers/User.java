package com.example.android.foodsavers;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

public class User extends BmobUser {

    String name;

    public void setName(String name) {
        this.name = name;
    }
}
