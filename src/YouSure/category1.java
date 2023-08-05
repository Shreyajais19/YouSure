package YouSure;

import java.util.Random;
import java.util.Scanner;

//This is Category1 only regarding java questions
public class category1 {
    void Category1(){

        Random r = new Random();
        Scanner S = new Scanner(System.in);
        

        String[] Question  = new String[] {"Java is short for JavaScript ?", "What is the default value of byte variable", "variable?"}; //String Array to store questions using array
        int Random_num = 0,j; // all local Variables
        int[] b = new int[3]; // array to store random numbers size is 3
        System.out.println(Random_num);
        char option, YouSure_Choice;


//      for now Generating Random numbers from 0 to 2 and it will be stored in b[]
        for(int  i = 0; i<b.length; i++) {
            b[i]= r.nextInt(3);
            // when we generating random numbers duplicate numbers are big headache
            // so to avoid duplicate numbers like 1,2,2 or 0,0,1
            // using another for loop to check if there is duplicate number
            // if there is i will decrement as long there are duplicate Numbers once there is no duplicate num loop will exit.
            for ( j = 0; j<i;j++){
                if(b[i]==b[j]) {
                    i--;
                }
            }
        }
//        Now b[] has 0,1,2 in random manner so this help to select questions randomly instead of fixed manner
        
        // using for loop to print string array which has questions 
        for(int i=0;i<3;i++) {

            // first generating Random Number in between 0 to 1 for You Sure Method
            Random_num = r.nextInt(2);

            // checking b[i] = 0
            if (b[i] == 0) {
                // checking if random number equal to 1
                if (Random_num == 1) {
                    //printing q1
                System.out.println("Question "+(int)(i+1)+")"+Question [0]);
                System.out.println("A) True\nB) False");
                System.out.println("Press A for True or Press B for False");
                option = S.next().charAt(0);// storing A or B
                    System.out.println("You Sure? It's "+ option+"? It might be other one 👀");
                    System.out.println("If you sure press A if you not sure press B to change option");
                    YouSure_Choice = S.next().charAt(0);
                    if(YouSure_Choice == 'A'||YouSure_Choice == 'a' ) {
                        if (option == 'A' || option == 'a') {
                            System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    Random_num = r.nextInt(2);// generating 0 or 1 again // this second run
                    if(YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("Be Sure This Time!! UwU");
                        System.out.println(Question [0]);
                        System.out.println("A) True\nB) False");
                        System.out.println("Press A for True or Press B for False");
                        option = S.next().charAt(0);
                        if (Random_num == 1) {
                            System.out.println("You Reeally sure?? It might be other one 👀");
                            System.out.println("If you sure press A if you not sure press B to change option");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                                if (option == 'A' || option == 'a') {
                                   System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript");
                                }
                                }
                                if(YouSure_Choice == 'B' || YouSure_Choice == 'b'){
                                    System.out.println("Be Reallyyyy Sure This Time!! UwU");
                                    System.out.println(Question [0]);
                                    System.out.println("Time to select for sure\nA) True\nB) False");
                                    System.out.println("Press A for True or Press B for False");
                                    option = S.next().charAt(0);

                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript");
                            }
                        }
                    }


                }

                // if Random num =0 else will trigger
                else {
                        System.out.println("Question "+(int)(i+1)+")"+Question [0]);
                        System.out.println("A) True\nB) False");
                        System.out.println("Press A for True or Press B for False");
                        option = S.next().charAt(0);

                        if (option == 'A' || option == 'a') {
                            System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript");

                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript");
                        }
                }


                }


            if(b[i] == 1){
                System.out.println("Question "+(int)(i+1)+")"+Question [1]);
            }
            if(b[i]==2){
                System.out.println("Question "+(int)(i+1)+")"+Question [2]);
            }
        }
        }


        }




