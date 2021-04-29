package com.example.shop.entity;

public class Order {
  private int oid;
  private int gid;
  private String goodsName;
  private int buyId;
  private String buyName;
  private int sellId;
  private String sellName;
  private String createTime;
  private String buyTime;
  private int status;

  public Order() {}

  public Order(int oid, int gid, String goodsName, int buyId, String buyName, int sellId, String sellName, String createTime, String buyTime, int status) {
    this.oid = oid;
    this.gid = gid;
    this.goodsName = goodsName;
    this.buyId = buyId;
    this.buyName = buyName;
    this.sellId = sellId;
    this.sellName = sellName;
    this.createTime = createTime;
    this.buyTime = buyTime;
    this.status = status;
  }

  public int getOid() {
    return oid;
  }

  public void setOid(int oid) {
    this.oid = oid;
  }

  public int getGid() {
    return gid;
  }

  public void setGid(int gid) {
    this.gid = gid;
  }

  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }

  public int getBuyId() {
    return buyId;
  }

  public void setBuyId(int buyId) {
    this.buyId = buyId;
  }

  public String getBuyName() {
    return buyName;
  }

  public void setBuyName(String buyName) {
    this.buyName = buyName;
  }

  public int getSellId() {
    return sellId;
  }

  public void setSellId(int sellId) {
    this.sellId = sellId;
  }

  public String getSellName() {
    return sellName;
  }

  public void setSellName(String sellName) {
    this.sellName = sellName;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getBuyTime() {
    return buyTime;
  }

  public void setBuyTime(String buyTime) {
    this.buyTime = buyTime;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Order{" +
            "oid=" + oid +
            ", gid=" + gid +
            ", goodsName='" + goodsName + '\'' +
            ", buyId=" + buyId +
            ", buyName='" + buyName + '\'' +
            ", sellId=" + sellId +
            ", sellName='" + sellName + '\'' +
            ", createTime='" + createTime + '\'' +
            ", buyTime='" + buyTime + '\'' +
            ", status=" + status +
            '}';
  }
}
