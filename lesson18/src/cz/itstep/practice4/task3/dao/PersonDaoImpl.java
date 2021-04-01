package cz.itstep.practice4.task3.dao;

import cz.itstep.practice4.task3.model.Person;
import cz.itstep.practice4.task3.storage.Storage;

import java.util.Collection;
import java.util.Optional;

public class PersonDaoImpl implements PersonDao {

    private final Storage<Long, Person> storage;

    private long idCounter = 0;

    public PersonDaoImpl(Storage<Long, Person> storage) {
        this.storage = storage;
    }

    @Override
    public Person save(Person entity) {
        if (entity == null) return null;

        final Optional<Long> existingKey = storage.load(entity.getId()).map(Person::getId);

        if (existingKey.isPresent()) {
            storage.save(existingKey.get(), entity);
            return entity;
        }

        final long actualId = ++idCounter;
        entity.setId(actualId);
        storage.save(actualId, entity);

        return entity;
    }

    @Override
    public Collection<Person> getAll() {
        return null;  // todo implement + cover by tests
    }

    @Override
    public Optional<Person> get(Long aLong) {
        return Optional.empty();  // todo implement + cover by tests
    }

    @Override
    public boolean delete(Long aLong) {
        return false;  // todo implement + cover by tests
    }
}
