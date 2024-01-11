public class SplittingDemo {
    public static void main(String[] args) {
        String info = "hello,2,3,4,bye";
        // split this up by commas
        // the goal
        // end up with 5 different pieces

        String[] allPieces = info.split(",");

        for (int i = 0; i < allPieces.length; i++) {
            System.out.println(allPieces[i]);
        }

        String anotherInfo = "abacadaba";
        // b, c, d, b
        String[] bunchofstuff = anotherInfo.split("a");

        for (int i = 0; i < bunchofstuff.length; i++) {
            System.out.println(bunchofstuff[i]);
        }
    }
}
