package com.example.shop.entity;

public class Chat {
  private int cid;
  private String content;
  private int sendId;
  private int acceptId;
  private String createTime;

  public Chat() {}

  public Chat(int cid, String content, int sendId, int acceptId, String createTime) {
    this.cid = cid;
    this.content = content;
    this.sendId = sendId;
    this.acceptId = acceptId;
    this.createTime = createTime;
  }

  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
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

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "Chat{" +
            "cid=" + cid +
            ", content='" + content + '\'' +
            ", sendId=" + sendId +
            ", acceptId=" + acceptId +
            ", createTime='" + createTime + '\'' +
            '}';
  }
}
