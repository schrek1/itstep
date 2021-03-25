package cz.itstep.practice4.task3_antipatern.dao;

import cz.itstep.practice4.task3_antipatern.storage.Storage;

public class PenaltyDaoImpl implements PenaltyDao {

    private final Storage storage;

    public PenaltyDaoImpl(Storage storage) {
        this.storage = storage;
    }
}
