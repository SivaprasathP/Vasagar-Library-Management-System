package com.vasagar;

import com.vasagar.login.Login;

import java.util.Scanner;

public class Vasagar {
    public static void main(String[] args) {
        System.out.println("Welcome to Vasagar");
        System.out.println("==================");
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1.Login\n2.Exit");
            System.out.println("Enter your choice:");
            int choice=scanner.nextInt();

            if(choice==1){
                Login login=new Login();
                login.userLogin();
            }else{
                break;
            }
        }


    }
}
