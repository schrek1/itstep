package cz.itstep.practice4.task3.storage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static cz.itstep.practice4.task3.storage.SerializationUtils.deserializeEntity;
import static cz.itstep.practice4.task3.storage.SerializationUtils.serializeEntity;

class MemoryStorageImpl<ID, T extends Serializable> implements Storage<ID, T> {

    private final Map<ID, byte[]> memory = new HashMap<>();

    @Override
    public boolean save(ID key, T entity) {
        if (key == null || entity == null) return false;
        final byte[] bytes = serializeEntity(entity);
        memory.put(key, bytes);
        return true;
    }

    @Override
    public Optional<T> load(ID key) {
        if (key == null) return Optional.empty();
        if (memory.containsKey(key)) {
            return Optional.ofNullable(deserializeEntity(memory.get(key)));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(ID key) {
        return false; // todo implement + cover by tests
    }
}
