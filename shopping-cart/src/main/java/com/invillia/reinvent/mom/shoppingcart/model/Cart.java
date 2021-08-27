package com.invillia.reinvent.mom.shoppingcart.model;

import java.util.ArrayList;

@RedisHash("Cart")
public class Cart {

    @Id
    private Integer id;
    private List<Item> itens;

    public Cart() {
    }

    public Cart(Integer id) {this.id = id;}

    public Integer getId() { return id;}

    public void setId(Integer id) { this.id = id;}

    public List<Item> getItens() {
        if (itens == null){
            itens = new ArrayList<>();
        }
        return itens;
    }

    public void setItens(List<Item> itens) { this.itens = itens;}
}
