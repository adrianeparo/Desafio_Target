package ex005;

public class Inverter {

    public static void main(String[] args) {

        String palavra = "Desafio Target";

        for(int stringTamanho = palavra.length() - 1; stringTamanho >= 0; stringTamanho--){

            System.out.print(palavra.charAt(stringTamanho));

        }
        
    }
}
