package com.mycompany.nadino;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int año;
    private String genero;
    private String editorial;
    private String estado;
    
    public Libro(){
    }
    
    public Libro(int id,String titulo,String autor,int año,String genero,String editorial,String estado){
           this.id=id;
           this.titulo=titulo;
           this.autor=autor;
           this.año=año;
           this.genero=genero;
           this.editorial=editorial;
           this.estado=estado;
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
    
    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    
    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
}