package cz.itstep.practice4.task2;

public class Main {
    public static void main(String[] args) {
        /*
        Task 2
        Create a dictionary program.
         It can be English-Spanish, French-German, or any other pair.
          The software must:

          ■Display a word and its translations;Allow adding, replacing, deleting translations of a word;


          ■Display 10 least popular words (based on the number of requests).
         */

        DictionaryStorage dictionary = new DictionaryStorage();
        //■Provide the initial data input for the dictionary;

        dictionary.put("kočka", "cat");
        dictionary.put("křeček", "hamster");
        dictionary.put("kronika", "chronicle");
        dictionary.put("kravata", "tie");
        dictionary.put("krkavec", "raven");
        dictionary.put("koule", "sphere");
        dictionary.put("krychle", "cube");

//        System.out.println("Zadejte české slovo:");
//        input = sc.nextLine();
        dictionary.searchWord("krychle");
        dictionary.searchWord("krychle");
        dictionary.searchWord("krkavec");
        dictionary.searchWord("qweqwsda");

        System.out.println(dictionary.getTopTenKeywords());

        //■Allow adding, replacing, deleting a word;
        dictionary.replace("koule", "ball");
        dictionary.remove("krkavec");
        System.out.println(dictionary);
        //■Display 10 most popular words (the popularity is based on the number of requests);


        System.out.println(dictionary.getByRequests());
    }
}
