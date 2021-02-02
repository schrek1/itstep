package cz.itstep;

import cz.itstep.example.Address;
import cz.itstep.example.BetterHuman;
import cz.itstep.fraction.Fraction;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Human and address testing...

        BetterHuman human = new BetterHuman("John", LocalDate.of(2000, 1, 1));
        Address address = new Address("Na Dolech", "30", "Praha");
        human.setAddress(address);

        // 45
        Address updatedAddress;
        if (human.isAddressSet()) {
            Address oldAddr = human.getAddress();
            updatedAddress = new Address(oldAddr.getStreetName(), "45", oldAddr.getCity(), oldAddr.getCountry(), oldAddr.getPostalCode());
        } else {
            updatedAddress = null;
        }

        human.setAddress(updatedAddress);


        Address.copy(human.getAddress(), new Address(null, "45", null, null, null));
        human.getAddress().copy(new Address(null, "45", null, null, null));


        // Fraction testing..

        BigDecimal productPrice = BigDecimal.valueOf(100);
        BigDecimal cash = BigDecimal.valueOf(1000);

        BigDecimal restOfMoney = cash.subtract(productPrice);

        Fraction firstFraction = new Fraction(3, 2);
        Fraction secondFraction = new Fraction(2, 3);

        Fraction resultFraction = firstFraction.division(secondFraction);

        if (resultFraction == null) {
            System.err.println("operace se nepovedla...");
            return;
        }

        System.out.println(resultFraction.printableFormat());

    }
}
