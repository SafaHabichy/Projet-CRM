package com.example.ProjetCrm;
import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer id;
    @Column(name="type_presta")
    private String typepresta;

    @Column(name="designation")
    private String designation;

    @Column(name="nb_days")
    private Integer nbdays;

    @Column(name="unit_price")
    private Integer unitprice;
    private OrderState state;

    @ManyToOne
    Client client;

    public Order() {
    }

    public Order(String typepresta, String designation, Integer nbdays, Integer unitprice, OrderState state) {
        this.typepresta = typepresta;
        this.designation = designation;
        this.nbdays = nbdays;
        this.unitprice = unitprice;
        this.state = state;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", typepresta='" + typepresta + '\'' +
                ", designation='" + designation + '\'' +
                ", nbdays=" + nbdays +
                ", unitprice=" + unitprice +
                ", state=" + state +
                ", client=" + client +
                '}';
    }
}
