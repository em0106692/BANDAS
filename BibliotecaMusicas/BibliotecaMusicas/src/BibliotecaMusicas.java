
import java.util.ArrayList;
//import javax.swing.ImageIcon;
//import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BibliotecaMusicas extends javax.swing.JFrame {

    JLabel jlab = new JLabel();
    TableModelMusica tableModel = new TableModelMusica();

    public BibliotecaMusicas() {
        initComponents();
        tMusicas.setModel(tableModel);
//this.setExtendedState(MAXIMIZED_BOTH);
    }

    public void RemoveBanda(int i) {
        Bandas.remove(Bandas.get(i));
        System.out.println(Bandas);

        int sizebanda = BandaTamanho();

        if (sizebanda <= 0) {
            sBandaNome.setText("");
            sBandaLocal.setText("");
        } else {
            ExibeBanda(0);
        }
    }

    public void AdicionarBanda(Banda Ban) {
        Bandas.add(Ban);
    }

    public void AdicionarUsuario(Usuario Usu) {
        Usuarios.add(Usu);
    }

    public void AdicionarAlbum(Album Alb) {
        Albuns.add(Alb);
    }

    public void AdicionarMusica(Musica Mus) {
        Musicas.add(Mus);
    }

    public int BandaTamanho() {
        return Bandas.size();
    }

    public int UsuarioTamanho() {
        return Usuarios.size();
    }

    public int AlbumTamanho() {
        return Albuns.size();
    }

    public int MusicaTamanho() {
        return Musicas.size();
    }

    public Banda getBanda(int indice) {
        return Bandas.get(indice);
    }

    public Usuario getComponentes(int indice) {
        return Usuarios.get(indice);
    }

    public void ExibeBanda(int i) {
        sBandaNome.setText(Bandas.get(i).getBAN_VNOME());
        sBandaLocal.setText(Bandas.get(i).getBAN_VLOCAL());
        INDICE = i;
        ID_BANDA_ATUAL = Bandas.get(i).getBAN_ID();
        System.out.println(Bandas);
    }

    public void ExibeAlbum(int i) {
        sBandaAlbum.setText(Albuns.get(i).getALB_VNOME());
        System.out.println(Albuns);

        INDICEALB = i;
        int TM = MusicaTamanho() - 1;
        for (int j = 0; j < TM; j++) {
            Musicas.get(j).getMUS_ALB_ID();
        }
    }

    public void ExibeMusica(int i) {
        Musica M = (Musicas.get(i));

        M.getMUS_ID();

        tableModel.addrow(M);
        //TrazImagemBanda(Banda.get(i).getBAN_ID());
        INDICEMUS = i;
        ID_BANDA_ATUAL = Bandas.get(i).getBAN_ID();

        System.out.println(Bandas);
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
        bAlbumEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlbumEditarActionPerformed(evt);
            }
        });

        bBandaEditar.setText("Editar");
        bBandaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBandaEditarActionPerformed(evt);
            }
        });

        tMusicas.setModel(tableModel);
        jScrollPane1.setViewportView(tMusicas);

        jLabel8.setText("Local:");

        bAlbumPrev.setText("<");
        bAlbumPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlbumPrevActionPerformed(evt);
            }
        });

        bAlbumNext.setText(">");
        bAlbumNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlbumNextActionPerformed(evt);
            }
        });

        bMusicaExcluir.setText("Excluir");

        bMusicaEditar.setText("Editar");

        bMusicaNova.setText("Nova Musica");
        bMusicaNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMusicaNovaActionPerformed(evt);
            }
        });

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
        bAlbumExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlbumExcluirActionPerformed(evt);
            }
        });

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
                        .addComponent(bAlbumAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlbumEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlbumExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bMusicaNova)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bMusicaEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMusicaExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lBandaImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sBandaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bBandaComponentes))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sBandaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bBandaEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bBandaExluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sBandaNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bBandaEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBandaExluir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(sBandaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBandaComponentes)))
                    .addComponent(lBandaImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAlbumEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAlbumPrev)
                    .addComponent(bAlbumNext)
                    .addComponent(sBandaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAlbumExcluir)
                    .addComponent(bAlbumAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        bBandaAvanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBandaAvancoActionPerformed(evt);
            }
        });

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
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBandaNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaNovaActionPerformed
        AdicionarBanda AddB = new AdicionarBanda(this);
        AddB.setVisible(true);
    }//GEN-LAST:event_bBandaNovaActionPerformed

    private void bBandaPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaPrevActionPerformed
