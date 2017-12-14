
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdicionarComponentes extends javax.swing.JFrame {

    TableModelComponentes tableModel = new TableModelComponentes();

    public AdicionarComponentes() {
        initComponents();
        tComponentesBanda.setModel(tableModel);
    }

    public AdicionarComponentes(BibliotecaMusicas bibli, int ID) {
        initComponents();
        B = bibli;
        ID_BANDA_ATUAL = ID;

        if (B.Usuarios.size() > 0) {

            for (int i = 0; i < B.UsuarioTamanho(); i++) {
                Usuario U = new Usuario();
                U.setUSU_ID(B.getComponentes(i).getUSU_ID());
                U.setUSU_VNOME(B.getComponentes(i).getUSU_VNOME());
                tableModel.addrow(U);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sComponentesNome = new javax.swing.JTextField();
        bSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tComponentesBanda = new javax.swing.JTable();
        jbAbreImagem = new javax.swing.JButton();
        jspImagemBanda = new javax.swing.JScrollPane();
        bComponentesAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Adicionar Artista");

        jLabel5.setText("Nome");

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        tComponentesBanda.setModel(tableModel);
        jScrollPane1.setViewportView(tComponentesBanda);

        jbAbreImagem.setText("Escolher Imagem");
        jbAbreImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbreImagemActionPerformed(evt);
            }
        });

        bComponentesAdicionar.setText("Adicionar componente");
        bComponentesAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComponentesAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sComponentesNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAbreImagem)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bComponentesAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jspImagemBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sComponentesNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAbreImagem)
                    .addComponent(jspImagemBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bComponentesAdicionar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAbreImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbreImagemActionPerformed
        JFileChooser jfc = new JFileChooser();

        if (jfc.showOpenDialog(jbAbreImagem) == JFileChooser.APPROVE_OPTION) {
            java.io.File f = jfc.getSelectedFile();

//            jlab.setIcon(new ImageIcon(f.toString()));
//
//            jlab.setHorizontalAlignment(JLabel.CENTER);
//
//            jspImagemBanda.getViewport().add(jlab);
        }
    }//GEN-LAST:event_jbAbreImagemActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        tableModel.limpaTabela();
        this.dispose();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bComponentesAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComponentesAdicionarActionPerformed
        if ("".equals(sComponentesNome.getText())) {
            sComponentesNome.setText(msgError);
            error = true;
        }

        if (error == false) {
            Usuario U = new Usuario();
            U.setUSU_ID(B.UsuarioTamanho());
            U.setUSU_VNOME(sComponentesNome.getText());
            U.setUSU_BAN_ID(ID_BANDA_ATUAL);

            B.AdicionarUsuario(U);

            tableModel.addrow(U);

            System.out.println(U);

            //tListaComponentes
            sComponentesNome.setText("");
        }
    }//GEN-LAST:event_bComponentesAdicionarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarBanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bComponentesAdicionar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAbreImagem;
    private javax.swing.JScrollPane jspImagemBanda;
    private javax.swing.JTextField sComponentesNome;
    private javax.swing.JTable tComponentesBanda;
    // End of variables declaration//GEN-END:variables

    BibliotecaMusicas B;

    int ID_BANDA_ATUAL = -1;
    int ID_ALBUM_ATUAL = -1;
    int ID_MUSICA_ATUAL = -1;

    boolean error = false;
    String msgError = "Este campo é obrigatório";
}
