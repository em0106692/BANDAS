
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class AdicionarBanda extends javax.swing.JFrame {
    
    public AdicionarBanda() {
        initComponents();
    }
    
    public AdicionarBanda(BibliotecaMusicas bibli) {
        initComponents();
        B = bibli;
    }
    
    public AdicionarBanda(BibliotecaMusicas bibli, int i) {
        initComponents();
        BEDITAR = bibli;
        EDIT = true;
        sBandaNome.setText(BEDITAR.getName());
        //sBandaLocal.setText(BEDITAR);
        
        BandToEdit = BEDITAR.getBanda(i);
        sBandaNome.setText(BandToEdit.getBAN_VNOME());
        sBandaLocal.setText(BandToEdit.getBAN_VLOCAL());
    }
    
    public void Cadastro(BibliotecaMusicas Bibli) {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelar = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sBandaNome = new javax.swing.JTextField();
        sBandaLocal = new javax.swing.JTextField();
        jbAbreImagem = new javax.swing.JButton();
        jspImagemBanda = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Adiocionar Banda");

        jLabel5.setText("Nome:");

        jLabel6.setText("Local:");

        jLabel7.setText("Carregar Imagem:");

        sBandaNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sBandaNomeMouseClicked(evt);
            }
        });
        sBandaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBandaNomeActionPerformed(evt);
            }
        });

        sBandaLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sBandaLocalMouseClicked(evt);
            }
        });

        jbAbreImagem.setText("Escolher Imagem");
        jbAbreImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbreImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(bCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                                .addComponent(bSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sBandaNome))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(sBandaLocal)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAbreImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jspImagemBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sBandaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sBandaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAbreImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bCancelar)
                            .addComponent(bSalvar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jspImagemBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        sBandaNome.setText("");
        sBandaLocal.setText("");
        //sBandaImagem.setText("");
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        if (EDIT != true) {
            if ("".equals(sBandaNome.getText())) {
                sBandaNome.setText(msgError);
                error = true;
            }
            if ("".equals(sBandaLocal.getText())) {
                sBandaLocal.setText(msgError);
                error = true;
            }
            
            if (error == false) {
                Banda L = new Banda();
                L.setBAN_ID(B.BandaTamanho());
                L.setBAN_VNOME(sBandaNome.getText());
                L.setBAN_VLOCAL(sBandaLocal.getText());
                
                B.AdicionarBanda(L);
                
                B.ExibeBanda(B.BandaTamanho() - 1);
                //B.RemoveBanda(B.BandaTamanho());
                this.dispose();
            }
        } else {
            if ("".equals(sBandaNome.getText())) {
                sBandaNome.setText(msgError);
                error = true;
            }
            if ("".equals(sBandaLocal.getText())) {
                sBandaLocal.setText(msgError);
                error = true;
            }
            
            if (error == false) {
            BandToEdit.setBAN_VNOME(sBandaNome.getText());
            BandToEdit.setBAN_VLOCAL(sBandaLocal.getText());
            
            BEDITAR.ExibeBanda(BandToEdit.getBAN_ID());
            this.dispose();
            }
        
        }
    }//GEN-LAST:event_bSalvarActionPerformed

    private void sBandaNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sBandaNomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sBandaNomeMouseClicked

    private void sBandaLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sBandaLocalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sBandaLocalMouseClicked
    JLabel jlab = new JLabel();
    private void jbAbreImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbreImagemActionPerformed
        JFileChooser jfc = new JFileChooser();

        //select file and display
        if (jfc.showOpenDialog(jbAbreImagem) == JFileChooser.APPROVE_OPTION) {
            //get selected file name [i.e., complete file path]
            java.io.File f = jfc.getSelectedFile();

            //set icon
            jlab.setIcon(new ImageIcon(f.toString()));

            //alignment
            jlab.setHorizontalAlignment(JLabel.CENTER);

            //add jLabel to scroll pane
            jspImagemBanda.getViewport().add(jlab);

//            Bandas L = new Bandas();
//            L.setBAN_VIMAGEM(f.toString());
        }
    }//GEN-LAST:event_jbAbreImagemActionPerformed

    private void sBandaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBandaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sBandaNomeActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarBanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbAbreImagem;
    private javax.swing.JScrollPane jspImagemBanda;
    private javax.swing.JTextField sBandaLocal;
    private javax.swing.JTextField sBandaNome;
    // End of variables declaration//GEN-END:variables

    Banda BandToEdit = new Banda();
    
    boolean EDIT = false;
    BibliotecaMusicas BEDITAR;
    BibliotecaMusicas B;
    boolean error = false;
    String msgError = "Este campo é obrigatório";
}
