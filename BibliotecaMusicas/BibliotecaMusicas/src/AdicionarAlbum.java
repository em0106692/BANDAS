
import java.util.ArrayList;
public class AdicionarAlbum extends javax.swing.JFrame {
    TableModelAlbum tableModel = new TableModelAlbum();
    
    public AdicionarAlbum() {
        initComponents();
        jtAlbum.setModel(tableModel);
    }

    public AdicionarAlbum(BibliotecaMusicas bibli, int ID) {
        initComponents();
        B = bibli;
        ID_BANDA_ATUAL = ID;
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
        jbCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlbum = new javax.swing.JTable();
        sMusicaNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Adicionar Álbum");

        jLabel5.setText("Nome");

        jbSalvarBanda.setText("Salvar");
        jbSalvarBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarBandaActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Adicionar Musica");

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

        jLabel3.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sMusicaNome)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sMusicaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sNomeAlbum))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalvarBanda)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarBanda)
                    .addComponent(jbCancelar)))
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
            idAlbum = B.AlbumTamanho();
            AL.setALB_ID(idAlbum);
            AL.setALB_VNOME(sNomeAlbum.getText());
            AL.setALB_BAN_ID(ID_BANDA_ATUAL);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvarBanda;
    private javax.swing.JTable jtAlbum;
    private javax.swing.JTextField sMusicaNome;
    private javax.swing.JTextField sNomeAlbum;
    // End of variables declaration//GEN-END:variables
    
    int idAlbum = 0;
    BibliotecaMusicas B;
    
    int ID_BANDA_ATUAL = -1;
    int ID_ALBUM_ATUAL = -1;
    int ID_MUSICA_ATUAL = -1;
    
    boolean error = false;
    String msgError = "Este campo é obrigatório";
}
