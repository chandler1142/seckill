package com.chandler.eshop.b2b.entity;

/**
 * Created by i325622 on 2/13/17.
 */
public class Product {

    private Long id;

    private String name;

    private String chain;

    private Long categoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chain='" + chain + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
