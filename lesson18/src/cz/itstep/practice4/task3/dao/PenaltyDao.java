package cz.itstep.practice4.task3.dao;

import cz.itstep.practice4.task3.storage.Storage;
import cz.itstep.practice4.task3_antipatern.model.Penalty;

public interface PenaltyDao {

    static PenaltyDao getInstance() {
        return new PenaltyDaoImpl(Storage.getInstance(Storage.Type.MEMORY));
    }


}
