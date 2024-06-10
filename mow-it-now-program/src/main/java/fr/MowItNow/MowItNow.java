package fr.MowItNow;

import java.io.File;
import java.util.Scanner;

import fr.MowItNow.implementation.InputReader;
import fr.MowItNow.implementation.LawnImpl;

/**
 * Main class to operate lawnmowers.
 */
public class MowItNow {

    public static String mowItNow(InputReader input){
        LawnImpl lawn = input.getLawn();
        return lawn.moveMowers();

    }
    public static void main(String[] args) {
        String filePath = " ";
        if(args.length == 1){
            filePath = args[0];
        }else{
            if(args.length == 2){
                filePath = args[1];
            }else{
            Scanner userInputScanner = new Scanner(System.in);
            System.out.println("Please enter the path of the input file :");
            filePath = userInputScanner.nextLine();
            userInputScanner.close();
            }
        }
        
        InputReader input = new InputReader(filePath);
        String output = mowItNow(input);
        System.out.println(output);
    }
}
