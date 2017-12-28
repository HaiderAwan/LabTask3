package com.example.aaa.lab3;

import android.graphics.drawable.Icon;

public class Contacts {
    private String firstname;
    private String phone;
   // private Icon imageid;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   // public void setImageid( Icon imageid) {
     //   this.imageid = imageid;
    //}

    public Contacts(String firstname, String phone) {
        this.firstname = firstname;
        //this.imageid =imageid;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPhone() {
        return phone;
    }

//    public Icon getImageid() {
//        return imageid;
  //  }
}
