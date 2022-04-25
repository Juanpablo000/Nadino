package codigo;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int año;
    private String categoria;
    private short edicion;
    private short ejemplares;
    private int disponibles;
	
    public Libro(){
       id=0;
       titulo="";
       autor="";
       año=0;
       categoria="";
       edicion=0;
       ejemplares=0;
       disponibles=0;
    }	
	    
    public Libro(int id,String titulo,String autor,int año,String categoria,short edicion,short ejemplares, int disponibles){
           this.id=id;
           this.titulo=titulo;
           this.autor=autor;
           this.año=año;
           this.categoria=categoria;
           this.edicion=edicion;
           this.ejemplares=ejemplares;
           this.disponibles=disponibles;
    }
    
    
    public int getId(){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }

    public void setAutor (String autor){
        this.autor = autor;
    }
    
    public int getAño(){
        return año;
    }

    public void setAño (int año){
        this.año = año;
    }
    
    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public short getEdicion(){
        return edicion;
    }

    public void setEdicion(short edicion){
        this.edicion = edicion;
    }
    
    public short getEjemplares(){
        return ejemplares;
    }

    public void setEjemplares(short ejemplares){
        this.ejemplares = ejemplares;
    }
    
    public int getDisponibles(){
        return disponibles;
    }

    public void setDisponibles(int disponibles){
        this.disponibles = disponibles;
    }
}