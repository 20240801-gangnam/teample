package main.java.com.ohgiraffers.teample;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("계산기 만들기");

        System.out.println("첫번째 숫자");
        int a = scr.nextInt();
        System.out.println("두번째 숫자");
        int b = scr.nextInt();
        System.out.println("연산자?");
        scr.nextLine();
        char c = scr.nextLine().charAt(0);
        System.out.println("asdasdas");
        System.out.println("#2 업데이트");
        switch (c){
            case '+' : break;
            case '-' : break;
            case '*' : break;
            case '/' : break;
            case '%' : break;
        }

    }
}
