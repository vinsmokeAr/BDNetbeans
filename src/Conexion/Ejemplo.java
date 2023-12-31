package Conexion;

import static Conexion.Conectar.c;
import java.awt.Component;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pacheco
 */
public class Ejemplo extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    public java.sql.Connection cp = null;
    String query = "Select *from my506";
    Object[] users = new Object[8];
    int id = 0;
    List<Integer> ids;

    public Ejemplo() {
        initComponents();
        modelo = (DefaultTableModel) tblUsuarios.getModel();
        cp = new Conexion.Conectar().conectaBD();
        ids = new ArrayList<>();
        limpiaT();
        consultarU("select *from my506");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editUsers = new javax.swing.JDialog();
        txtNombre = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        insertUsers = new javax.swing.JDialog();
        txtNombre1 = new javax.swing.JTextField();
        txtMatricula1 = new javax.swing.JTextField();
        txtCarrera1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbInsertar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        editUsers.setModal(true);
        editUsers.setSize(new java.awt.Dimension(399, 275));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Matrícula");

        jLabel3.setText("Carrera");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editUsersLayout = new javax.swing.GroupLayout(editUsers.getContentPane());
        editUsers.getContentPane().setLayout(editUsersLayout);
        editUsersLayout.setHorizontalGroup(
            editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUsersLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editUsersLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtNombre)))
                    .addGroup(editUsersLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                .addGap(166, 166, 166))
            .addGroup(editUsersLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editUsersLayout.setVerticalGroup(
            editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUsersLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addComponent(jButton3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        insertUsers.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        insertUsers.setTitle("Insertar");
        insertUsers.setModal(true);
        insertUsers.setSize(new java.awt.Dimension(399, 275));

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        txtMatricula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatricula1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel5.setText("Matrícula");

        jLabel6.setText("Carrera");

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insertUsersLayout = new javax.swing.GroupLayout(insertUsers.getContentPane());
        insertUsers.getContentPane().setLayout(insertUsersLayout);
        insertUsersLayout.setHorizontalGroup(
            insertUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertUsersLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(insertUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGroup(insertUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insertUsersLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(insertUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatricula1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtNombre1)))
                    .addGroup(insertUsersLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtCarrera1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                .addGap(166, 166, 166))
            .addGroup(insertUsersLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnInsertar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insertUsersLayout.setVerticalGroup(
            insertUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertUsersLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(insertUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(insertUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(insertUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addComponent(btnInsertar)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NP", "Nombre", "Matrícula", "Carrera"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/database_go.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/note_edit.png"))); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbInsertar.setText("Insertar");
        jbInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertarActionPerformed(evt);
            }
        });

        jMenu1.setText("Home");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");

        jMenuItem1.setText("Consultar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jbInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(14, 14, 14)
                        .addComponent(jButton2)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        limpiaT();
        consultarU(query);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaT();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (seleccionado()) {
            JLabel x = new JLabel("Confirma que desea eliminar el usuario " + tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 1));
            Object[] x1 = {"", x};
            int si = JOptionPane.showConfirmDialog(null, x1, "Ejemplo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (si == JOptionPane.OK_OPTION) {
                try {
                    new Conexion.Conectar().ejecutar("delete from my506 where nombre='" + tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 1) + "'");
                    consultarU("select *from my506");
                    if (!Conexion.Conectar.MENSAJE.equals("")) {
                        JOptionPane.showMessageDialog(null, "Error: El usuario " + tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 1) + " no se pudo eliminar!");
                    }
                } catch (Exception ex) {
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario en la tabla!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * boton de actualizar
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            String sql = "update my506 set nombre='" + txtNombre.getText() + "', matricula='" + txtMatricula.getText() + "', carrera ='" + txtCarrera.getText() + "' where id= '" + id + "'";
            System.out.println(sql);
            new Conexion.Conectar().ejecutar(sql);
            if (!Conexion.Conectar.MENSAJE.equals("")) {
                JOptionPane.showMessageDialog(null, "Error: Los campos del usuario " + txtNombre.getText() + " no se actualizarón ! ");
            } else {
                JOptionPane.showMessageDialog(null, "Los campos se actualizarón correctamente!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        editUsers.setVisible(false);
        limpiaT();
        consultarU(query);


    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Boton para editar los campos de la tabla
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (seleccionado()) {
            txtNombre.setText("" + tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 1));
            txtMatricula.setText("" + tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 2));
            txtCarrera.setText("" + tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 3));
            editUsers.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro en la tabla!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertarActionPerformed
        txtNombre1.setText("");
        txtMatricula1.setText("");
        txtCarrera1.setText("");

        insertUsers.setVisible(true);
    }//GEN-LAST:event_jbInsertarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        String sql = "INSERT INTO my506 (id, nombre, matricula, carrera) VALUES (?,?,?,?)";
        PreparedStatement sentencia = null;
        try {
            sentencia = c.prepareStatement(sql);
            sentencia.setInt(1, createID());
            sentencia.setString(2, txtNombre1.getText());
            sentencia.setInt(3, Integer.parseInt(txtMatricula1.getText()));
            sentencia.setString(4, txtCarrera1.getText());
            sentencia.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        insertUsers.setVisible(true);


    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtMatricula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatricula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatricula1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ejemplo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JDialog editUsers;
    private javax.swing.JDialog insertUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbInsertar;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCarrera1;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMatricula1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables

    public void consultarU(String query) {
        java.sql.ResultSet r = new Conexion.Conectar().consulta(query);
        int i = 1;
        try {
            while (r.next()) {
                ids.add(r.getInt("id"));
                users[0] = i;
                users[1] = r.getString("nombre");
                users[2] = r.getString("matricula");
                users[3] = r.getString("carrera");
                modelo.addRow(users);
                i = i + 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void limpiaT() {
        int a = modelo.getRowCount();
        while (a != 0) {
            if (a != 0) {
                modelo.removeRow(0);
            }
            a = modelo.getRowCount();
        }
    }

    public boolean seleccionado() {
        if (tblUsuarios.getSelectedRow() != -1) {
            return true;
        } else {
            return false;
        }
    }

    private int createID() {
        int i = 0;
        while (ids.contains(i)) {
            i++;
        }

        return i;
    }
}
