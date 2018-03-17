package IntroToJava;

import java.security.SecureRandom;
import java.util.*;


public class SuperLottoPlusArray {

    public static void main(String[] args) {


        System.out.println("How Many lotto tickets would you like?");
        Scanner ticketsNum = new Scanner (System.in);
        int ticketsWanted = ticketsNum.nextInt();

        for (int t = 1; t <= ticketsWanted; t++ ) {
            printTicket(generateNumbers());
        }

    }
    public static int[] generateNumbers(){


        int [] lottoNumbers = new int[6];
        boolean valid;
        SecureRandom r = new SecureRandom();


        for (int counter = 0; counter < lottoNumbers.length; counter++)
        {
            valid = false;
            while(valid == false && counter != 5)
            {
                lottoNumbers[counter] = 1 + r.nextInt(47);
                valid = true;
                for(int i = 0; i < counter; i++)
                {
                    if(lottoNumbers[counter] == lottoNumbers[i])
                    {
                        valid = false;
                    }
                }
            }
            if(counter == 5)
            {
                lottoNumbers[counter] = 1 + r.nextInt(27);
            }
        }
        return lottoNumbers;
    }

    public static void printTicket(int[] finalTicket){

        for(int i = 0; i < finalTicket.length; i++)
        {
            if(i<5)
                System.out.printf("%d ", finalTicket[i]);
            else
                System.out.printf("MEGA (%d)%n", finalTicket[i]);
        }

    }
}



