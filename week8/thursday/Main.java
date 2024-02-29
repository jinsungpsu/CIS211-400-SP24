import java.util.HashMap;
import java.util.Map;

public class Main {

    /*

     */
    static int hashFunction(String key) {
//        if (key.equals("Hello")) {
//            return 0;
//        } else {
//            return 1;
//        }
        System.out.println("Hash value for " + key + " is " + key.hashCode());
        return Math.abs(key.hashCode())%10;
    }


    public static void main(String[] args) {

        /*
        String to String map
         */
        String[] hashDictionary = new String[10];
        // Hello, Hola
        hashDictionary[hashFunction("Hello")] = "Hola";

        System.out.println(hashDictionary[hashFunction("Hello")]);

        // Bye, Adios
        hashDictionary[hashFunction("Bye")] = "Adios";

        System.out.println(hashDictionary[hashFunction("Hello")]);
        System.out.println(hashDictionary[hashFunction("Bye")]);

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("Hello", "Hola");
        dictionary.put("Bye", "Adios");
        /*
        how do we get all major operations on a map
        to be O(1)...

        we're gonna use an associative array
         */

        int[] nums = {11, 25, 99};
        /*
        the associations between key value pairs in this array:
        0 > 1
        1 > 25
        2 > 99
         */

        // we're in charge of keepin track of racers...
        /*
        index 0 - gold
        index 1 - silver
        index 2 - bronze
         */
        String[] finishers = {"John", "Joly", "Kaycee"};
        // how do i find out who finished 1st?
        // O(1) - constant time... can INSTANTLY get first place finisher
        System.out.println("First place is: " + finishers[0]);

        // O(n) - linear... have to linearly search through all results
        String[] finishers2 = {"2: John", "3: Joly", "1: Kaycee"};
        for (int i = 0; i < finishers2.length; i++) {
            if (finishers2[i].charAt(0) == '1') {
                System.out.println("First place is: " + finishers2[i]);
            }
        }

        String[] students = new String[800000000];

        students[700123456] = "Jacob";
        students[700999123] = "Max";
        students[700000001] = "Cooper";







        System.out.println(dictionary);

//        for (int i = 0; i < dictionary.size(); i++) {
//            System.out.println(dictionary.get(i));
//        }

        for (String name: dictionary.keySet()) {
            String key = name;
            String value = dictionary.get(name);
            System.out.println(key + " " + value);
        }












//        Map<Integer, String> dictionary2 = new HashMap<>();
//
//        dictionary2.put(1, "Uno");
//        dictionary2.put(2, "Dos");
//
//
//
//
//        System.out.println(dictionary2.get(2));
//
//        System.out.println(dictionary.get("Hello"));
    }
}
