package cz.itstep.practice4.task3.dao;

import cz.itstep.practice4.task3.model.Person;
import cz.itstep.practice4.task3.storage.Storage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class PersonDaoImplOldTest {

    PersonDaoImpl underTest;

    @BeforeEach
    void setUp() {

    }

    @Test
    void saveNewEntity_entityNotExist_shouldGenerateIdAndSaveEntity() {
        var PERSON = new Person(null);

        underTest = new PersonDaoImpl(new Storage<>() {
            @Override
            public boolean save(Long key, Person entity) {
                Assertions.assertEquals(1L, key);
                Assertions.assertNotNull(entity);
                Assertions.assertEquals(1L, entity.getId());

                return true;
            }

            @Override
            public Optional<Person> load(Long key) {
                return Optional.empty();
            }

            @Override
            public boolean delete(Long key) {
                return false;
            }
        });

        var saved = underTest.save(PERSON);

        Assertions.assertNotNull(saved);
        Assertions.assertEquals(1L, saved.getId());
    }

    @Test
    void saveExistingEntity_entityExist_shouldGenerateIdAndSaveEntity() {
        var PERSON = new Person(5L);
        PERSON.addPenaltyId(6L);

        underTest = new PersonDaoImpl(new Storage<>() {
            @Override
            public boolean save(Long key, Person entity) {
                Assertions.assertEquals(5L, key);
                Assertions.assertNotNull(entity);
                Assertions.assertEquals(5L, entity.getId());
                Assertions.assertIterableEquals(List.of(6L), entity.getPenaltyIds());

                return true;
            }

            @Override
            public Optional<Person> load(Long key) {
                final Person person = new Person(5L);
                person.addPenaltyId(5L);
                return Optional.ofNullable(person);
            }

            @Override
            public boolean delete(Long key) {
                return false;
            }
        });

        var saved = underTest.save(PERSON);

        Assertions.assertNotNull(saved);
        Assertions.assertEquals(5L, saved.getId());
        Assertions.assertIterableEquals(List.of(6L), PERSON.getPenaltyIds());
    }

    @Test
    void saveExistingEntity_entityNotExist_shouldGenerateIdAndSaveEntity() {
        var PERSON = new Person(5L);
        PERSON.addPenaltyId(6L);

        underTest = new PersonDaoImpl(new Storage<>() {
            @Override
            public boolean save(Long key, Person entity) {
                Assertions.assertEquals(1L, key);
                Assertions.assertNotNull(entity);
                Assertions.assertEquals(1L, entity.getId());
                Assertions.assertIterableEquals(List.of(6L), entity.getPenaltyIds());

                return true;
            }

            @Override
            public Optional<Person> load(Long key) {
                return Optional.empty();
            }

            @Override
            public boolean delete(Long key) {
                return false;
            }
        });

        var saved = underTest.save(PERSON);

        Assertions.assertNotNull(saved);
        Assertions.assertEquals(1L, saved.getId());
        Assertions.assertIterableEquals(List.of(6L), PERSON.getPenaltyIds());
    }
}
