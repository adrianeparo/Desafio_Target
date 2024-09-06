package ex003;

public class Faturamentos {
    public static void main(String[] args) {

        double[] faturamentos = { 2999.51, 8199.27, 1599.42, 4798.91, 2199.67, 3999.18, 6599.85,
                1499.23, 3799.56, 8999.12, 2599.78, 4999.35, 7999.92, 1399.58,
                2799.21, 4599.76, 6999.31, 9599.86, 1999.52, 4399.17, 6799.82,
                9199.47, 1199.13, 3599.68, 5999.23, 8399.78, 10799.33, 1299.88 };

        double menorFaturamento, maiorFaturamento, media;
        
        menorFaturamento = maiorFaturamento = faturamentos[0];
        media = 0;    

        for(int i = 0; i < 28; i++){

            if(faturamentos[i] > maiorFaturamento){
                maiorFaturamento = faturamentos[i];
            }

            if(faturamentos[i] < menorFaturamento){
                menorFaturamento = faturamentos[i];
            }

            media += faturamentos[i];

        }   

        media = media / 28;
        int dias = 0;

        for(int i = 0; i < 28; i++){
            
            if(faturamentos[i] > media){
                dias++;
            }
        }

        System.out.println("Maior Faturamento: " + maiorFaturamento);
        System.out.println("Menor Faturamento: " + menorFaturamento);
        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Dias com faturamento acima da média: " + dias);

    }
}
