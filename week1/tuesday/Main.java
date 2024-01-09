
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Download/install IntelliJ Community Edition

        create an array... fill it with stuff
        print out the contents

        without googling and/or chatGPT

        find some csv file (or make one)
        print out the contents
        * you can use google for this part...
         */

        int[] nums = {1,2,3};
        int[] reverseArr = new int[3];
        int[] nums2 = {1,2,3};
        char[] letters = new char[10];

        Food pizza = new Food();

        System.out.println("display forward:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("display in reverse 1: ");
        // display in reverse
        for (int i = nums.length-1; i > -1; i--) {
            System.out.println(nums[i]);
        }

        System.out.println("Display in reverse 2: ");

        for (int i = 0; i < nums.length; i++) {
            // 0, 1, 2
            System.out.println(nums[nums.length-1-i]);
            reverseArr[i] = nums[nums.length-1-i];
        }

        nums = reverseArr;

        System.out.println("Reversed contents:");
        printArr(nums);



        // actually reverse the contents in the array

        // break - restart at 3pm

    }

    static void printArr(int[] arr) {
        System.out.println("Contents of the array:");
        for (int i = 0; i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}