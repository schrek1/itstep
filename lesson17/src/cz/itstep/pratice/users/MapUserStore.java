package cz.itstep.pratice.users;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapUserStore {

    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.putIfAbsent("John", "1234");

        final Map<String, String> mapSource = Map.of(
                "Carl", "5897",
                "Filip", "0000"
        );

        for (Map.Entry<String, String> entry : mapSource.entrySet()) {
            users.putIfAbsent(entry.getKey(), entry.getValue());
        }

        System.out.println(users);

        users.remove("Filip");
        System.out.println(users);

        users.computeIfPresent("Carl", (key, value) -> "1111");
        System.out.println(users);

        users.put("Andrew", users.remove("Carl"));
        System.out.println(users);

        Map<String, User> improvedUsers = new HashMap<>();

        improvedUsers.putIfAbsent("John", new User("John", "1234"));

        Map<String, User> improvedMapSource = Map.of(
                "Carl", new User("Carl", "5897"),
                "Filip", new User("Filip", "0000")
        );

        for (Map.Entry<String, User> entry : improvedMapSource.entrySet()) {
            improvedUsers.putIfAbsent(entry.getKey(), entry.getValue());
        }

        System.out.println(improvedUsers);

        improvedUsers.remove("Filip");
        System.out.println(improvedUsers);

        improvedUsers.computeIfPresent("Carl", (key, value) -> {
            value.setPassword("1111");
            return value;
        });
        System.out.println(improvedUsers);

        final User oldCarl = improvedUsers.remove("Carl");
        if (oldCarl != null) oldCarl.setUsername("Andrew");
        improvedUsers.put("Andrew", oldCarl);
        System.out.println(improvedUsers);
    }
}
