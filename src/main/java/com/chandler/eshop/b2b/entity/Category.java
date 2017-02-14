package com.chandler.eshop.b2b.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by i325622 on 2/13/17.
 */
public class Category {

    private Long id;

    private Long parentId;

    private String chain;

    private Boolean leaf;

    private Long level;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", chain='" + chain + '\'' +
                ", leaf=" + leaf +
                ", level=" + level +
                '}';
    }
}
