package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 12321; // berilgan son

        int num = n; //
        int temp;
        int reverseNum = 0;

        for (; num != 0; ) {
            temp = num % 10;
            reverseNum = reverseNum * 10 + temp;

            num = num / 10;
        }

        if(n == reverseNum){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }



        










    }
}
