import java.util.Random;

public class AppMain {

    public static void main(String[] args) {
        //psvm

        //             0,1,2,3
        //       int[] arr = {1, 2, 3, 4}; // * * [* * * *] * * * * *
        //       int[] juiceArr = new int[10];  // * * [* * * * * * * *] *

//        System.out.println("Second index of arr = "+ arr[1]);
//        arr[1] = 12;
//        System.out.println("Second index of arr after replacement = "+ arr[1]);

//        juiceArr[8] = 9;
//        System.out.println("4 : " + juiceArr[3]);


        int age = 62;
//    (condition1) = age >= 18

// ((condition1) && (condition2))        (true) && (true) => true
// ((condition1) && (condition2))        (false) && (true) => false
// ((condition1) && (condition2))        (true) && (fasle) => false
// ((condition1) && (condition2))        (false) && (fasle) => false

//        if (age < 18) {
//            System.out.println("Not allowed alco!");
//        } else if ((age >= 18) && (age < 21)) {
//            System.out.println("Allow drink beer ");
//        } else if ((age >= 21) && (age<=60) ) {
//            System.out.println("Allow all!");
//        } else {
//            System.out.println("Not a good idea");
//        }


//        int a = 10;
//        if(a%2 == 0) {
//            System.out.println("2");
//        }
//        else if(a%5 == 0) {
//            System.out.println("5");
//        }

//        int j = 10;
//        j = j +1;
//        j=+1; // j = j +1;
//        j--;


//        int summ = 0;
//        int notEvenSumm = 0;
//        int count = 0;
//        for(var i = 0; i <= 143; i++) {
//            if(i % 2 == 0) {
//                summ += i;
//                count++;
//            } else {
//                notEvenSumm +=i;
//            }
//        }
//        System.out.println("Sum even: "+ summ/count);
//        System.out.println("Sum  not even: "+ notEvenSumm/(142-count));


//
//        for (int i = 0; i < arr.length; i++) {
//
//        }

//        for(int i = 5; i< 10; i+=10) {   // i += 5  == i=i+5; i-=5  === i=i-5;
//            System.out.println(i);
//        }

//        int[] arr = new int[10];
//        for (var i = 0; i < arr.length; i++) {
//            arr[i] = i*10;
//        }
//
//        for (int i : arr) {  // [1,2,3,4,5,6,7,8,8]
//            System.out.println(i);
//        }


//        for(int i = arr.length ; i>0; i--) {
//            System.out.println(i);
//        }

        //*******HINT***********
        // for(int i = 0; i< 10; i++) {} - simple for
        // for(int i : array) {} - for-each

//        int count = 0;
//        Random random = new Random();
//
//        while (count % 7 == 0) {
//            count = random.nextInt(100);
//            System.out.println(count);
//        }
//        System.out.println("Stop number is: "+ count);


//        int i = 5;
//        do {
//            i++;// i = i + 1     i--  === i = i-1;
//            System.out.println(i);
//        }while (i< 10);
        System.out.println(reverse("a1bc3d efg!h"));
    }

    public static String reverse(String source) {
        String sourceWords[] = source.split(" ");
        String reverseWords[] = new String[sourceWords.length];
        for (int i = 0; i < sourceWords.length; i++) {

            char sourceWord[] = sourceWords[i].toCharArray();
            char wordCompare[] = sourceWords[i].toCharArray();

            int count = 0;
            for (int j = sourceWord.length - 1; j >= 0; j--) {
                if (!Character.isLetter(wordCompare[count])) {
                    if (count < sourceWords[i].length()) {
                        count++;
                    }
                }
                if (Character.isLetter(sourceWord[j])) {
                    sourceWord[j] = wordCompare[count];
                    count++;

                }

            }

            reverseWords[i] = String.valueOf(sourceWord);
        }

        return String.join(" ", reverseWords);

    }


}

