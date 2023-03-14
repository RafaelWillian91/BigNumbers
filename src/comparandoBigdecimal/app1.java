package comparandoBigdecimal;

import java.math.BigDecimal;

public class app1 {

    public static void main(String[] args) {

        BigDecimal b1 = BigDecimal.valueOf(1);
        System.out.println(b1);
        BigDecimal b2 = BigDecimal.valueOf(1.0);
        System.out.println(b2);

        System.out.println(b1 == b2);//false devido a referencia de memória
        System.out.println(b1.equals(b2));

        //Para comparar Bigdecimal usamos o compareTo. Voltando 0 quer dizer que os numeros são iguais.
        System.out.println(b1.compareTo(b2) == 0);

    }


}
