package com.example.shop.entity;

public class Goods {
  private int gid;
  private String title;
  private String type;
  private int price;
  private String detail;
  private String pic;
  private int status;
  private int uid;
  private String name;

  public Goods() {}

  public Goods(int gid, String title, String type, int price, String detail, String pic, int status, int uid, String name) {
    this.gid = gid;
    this.title = title;
    this.type = type;
    this.price = price;
    this.detail = detail;
    this.pic = pic;
    this.status = status;
    this.uid = uid;
    this.name = name;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public int getGid() {
    return gid;
  }

  public void setGid(int gid) {
    this.gid = gid;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Goods{" +
            "gid=" + gid +
            ", title='" + title + '\'' +
            ", type='" + type + '\'' +
            ", price=" + price +
            ", detail='" + detail + '\'' +
            ", pic='" + pic + '\'' +
            ", status=" + status +
            ", uid=" + uid +
            ", name='" + name + '\'' +
            '}';
  }
}
