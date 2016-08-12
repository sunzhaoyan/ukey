package com.itrus.ukey2.po;

public class Resource {
    private Long id;

    private String parentResCode;

    private String resCode;

    private String resRoleName;

    private String resTitle;

    private String resUrl;

    private Long resOrder;

    private Long resStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentResCode() {
        return parentResCode;
    }

    public void setParentResCode(String parentResCode) {
        this.parentResCode = parentResCode == null ? null : parentResCode.trim();
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode == null ? null : resCode.trim();
    }

    public String getResRoleName() {
        return resRoleName;
    }

    public void setResRoleName(String resRoleName) {
        this.resRoleName = resRoleName == null ? null : resRoleName.trim();
    }

    public String getResTitle() {
        return resTitle;
    }

    public void setResTitle(String resTitle) {
        this.resTitle = resTitle == null ? null : resTitle.trim();
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    public Long getResOrder() {
        return resOrder;
    }

    public void setResOrder(Long resOrder) {
        this.resOrder = resOrder;
    }

    public Long getResStatus() {
        return resStatus;
    }

    public void setResStatus(Long resStatus) {
        this.resStatus = resStatus;
    }
}