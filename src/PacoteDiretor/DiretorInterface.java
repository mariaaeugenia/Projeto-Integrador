 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteDiretor;

/**
 *
 * @author MaryBeds
 */
public class DiretorInterface extends javax.swing.JFrame {

    /**
     * Creates new form DiretorInterface
     */
    
    private boolean isCadastroFuncionario = false;
    private boolean isFiltrarFuncionario = false;
    private boolean isAutorizarFuncionario = true;
    
    CadastroFuncionarioView cadastroFrame = new CadastroFuncionarioView();
    SocioPendenteView socioFrame = new SocioPendenteView();
    FIltrarFuncionarioView filtrarView = new FIltrarFuncionarioView();
           
    
    public DiretorInterface() {
        initComponents();
        
        //ViewCadastrarFuncionario.setVisible(false);
        DesktopMenu.add(socioFrame);
        socioFrame.setVisible(true);
        socioFrame.setUI(null);
        
        
        DesktopMenu.add(cadastroFrame);
        cadastroFrame.setUI(null);
        cadastroFrame.setVisible(false);
        
        DesktopMenu.add(filtrarView);
        filtrarView.setUI(null);
        filtrarView.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgBranco = new javax.swing.JPanel();
        BgMenu = new javax.swing.JPanel();
        AutorizarFuncionarioPressed = new javax.swing.JButton();
        CadastrarFuncionaroPressed = new javax.swing.JButton();
        FiltrarFuncionarioPressed = new javax.swing.JButton();
        DesktopMenu = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 700));

        BgBranco.setBackground(new java.awt.Color(255, 255, 255));
        BgBranco.setPreferredSize(new java.awt.Dimension(1024, 712));

        BgMenu.setBackground(new java.awt.Color(158, 189, 83));

        AutorizarFuncionarioPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Diretor/AutorizarSocio.png"))); // NOI18N
        AutorizarFuncionarioPressed.setBorderPainted(false);
        AutorizarFuncionarioPressed.setContentAreaFilled(false);
        AutorizarFuncionarioPressed.setSelected(true);
        AutorizarFuncionarioPressed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Diretor/AutorizarSocioPressed.png"))); // NOI18N
        AutorizarFuncionarioPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorizarFuncionarioPressedActionPerformed(evt);
            }
        });

        CadastrarFuncionaroPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Diretor/CadastrarFunc.png"))); // NOI18N
        CadastrarFuncionaroPressed.setBorderPainted(false);
        CadastrarFuncionaroPressed.setContentAreaFilled(false);
        CadastrarFuncionaroPressed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Diretor/CadastrarFuncPressed.png"))); // NOI18N
        CadastrarFuncionaroPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFuncionaroPressedActionPerformed(evt);
            }
        });

        FiltrarFuncionarioPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Diretor/FiltrarFunc..png"))); // NOI18N
        FiltrarFuncionarioPressed.setBorderPainted(false);
        FiltrarFuncionarioPressed.setContentAreaFilled(false);
        FiltrarFuncionarioPressed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Diretor/FiltrarFuncPressed.png"))); // NOI18N
        FiltrarFuncionarioPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrarFuncionarioPressedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgMenuLayout = new javax.swing.GroupLayout(BgMenu);
        BgMenu.setLayout(BgMenuLayout);
        BgMenuLayout.setHorizontalGroup(
            BgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgMenuLayout.createSequentialGroup()
                .addGroup(BgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CadastrarFuncionaroPressed)
                    .addComponent(FiltrarFuncionarioPressed)
                    .addComponent(AutorizarFuncionarioPressed))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        BgMenuLayout.setVerticalGroup(
            BgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgMenuLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(CadastrarFuncionaroPressed)
                .addGap(44, 44, 44)
                .addComponent(FiltrarFuncionarioPressed)
                .addGap(44, 44, 44)
                .addComponent(AutorizarFuncionarioPressed)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        DesktopMenu.setBackground(new java.awt.Color(255, 255, 255));
        DesktopMenu.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(662, 706));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );

        DesktopMenu.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout BgBrancoLayout = new javax.swing.GroupLayout(BgBranco);
        BgBranco.setLayout(BgBrancoLayout);
        BgBrancoLayout.setHorizontalGroup(
            BgBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgBrancoLayout.createSequentialGroup()
                .addComponent(BgMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DesktopMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
        BgBrancoLayout.setVerticalGroup(
            BgBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopMenu))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BgBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FiltrarFuncionarioPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrarFuncionarioPressedActionPerformed

        if (isFiltrarFuncionario) {
            isFiltrarFuncionario = false;
            FiltrarFuncionarioPressed.setSelected(false);
            filtrarView.setVisible(false);

        } else {

            isFiltrarFuncionario = true;
            isCadastroFuncionario = false;
            isAutorizarFuncionario = false;
            FiltrarFuncionarioPressed.setSelected(true);
            CadastrarFuncionaroPressed.setSelected(false);
            AutorizarFuncionarioPressed.setSelected(false);

            cadastroFrame.setVisible(false);
            socioFrame.setVisible(false);
            filtrarView.setVisible(true);

        }
    }//GEN-LAST:event_FiltrarFuncionarioPressedActionPerformed

    private void CadastrarFuncionaroPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFuncionaroPressedActionPerformed

        if (isCadastroFuncionario) {

            isCadastroFuncionario = false;
            CadastrarFuncionaroPressed.setSelected(false);
            cadastroFrame.setVisible(false);

        } else {
            isCadastroFuncionario = true;
            isAutorizarFuncionario = false;
            isFiltrarFuncionario = false;
            CadastrarFuncionaroPressed.setSelected(true);
            FiltrarFuncionarioPressed.setSelected(false);
            AutorizarFuncionarioPressed.setSelected(false);

            cadastroFrame.setVisible(true);
            socioFrame.setVisible(false);
            filtrarView.setVisible(false);
            
        }
    }//GEN-LAST:event_CadastrarFuncionaroPressedActionPerformed

    private void AutorizarFuncionarioPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorizarFuncionarioPressedActionPerformed

        if (isAutorizarFuncionario) {

            isAutorizarFuncionario = false;
            AutorizarFuncionarioPressed.setSelected(false);
            socioFrame.setVisible(false);

        } else {

            isAutorizarFuncionario = true;
            isCadastroFuncionario = false;
            isFiltrarFuncionario = false;
            AutorizarFuncionarioPressed.setSelected(true);
            CadastrarFuncionaroPressed.setSelected(false);
            FiltrarFuncionarioPressed.setSelected(false);

            socioFrame.setVisible(true);
            cadastroFrame.setVisible(false);
            filtrarView.setVisible(false);

        }
    }//GEN-LAST:event_AutorizarFuncionarioPressedActionPerformed

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
            java.util.logging.Logger.getLogger(DiretorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiretorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiretorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiretorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiretorInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AutorizarFuncionarioPressed;
    private javax.swing.JPanel BgBranco;
    private javax.swing.JPanel BgMenu;
    private javax.swing.JButton CadastrarFuncionaroPressed;
    private javax.swing.JDesktopPane DesktopMenu;
    private javax.swing.JButton FiltrarFuncionarioPressed;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
