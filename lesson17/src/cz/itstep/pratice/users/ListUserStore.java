package cz.itstep.pratice.users;

import java.util.LinkedList;
import java.util.List;

public class ListUserStore {

    public static void main(String[] args) {
        List<User> users = new LinkedList<>();

        users.add(new User("John", "1234"));
        users.add(new User("Carl", "5897"));
        users.add(new User("Filip", "0000"));
        System.out.println(users.toString());

        users.removeIf(user -> user.getUsername().equals("Filip"));
        System.out.println(users);

        boolean isExists = false;
        for (User user : users) {
            if (user.getUsername().equals("Carl")) {
                isExists = true;
                break;
            }
        }


        System.out.println("Uzivatel " + (isExists ? "existuje" : "neexistuje"));


        for (User user : users) {
            if (user.getUsername().equals("Carl")) {
                user.setUsername("Andrew");
                user.setPassword("789546");
            }
        }

        System.out.println(users);

    }
}
