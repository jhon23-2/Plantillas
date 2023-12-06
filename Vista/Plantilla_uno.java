package Vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Plantilla_uno extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Plantilla_uno
     */
    public Plantilla_uno() {
        initComponents();
        this.setLocationRelativeTo(null);
        new Thread(this).start();

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesnanias = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelUno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtSeniores = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panelDos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pesnanias.setForeground(new java.awt.Color(0, 0, 0));
        pesnanias.setFocusable(false);

        panelUno.setBackground(new java.awt.Color(255, 255, 255));
        panelUno.setFocusable(false);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CEDULA");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("APELLIDOS");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRES");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FECHA");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SEÑORES");

        javax.swing.GroupLayout panelUnoLayout = new javax.swing.GroupLayout(panelUno);
        panelUno.setLayout(panelUnoLayout);
        panelUnoLayout.setHorizontalGroup(
            panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUnoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(panelUnoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)))
                .addGap(46, 46, 46)
                .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha)
                    .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombres)
                        .addComponent(txtApellidos)
                        .addComponent(txtSeniores, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 89, Short.MAX_VALUE))
        );
        panelUnoLayout.setVerticalGroup(
            panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUnoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSeniores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(panelUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pesnanias.addTab("tab1", jPanel1);

        panelDos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelDosLayout = new javax.swing.GroupLayout(panelDos);
        panelDos.setLayout(panelDosLayout);
        panelDosLayout.setHorizontalGroup(
            panelDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        panelDosLayout.setVerticalGroup(
            panelDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pesnanias.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesnanias, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesnanias, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Plantilla_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plantilla_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plantilla_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plantilla_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plantilla_uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelDos;
    private javax.swing.JPanel panelUno;
    private javax.swing.JTabbedPane pesnanias;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSeniores;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        this.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e){
            
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
                
            }
            
        });

    }
}
