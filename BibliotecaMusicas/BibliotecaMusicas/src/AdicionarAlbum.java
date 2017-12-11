
import java.util.ArrayList;

public class AdicionarAlbum extends javax.swing.JFrame {

    TableModelMusica tableModel = new TableModelMusica();

    public AdicionarAlbum() {
        initComponents();
        jtMusica.setModel(tableModel);
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
        jbAlbumSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMusica = new javax.swing.JTable();
        sMusicaNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bMusicaAdicionar = new javax.swing.JButton();
        bMusicaEditar = new javax.swing.JButton();
        bMusicaExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Adicionar Álbum");

        jLabel5.setText("Nome");

        jbAlbumSalvar.setText("Salvar");
        jbAlbumSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlbumSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Adicionar Musica");

        jtMusica.setModel(tableModel);
        jtMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMusicaMouseClicked(evt);
            }
        });
        jtMusica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMusicaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtMusica);

        jLabel3.setText("Nome");

        bMusicaAdicionar.setText("Adicionar");
        bMusicaAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMusicaAdicionarActionPerformed(evt);
            }
        });

        bMusicaEditar.setText("Editar");

        bMusicaExcluir.setText("Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sMusicaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMusicaAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMusicaEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMusicaExcluir)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sMusicaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(bMusicaAdicionar)
                    .addComponent(bMusicaEditar)
                    .addComponent(bMusicaExcluir))
                .addGap(18, 18, 18)
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
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sNomeAlbum))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAlbumSalvar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlbumSalvar)
                    .addComponent(jbCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlbumSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlbumSalvarActionPerformed
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

            B.ExibeAlbum(idAlbum);
            
            this.dispose();
        }
    }//GEN-LAST:event_jbAlbumSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtMusicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMusicaKeyReleased
        System.out.println("Work");
        int linha = jtMusica.getSelectedRow();
        sNomeAlbum.setText(jtMusica.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_jtMusicaKeyReleased

    private void jtMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMusicaMouseClicked
        System.out.println("Work");
        int linha = jtMusica.getSelectedRow();
        sNomeAlbum.setText(jtMusica.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_jtMusicaMouseClicked

    private void bMusicaAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMusicaAdicionarActionPerformed
        if ("".equals(sMusicaNome.getText())) {
            sMusicaNome.setText(msgError);
            error = true;
        }
        if (error == false) {
            Musicas M = new Musicas();
            
            idMusica = B.MusicaTamanho();
            M.setMUS_ID(idMusica);
            M.setMUS_VNOME(sMusicaNome.getText());
            M.setMUS_ALB_ID(idAlbum);
            B.AdicionarMusica(M);
            tableModel.addrow(M);

            B.ExibeMusica(idMusica);
        }
    }//GEN-LAST:event_bMusicaAdicionarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarBanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMusicaAdicionar;
    private javax.swing.JButton bMusicaEditar;
    private javax.swing.JButton bMusicaExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlbumSalvar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JTable jtMusica;
    private javax.swing.JTextField sMusicaNome;
    private javax.swing.JTextField sNomeAlbum;
    // End of variables declaration//GEN-END:variables

    int idAlbum = 0;
    int idMusica = 0;

    BibliotecaMusicas B;

    int ID_BANDA_ATUAL = -1;
    int ID_ALBUM_ATUAL = -1;
    int ID_MUSICA_ATUAL = -1;

    boolean error = false;
    String msgError = "Este campo é obrigatório";
}
