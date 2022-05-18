/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package codigo;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author juanp
 */
public class Prestamos extends javax.swing.JPanel {

    Conexion conn;
    Connection reg;
    public Prestamos() {
        initComponents();
        conn = new Conexion();
        reg = Conexion.getConnection();
        cargarLibrosUsuarios();
        cargarLibrosTitulos();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnReservar = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();
        cmbLibro = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(750, 430));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Titulo y edición del libro");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Nombre del usuario");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamo2-removebg.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(270, 270));
        jLabel2.setMinimumSize(new java.awt.Dimension(270, 270));
        jLabel2.setPreferredSize(new java.awt.Dimension(270, 270));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 270, 280));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 10, 350));

        btnReservar.setBackground(new java.awt.Color(54, 33, 89));
        btnReservar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setText("Reservar");
        btnReservar.setBorderPainted(false);
        btnReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 90, 40));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Prestamo de Libro");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        cmbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuarioActionPerformed(evt);
            }
        });
        add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 260, 30));

        add(cmbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        Connection con = null;
        PreparedStatement prSt = null;
        ResultSet rs = null;
        
        try{
            String nom_usuario = cmbUsuario.getSelectedItem().toString();//id usuario
            String nom_libro =  cmbLibro.getSelectedItem().toString();//id libro
            
            //Obtiene ID del usuario
            String vectorUsuario = nom_usuario;
            String[] parts = null;
            parts = vectorUsuario.split(" ");

            int i = parts.length; 
            int id_usuario=-1, id_libro=-1;

            con = Conexion.getConnection();
            String query = "SELECT * FROM Usuarios where (PrimerNombre +' '+ SegundoNombre +' '+ PrimerApellido +' '+ SegundoApellido) = ?";

            if(i==3){
               nom_usuario=parts[0] + "  " + parts[1] + " " + parts[2];
            }

            prSt = con.prepareStatement(query);
            prSt.setString(1, nom_usuario);
            rs = prSt.executeQuery();
           
            while(rs.next()){
                id_usuario = rs.getInt(1);
                break;
            }
            
            //Obtiene ID del Libro
            String vectorLibro = nom_libro;
            String[] partesLibro = null;
            String[] partesEdicion = null;
            
            partesLibro = vectorLibro.split("/");
            
            String tmp = partesLibro[1];
            partesEdicion = tmp.split(" ");
            
            con = Conexion.getConnection();
            query = "SELECT IdLibro\n" +
                    "FROM Libros lb\n" +
                    "INNER JOIN Titulos t ON lb.IdTitulo = t.IdTitulo\n" +
                    "WHERE t.Titulo = ? and Edicion = ?";
            prSt = con.prepareStatement(query);
            prSt.setString(1, partesLibro[0]);
            prSt.setString(2, partesEdicion[2]);
            
            rs = prSt.executeQuery();
           
            while(rs.next()){
                id_libro = rs.getInt(1);
                break;
            }
            
            
            Statement stm = reg.createStatement();
            Date ahora = new Date();
            Date devol = sumarFechasDias(ahora, 5);//Sumamos 5 días a la fecha actual.
            String f_inicio = formato(ahora);
            String f_final = formato(devol);
            
            stm.executeUpdate("INSERT INTO Prestamos (IdUsuario, IdLibro, FechaInicio, FechaFin) VALUES ('"+id_usuario+"', '"+ id_libro +"', '"+ f_inicio +"', '"+f_final+"')");
            stm.executeUpdate("UPDATE Libros SET Disponibles = Disponibles-1 WHERE IdLibro = '"+ id_libro +"';");
            javax.swing.JOptionPane.showMessageDialog(this, "¡Prestamo realizado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void obtenerID_Usuario(){
        
    }
    
    private void obtenerID_Libro(){
        
    }
    
    
    private void cmbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsuarioActionPerformed

    private void cargarLibrosUsuarios(){
        try{
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConnection();
            ps = con.prepareStatement("select PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido from Usuarios");
            //ps = con.prepareStatement("select idUsuario from Usuarios");
            rs = ps.executeQuery();

            while(rs.next()){
                //cmbUsuario.addItem(rs.getString("idUsuario"));
                String salida = rs.getString("PrimerNombre") +" " + rs.getString("SegundoNombre") +" " + rs.getString("PrimerApellido") +" " + rs.getString("SegundoApellido");
                cmbUsuario.addItem(salida);
            }
            
            //cmbUsuario.addItem("12");
          }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
          }
    }
    
    private void cargarLibrosTitulos(){
        try{
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT  IdLibro, Titulo, Edicion\n" +
                                      "FROM Libros lb\n" +
                                      "INNER JOIN Titulos t ON lb.IdTitulo = t.IdTitulo\n"+ 
                                      "WHERE Disponibles>0");
            rs = ps.executeQuery();

            while(rs.next()){
                //cmbUsuario.addItem(rs.getString("idUsuario"));
                String salida = rs.getString("Titulo") +" / Ed: " + rs.getString("Edicion");
                cmbLibro.addItem(salida);
            }
            
            //cmbUsuario.addItem("12");
          }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
          }
    }
    
    private static String formato(Date date){
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formateador.format(date);
        return fecha;
    }
    
    public static Date sumarFechasDias(Date fecha, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
	return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cmbLibro;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}


/*

SELECT IdUsuario FROM Usuarios 
where (PrimerNombre +' '+ SegundoNombre +' '+ PrimerApellido +' '+ SegundoApellido) like '%Mateo  Arango%'


SELECT IdLibro
FROM Libros lb
INNER JOIN Titulos t ON lb.IdTitulo = t.IdTitulo
WHERE t.Titulo LIKE '%1984%'

*/