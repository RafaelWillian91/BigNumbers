import java.math.BigInteger;

public class BigIntegerApp1 {

    public static void main(String[] args) {

        //long a = 839482398492380304492390L;

        //Quando o número do tipo primitivo é muito grande podemos usar a classe Big do java

        //Criamos o BigInteger de diversas formas
        BigInteger i = new BigInteger("839482398492380304492390");
        System.out.println(i);
        //Objetos do Tipo BigInteger são imutáveis. Umas vez declarados nao podem ser alterados;
        //Ou seja qualquer operacao que eu faça gera um novo objeto

        //Suponhamos que eu queira somar esse objeto acima
        i = i.add(BigInteger.TWO);//Tenho que criar um novo objeto ou reatribuir a ele mesmo
        System.out.println(i);

        //A classe oferece outros métodos como o subtract
        i.subtract(BigInteger.TWO);
        i.multiply(BigInteger.ONE);

        i.divideAndRemainder(BigInteger.ONE);//Retorna o resto da Divisao

        i.abs();//Tira o sinal do Numero

        i.toByteArray();//Coverte para um array de Bytes

        System.out.println(i.intValue());//Extrair valores

        BigInteger b4 = BigInteger.valueOf(1000);
        System.out.println(b4.intValue());//foi feito um cast Implicito

        //Geralmente a inicializacao é através de Strings. Numeros muito grandes. Qualquer operacao
        //é com metodos da classe BigInteger e o Retorno é sempre um novo Objeto

    }

}
