
import java.util.ArrayList;
//import javax.swing.ImageIcon;
//import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class BibliotecaMusicas extends javax.swing.JFrame {

    JLabel jlab = new JLabel();

    public BibliotecaMusicas() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
    }

    public void RemoveBanda(int i) {
        Banda.remove(Banda.get(i));
        System.out.println(Banda);

        int sizebanda = BandaTamanho();

        if (sizebanda <= 0) {
            sBandaNome.setText("");
            sBandaLocal.setText("");
        } else {
            ExibeBanda(0);
        }
    }

    public void AdicionarBanda(Bandas Ban) {
        Banda.add(Ban);
    }

    public void AdicionarUsuario(Usuarios Usu) {
        Usuario.add(Usu);
    }

    public void AdicionarAlbum(Albuns Alb) {
        Album.add(Alb);
    }

    public void AdicionarMusica(Musicas Mus) {
        Musica.add(Mus);
    }

    public int BandaTamanho() {
        return Banda.size();
    }

    public int UsuarioTamanho() {
        return Usuario.size();
    }

    public int AlbumTamanho() {
        return Album.size();
    }

    public int MusicaTamanho() {
        return Musica.size();
    }

    public void ExibeBanda(int i) {
        sBandaNome.setText(Banda.get(i).getBAN_VNOME());
        sBandaLocal.setText(Banda.get(i).getBAN_VLOCAL());
        //TrazImagemBanda(Banda.get(i).getBAN_ID());
        INDICE = i;
        ID_BANDA_ATUAL = Banda.get(i).getBAN_ID();
        System.out.println(Banda);
    }

    public void ExibeAlbum(int i) {
        sBandaAlbum.setText(Album.get(i).getALB_VNOME());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bAlbumEditar = new javax.swing.JButton();
        bBandaEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMusicas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        bAlbumPrev = new javax.swing.JButton();
        bAlbumNext = new javax.swing.JButton();
        bMusicaExcluir = new javax.swing.JButton();
        bMusicaEditar = new javax.swing.JButton();
        bMusicaNova = new javax.swing.JButton();
        bBandaComponentes = new javax.swing.JButton();
        bAlbumAdicionar = new javax.swing.JButton();
        sBandaNome = new javax.swing.JTextField();
        sBandaLocal = new javax.swing.JTextField();
        sBandaAlbum = new javax.swing.JTextField();
        bAlbumExcluir = new javax.swing.JButton();
        bBandaExluir = new javax.swing.JButton();
        lBandaImagem = new javax.swing.JScrollPane();
        bBandaPrev = new javax.swing.JButton();
        bBandaAvanco = new javax.swing.JToggleButton();
        bBandaNova = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Acervo de Músicas");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Banda:");

        bAlbumEditar.setText("Editar");

        bBandaEditar.setText("Editar");
        bBandaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBandaEditarActionPerformed(evt);
            }
        });

        tMusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nº", "Nome", "Cifra", "Letra", "Player"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tMusicas);

        jLabel8.setText("Local:");

        bAlbumPrev.setText("<");

        bAlbumNext.setText(">");

        bMusicaExcluir.setText("Excluir");

        bMusicaEditar.setText("Editar");

        bMusicaNova.setText("Nova Musica");

        bBandaComponentes.setText("Ver Componentes da Banda");
        bBandaComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBandaComponentesActionPerformed(evt);
            }
        });

        bAlbumAdicionar.setText("Adicionar Álbum");
        bAlbumAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlbumAdicionarActionPerformed(evt);
            }
        });

        sBandaAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBandaAlbumActionPerformed(evt);
            }
        });

        bAlbumExcluir.setText("Excluir");

        bBandaExluir.setText("Excluir");
        bBandaExluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBandaExluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bAlbumPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sBandaAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlbumNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlbumEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlbumExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlbumAdicionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bMusicaNova)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bMusicaEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMusicaExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lBandaImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sBandaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sBandaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bBandaEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBandaComponentes))
                            .addComponent(bBandaExluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBandaEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sBandaNome)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(bBandaComponentes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(sBandaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBandaExluir))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lBandaImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAlbumEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAlbumPrev)
                    .addComponent(bAlbumNext)
                    .addComponent(bAlbumAdicionar)
                    .addComponent(sBandaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAlbumExcluir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMusicaExcluir)
                    .addComponent(bMusicaEditar)
                    .addComponent(bMusicaNova))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bBandaPrev.setText("<");
        bBandaPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBandaPrevActionPerformed(evt);
            }
        });

        bBandaAvanco.setText(">");

        bBandaNova.setText("Nova Banda");
        bBandaNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBandaNovaActionPerformed(evt);
            }
        });

        jTextField4.setText("Pesquisar por nome, banda, álbuns");

        jButton12.setText("Ir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bBandaPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBandaNova)))
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBandaAvanco)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(bBandaNova))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(bBandaPrev))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(bBandaAvanco)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBandaNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaNovaActionPerformed
        AdicionarBanda AddB = new AdicionarBanda(this);
        AddB.setVisible(true);
    }//GEN-LAST:event_bBandaNovaActionPerformed

    private void bBandaPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaPrevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBandaPrevActionPerformed

    private void bAlbumAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlbumAdicionarActionPerformed
        AdicionarAlbum AddAlbum = new AdicionarAlbum(this);
        AddAlbum.setVisible(true);
    }//GEN-LAST:event_bAlbumAdicionarActionPerformed

    private void bBandaComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaComponentesActionPerformed
        AdicionarComponentes AddUsu = new AdicionarComponentes(this);
        AddUsu.setVisible(true);
    }//GEN-LAST:event_bBandaComponentesActionPerformed

    private void bBandaExluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaExluirActionPerformed
        if (INDICE != -1) {
            RemoveBanda(INDICE);
        }
    }//GEN-LAST:event_bBandaExluirActionPerformed

    private void sBandaAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBandaAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sBandaAlbumActionPerformed

    private void bBandaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaEditarActionPerformed
        AdicionarBanda AddB = new AdicionarBanda(this, INDICE);
        AddB.setVisible(true);
    }//GEN-LAST:event_bBandaEditarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecaMusicas().setVisible(true);
            }
        });
    }

