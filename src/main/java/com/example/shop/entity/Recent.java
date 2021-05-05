package com.example.shop.entity;

public class Recent {
  private int rid;
  private int sendId;
  private int acceptId;
  private String content;
  private String updateTime;

  public Recent() {}

  public Recent(int rid, int sendId, int acceptId, String content, String updateTime) {
    this.rid = rid;
    this.sendId = sendId;
    this.acceptId = acceptId;
    this.content = content;
    this.updateTime = updateTime;
  }

  public int getRid() {
    return rid;
  }

  public void setRid(int rid) {
    this.rid = rid;
  }

  public int getSendId() {
    return sendId;
  }

  public void setSendId(int sendId) {
    this.sendId = sendId;
  }

  public int getAcceptId() {
    return acceptId;
  }

  public void setAcceptId(int acceptId) {
    this.acceptId = acceptId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "Recent{" +
            "rid=" + rid +
            ", sendId=" + sendId +
            ", acceptId=" + acceptId +
            ", content='" + content + '\'' +
            ", updateTime='" + updateTime + '\'' +
            '}';
  }
}
