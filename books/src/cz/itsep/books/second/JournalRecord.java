package cz.itsep.books.second;

import java.time.LocalDate;

public class JournalRecord {
    public JournalActionType actionType;
    public LocalDate lentFrom;
    public LocalDate acceptedAt;
    public int lentDays;
    public Person person;


    private JournalRecord(
            Person person,
            LocalDate lentFrom,
            int lentDays
    ) {
        this.actionType = JournalActionType.LENT;
        this.lentFrom = lentFrom;
        this.lentDays = lentDays;
        this.person = person;
    }

    private JournalRecord(Person person,
                          LocalDate acceptedAt
    ) {
        this.actionType = JournalActionType.ACCEPTED;
        this.acceptedAt = acceptedAt;
        this.person = person;
    }

    public static JournalRecord createLentRecord(Person person,
                                                 LocalDate lentFrom,
                                                 int lentDays
    ) {
        return new JournalRecord(person, lentFrom, lentDays);
    }

    public static JournalRecord createAcceptedRecord(Person person, LocalDate acceptedAt
    ) {
        return new JournalRecord(person, acceptedAt);
    }

    @Override
    public String toString() {
        return "JournalRecord{" +
                "actionType=" + actionType +
                ", lentFrom=" + lentFrom +
                ", acceptedAt=" + acceptedAt +
                ", lentDays=" + lentDays +
                ", person=" + person +
                '}';
    }
}
