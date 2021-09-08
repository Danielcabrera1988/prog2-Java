package POO;

import java.util.Objects;

public class Birome {
    int cant_tinta;

    public Birome(int cant) {
        this.cant_tinta = cant;
    }

    public void write(Papel object, String txt) {
        int cont;
        cont = txt.length();
        String[] split = new String[cont];
        for (int i = 0; i < txt.length(); i++) {
            split[i] = String.valueOf(txt.charAt(i));
            object.escribir(String.valueOf(txt.charAt(i)));
        }

        for (int i = 0; i < txt.length(); i++) {
            if (!Objects.equals(split[i], " ")) {
                System.out.print(split[i]);
                this.cant_tinta --;
                if (this.cant_tinta == 0){
                    break;
                }
            }
            else if (Objects.equals(split[i], " ")){
                System.out.print(split[i]);
            }
        }
        if (this.cant_tinta == 0) System.out.println("\nBirome sin tinta, por favor Recargue");
    }
}

