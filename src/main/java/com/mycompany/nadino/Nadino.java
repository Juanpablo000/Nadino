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
        
        try{
            
        int opc = -1;
        do{
            System.out.println("Ingresa una opción");        
            System.out.println("\n 1. Añadir un libro nuevo \n 2. Editar un libro \n 3. Buscar y leer la información de un libro \n 4. Eliminar un libro \n 5. Salir");
            opc = lectura.nextInt();
            
            switch (opc) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    buscar(false, true);
                    break;
                case 3:
                    buscar(false, false);   
                    break;

                case 4:
                    buscar(true, false);
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
    
    public static void buscar(boolean eliminar, boolean editar){
        System.out.println("Elija una opción de busqueda");        
        System.out.println("\n 1. Buscar por nombre \n 2. Buscar por autor \n 3. Buscar por fecha de publicación \n 4. Buscar por genero \n 5. Buscar por editorial");
        int opc = lectura.nextInt();
        int contador;
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre del libro");
                String salida_titulo = lectura.next();

                for (Libro libro : libros) {
                    if(libro.getTitulo().equals(salida_titulo)){
                         //System.out.println("# "+ contador);
                         System.out.println("Id: "+ libro.getId());
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                    
                }
                                    
                if(eliminar==true){
                    System.out.println("Ingresa el id del libro a eliminar");
                    int num_libro = lectura.nextInt();
                    if(num_libro<libros.size()){
                        libros.remove(num_libro);
                    }else{
                        System.out.println("Opción invalida");
                    }
 

                }else if(editar==true){
                    System.out.println("Ingresa el id del libro a editar");
                    int num_libro = lectura.nextInt();
                    String respuesta="n";
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
                        
                        System.out.println("¿Modificara el genero? (s/n)");
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

                break;
            case 2:
                System.out.println("Ingrese el autor del libro");
                String salida_autor = lectura.next();
                contador =0;

                for (Libro libro : libros) {
                    if(libro.getAutor().equals(salida_autor)){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                    
                    if(eliminar==true){
                        libros.remove(libro);
                    }else if(editar==true){
                        
                        System.out.println("Titulo");
                        libro.setTitulo(lectura.next());
                        System.out.println("Autor");
                        libro.setAutor(lectura.next());
                        System.out.println("Fecha publicación");
                        libro.setAño(lectura.nextInt());
                        System.out.println("Genero");
                        libro.setGenero(lectura.next());
                        System.out.println("Editorial");
                        libro.setEditorial(lectura.next());
                        
                        libros.set(contador, libro);
                    }
                    contador++;
                }

                //buscar(salida_autor);
                break;
            case 3:
                System.out.println("Ingrese la fecha de publicación del libro");
                int salida_año = lectura.nextInt();
                contador =0;

                for (Libro libro : libros) {
                    if(libro.getAño()==salida_año){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                    
                    if(eliminar==true){
                        libros.remove(libro);
                    }else if(editar==true){
                        
                        System.out.println("Titulo");
                        libro.setTitulo(lectura.next());
                        System.out.println("Autor");
                        libro.setAutor(lectura.next());
                        System.out.println("Fecha publicación");
                        libro.setAño(lectura.nextInt());
                        System.out.println("Genero");
                        libro.setGenero(lectura.next());
                        System.out.println("Editorial");
                        libro.setEditorial(lectura.next());
                        
                        libros.set(contador, libro);
                    }
                    contador++;
                }

                break;
            case 4:
                System.out.println("Ingrese el genero del libro");
                String salida_genero = lectura.next();
                contador=0;

                for (Libro libro : libros) {
                    if(libro.getGenero().equals(salida_genero)){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                    if(eliminar==true){
                        libros.remove(libro);
                    }else if(editar==true){
                        
                        System.out.println("Titulo");
                        libro.setTitulo(lectura.next());
                        System.out.println("Autor");
                        libro.setAutor(lectura.next());
                        System.out.println("Fecha publicación");
                        libro.setAño(lectura.nextInt());
                        System.out.println("Genero");
                        libro.setGenero(lectura.next());
                        System.out.println("Editorial");
                        libro.setEditorial(lectura.next());
                        
                        libros.set(contador, libro);
                    }
                    contador++;
                    
                }
                //buscar(salida_genero);
                break;
            case 5:
                System.out.println("Ingrese la editorial del libro");
                String salida_editorial = lectura.next();
                contador=0;

                for (Libro libro : libros) {
                    if(libro.getEditorial().equals(salida_editorial)){
                         System.out.println("Titulo: " + libro.getTitulo());
                         System.out.println("Autor: " + libro.getAutor());
                         System.out.println("Fecha publicación: " + libro.getAño());
                         System.out.println("Genero: " + libro.getGenero());
                         System.out.println("Editorial: " + libro.getEditorial()+"\n");
                    }
                    
                    if(eliminar==true){
                        libros.remove(libro);
                    }else if(editar==true){
                        
                        System.out.println("Titulo");
                        libro.setTitulo(lectura.next());
                        System.out.println("Autor");
                        libro.setAutor(lectura.next());
                        System.out.println("Fecha publicación");
                        libro.setAño(lectura.nextInt());
                        System.out.println("Genero");
                        libro.setGenero(lectura.next());
                        System.out.println("Editorial");
                        libro.setEditorial(lectura.next());

                        libros.set(contador, libro);
                    }
                    contador++;
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
