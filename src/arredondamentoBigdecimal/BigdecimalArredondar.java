package arredondamentoBigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigdecimalArredondar {

    public static void main(String[] args) {

        BigDecimal b1 = BigDecimal.valueOf(1.43);
        b1 = b1.setScale(1, RoundingMode.UP);
        //RoundinfMode fala qual o tipo de arredondamento
        // vai arredondar em 1 casa decimal

        System.out.println(b1);

    }

}
