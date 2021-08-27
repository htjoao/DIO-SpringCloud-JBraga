package com.example.productcatalogbraga.model;


public class product {

    private long id;
    private String name;
    private Integer amount;

    public  Long getid() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String  name){
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void  setAmount(Integer amount) {
        this.amount = amount;
    }
}
