package com.androidbootcamp.exam;

/**
 * Created by adrianmcmains on 12/05/2017.
 */
public class Code2flow {
    public static void main(String[] args){
        System.out.println("Welcome to code2flow");

        boolean indoubt = true;
        boolean ready = true;

        if (indoubt){
            System.out.println("Press help");

            while (!ready){
                System.out.println("Read help");
            }

            if (!ready){
                System.out.println("My name is chris");
            }
        }else {
            System.out.println("Improve your work");
        }
    }
}
