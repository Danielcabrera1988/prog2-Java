package POO;

import java.util.Objects;

public class Sacacorchos {
    boolean tieneCorcho;

    public void destapar(Botella botella){

        if (botella.corcho.enBotella) {
            System.out.println("El corcho ha sido removido");
            botella.corcho.enBotella = false;
            this.tieneCorcho = true;
        }
        else System.out.println("El saca corchos ha sido utilizado, la botella no tiene corcho");
    }

    public void limpiar(Sacacorchos scorcho){
        if (this.tieneCorcho){
            System.out.println("El saca corchos tiene un corcho, removiendo...");
            this.tieneCorcho = false;
        }
        else System.out.println("El saca corchos esta limpio y puede ser utilizado");
    }
}
