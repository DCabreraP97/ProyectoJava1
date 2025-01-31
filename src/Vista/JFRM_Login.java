
package Vista;

import Controlador.LoginControlador;
/**
 *
 * @author Diego Cabrera
 */
public class JFRM_Login extends javax.swing.JFrame {

    /**
     * Creates new form JFRM_Login
     */
    public JFRM_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLBL_usuario = new javax.swing.JLabel();
        JLBL_contrasena = new javax.swing.JLabel();
        JLBL_mensaje = new javax.swing.JLabel();
        JTXTF_usuario = new javax.swing.JTextField();
        JBTN_iniciarSesion = new javax.swing.JButton();
        JPass_contrasena = new javax.swing.JPasswordField();
        JLBL_mensajeBienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de objetos perdidos");

        JLBL_usuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLBL_usuario.setText("Usuario: ");

        JLBL_contrasena.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLBL_contrasena.setText("Contraseña:");

        JLBL_mensaje.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JLBL_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JBTN_iniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBTN_iniciarSesion.setText("Iniciar Sesion");
        JBTN_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_iniciarSesionActionPerformed(evt);
            }
        });

        JPass_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPass_contrasenaActionPerformed(evt);
            }
        });

        JLBL_mensajeBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBL_mensajeBienvenida.setText("Bienvenido al programa de registro de objetos perdidos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Por favor inicie sesion!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBL_mensajeBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLBL_usuario)
                                    .addComponent(JLBL_contrasena))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBTN_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JPass_contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                        .addComponent(JTXTF_usuario))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(JLBL_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JLBL_mensajeBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBL_usuario)
                    .addComponent(JTXTF_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPass_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBL_contrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(JBTN_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLBL_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTN_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_iniciarSesionActionPerformed
        LoginControlador login = new LoginControlador();
        boolean loginExitoso = login.validarCredenciales(
        JTXTF_usuario.getText(),
        String.valueOf(JPass_contrasena.getPassword())
        );
        
        if (loginExitoso) {
            JLBL_mensaje.setText("Inicio de sesion correcto! \n Bienvenido a registro de objetos perdidos!");
            JFRM_menuPrincipal menuPrincipal = new JFRM_menuPrincipal();
            menuPrincipal.setVisible(true);
            this.dispose();
        } else {
            JLBL_mensaje.setText("Usuario/Contraseña incorrectos! \n Volver a intentar.");
        }
    }//GEN-LAST:event_JBTN_iniciarSesionActionPerformed

    private void JPass_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPass_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPass_contrasenaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFRM_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRM_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRM_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRM_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRM_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTN_iniciarSesion;
    private javax.swing.JLabel JLBL_contrasena;
    private javax.swing.JLabel JLBL_mensaje;
    private javax.swing.JLabel JLBL_mensajeBienvenida;
    private javax.swing.JLabel JLBL_usuario;
    private javax.swing.JPasswordField JPass_contrasena;
    private javax.swing.JTextField JTXTF_usuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
