package POO;

public class PasswordGenerator {

    private final String NUMEROS = "0123456789";
    private final String MAYUSCULAS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private final String MINUSCULAS = "abcdefghijklmnñopqrstuvwxyz";

    protected String getPinNumber() {
        return generarPassword(NUMEROS, 4);
    }

    protected String getPassword() {
        return getPassword(8);
    }

    protected String getPassword(int length) {
        return generarPassword(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
    }

    protected String generarPassword(String key, int length) {
        String pswd = "";
        for (int i = 0; i < length; i++) {
            pswd+=(key.charAt((int) (Math.random() * key.length())));
        }
        return pswd.toString();
    }
}
