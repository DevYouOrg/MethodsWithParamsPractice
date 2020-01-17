package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Room Area Calculator Application");

        System.out.println("Would you like to calculate the perimeter or area of your room? Choose (1) for perimeter and (2) for area");

        int userChoice = input.nextInt();

        System.out.println("Please enter the length of your room");
        int roomLength = input.nextInt();

        System.out.println("Please enter the width of your room");
        int roomWidth = input.nextInt();


        switch (userChoice){
            case 1:
                CalculateRoomPerimeter(roomLength,roomWidth);
                break;
            case 2:
                CalculateRoomArea(roomLength,roomWidth);
                break;

            default:
                System.out.println("Please enter a valid choice");

                //Extra Challenge: Allow the user to use the app again
        }

    }

    public static void CalculateRoomPerimeter(int length, int width){

        int result = length + length + width + width;
         System.out.println("The perimeter of the room is " + result);
    }
    public static void CalculateRoomArea(int length, int width){

        int result = length * width;
        System.out.println("The perimeter of the room is " + result);

    }
}
