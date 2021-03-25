package cz.itstep.practice4.task3.model;

import cz.itstep.practice4.task3_antipatern.dao.PenaltyDaoImpl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Penalty implements Serializable {

    private Long id;
    private String cause;
    private BigDecimal price;
    private Long personId;

    public Penalty(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Penalty{" +
                "id=" + id +
                ", cause='" + cause + '\'' +
                ", price=" + price +
                ", personId=" + personId +
                '}';
    }
}
