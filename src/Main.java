public class Main {
    public static void main(String[] args) {

        // array of int
        final int ARRAY_LENGTH = 5;
        int[] array = new int[ARRAY_LENGTH];
        double[] arrayDouble = new double[ARRAY_LENGTH];
        array[1] = 55; // naznachenie massiva
        array[0] = 99;
        arrayDouble[3] = 33;


        int[] arrayWithValue = {2, 4, 5, 6, 7, 99, 22};// konkretnye znachenija figurnie skobki

        System.out.println(arrayWithValue.length);  //hranitsia dlina massiva


        char[] characters = {'b', 'f', 'f', 121};

        String[] arrayOfString = new String[2]; // massiv kotorij soderzhit dva elementa
        String[] arrayOfStringValue = {"hello", "world"};
        arrayOfString[1] = "first String";


        //System.out.println("Hello world!");

        // get value from array - tam sozdali massiv
        System.out.println(arrayOfStringValue[0]);
        System.out.println(arrayOfStringValue[1]);
        //ArrayIndexOutOfBoundsException - runtime
        // System.out.println(arrayOfStringValue[2] ); // index 2 out of bounds length 2, RUN TIME ERROR

        String[] seasonsArray = new String[4];
        seasonsArray[3] = "Autumn";
        seasonsArray[3] = "Fall"; //zamenitsia na eto znachenie
        seasonsArray[0] = "Winter";
        seasonsArray[1] = "Spring";
        seasonsArray[2] = "Summer";

        // loop
        for (int seasonId = 0; seasonId < seasonsArray.length; seasonId++) {
            System.out.println("season id = " + seasonId);
            System.out.println("currant season is " + seasonsArray[seasonId]);
        }

        for (int number = 0; number <= 7; number++) {
            System.out.println("Current value of number is " + number);
        }
//        //beskonechnij cikl nado ostanovit CTRL + C
//
//        for (int number = 0; true; number++) {
//            System.out.println("Current value of number is " + number);
//        }
        // mozhno isplozovat kogda iz vne prihodit ...
//        int courier = 5;
//        while (courier > 0){
//            System.out.println("courier ->" + courier);
//            courier--;
//        }

        // 16 Homework
        // 1 task. Average of the elements for a given array of the integers. In this case we use array to store numbers and a loop to calculate they sum.
        // To find the average we will divide the sum by number of array elements

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // access all elements using for each loop
        // add each element in sum
        for (int number : numbers) {
            sum += number;
        }
        // get the total number of elements
        int arrayLength = numbers.length;
        //calculate the average

        double average = (double) sum / numbers.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average of the numbers: " + average);


        // 2 task. Find the largest element in the array
        int[] arrays = {1, 2, 3, 4, 5};
        int max = arrays[0];

        for (int num = 1; num < arrays.length; num++) {
            if (arrays[num] > max) {
                max = arrays[num];
            }
        }

        System.out.println("The largest element in the array is: " + max);


        // 3 task. Finding duplicate elements in the given array

        int[] numerics = {1, 2, 3, 2, 4, 5};

        for (int i = 0; i < numerics.length; i++) {
            for (int j = i + 1; j < numerics.length; j++) {
                if (numerics[i] == numerics[j]) {

                    System.out.println("Duplicate element found: " + numerics[i]);
                }
            }
        }
        // 4 task. Sum of all elements in a given array

        int[] numbr = {1, 2, 3, 4, 5};
        int total = 0;
        for (int i = 0; i < numbr.length; i++) {
            total += numbr[i];
        }
        System.out.println("Sum of all elements in a given array is " + total);


        // 5 task. Print numbers from 10 to 1 in reverse order using FOR loop. To decrease a loop variable, use the decrement "--".

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

            // 6a task. Count the number of characters in a string, ignoring spaces

            String str = "Hello, World!";
            int count = 0;
            for (int a = 0; a < str.length(); a++) {
                if (str.charAt(a) != ' ') {
                    count++;
                }
            }
            System.out.println("Characters number without spaces is " + count);


            //6b task. Count the number of characters with spaces in the "All of The Times" string

            String str1 = "All of The Times";
            int countWithSpace = 0;
            for (int b = 0; b < str1.length(); b++) {
                if (str1.charAt(b) == ' ') {
                    countWithSpace++;
                }
            }
            System.out.println("Characters number with spaces is " + countWithSpace);

            // 7 task. Sum of all elements in a given array using WHILE loop
            int[] block = {1, 2, 3, 4, 5};
            int sumValue = 0;
            int c = 0;

            while (c < block.length) {
                sumValue += block[c];
                c++;
            }

            System.out.println("Sum of all elements in the array with while loop is : " + sumValue);
        }
    }
}








































