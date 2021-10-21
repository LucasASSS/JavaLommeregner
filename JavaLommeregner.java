package com.company;

import java.util.Scanner;

public class JavaLommeregner {



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.println("Vil du +(1), minus(2), gange(3), dividere(4) eller afslut programmet(0)");
            int action = input.nextInt();

            if (action == 0) {
                System.out.println("Programet stopper :/");
                i++;
                return;
            }

            System.out.println("Du skal indsætte dit første nummer!");
            int x = input.nextInt();

            System.out.println("Du skal indsætte dit andet nummer!");
            int y = input.nextInt();

            if (action == 1) {
                System.out.println(x + y);
            } else if (action == 2) {
            System.out.println(x - y);
            } else if (action == 3) {
            System.out.println(x*y);
            } else if (action == 4) {
                if (y == 0 || x == 0) {
                    System.out.println("Du kan ikke dividere med 0!");
                } else {
                    System.out.println(x/y);
                }

            }
            }

        }
    }

