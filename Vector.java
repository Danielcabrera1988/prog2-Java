package POO;

import java.util.Arrays;

public class Vector {
    private int elemento_x;
    private int elemento_y;
    private int elemento_z;
    private int [] elements;

    public Vector(int [] elements) {
        this.elements = elements;
    }

    public Vector multiplication(int num){
        int [] vec = this.elements;
        Vector vm = new Vector(vec);
        for (int i = 0; i < this.elements.length; i++) {
            vm.elements[i] = this.elements[i] * num;
        }
        return vm;
    }

    public Vector add(Vector v2){

        if (this.elements.length != v2.elements.length){
            System.out.println("Error, cantidad de elementos erronea ");
            return v2;
        }
        else {
            Vector vector = new Vector(this.elements);
            for (int i = 0; i < this.elements.length; i++) {
                vector.elements[i] = this.elements[i] + v2.elements[i];
            }
            return vector;
        }
    }

    public String toString() {
        return "Coordenadas del Vector "+ Arrays.toString(this.elements);
    }
}


