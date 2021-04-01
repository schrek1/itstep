package cz.itstep.practice4.task3.storage;

import java.io.Serializable;
import java.util.Optional;

import static cz.itstep.practice4.task3.storage.SerializationUtils.serializeEntity;

class FileStorageImpl<ID, T extends Serializable> implements Storage<ID, T> {


    @Override
    public boolean save(ID key, T entity) {
        if (key == null || entity == null) return false;
        final byte[] bytes = serializeEntity(entity);
//        memory.put(key, bytes);
        return true;
    }

    @Override
    public Optional<T> load(ID key) {
        return Optional.empty();
    }

    @Override
    public boolean delete(ID key) {
        return false;
    }
}
