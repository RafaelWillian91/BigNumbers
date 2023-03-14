package integerBigdecimal;

import java.math.BigDecimal;

public class Bigdecimall {

    public static void main(String[] args) {

        BigDecimal big = new BigDecimal("1465444873.44");//Numeros double grandes

        System.out.println(big);

        //Assim como em BigInteger as operacoes com Bigdecimal são chamadas em métodos

        big = big.multiply(BigDecimal.TEN);//Tambem imutável

        System.out.println(big);

        //Na conversão temos que cuidar com a extracao, para caber dentro do tipo primitivo
        int a = big.intValue();

        System.out.println(a);
    }

}
