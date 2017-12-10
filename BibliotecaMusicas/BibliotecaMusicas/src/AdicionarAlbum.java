
import java.util.ArrayList;
public class AdicionarAlbum extends javax.swing.JFrame {
    TableModelAlbum tableModel = new TableModelAlbum();
    
    public AdicionarAlbum() {
        initComponents();
        jtAlbum.setModel(tableModel);
    }

    public AdicionarAlbum(BibliotecaMusicas bibli) {
        initComponents();
        B = bibli;
    }

    public void Cadastro(BibliotecaMusicas Bibli) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sNomeAlbum = new javax.swing.JTextField();
        jbSalvarBanda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlbum = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Adicionar Álbum");

        jLabel5.setText("Nome");

        jbSalvarBanda.setText("Salvar");
        jbSalvarBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarBandaActionPerformed(evt);
            }
        });

        jtAlbum.setModel(tableModel);
        jtAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlbumMouseClicked(evt);
            }
        });
        jtAlbum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtAlbumKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlbum);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sNomeAlbum))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvarBanda)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sNomeAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarBanda)
                    .addComponent(jbCancelar))
                .addGap(168, 168, 168))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarBandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarBandaActionPerformed
        if ("".equals(sNomeAlbum.getText())) {
            sNomeAlbum.setText(msgError);
            error = true;
        }
        if (error == false) {
            Albuns AL = new Albuns();
            idAlbum = B.RetornaTamanhoAlbum();
            AL.setALB_ID(idAlbum);
            AL.setALB_VNOME(sNomeAlbum.getText());
            B.AdicionarAlbum(AL);
            tableModel.addrow(AL);
            
            B.ExibeAlbum(idAlbum);
        }
    }//GEN-LAST:event_jbSalvarBandaActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtAlbumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAlbumKeyReleased
        System.out.println("Work");
        int linha = jtAlbum.getSelectedRow();       
        sNomeAlbum.setText(jtAlbum.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_jtAlbumKeyReleased

    private void jtAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlbumMouseClicked
        System.out.println("Work");
        int linha = jtAlbum.getSelectedRow();       
        sNomeAlbum.setText(jtAlbum.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_jtAlbumMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarBanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvarBanda;
    private javax.swing.JTable jtAlbum;
    private javax.swing.JTextField sNomeAlbum;
    // End of variables declaration//GEN-END:variables
    
    int idAlbum = 0;
    BibliotecaMusicas B;
    boolean error = false;
    String msgError = "Este campo é obrigatório";
}
