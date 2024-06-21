package Operators;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        int y = x++;
        System.out.println(x +" "+ y);
        int z = y+++ ++x;
        System.out.println(x +" "+ y+ " "+ z);
    }
}
