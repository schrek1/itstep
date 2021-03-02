package cz.itstep.lecture.generic2;

public class Main {

    public static void main(String args[]){
        GenericsTypeOld oldType = new GenericsTypeOld();
        oldType.set("Pankaj");
        oldType.set(1);
        oldType.set(new RuntimeException());
        String str = (String) oldType.get(); //type casting, error prone and can cause ClassCastException

        GenericsType<String> genericType = new GenericsType<>();
        genericType.set("Pankaj"); //valid
//        genericType.set(10); // compilation error

        GenericsType rawGenericType = new GenericsType(); //raw type
        rawGenericType.set("Pankaj"); //valid
        rawGenericType.set(10); //valid and autoboxing support
    }
}
