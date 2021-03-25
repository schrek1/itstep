package cz.itstep.practice4.task3.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private Long id;

    private final List<Long> penaltyIds = new ArrayList<>();

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getPenaltyIds() {
        return Collections.unmodifiableList(penaltyIds);
    }

    public void addPenaltyId(Long id) {
        penaltyIds.add(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", penaltyIds=" + penaltyIds +
                '}';
    }
}
