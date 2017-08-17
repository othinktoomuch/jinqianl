package com.jinqianl.recommend.domain;

public class Recommend {
    private Integer id;

    private Integer oldUserId;

    private Integer newUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOldUserId() {
        return oldUserId;
    }

    public void setOldUserId(Integer oldUserId) {
        this.oldUserId = oldUserId;
    }

    public Integer getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(Integer newUserId) {
        this.newUserId = newUserId;
    }
}