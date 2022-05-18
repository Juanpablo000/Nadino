/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package codigo;

import static codigo.Home.JP_content;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class Usuarios extends javax.swing.JPanel {

    Conexion conn;
    Connection reg;
    
    public Usuarios() {
        initComponents();
        conn = new Conexion();
        reg = Conexion.getConnection();
        cargarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPbody = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(750, 430));
        setMinimumSize(new java.awt.Dimension(710, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPbody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Usuarios");
        JPbody.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jtxtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jtxtUsuario.setText("Ingrese el nombre de usuario a buscar");
        jtxtUsuario.setBorder(null);
        jtxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtUsuarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtxtUsuarioMouseReleased(evt);
            }
        });
        JPbody.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 530, 30));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Primer nombre", "Segundo nombre", "Primer apellido", "Segundo apellido", "Domicilio", "Telefono", "Devoluciones Extratemporales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        JPbody.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 660, 240));

        btnEditar.setBackground(new java.awt.Color(54, 33, 89));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        JPbody.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, 40));

        btnNuevo.setBackground(new java.awt.Color(54, 33, 89));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        JPbody.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, 40));

        btnEliminar.setBackground(new java.awt.Color(54, 33, 89));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        JPbody.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 80, 40));

        btnBuscar.setBackground(new java.awt.Color(54, 33, 89));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setDefaultCapable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        JPbody.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 70, 30));

        add(JPbody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUsuarioMousePressed
        if(jtxtUsuario.getText().equals("Ingrese el nombre de usuario a buscar"))
        jtxtUsuario.setText("");
    }//GEN-LAST:event_jtxtUsuarioMousePressed

    private void jtxtUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUsuarioMouseReleased
        //nothing
    }//GEN-LAST:event_jtxtUsuarioMouseReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
            //obtiene el id de la celda selccionada del Jtable [0,1,2,3,4,.....]
            int row = tablaUsuarios.getSelectedRow();
            if(row <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                int column = 0;
                int valorID = Integer.parseInt(tablaUsuarios.getModel().getValueAt(row, column).toString());
                
                if(valorID <= 0){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    String primerNombre=tablaUsuarios.getModel().getValueAt(row,1).toString();
                    String segundoNombre=tablaUsuarios.getModel().getValueAt(row,2).toString();
                    String primerApellido=tablaUsuarios.getModel().getValueAt(row,3).toString();
                    String segundoApellido=tablaUsuarios.getModel().getValueAt(row,4).toString();
                    String direccion=tablaUsuarios.getModel().getValueAt(row,5).toString();
                    String tel=tablaUsuarios.getModel().getValueAt(row,6).toString();
                    //String devoluciones=tablaUsuarios.getModel().getValueAt(row,7).toString();
                    upUsers p1 = new upUsers(valorID, primerNombre, segundoNombre, primerApellido, segundoApellido, direccion,tel);
                    p1.setSize(750, 430);
                    p1.setLocation(0, 0);

                    JP_content.removeAll();
                    JP_content.add(p1, BorderLayout.CENTER);
                    JP_content.revalidate();
                    JP_content.repaint();
                }   
            }
            
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
       }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Abrir sección
        upUsers p1 = new upUsers();
        p1.setSize(750, 430);
        p1.setLocation(0,0);

        JP_content.removeAll();
        JP_content.add(p1, BorderLayout.CENTER);
        JP_content.revalidate();
        JP_content.repaint();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try{
            //obtiene el id de la celda selccionada del Jtable [0,1,2,3,4,.....]
            int row = tablaUsuarios.getSelectedRow();
            if(row <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a eliminar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                int column = 0;
                int valorID = Integer.parseInt(tablaUsuarios.getModel().getValueAt(row, column).toString());
                
                if(valorID <= 0){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    Statement stm = reg.createStatement();
                    stm.executeUpdate("DELETE FROM Usuarios WHERE idUsuario = "+valorID);
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Usuario borrado! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    cargarTabla();
                }   
            }
            
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
     
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Connection con = null;
        PreparedStatement prSt = null;
        ResultSet rs = null;
        
        DefaultTableModel modeloTabla = (DefaultTableModel)tablaUsuarios.getModel();
        modeloTabla.setRowCount(0);
        String nomUsuario = jtxtUsuario.getText();
        String vectorUsuario = nomUsuario;
        
        
        if(!nomUsuario.equals("") && !nomUsuario.equals("Ingrese el nombre de usuario a buscar") ){
            try{
                String[] parts = null;
                parts = vectorUsuario.split(" ");

                int i = parts.length;
                
                con = Conexion.getConnection();
                String query = "SELECT * FROM Usuarios where (PrimerNombre +' '+ SegundoNombre +' '+ PrimerApellido +' '+ SegundoApellido) like ?";
               
                if(i==3){
                   nomUsuario=parts[0] + "  " + parts[1] + " " + parts[2];
                }
                
                prSt = con.prepareStatement(query);
                prSt.setString(1, "%" + nomUsuario + "%");
                rs = prSt.executeQuery();
                
                while(rs.next()){
                     Object[] fila = new Object[8];
                     for(int indice = 0; indice <8; indice++){
                        fila[indice] = rs.getObject(indice +1);
                     }
                     modeloTabla.addRow(fila);
                }


            }catch(SQLException ex){
               JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
           }   
        }else{
            JOptionPane.showMessageDialog(null, "Error: Nombre de usuario vacio");
            cargarTabla();
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel)tablaUsuarios.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        int[] anchos = {10,50,50,50,50,50,50,50};
        for(int i=0; i<tablaUsuarios.getColumnCount();i++){
            tablaUsuarios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        
        try{
            Connection con = Conexion.getConnection();
            ps = con.prepareStatement("select * from Usuarios");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice = 0; indice <columnas; indice++){
                    fila[indice] = rs.getObject(indice +1);
                }
                modeloTabla.addRow(fila);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPbody;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}


/*
SELECT CONCAT( PrimerNombre, ' ', SegundoNombre, ' ' , PrimerApellido, ' ', SegundoApellido) AS NombreCompleto 
FROM Usuarios

*/

    /*
            HashMap<Integer, Usuario> usuariosMap = new HashMap<Integer, Usuario>();

            //obtiene el id de la celda selccionada del Jtable [0,1,2,3,4,.....]
            int idcelda = tablaUsuarios.getSelectedRow();
            if(idcelda <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                idcelda++;
                Statement stm = reg.createStatement();
                ResultSet rs;
                 
                rs= stm.executeQuery("SELECT * FROM Usuarios");
                 
                while(rs.next()){
                    Usuario tmpUsuario = new Usuario(rs.getInt("idUsuario"),rs.getString("PrimerNombre"),rs.getString("SegundoNombre"),rs.getString("PrimerApellido"), rs.getString("SegundoApellido"), rs.getString("Direccion"), rs.getInt("Telefono"), rs.getShort("DevolucionesExtratemporales"));
                    usuariosMap.put(rs.getInt("idUsuario"), tmpUsuario);
                }
                
                int column = 0;
                int row = tablaUsuarios.getSelectedRow();
                int valorID = Integer.parseInt(tablaUsuarios.getModel().getValueAt(row, column).toString());
                
                Usuario u = usuariosMap.get(valorID);
                int id = u.getId();
                if(id <= 0){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    stm = reg.createStatement();
                    stm.executeUpdate("DELETE FROM Usuarios WHERE id = "+id+" LIMIT 1");
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Usuario borrado! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }   
            }
            
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
       }
    
    */