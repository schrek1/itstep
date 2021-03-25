package cz.itstep.practice4.task3.dao;

import cz.itstep.practice4.task3.storage.Storage;
import cz.itstep.practice4.task3_antipatern.model.Penalty;

class PenaltyDaoImpl implements PenaltyDao {

    private final Storage<Long, Penalty> storage;

    public PenaltyDaoImpl(Storage<Long, Penalty> storage) {
        this.storage = storage;
    }
}
