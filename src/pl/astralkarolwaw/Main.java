package pl.astralkarolwaw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isStillRunning = true;
        int typedNumber1St;
        int typedNumber2Nd;
        int chosenOperation;
        String chosenExitOption;

        System.out.println("Welcome in kinda simple calculator :)");
        while (isStillRunning){
            System.out.println("Type first number:");
            typedNumber1St = scanner.nextInt();

            System.out.println("Press 1 to +");
            System.out.println("Press 2 to -");
            System.out.println("Press 3 to *");
            System.out.println("Press 4 to /");
            System.out.println("Chose operation:");
            chosenOperation = scanner.nextInt();

            System.out.println("Type second number:");
            typedNumber2Nd = scanner.nextInt();

            switch (chosenOperation){
                case 1 -> System.out.println("Restult = " + typedNumber1St+typedNumber2Nd);
                case 2 -> System.out.println("Restult = " + (typedNumber1St-typedNumber2Nd));
                case 3 -> System.out.println("Restult = " + typedNumber1St*typedNumber2Nd);
                case 4 -> System.out.println("Restult = " + typedNumber1St/typedNumber2Nd);

            }
            System.out.println("Next operation? y/n");
            Scanner scanner1 = new Scanner(System.in);
            chosenExitOption = scanner1.nextLine();
            if (chosenExitOption.equals("n")){
                isStillRunning = false;
            }

        }



    }
}
