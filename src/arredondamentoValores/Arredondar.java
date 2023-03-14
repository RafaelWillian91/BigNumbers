package arredondamentoValores;

public class Arredondar {


    public static void main(String[] args) {

        double a = 1.1;

        //Para aredondar, podemos trabalhar com a classe Math.around
        long a3 = Math.round(a);//De 5 para cima ele arredonda para cima

        System.out.println(a3);//saída: 2 se a for >=5

        //Outra opcao
        double e3 = Math.floor(a);
        System.out.println(e3);// saida 1 para a <= 1.9

        double e4 = Math.ceil(a);
        System.out.println(e4);// saida 1 para a >= 1.1

        //Como no arredondamento é cortada a parte decimal é seguro em todos os casos fazer um cast explicito para long

    }

}