//        if (INDICE < BandaTamanho() - 1) {
//            INDICE--;
//            ExibeBanda(INDICE);
//        }

        if (INDICE - 1 >= 0) {
            ExibeBanda(INDICE - 1);
        }

        if (INDICEALB - 1 >= 0) {
            ExibeBanda(INDICEALB - 1);
        }

        if (INDICE - 2 < 0) {
            bBandaPrev.disable();
        }


    }//GEN-LAST:event_bBandaPrevActionPerformed

    private void bAlbumAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlbumAdicionarActionPerformed
        tableModel = new TableModelMusica();
        if (!"".equals(sBandaNome.getText())) {
            AdicionarAlbum AddAlbum = new AdicionarAlbum(this, ID_BANDA_ATUAL);
            AddAlbum.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Cadastre uma banda primeiro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        sBandaAlbum.setText("");
    }//GEN-LAST:event_bAlbumAdicionarActionPerformed

    private void bBandaComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaComponentesActionPerformed
        if (!"".equals(sBandaNome.getText())) {
            AdicionarComponentes AddUsu = new AdicionarComponentes(this, ID_BANDA_ATUAL);
            AddUsu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Insira uma Banda primeiro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

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

    private void bMusicaNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMusicaNovaActionPerformed
        if (!"".equals(sBandaNome.getText())) {
            AdicionarAlbum AddAlbum = new AdicionarAlbum(this, ID_BANDA_ATUAL);
            AddAlbum.setVisible(true);
        } else if ("".equals(sBandaNome.getText())) {
            JOptionPane.showMessageDialog(null, "Insira uma Banda primeiro!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (!"".equals(sBandaAlbum.getText())) {
            JOptionPane.showMessageDialog(null, "Insira uma Álbum primeiro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bMusicaNovaActionPerformed

    private void bBandaAvancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBandaAvancoActionPerformed
        if (INDICE + 1 <= BandaTamanho() - 1) {
            ExibeBanda(INDICE + 1);
        }

        if (INDICEALB - 1 >= 0) {
            ExibeBanda(INDICEALB - 1);
        }

        if (INDICE + 2 > BandaTamanho() - 1) {
            bBandaAvanco.disable();
        }
    }//GEN-LAST:event_bBandaAvancoActionPerformed

    private void bAlbumPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlbumPrevActionPerformed
        if (INDICEALB - 1 >= 0) {
            ExibeBanda(INDICEALB - 1);
        }
    }//GEN-LAST:event_bAlbumPrevActionPerformed

    private void bAlbumNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlbumNextActionPerformed
        if (INDICEALB + 1 >= 0) {
            ExibeBanda(INDICEALB + 1);
        }
    }//GEN-LAST:event_bAlbumNextActionPerformed

    private void bAlbumEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlbumEditarActionPerformed
        AdicionarAlbum AddA = new AdicionarAlbum(this, INDICEALB);
        AddA.setVisible(true);
    }//GEN-LAST:event_bAlbumEditarActionPerformed

    private void bAlbumExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlbumExcluirActionPerformed
        if (INDICEALB != -1) {
            RemoveBanda(INDICEALB);
        }
    }//GEN-LAST:event_bAlbumExcluirActionPerformed

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
    int ID_ALBUM_ATUAL = -1;
    int ID_MUSICA_ATUAL = -1;

    int INDICE = -1;
    int INDICEALB = -1;
    int INDICEMUS = -1;

    int indiceRemove = 0;

    ArrayList<Banda> Bandas = new ArrayList<>();
    ArrayList<Album> Albuns = new ArrayList<>();
    ArrayList<Usuario> Usuarios = new ArrayList<>();
    ArrayList<Musica> Musicas = new ArrayList<>();
}
