package POO;

import java.util.Scanner;

public class Libro {
    Scanner in = new Scanner(System.in);
    int isbn;
    int nPaginas;
    String titulo;
    String autor;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "El libro con ISBN "+isbn+" creado por el autor "+autor+" tiene "+nPaginas+" páginas";
    }
    public String contPaginas(int paginas1, int paginas2){
        if(paginas1 > paginas2){
            return "El libro 1 contiene más páginas";
        }
        else if(paginas2 > paginas1){
            return "El libro 2 contiene mas paginas";
        }
        else return "Ambos libros tienen la misma cantidad de páginas";
    }
    public void cargaLibro(Libro obj){
        System.out.print("Ingrese el titulo del primer libro: ");
        String titulo1 = in.nextLine();
        System.out.print("Ingrese el nombre del autor:");
        String autor1 = in.nextLine();
        System.out.print("Ingrese el numero de ISBN: ");
        int ISBN = in.nextInt();
        System.out.print("Ingrese el numero de paginas del libro: ");
        int pag1 = in.nextInt();
        obj.setTitulo(titulo1);
        obj.setAutor(autor1);
        obj.setIsbn(ISBN);
        obj.setnPaginas(pag1);
    }
}
