package cz.itstep;

import java.util.Objects;
import java.util.StringTokenizer;

public class StringExamples {

    public static void main(String[] args) {
        String name = "John";
        String name2 = "John";
        String name3 = new String("John");
        String name4 = new String("John");

        System.out.println("name == name4 -> " + (name == name4));
        System.out.println("name equals name4 -> " + name.equals(name4));

        boolean isEquals = name != null ? name.equals(name4) : (name4 != null ? false : true);

        Objects.equals(((String) null), name);

        String john = "John";
        String replaced = john.replace("J", "j");

        int a = 5;
        String aToStr = a + "";
        String aToStrBetter = String.valueOf(a);

        new StringTokenizer("Ondrej-Schrek-2021", "-");

        String[] splits = "Ondrej-Schrek-2021".split("-");

    }
}
