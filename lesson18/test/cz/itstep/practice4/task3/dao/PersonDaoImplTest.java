package cz.itstep.practice4.task3.dao;

import cz.itstep.practice4.task3.model.Person;
import cz.itstep.practice4.task3.storage.Storage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

class PersonDaoImplTest {

    Storage<Long, Person> storage;

    PersonDaoImpl underTest;

    @BeforeEach
    void setUp() {
        storage = Mockito.mock(Storage.class);
        underTest = new PersonDaoImpl(storage);
    }

    @Test
    void saveNewEntity_entityNotExist_shouldGenerateIdAndSaveEntity() {
        var PERSON = new Person(null);

        Mockito.when(storage.load(null)).thenReturn(Optional.empty());

        var saved = underTest.save(PERSON);

        var personCaptor = ArgumentCaptor.forClass(Person.class);
        Mockito.verify(storage, Mockito.times(1))
                .save(Mockito.eq(1L), personCaptor.capture());

        var capturedPerson = personCaptor.getValue();
        Assertions.assertNotNull(capturedPerson);
        Assertions.assertEquals(1L, capturedPerson.getId());

        Assertions.assertNotNull(saved);
        Assertions.assertEquals(1L, saved.getId());
    }

    @Test
    void saveExistingEntity_entityExist_shouldGenerateIdAndSaveEntity() {
        var PERSON = new Person(5L);
        PERSON.addPenaltyId(6L);

        final Person personInStorage = new Person(5L);
        personInStorage.addPenaltyId(5L);
        Mockito.when(storage.load(5L)).thenReturn(Optional.of(personInStorage));



        var saved = underTest.save(PERSON);



        var personCaptor = ArgumentCaptor.forClass(Person.class);
        Mockito.verify(storage, Mockito.times(1))
                .save(Mockito.eq(5L), personCaptor.capture());

        var capturedPerson = personCaptor.getValue();
        Assertions.assertNotNull(capturedPerson);
        Assertions.assertEquals(5L, capturedPerson.getId());

        Assertions.assertNotNull(saved);
        Assertions.assertEquals(5L, saved.getId());
        Assertions.assertIterableEquals(List.of(6L), PERSON.getPenaltyIds());
    }

    @Test
    void saveExistingEntity_entityNotExist_shouldGenerateIdAndSaveEntity() {
        var PERSON = new Person(5L);
        PERSON.addPenaltyId(6L);

        Mockito.when(storage.load(5L)).thenReturn(Optional.empty());

        var saved = underTest.save(PERSON);

        var personCaptor = ArgumentCaptor.forClass(Person.class);
        Mockito.verify(storage, Mockito.times(1))
                .save(Mockito.eq(1L), personCaptor.capture());

        var capturedPerson = personCaptor.getValue();
        Assertions.assertNotNull(capturedPerson);
        Assertions.assertEquals(1L, capturedPerson.getId());

        Assertions.assertNotNull(saved);
        Assertions.assertEquals(1L, saved.getId());
        Assertions.assertIterableEquals(List.of(6L), PERSON.getPenaltyIds());
    }
}
