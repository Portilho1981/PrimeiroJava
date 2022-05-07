package com.mycompany.primeiraprova;
    public class PrimeiraProva {
    public static int soma(int x, int y) {
        
        int soma = x + y;
        return soma;
    }    
          public static int subt(int x, int y) {
        int subtracao = x - y;
        return subtracao;
    }    
    public static int mult (int x, int y) {
        int multiplicacao = x * y;
        return multiplicacao;
    }
    public static int divisao (int x, int y) {
        int divisao = x / y;
        return divisao;
    }
    public static void main(String[] args) {
        int X = 10;
        int Y = 20;
        int SOM = X+Y;
        int SUB = SOM-Y;
        int MUT = SUB*Y;
        int DIV = MUT/Y;
        
        System.out.println ("1 METODO x + y : " + SOM);
        System.out.println ("2 METODO SOM - 2 PARAMETRO: " + SUB);
        System.out.println ("3 METODO SUB * 2 PARAMETRO: " + MUT);
        System.out.println ("4 METODO MUT / 2 PARAMETRO: " + DIV);
    }
}    