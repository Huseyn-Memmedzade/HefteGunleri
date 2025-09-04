package yenipabka;

import java.util.Scanner;

public class HefteGunleri {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Heftenin Gununu Daxil Edin");
        int gun = sc.nextInt();

        switch (gun) {
            case 1:
                System.out.println("1-ci Gun");
                break;

            case 2:
                System.out.println("2-ci gun");
                break;

            case 3:
                System.out.println("3-cu gun");

                break;
            case 4:
                System.out.println("4-cu gun");
                break;
            case 5:
                System.out.println("5-ci gun");
                break;
            case 6:
                System.out.println("6-ci gun");
                break;
            case 7:
                System.out.println("Bazar gunu");
                break;

            default:
                System.out.println("Sehv Gunu Daxil Etdiniz");
                break;
        }


    }


}
