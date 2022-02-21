package br.com.projetos.ultilitarios;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static BigDecimal convertBigdecimal(Object o){
        if(o instanceof String){
            return new BigDecimal(o.toString());
        }else if(o instanceof Double){
            return BigDecimal.valueOf(Double.valueOf(o.toString()));
        }else if(o instanceof Integer){
            return new BigDecimal(o.toString());
        }
        return null;
    }
}
