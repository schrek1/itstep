package cz.itstep.practice4.task3.storage;

import cz.itstep.practice4.task3.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


class MemoryStorageImplTest {

    MemoryStorageImpl<String, Person> underTest;

    @BeforeEach
    void setUp() {
        underTest = new MemoryStorageImpl<>();
    }

    @Test
    void saveEntityAndLoadIt_shouldPass() {
        // GIVEN
        var KEY = "tPersonId";
        var ENTITY = new Person(1L);
        ENTITY.addPenaltyId(3L);
        ENTITY.addPenaltyId(4L);

        // WHEN
        final boolean isSaved = underTest.save(KEY, ENTITY);
        final Optional<Person> loadedEntity = underTest.load(KEY);

        // THEN
        Assertions.assertTrue(isSaved);

        Assertions.assertNotNull(loadedEntity);
        Assertions.assertTrue(loadedEntity.isPresent());

        final Person loadedPerson = loadedEntity.get();
        Assertions.assertEquals(1L, loadedPerson.getId());

        final List<Long> penaltyIds = loadedPerson.getPenaltyIds();
        Assertions.assertIterableEquals(List.of(3L, 4L), penaltyIds);
    }

    @Test
    void saveEntityAndLoadByOtherKey_shouldReturnEmpty() {
        // GIVEN
        var KEY = "tPersonId";
        var ENTITY = new Person(1L);
        ENTITY.addPenaltyId(3L);
        ENTITY.addPenaltyId(4L);

        // WHEN
        final boolean isSaved = underTest.save(KEY, ENTITY);
        final Optional<Person> loadedEntity = underTest.load("OtherKey");

        // THEN
        Assertions.assertTrue(isSaved);

        Assertions.assertNotNull(loadedEntity);
        Assertions.assertTrue(loadedEntity.isEmpty());
    }


    @Test
    void noEntitiesSave_shouldReturnEmpty() {
        // WHEN
        final Optional<Person> loadedEntity = underTest.load("OtherKey");

        // THEN
        Assertions.assertNotNull(loadedEntity);
        Assertions.assertTrue(loadedEntity.isEmpty());
    }


    @Test
    void onSave_keyIsNull_shouldReturnFalse() {
        var isSaved = underTest.save(null, new Person(1L));
        final Optional<Person> loaded = underTest.load(null);

        Assertions.assertFalse(isSaved);
        Assertions.assertNotNull(loaded);
        Assertions.assertTrue(loaded.isEmpty());
    }

    @Test
    void onSave_entityIsNull_shouldReturnFalse() {
        var isSaved = underTest.save("KEY", null);
        final Optional<Person> loaded = underTest.load("KEY");

        Assertions.assertFalse(isSaved);
        Assertions.assertNotNull(loaded);
        Assertions.assertTrue(loaded.isEmpty());
    }


    @Test
    void onLoad_keyIsNull_shouldReturnFalse() {
        final Optional<Person> loaded = underTest.load(null);

        Assertions.assertNotNull(loaded);
        Assertions.assertTrue(loaded.isEmpty());
    }
}
