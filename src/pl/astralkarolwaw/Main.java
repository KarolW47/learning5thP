package pl.astralkarolwaw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scannerForInts = new Scanner(System.in);
        Scanner scannerForStrings = new Scanner(System.in);
        boolean isStillRunning = true;
        double typedNumber1St;
        double typedNumber2Nd;
        int chosenOperation;
        String chosenExitOption;

        System.out.println("Welcome in kinda simple calculator :)");
        while (isStillRunning){
            System.out.println("Type first number:");
            typedNumber1St = scannerForInts.nextInt();

            System.out.println("Press 1 to +");
            System.out.println("Press 2 to -");
            System.out.println("Press 3 to *");
            System.out.println("Press 4 to /");
            System.out.println("Chose operation:");
            chosenOperation = scannerForInts.nextInt();

            System.out.println("Type second number:");
            typedNumber2Nd = scannerForInts.nextInt();

            switch (chosenOperation){
                case 1 -> System.out.println("Restult = " + (typedNumber1St+typedNumber2Nd));
                case 2 -> System.out.println("Restult = " + (typedNumber1St-typedNumber2Nd));
                case 3 -> System.out.println("Restult = " + (typedNumber1St*typedNumber2Nd));
                case 4 -> System.out.println("Restult = " + (typedNumber1St/typedNumber2Nd));

            }
            System.out.println("Next operation? y/n");
            chosenExitOption = scannerForStrings.nextLine();
            if (chosenExitOption.equals("n")){
                isStillRunning = false;
            }

        }



    }
}