//    public void TrazImagemBanda (int ID_BANDA) {                                             
//        JFileChooser jfc = new JFileChooser();
//            java.io.File ff = jfc.getSelectedFile();
//            String f = ff.toString();
//            f = Banda.get(ID_BANDA).getBAN_VIMAGEM();
//            //set icon
//            jlab.setIcon(new ImageIcon(f));
//
//            //alignment
//            jlab.setHorizontalAlignment(JLabel.CENTER);
//
//            //add jLabel to scroll pane
//            lBandaImagem.getViewport().add(jlab);
//    }         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlbumAdicionar;
    private javax.swing.JButton bAlbumEditar;
    private javax.swing.JButton bAlbumExcluir;
    private javax.swing.JButton bAlbumNext;
    private javax.swing.JButton bAlbumPrev;
    private javax.swing.JToggleButton bBandaAvanco;
    private javax.swing.JButton bBandaComponentes;
    private javax.swing.JButton bBandaEditar;
    private javax.swing.JButton bBandaExluir;
    private javax.swing.JButton bBandaNova;
    private javax.swing.JButton bBandaPrev;
    private javax.swing.JButton bMusicaEditar;
    private javax.swing.JButton bMusicaExcluir;
    private javax.swing.JButton bMusicaNova;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JScrollPane lBandaImagem;
    private javax.swing.JTextField sBandaAlbum;
    private javax.swing.JTextField sBandaLocal;
    private javax.swing.JTextField sBandaNome;
    private javax.swing.JTable tMusicas;
    // End of variables declaration//GEN-END:variables

    int ID_BANDA_ATUAL = -1;
    int ID_ALBUM_ATUAL = 0;
    int ID_MUSICA_ATUAL = 0;

    int INDICE = -1;

    int indiceRemove = 0;
    ArrayList<Bandas> Banda = new ArrayList<>();
    ArrayList<Albuns> Album = new ArrayList<>();
    ArrayList<Usuarios> Usuario = new ArrayList<>();
    ArrayList<Musicas> Musica = new ArrayList<>();
}
