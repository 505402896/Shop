package com.example.shop.entity;

public class UserInfo {
  private int uid;
  private String username;
  private String password;
  private String name;
  private String dept;
  private String phone;
  private String qqNumber;
  private String address;

  public UserInfo() {}

  public UserInfo(int uid, String username, String password, String name, String dept, String phone, String qqNumber, String address) {
    this.uid = uid;
    this.username = username;
    this.password = password;
    this.name = name;
    this.dept = dept;
    this.phone = phone;
    this.qqNumber = qqNumber;
    this.address = address;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getQqNumber() {
    return qqNumber;
  }

  public void setQqNumber(String qqNumber) {
    this.qqNumber = qqNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "UserInfo{" +
            "uid=" + uid +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", name='" + name + '\'' +
            ", dept='" + dept + '\'' +
            ", phone='" + phone + '\'' +
            ", qqNumber='" + qqNumber + '\'' +
            ", address='" + address + '\'' +
            '}';
  }
}
