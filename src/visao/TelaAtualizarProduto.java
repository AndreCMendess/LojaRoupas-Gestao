package visao;

import Classes.ListaProduto;
import Classes.Produto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaAtualizarProduto extends javax.swing.JFrame {

    Principal tela;

    public TelaAtualizarProduto(Principal tela) {
        this.tela = tela;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaCadastro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtTamanho = new javax.swing.JTextField();
        txtValorCompra = new javax.swing.JTextField();
        txtValorVenda = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaCadastro.setBackground(new java.awt.Color(17, 24, 39));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Atualizar Produto");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dados do produto ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome*");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade*");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tamanho*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor Compra*");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descrição*");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valor Venda*");

        txtNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeProduto.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeProduto.setToolTipText("Insira o nome do produto.");
        txtNomeProduto.setBorder(null);
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        txtQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        txtQuantidade.setToolTipText("Insira a quantidade do produto (nao pode ser negativa)");
        txtQuantidade.setBorder(null);

        txtDescricao.setBackground(new java.awt.Color(255, 255, 255));
        txtDescricao.setForeground(new java.awt.Color(0, 0, 0));
        txtDescricao.setToolTipText("Aqui sera escrito a descriçao do produto , caracteristicas etc...");
        txtDescricao.setBorder(null);

        txtTamanho.setBackground(new java.awt.Color(255, 255, 255));
        txtTamanho.setForeground(new java.awt.Color(0, 0, 0));
        txtTamanho.setToolTipText("Insira o tamanho do produto (M, U, P, G ou GG).");
        txtTamanho.setBorder(null);

        txtValorCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtValorCompra.setForeground(new java.awt.Color(0, 0, 0));
        txtValorCompra.setToolTipText("Insira o valor de compra do produto (entre 2 e 5 dígitos).");
        txtValorCompra.setBorder(null);

        txtValorVenda.setBackground(new java.awt.Color(255, 255, 255));
        txtValorVenda.setForeground(new java.awt.Color(0, 0, 0));
        txtValorVenda.setToolTipText("Insira o valor de venda do produto (não negativo e maior ou igual ao valor de compra).");
        txtValorVenda.setBorder(null);

        btnAtualizar.setBackground(new java.awt.Color(17, 24, 39));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setActionCommand(" Voltar");
        btnAtualizar.setPreferredSize(new java.awt.Dimension(123, 39));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCadastroLayout = new javax.swing.GroupLayout(telaCadastro);
        telaCadastro.setLayout(telaCadastroLayout);
        telaCadastroLayout.setHorizontalGroup(
            telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(telaCadastroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaCadastroLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaCadastroLayout.createSequentialGroup()
                                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtValorVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(txtTamanho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtValorCompra, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(55, 55, 55))
        );
        telaCadastroLayout.setVerticalGroup(
            telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        if (tela.tabelaProduto.getSelectedRow() != -1) {
            
            int indiceSelecionado = tela.tabelaProduto.getSelectedRow();
            Produto p = ListaProduto.listar().get(indiceSelecionado);
            
          
            String nomeProduto = txtNomeProduto.getText();
            String descricao = txtDescricao.getText();
            String tamanho = txtTamanho.getText();
            String quantidade = txtQuantidade.getText();
            String valorCompra = txtValorCompra.getText();
            String valorVenda = txtValorVenda.getText();
            
            try {
                if(ListaProduto.validarDados(nomeProduto,descricao,tamanho,valorCompra,valorVenda,quantidade)){
                    //ListaProduto.atualizarProdutoNoEstoque(indiceSelecionado,nomeProduto,descricao,tamanho,valorCompra,valorVenda,quantidade);
                 //atualizarTabelaProduto(indiceSelecionado,nomeProduto,descricao,tamanho,valorCompra,valorVenda,quantidade);
                     JOptionPane.showMessageDialog(rootPane,
                        "Produto Atualizado com Sucesso");
                dispose();
                    
                }
            } catch (ListaProduto.dadosProdutoException ex) {
               JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                       
            }

           /*  if (txtQuantidade.getText().isBlank() || txtValorCompra.getText().isBlank() || txtValorVenda.getText().isBlank()) {
               JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos.");
                return;
            }*/

          /*  try {

                tela.validarDados(tamanho, quantidade, valorCompra, valorVenda);
                int qnt = Integer.parseInt(quantidade);
                double vCompra = Double.parseDouble(valorCompra);
                double vVenda = Double.parseDouble(valorVenda);

                p.setNome(txtNomeProduto.getText());
                p.setDescricao(txtDescricao.getText());
                p.setTamanho(txtTamanho.getText());
                p.setValorCompra(vCompra);
                p.setValorVenda(vVenda);
                p.setQuantidade(qnt);

                ListaProduto.atualizar(indiceSelecionado, p);

                tela.tabelaProduto.setValueAt(txtNomeProduto.getText(), indiceSelecionado, 1);
                tela.tabelaProduto.setValueAt(txtDescricao.getText(), indiceSelecionado, 2);
                tela.tabelaProduto.setValueAt(tamanho, indiceSelecionado, 3);
                tela.tabelaProduto.setValueAt(valorCompra, indiceSelecionado, 4);
                tela.tabelaProduto.setValueAt(valorVenda, indiceSelecionado, 5);
                tela.tabelaProduto.setValueAt(quantidade, indiceSelecionado, 6);

                JOptionPane.showMessageDialog(rootPane,
                        "Produto Atualizado com Sucesso");
                dispose();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "A quantidade do produto deve ser um numero inteiro");
            } catch (Principal.dadosProdutoException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }*/

            

    }//GEN-LAST:event_btnAtualizarActionPerformed
    }

  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel telaCadastro;
    protected javax.swing.JTextField txtDescricao;
    protected javax.swing.JTextField txtNomeProduto;
    protected javax.swing.JTextField txtQuantidade;
    protected javax.swing.JTextField txtTamanho;
    protected javax.swing.JTextField txtValorCompra;
    protected javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
