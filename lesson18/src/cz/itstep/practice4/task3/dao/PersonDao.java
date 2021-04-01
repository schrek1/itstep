package cz.itstep.practice4.task3.dao;

import cz.itstep.practice4.task3.model.Person;
import cz.itstep.practice4.task3.storage.Storage;

public interface PersonDao extends GeneralDao<Long, Person> {

    static PersonDao getInstance() {
        return new PersonDaoImpl(Storage.getInstance(Storage.Type.MEMORY));
    }

}
