package cz.itstep.practice4.task3;

import cz.itstep.practice4.task3.dao.PenaltyDao;
import cz.itstep.practice4.task3.model.Penalty;
import cz.itstep.practice4.task3.model.Person;
import cz.itstep.practice4.task3.storage.Storage;

import java.math.BigDecimal;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        final PenaltyDao instance = PenaltyDao.getInstance();

        final Person person = new Person(1L);
        final Penalty penalty = new Penalty(2L);
        penalty.setCause("Late tax pay");
        penalty.setPrice(new BigDecimal("1000.0"));
        penalty.setPersonId(person.getId());

        final Storage<Long, Penalty> penaltyStore = Storage.getInstance(Storage.Type.MEMORY);
        penaltyStore.save(penalty.getId(), penalty);

        penalty.setCause("corupted cause");

        System.out.println("original:" + penalty);

        final Penalty stored = penaltyStore.load(penalty.getId()).orElse(null);

        System.out.println("stored:" + stored);


        person.addPenaltyId(penalty.getId());

        System.out.println(penalty);
        System.out.println(person);
    }
}
