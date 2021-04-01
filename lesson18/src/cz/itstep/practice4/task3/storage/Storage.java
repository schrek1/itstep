package cz.itstep.practice4.task3.storage;

import java.io.Serializable;
import java.util.Optional;

public interface Storage<ID, T extends Serializable> {

    enum Type {
        MEMORY, FILE
    }

    static <ID, T extends Serializable> Storage<ID, T> getInstance(Type storageType) {
        if (storageType == null) throw new IllegalArgumentException("unknown type");

        switch (storageType) {
            case MEMORY:
                return new MemoryStorageImpl<>();
            case FILE:
                return new FileStorageImpl<>();
            default:
                throw new IllegalArgumentException("unknown type");
        }
    }

    boolean save(ID key, T entity);

    Optional<T> load(ID key);

    boolean delete(ID key);

}
