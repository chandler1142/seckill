package com.chandler.eshop.b2b.entity;

/**
 * Created by i325622 on 2/13/17.
 */
public class Visibility {

    private Long categoryId;

    private Long groupId;

    private Boolean visible = true;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

}
