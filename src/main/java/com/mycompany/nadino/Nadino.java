package com.mycompany.nadino;
import java.util.*;

public class Nadino {
    static ArrayList<Libro> libros = new ArrayList();
    static ArrayList<Libro> librostmp = new ArrayList();
    static int c=0;
    //static HashMap<Integer, Libro> indices_libros = new HashMap<>();
    
    //HashMap<String, ArrayList> mapAutores = new HashMap<>();
    static Scanner lectura = new Scanner (System.in);
    public static void main(String[] args) {
        
        
        int opc=-1;
        do{
            try{  
            System.out.println("Ingresa una opción");        
            System.out.println("\n 1. Añadir un libro nuevo \n 2. Editar un libro \n 3. Buscar y leer la información de un libro \n 4. Eliminar un libro \n 5. Salir");
            opc = lectura.nextInt();
            
            switch (opc) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    editar();
                    break;
                case 3:
                    buscar();   
                    break;

                case 4:
                    eliminar();
                    break;
                case 5:
                    break;
                default:
                    for (Libro libro : libros) {
                        System.out.println("Id: " + libro.getId());
                        System.out.println("Titulo: " + libro.getTitulo());
                        System.out.println("Autor: " + libro.getAutor());
                        System.out.println("Fecha publicación: " + libro.getAño());
                        System.out.println("Genero: " + libro.getGenero());
                        System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                    System.out.println("Tamaño del array " + libros.size());
                    break;
            }
            }catch(InputMismatchException e){
                System.out.println("Error " + e);
            }
        }while(opc!=5);
    }
    
    public static void crearLibro(){
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

        Libro lib = new Libro(c,salida_titulo,salida_autor,salida_año,salida_genero,salida_editorial,"disponible");
        libros.add(lib);
        c++;
   
    }
    
    public static void buscar(){
        System.out.println("Elija una opción de busqueda");        
        System.out.println("\n 1. Buscar por nombre \n 2. Buscar por autor \n 3. Buscar por fecha de publicación \n 4. Buscar por genero \n 5. Buscar por editorial");
        int opc = lectura.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre del libro");
                String salida_titulo = lectura.next();
                
                for (Libro libro : libros) {
                    if(libro.getTitulo().equals(salida_titulo)){
                         System.out.println("Id: "+ libro.getId());
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                }
             
                break;
            case 2:
                System.out.println("Ingrese el autor del libro");
                String salida_autor = lectura.next();

                for (Libro libro : libros) {
                    if(libro.getAutor().equals(salida_autor)){
                         System.out.println("Id: "+ libro.getId());
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                                     
                }

                break;
            case 3:
                System.out.println("Ingrese la fecha de publicación del libro");
                int salida_año = lectura.nextInt();

                for (Libro libro : libros) {
                    if(libro.getAño()==salida_año){
                         System.out.println("Id: "+ libro.getId());
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
                         System.out.println("Id: "+ libro.getId());
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
                         System.out.println("Id: "+ libro.getId());
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
    
    public static void eliminar(){
        buscar();
        System.out.println("Ingresa el id del libro a eliminar");
        int num_libro = lectura.nextInt();
        if(num_libro<libros.size()){
            libros.remove(num_libro);
        }else{
            System.out.println("Opción invalida");
        }
    }
    
    public static void editar(){
        buscar();
        System.out.println("Ingresa el id del libro a editar");
        int num_libro = lectura.nextInt();
        String respuesta;
        if(num_libro<libros.size()){
            Libro tmp = libros.get(num_libro);
            
            System.out.println("¿Modificara el titulo? (s/n)");
            respuesta=lectura.next();
            if(respuesta.equals("s")){
                System.out.println("Nuevo titulo");
                tmp.setTitulo(lectura.next());
            }

            System.out.println("¿Modificara el autor? (s/n)");
            respuesta=lectura.next();
            if(respuesta.equals("s")){
                System.out.println("Autor");
                tmp.setAutor(lectura.next());
            }

            System.out.println("¿Modificara la fecha publicación? (s/n)");
            respuesta=lectura.next();
            if(respuesta.equals("s")){
                System.out.println("Fecha publicación");
                tmp.setAño(lectura.nextInt());
            }

            System.out.println("¿Modificara el genero? (s/n)");
            respuesta=lectura.next();
            if(respuesta.equals("s")){
                 System.out.println("Genero");
                 tmp.setGenero(lectura.next());
            }

            System.out.println("¿Modificara la editorial? (s/n)");
            respuesta=lectura.next();
            if(respuesta.equals("s")){
                System.out.println("Editorial");
                tmp.setEditorial(lectura.next());
            }
            
            libros.set(num_libro, tmp);
        }else{
            System.out.println("Opción invalida");
        }
    } 
}
