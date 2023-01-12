package com.example.ProjetCrm;

import jakarta.persistence.Column;

public class OrderDTO {

    private Integer id;
    private String typepresta;
    private String designation;
    private Integer nbdays;
    private Integer unitprice;
    private OrderState state;

    public OrderDTO() {
    }

    public OrderDTO(Order entity) {
        this.id = entity.getId();
        this.typepresta = entity.getTypepresta();
        this.designation = entity.getDesignation();
        this.nbdays = entity.getNbdays();
        this.unitprice = entity.getUnitprice();
        this.state = entity.getState();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypepresta() {
        return typepresta;
    }

    public void setTypepresta(String typepresta) {
        this.typepresta = typepresta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getNbdays() {
        return nbdays;
    }

    public void setNbdays(Integer nbdays) {
        this.nbdays = nbdays;
    }

    public Integer getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Integer unitprice) {
        this.unitprice = unitprice;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", typepresta='" + typepresta + '\'' +
                ", designation='" + designation + '\'' +
                ", nbdays=" + nbdays +
                ", unitprice=" + unitprice +
                ", state=" + state +
                '}';
    }
}
