package codigo;

public class Usuario {
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private int telefono;
    private short devolucionesExtratemporales;

    public Usuario(){
       id=0;
       primerNombre="";
       segundoNombre="";
       primerApellido="";
       segundoApellido="";
       direccion="";
       telefono=0;
       devolucionesExtratemporales =0;
    }
    
    public Usuario(int id, String primerNombre,String segundoNombre,String primerApellido, String segundoApellido, String direccion, int telefono, short devolucionesExtratemporales){
       this.id=id;
       this.primerNombre=primerNombre;
       this.segundoNombre=segundoNombre;
       this.primerApellido=primerApellido;
       this.segundoApellido=segundoApellido;
       this.direccion=direccion;
       this.telefono=telefono;
       this.devolucionesExtratemporales=devolucionesExtratemporales;
    }
    
    public int getId(){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }
    
    public String getPrimerNombre(){
        return primerNombre;
    }

    public void setPrimerNombre (String primerNombre){
        this.primerNombre = primerNombre;
    }
    
    public String getSegundoNombre(){
        return segundoNombre;
    }

    public void setSegundoNombre (String segundoNombre){
        this.segundoNombre = segundoNombre;
    }
    
    public String getPrimerApellido(){
        return primerApellido;
    }

    public void setPrimerApellido (String primerApellido){
        this.primerApellido = primerApellido;
    }
    
    public String getsegundoApellido(){
        return segundoApellido;
    }

    public void setSegundoApellido (String segundoApellido){
        this.segundoApellido = segundoApellido;
    }
    
    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public int getDisponibles(){
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getDevolucionesExtratemporales(){
        return devolucionesExtratemporales;
    }

    public void setDevolucionesExtratemporales(short devolucionesExtratemporales){
        this.devolucionesExtratemporales = devolucionesExtratemporales;
    }
}
