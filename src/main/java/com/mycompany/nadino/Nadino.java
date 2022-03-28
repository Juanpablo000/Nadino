package com.mycompany.nadino;
import java.util.*;



public class Nadino {
    static ArrayList<Libro> libros = new ArrayList();
    HashMap<String, ArrayList> mapAutores = new HashMap<>();
    
    public static void main(String[] args) {
        
        try{
            Scanner lectura = new Scanner (System.in);
        int opc = -1;
        do{
            System.out.println("Ingresa una opción");        
            System.out.println("\n 1. Añadir un libro nuevo \n 2. Editar un libro \n 3. Buscar y leer la información de un libro \n 4. Eliminar un libro \n 5. Salir");
            opc = lectura.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Titulo");
                    String salida_titulo = lectura.next();
                    System.out.println("Autor");
                    String salida_autor = lectura.next();
                    System.out.println("Fecha publicación");
                    int salida_año = lectura.nextInt();
                    System.out.println("Genero");
                    String salida_genero = lectura.next();
                    System.out.println("Editorial");
                    String salida_editorial = lectura.next();
                    
                    Libro lib = new Libro(salida_titulo,salida_autor,salida_año,salida_genero,salida_editorial);
                    libros.add(lib);
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    buscar();   
                    break;

                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }while(opc!=5);
        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }
    
    public static void buscar(){
        Scanner lectura = new Scanner (System.in);
        System.out.println("Elija una opción de busqueda");        
        System.out.println("\n 1. Buscar por nombre \n 2. Buscar por autor \n 3. Buscar por fecha de publicación \n 4. Buscar por genero \n 5. Buscar por editorial");
        int opc = lectura.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre del libro");
                String salida_titulo = lectura.next();
                for (Libro libro : libros) {
                    if(libro.getTitulo().equals(salida_titulo)){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                }

                //buscar(salida_titulo);
                break;
            case 2:
                System.out.println("Ingrese el autor del libro");
                String salida_autor = lectura.next();

                for (Libro libro : libros) {
                    if(libro.getAutor().equals(salida_autor)){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                }

                //buscar(salida_autor);
                break;
            case 3:
                System.out.println("Ingrese la fecha de publicación del libro");
                int salida_año = lectura.nextInt();

                for (Libro libro : libros) {
                    if(libro.getAño()==salida_año){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                }

                break;
            case 4:
                System.out.println("Ingrese el genero del libro");
                String salida_genero = lectura.next();

                for (Libro libro : libros) {
                    if(libro.getGenero().equals(salida_genero)){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                }
                //buscar(salida_genero);
                break;
            case 5:
                System.out.println("Ingrese la editorial del libro");
                String salida_editorial = lectura.next();

                for (Libro libro : libros) {
                    if(libro.getEditorial().equals(salida_editorial)){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                }
                break;
            default:
                break;
        }
    
    }
    
    /*
    public static void buscar(){
        //String criterio, String valor
        if(criterio.equals("titulo")){
            for (Libro libro : libros) {
                if(libro.getTitulo().equals(valor)){
                     System.out.println("Titulo: " + libro.getTitulo());
                     System.out.println("Autor: " + libro.getAutor());
                     System.out.println("Fecha publicación: " + libro.getAño());
                     System.out.println("Genero: " + libro.getGenero());
                     System.out.println("Editorial: " + libro.getEditorial());
                     break;
                }
            }
        }
    }
    */

    
}


/*

Scanner lectura = new Scanner (System.in);
        //Buscar libro por nom, titulo, genero, etc
        System.out.println("Elija una opción de busqueda");        
        System.out.println("\n 1. Buscar por nombre \n 2. Buscar por autor \n 3. Buscar por fecha de publicación \n 4. Buscar por genero \n 5. Buscar por editorial");
        int opc = lectura.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre del libro");
                String salida_titulo = lectura.next();
                break;
            case 2:
                System.out.println("Ingrese el autor del libro");
                String salida_autor = lectura.next();
                break;
            case 3:
                System.out.println("Ingrese la fecha de publicación del libro");
                int año = lectura.nextInt();
                break;
            case 4:
                System.out.println("Ingrese el genero del libro");
                String salida_genero = lectura.next();
                break;
            case 5:
                System.out.println("Ingrese la editorial del libro");
                String salida_editorial = lectura.next();
                break;
            default:
                break;
        }    
        //buscar, mostrar libros, seleccionar uno, mostrar la info del seleccionado



        //Leer la información de un libro
        for (Libro libro : libros) {

           if(libro.equals("yo")){

               break;
           }
           System.out.println("Titulo: " + libro.getTitulo());
           System.out.println("Autor: " + libro.getAutor());
           System.out.println("Fecha publicación: " + libro.getAño());
           System.out.println("Genero: " + libro.getGenero());
           System.out.println("Editorial: " + libro.getEditorial());
        }

*/
