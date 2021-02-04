package cz.itsep.books.second;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.id = 1;
        book1.autor = "John";
        book1.title = "Magazine";
        book1.journal = new Journal();

        Book book2 = new Book();
        book2.id = 2;
        book2.autor = "John";
        book2.title = "Magazine";
        book2.journal = new Journal();

        Book[] library = {book1, book2};

        Person person = new Person();
        person.name = "Carl";


        JournalRecord lentRecord = JournalRecord.createLentRecord(person, LocalDate.now(), 10);

        book2.journal.addJournalRecord(lentRecord);

        JournalRecord acceptedRecord = JournalRecord.createAcceptedRecord(person, LocalDate.now());

        book2.journal.addJournalRecord(acceptedRecord);


        System.out.println("VYPUJCKY:");
        for (Book book : library) {
            book.journal.getJournalRecords(); // find last journal record -> LENT
        }

        System.out.println("VRACENO:");
        for (Book book : library) {
            book.journal.getJournalRecords(); // find last journal record -> ACCEPTED
        }
    }
}
