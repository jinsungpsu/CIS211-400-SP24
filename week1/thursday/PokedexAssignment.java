import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PokedexAssignment {
    static ArrayList<Pokemon> mypokedex = new ArrayList<>();

    public static void main(String[] args) {


        // file reading review
        // absolute/relative paths

        String filepath = "pokedex.csv";
        File pokedexFile = new File(filepath);
        try {
            Scanner fileinput = new Scanner(pokedexFile);

            // throw away first line
            fileinput.nextLine();

            while(fileinput.hasNextLine() == true) {
                String lineInfo = fileinput.nextLine();
                String[] lineInfoSplit = lineInfo.split(",");
                /*
                0:#
                1: Name
                2: Type 1
                3: Type 2
                4: Total
                5: HP
                6: Attack
                7: Defense
                8: Sp. Atk
                9: Sp. Def
                10: Speed
                11: Generation
                12: Legendary
                 */
                Pokemon tempPoke = new Pokemon();
                tempPoke.setId(Integer.parseInt(lineInfoSplit[0]));
                tempPoke.setName(lineInfoSplit[1]);
                System.out.println(lineInfo);
                mypokedex.add(tempPoke);
            }
            System.out.println("\n\n\nPrinting out the arraylist contents:");
            System.out.println(mypokedex);


        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
