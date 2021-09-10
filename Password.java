package POO;

public class Password {

    PasswordGenerator pass = new PasswordGenerator();
    private final int longitud;
    private final String pswd;


    public Password(){
        this.longitud = 8;
        this.pswd = pass.getPassword();
    }

    public Password(int longitud){
        this.longitud = longitud;
        this.pswd = pass.getPassword();
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

    @Override
    public String toString() {
        return "Password => {"+this.pswd+"}";
    }
}
