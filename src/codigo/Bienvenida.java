/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package codigo;

/**
 *
 * @author juanp
 */
public class Bienvenida extends javax.swing.JPanel {

    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
        initComponents();
        
        initComponents();
        String text ="<html><body><p style='margin: 2px; text-align: justify;'>El sistema gestor bibliotecario llamado Nadino Collections busca administrar de manera optima y eficiente todo lo relacionado a los procesos de prestamo y devolución de material bibliografico. <br><br> Permitiendo tener un control eficaz sobre los usuarios, los libros mediante la realización de un seguimiento de los mismos. </p></body></html>";
        jlabelMulti.setText(text);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jlabelMulti = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(640, 390));
        setMinimumSize(new java.awt.Dimension(640, 390));
        setPreferredSize(new java.awt.Dimension(640, 390));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Bienvenido");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jlabelMulti.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelMulti.setText("forma óptima y fácil el flujo de préstamos y devoluciones de Libros. ");
        add(jlabelMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 270, 220));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jlabelMulti;
    // End of variables declaration//GEN-END:variables
}
