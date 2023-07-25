package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Start");
        count();
        System.out.println("Finished!");
    }

    private static void count() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
