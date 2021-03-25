package cz.itstep.practice4.task3.storage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class MemoryStorageImpl<ID, T> implements Storage<ID, T> {

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

    private T deserializeEntity(byte[] bytes) {
        try (
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                ObjectInputStream in = new ObjectInputStream(bis);
        ) {
            return (T) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    private byte[] serializeEntity(T entity) {
        try (
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream out = new ObjectOutputStream(bos)
        ) {
            out.writeObject(entity);
            out.flush();
            return bos.toByteArray();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
