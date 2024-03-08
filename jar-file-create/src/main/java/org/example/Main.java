package org.example;

public class Main{
    public static void main(String[] args){
        try{
            System.out.println("stat try");
            int x  = 10/0;
            System.out.println("end try");
        }catch(Exception e){
            System.out.println("start catch");
            e.printStackTrace();
            System.out.println("end catch");
        }
    }
}