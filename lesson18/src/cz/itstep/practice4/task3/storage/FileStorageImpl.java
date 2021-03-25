package cz.itstep.practice4.task3.storage;

import java.util.Optional;

class FileStorageImpl<ID, T> implements Storage<ID, T> {

    @Override
    public boolean save(ID key, T entity) {
        return false;
    }

    @Override
    public Optional<T> load(ID key) {
        return Optional.empty();
    }
}
