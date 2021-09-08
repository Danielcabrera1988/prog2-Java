package POO;

import java.util.Arrays;
import java.util.Random;

public class Password {
    Random rdn = new Random();
    int longitud = 8;
    String [] contrasenia;

    public Password(){
    }

    public Password(int longitud){
        int pass = rdn.nextInt(99999999-10000000+1)+10000000;
        this.longitud = longitud;

    }
}
