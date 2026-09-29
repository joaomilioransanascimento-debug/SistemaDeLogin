package com.mycompany.sistemadelogin;
import javax.swing.JOptionPane;

public class TelaDeLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaDeLogin.class.getName());

    public TelaDeLogin() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204,0,204));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_email = new javax.swing.JLabel();
        chk_lembrese = new javax.swing.JCheckBox();
        txt_email = new javax.swing.JTextField();
        pwd_senha = new javax.swing.JPasswordField();
        lbl_senha = new javax.swing.JLabel();
        btn_limpar = new javax.swing.JButton();
        btn_entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_email.setText("Email");

        chk_lembrese.setText("Lebrem-se de mim");

        txt_email.setBackground(new java.awt.Color(255, 153, 255));
        txt_email.setForeground(new java.awt.Color(255, 0, 255));
        txt_email.setSelectedTextColor(new java.awt.Color(255, 153, 255));

        pwd_senha.setBackground(new java.awt.Color(255, 153, 255));
        pwd_senha.setForeground(new java.awt.Color(255, 0, 255));
        pwd_senha.setSelectedTextColor(new java.awt.Color(255, 153, 255));

        lbl_senha.setText("Senha");

        btn_limpar.setBackground(new java.awt.Color(255, 153, 255));
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(this::btn_limparActionPerformed);

        btn_entrar.setBackground(new java.awt.Color(255, 153, 255));
        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(this::btn_entrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lbl_email))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_senha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwd_senha)
                    .addComponent(txt_email))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_lembrese)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_limpar)
                        .addGap(43, 43, 43)
                        .addComponent(btn_entrar)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_senha))
                .addGap(30, 30, 30)
                .addComponent(chk_lembrese)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpar)
                    .addComponent(btn_entrar))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
            txt_email.setText("");
            pwd_senha.setText("");
            txt_email.requestFocus();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
            String email = txt_email.getText();
            String senha = new String(pwd_senha.getPassword());
            
            if(email.equals("joao@escola.pr.gov.br")&& senha.equals("1234")){
            JOptionsPane.showMessageDialog(
                    this,
                    "bem vindo ao sistema!",
                    "login realizado com sucesso!",
                    JOptionsPane.INFORMATION_MESSAGE
            );
    }//GEN-LAST:event_btn_entrarActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaDeLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JCheckBox chk_lembrese;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JPasswordField pwd_senha;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
