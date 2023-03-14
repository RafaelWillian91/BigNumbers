package valoresMonetarios;

import java.math.BigDecimal;

public class Valoresmonetarios {

    public static void main(String[] args) {

        double m1 = 1.09 - 0.60 -0.8;//Começam a aparecer diversos problemas devido a como o float e o double
        //Trabalham. Não só no java, mas as linguagens tem esse problema com esses tipos de operacoes com casas decimais.
        System.out.println(m1);//-> saida : 0.4900000000000001

        //A Solução é não usar float e double para valores monetários.
        //Existem duas opçoes para valores monetários no java.
        //1° é trabalhar com inteiros e mover as casas de virgula para trabalhar com centavos. Ex: Sempre divide por 100
        //2°opção é a mais usada é o Bigdecimal.

        BigDecimal b1 = new BigDecimal("1.09");
        System.out.println(b1);
        BigDecimal b2 = BigDecimal.valueOf(1.09);
        System.out.println(b2);
        b2 = b2.subtract(BigDecimal.valueOf(0.60));
        b2 = b2.subtract(BigDecimal.valueOf(0.8));
        System.out.println(b2);



    }

}
