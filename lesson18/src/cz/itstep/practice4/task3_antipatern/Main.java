package cz.itstep.practice4.task3_antipatern;


import cz.itstep.practice4.task3_antipatern.dao.PenaltyDao;
import cz.itstep.practice4.task3_antipatern.dao.PenaltyDaoImpl;
import cz.itstep.practice4.task3_antipatern.storage.MemoryStorageImpl;
import cz.itstep.practice4.task3_antipatern.storage.Storage;

public class Main {

    public static void main(String[] args) {
        final Storage memoryStorage = new MemoryStorageImpl();
        final PenaltyDao penaltyDao = new PenaltyDaoImpl(memoryStorage);
    }
}
