package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
	    for (int i = 1; i < 1001; i++ ) {
	        if (count >= 5) {
	            break;
            }
	        if (i % 3 == 0 && i % 5 == 0) {
	            sum += i;
	            count ++;
                System.out.println(i);
            }
        }
        System.out.println(sum);

	    int number = 4;
	    int finishNumber = 20;
	    int totalFound = 0;

	    while (number <= finishNumber && totalFound < 5) {
	        number ++;
	        if (!isEvenNumber(number)) {
	            continue;
            }
	        totalFound++;
            System.out.println("Even Number = " + number);
        }
        System.out.println("Total Found = " + totalFound);
    }

    public static boolean isEvenNumber(int number) {
        return (number > 0 && number % 2 == 0);
    }

    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        if (start <= end && start > 0) {
            int sumNumber = 0;
            for (int i = start; i <= end; i++ ) {
                if(isOdd(i)) {
                    sumNumber += i;
                }
            }
            return sumNumber;
        } else {
            return -1;
        }
    }
}
