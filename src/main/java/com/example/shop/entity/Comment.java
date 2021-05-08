package com.example.shop.entity;

public class Comment {
  private int cid;
  private int gid;
  private String content;
  private String createTime;
  private int uid;
  private String name;

  public Comment () {}

  public Comment(int cid, int gid, String content, String createTime, int uid, String name) {
    this.cid = cid;
    this.gid = gid;
    this.content = content;
    this.createTime = createTime;
    this.uid = uid;
    this.name = name;
  }

  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
  }

  public int getGid() {
    return gid;
  }

  public void setGid(int gid) {
    this.gid = gid;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Comment{" +
            "cid=" + cid +
            ", gid=" + gid +
            ", content='" + content + '\'' +
            ", createTime='" + createTime + '\'' +
            ", uid=" + uid +
            ", name='" + name + '\'' +
            '}';
  }
}
