package POO;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##");
        String name;
        int edad, edad2, edad3, peso;
        char sexo;
        float altura;
        /**=============================EJERCICIO 1===================================*/
        /*
        String nombre;
        int option;
        double saldo, cantidad;
        Cuenta usuario1 = new Cuenta();

        System.out.print("Ingrese el nombre de usuario: ");
        nombre = in.nextLine();
        System.out.print("Ingrese el saldo a depositar: ");
        saldo = in.nextDouble();
        usuario1.setTitular(nombre);
        usuario1.setCantidad(saldo);
        do {
            System.out.println("Ingrese la operacion que desea: ");
            System.out.println("1 ==> Ingresar Dinero");
            System.out.println("2 ==> Retirar Dinero");
            System.out.println("3 ==> Salir");
            option = in.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    cantidad = in.nextDouble();
                    System.out.println("El nuevo saldo es " + usuario1.ingresar(cantidad));
                }
                case 2 -> {
                    System.out.print("Ingrese la cantidad retirar: ");
                    cantidad = in.nextDouble();
                    System.out.println("El nuevo saldo es " + usuario1.retirar(cantidad));
                }
            }
        }
        while(option!=3);
        */
        /**=============================EJERCICIO 2===================================*/
        /*
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        libro1.cargaLibro(libro1);
        libro2.cargaLibro(libro2);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro1.contPaginas(libro1.getnPaginas(), libro2.getnPaginas()));
        */
        /**=============================EJERCICIO 3===================================*/
        /*
        Fraccion fraccion1 = new Fraccion(1,2);
        Fraccion fraccion2 = new Fraccion(2,3);
        System.out.println(fraccion1.sumar(fraccion2));
        System.out.println(fraccion1.multiplicar(fraccion2));
        System.out.println(fraccion1);
        System.out.println(fraccion2);
        */
        /**=============================EJERCICIO 4===================================*/
        /*
        int [] vec1 = {2,4,6};
        int [] vec2 = {2,4};
        Vector v1 = new Vector(vec1);
        Vector v2 = new Vector(vec2);

        System.out.println(v1.add(v2));
        */
        /**=============================EJERCICIO 5===================================*/
        /*
        Papel p1 = new Papel();
        p1.escribir("Hola don pepito! Hola don Jose!");

        Birome b1 = new Birome(20);
        b1.write(p1, p1.texto);
        */
        /**=============================EJERCICIO 6===================================*/
        /*
        Corcho corcho = new Corcho();
        Botella botella = new Botella(corcho);
        Sacacorchos s1 = new Sacacorchos();
        s1.destapar(botella);
        s1.limpiar(s1);
        s1.limpiar(s1);
        s1.limpiar(s1);
        */
        /**=============================EJERCICIO 7===================================*/
        /*
        Mate m1 = new Mate(2);
        m1.cebar();
        m1.beber();
        m1.cebar();
        m1.beber();
        m1.cebar();
        m1.beber();
        */
        /**=============================EJERCICIO 8===================================*/
        /*
        System.out.print("Ingrese el nombre: ");
        name = in.next();
        System.out.print("Ingrese la edad: ");
        edad = in.nextInt();
        System.out.print("Ingrese el sexo 'H'(Hombre) 'M'(mujer): ");
        sexo = in.next().charAt(0);
        System.out.print("Ingrese el peso en KG: ");
        peso = in.nextInt();
        System.out.print("Ingrese la altura en mts: ");
        altura = in.nextFloat();
        Persona p1 = new Persona(name, sexo, edad, altura, peso);
        p1.generaDNI();
        p1.comprobarSexo(sexo);
        System.out.println(p1);
        p1.imcMjs(p1);
        p1.compAge(p1.age(edad));
        */
        /**=============================EJERCICIO 9===================================*/

        Password contrasenia = new Password();
        System.out.println(contrasenia);
        System.out.println(contrasenia.esFuerte(contrasenia.pass.getPassword()));


    }
}
