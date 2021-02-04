package cz.itsep.books.first;

public class Journal {
    private JournalRecord[] journalRecords = new JournalRecord[1000];
    private int actualIndex = 0;

    public JournalRecord[] getJournalRecords() {
        return journalRecords;
    }

    public void addJournalRecord(JournalRecord journalRecord) {
        if (journalRecord != null) {
            journalRecords[actualIndex] = journalRecord;
            actualIndex++;
        }
    }
}
