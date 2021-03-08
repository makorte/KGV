package com.maxkorte;

public class KGV {
    public static void main(String[] args) {
        try{
            System.out.println(getKGV(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Es müssen 2 Parameter angegeben werden!");
        } catch (NumberFormatException e){
            System.out.println("fehlerhafte Eingabe!");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public static int getKGV(int a, int b){
        if (a == 0 && b == 0) throw new IllegalArgumentException("Es darf nur eine der Zahlen 0 sein!");
        if (a < 0 || b < 0) throw new IllegalArgumentException("Keine Zahl darf negativ sein!");

        if (b == 0) return a;
        if (a == 0) return b;
        return ((a * b) / GGT.getGGT(a, b));
    }
}
