package POO;

public class Password {

    int longitud;
    private String pswd;


    public Password(){
        this.longitud = 8;
        this.pswd = passwordGen();
    }

    public Password(int longitud){
        this.longitud = longitud;
        this.pswd = passwordGen();
    }

    public String getPswd() {
        return pswd;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean esFuerte(String o){
        int May = 0, min = 0, number = 0;
        int passTotal = 0;
        char character;
        for (int i = 0; i < o.length(); i++) {
            character = o.charAt(i);
            if (Character.isUpperCase(character)) May++;
        }
        for (int i = 0; i < o.length(); i++) {
            character = o.charAt(i);
            if (Character.isLowerCase(character)) min++;
        }
        for (int i = 0; i < o.length(); i++) {
            if (o.charAt(i) > 47 && o.charAt(i) < 58) number++;
        }
        if (May >= 2) passTotal += May;
        if (min >= 1) passTotal += min;
        if (number >=5) passTotal *=number;
        return passTotal >= 8;
    }

    public String passwordGen() {
        String key = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
        String pswd = "";
        for (int i = 0; i < 8; i++) {
            pswd+=(key.charAt((int) (Math.random() * key.length())));
        }
        return pswd.toString();
    }
    public String passwordGenUser(int length) {
        String key = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
        String pswd = "";
        for (int i = 0; i < length; i++) {
            pswd+=(key.charAt((int) (Math.random() * key.length())));
        }
        return pswd.toString();
    }

    @Override
    public String toString() {
        return "Password => {"+this.pswd+"}";
    }
}
