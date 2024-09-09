/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class me_historico extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public me_historico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        profile_pic = new javax.swing.JLabel();
        nome_label = new javax.swing.JLabel();
        rua_label = new javax.swing.JLabel();
        bairro_label = new javax.swing.JLabel();
        complemento_label = new javax.swing.JLabel();
        num_label = new javax.swing.JLabel();
        sangue_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alegias_list = new javax.swing.JList<>();
        med_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comorb_list = new javax.swing.JList<>();
        Alergia_label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        med_list = new javax.swing.JList<>();
        Comorb_label = new javax.swing.JLabel();
        CPF_txtfield = new javax.swing.JFormattedTextField();
        rg_txtfield = new javax.swing.JFormattedTextField();
        nascimento_txtfield1 = new javax.swing.JFormattedTextField();
        telefone_txtfield2 = new javax.swing.JFormattedTextField();
        cep_txtfield3 = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        SisFisio_topname = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jPanel3.setBackground(new java.awt.Color(226, 234, 252));

        profile_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png-transparent-user-profile-computer-icons-avatar-profile-s-free-angle-rectangle-profile-cliparts-free-thumbnail.png"))); // NOI18N
        profile_pic.setText("jLabel1");
        profile_pic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 232, 228), 2, true));

        nome_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        nome_label.setText("[NOME-NOME-NOME]");
        nome_label.setMaximumSize(new java.awt.Dimension(227, 27));

        rua_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rua_label.setText("[RUA-RUA-RUA-RUA-RUA-RUA-RUA-RUA-RUA]");
        rua_label.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                rua_labelInputMethodTextChanged(evt);
            }
        });

        bairro_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bairro_label.setText("[BAIRRO-BAIRRO]");

        complemento_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        complemento_label.setText("[COMPLEMENTO]");

        num_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num_label.setText("N° [0]");

        sangue_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sangue_label.setText("A+");

        alegias_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(alegias_list);

        med_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        med_label.setText("Medicamentos");

        comorb_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        comorb_list.setSelectionBackground(new java.awt.Color(226, 234, 252));
        jScrollPane2.setViewportView(comorb_list);

        Alergia_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Alergia_label.setText("Alergias");

        med_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(med_list);

        Comorb_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Comorb_label.setText("Comorbidades");

        CPF_txtfield.setBackground(new java.awt.Color(226, 234, 252));
        CPF_txtfield.setBorder(null);
        try {
            CPF_txtfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPF_txtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPF_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPF_txtfieldActionPerformed(evt);
            }
        });

        rg_txtfield.setBackground(new java.awt.Color(226, 234, 252));
        rg_txtfield.setBorder(null);
        try {
            rg_txtfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rg_txtfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rg_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rg_txtfieldActionPerformed(evt);
            }
        });

        nascimento_txtfield1.setBackground(new java.awt.Color(226, 234, 252));
        nascimento_txtfield1.setBorder(null);
        nascimento_txtfield1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        nascimento_txtfield1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nascimento_txtfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimento_txtfield1ActionPerformed(evt);
            }
        });

        telefone_txtfield2.setBackground(new java.awt.Color(226, 234, 252));
        telefone_txtfield2.setBorder(null);
        try {
            telefone_txtfield2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+##) ## #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone_txtfield2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefone_txtfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone_txtfield2ActionPerformed(evt);
            }
        });

        cep_txtfield3.setBackground(new java.awt.Color(226, 234, 252));
        cep_txtfield3.setBorder(null);
        try {
            cep_txtfield3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cep_txtfield3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cep_txtfield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cep_txtfield3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(med_label)
                                .addComponent(Comorb_label))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alergia_label))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(profile_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rg_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nascimento_txtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(CPF_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(236, 236, 236)
                                        .addComponent(sangue_label)))
                                .addComponent(telefone_txtfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(rua_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bairro_label)
                                .addComponent(cep_txtfield3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(226, 226, 226)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(complemento_label, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(num_label, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nascimento_txtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sangue_label)
                            .addComponent(CPF_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rg_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telefone_txtfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(profile_pic))
                .addGap(14, 14, 14)
                .addComponent(rua_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(complemento_label)
                    .addComponent(bairro_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num_label)
                    .addComponent(cep_txtfield3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Alergia_label)
                    .addComponent(Comorb_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(med_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 232, 228));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SisFisio_topname.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        SisFisio_topname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SisFisio_topname.setText("SisFisio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(SisFisio_topname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SisFisio_topname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rua_labelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_rua_labelInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rua_labelInputMethodTextChanged

    private void CPF_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPF_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPF_txtfieldActionPerformed

    private void rg_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rg_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rg_txtfieldActionPerformed

    private void nascimento_txtfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimento_txtfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimento_txtfield1ActionPerformed

    private void telefone_txtfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone_txtfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone_txtfield2ActionPerformed

    private void cep_txtfield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cep_txtfield3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cep_txtfield3ActionPerformed

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
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StarterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alergia_label;
    private javax.swing.JFormattedTextField CPF_txtfield;
    private javax.swing.JLabel Comorb_label;
    private javax.swing.JLabel SisFisio_topname;
    private javax.swing.JList<String> alegias_list;
    private javax.swing.JLabel bairro_label;
    private javax.swing.JFormattedTextField cep_txtfield3;
    private javax.swing.JList<String> comorb_list;
    private javax.swing.JLabel complemento_label;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel med_label;
    private javax.swing.JList<String> med_list;
    private javax.swing.JFormattedTextField nascimento_txtfield1;
    private javax.swing.JLabel nome_label;
    private javax.swing.JLabel num_label;
    private javax.swing.JLabel profile_pic;
    private javax.swing.JFormattedTextField rg_txtfield;
    private javax.swing.JLabel rua_label;
    private javax.swing.JLabel sangue_label;
    private javax.swing.JFormattedTextField telefone_txtfield2;
    // End of variables declaration//GEN-END:variables
}
