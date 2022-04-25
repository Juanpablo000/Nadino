package codigo;

public class Usuario {
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private int telefono;

    public Usuario(){
       id=0;
       primerNombre="";
       segundoNombre="";
       primerApellido="";
       segundoApellido="";
       direccion="";
       telefono=0;
    }
    
    public Usuario(int id, String primerNombre,String segundoNombre,String primerApellido, String segundoApellido, String direccion, int telefono){
       this.id=id;
       this.primerNombre=primerNombre;
       this.segundoNombre=segundoNombre;
       this.primerApellido=primerApellido;
       this.segundoApellido=segundoApellido;
       this.direccion=direccion;
       this.telefono=telefono;
    }
}
