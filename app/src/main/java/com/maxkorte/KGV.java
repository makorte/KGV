package com.maxkorte;

public class KGV {
    public static void main(String[] args) {
        try{
            System.out.println(getKGV(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        } catch (Exception e){
            System.out.println("fehlerhafte Eingabe!");
        }
    }

    protected static int getKGV(int a, int b){
        if (b == 0) return a;
        if (a == 0) return b;
        return (a * b) / GGT.getGGT(a, b);
    }
}
