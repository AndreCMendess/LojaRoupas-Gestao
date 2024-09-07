package visao;

import Classes.Cliente;
import Classes.ListaCliente;
import Classes.ListaProduto;
import Classes.ListaProduto.dadosProdutoException;
import Classes.ListaVenda;
import Classes.Produto;
import Classes.Venda;
import Classes.VendaProduto;
import dao.ClienteDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private List<VendaProduto> produtosVenda = new ArrayList<>();

    public Principal() {

        initComponents();
        Produto p = (Produto) jcbProduto.getSelectedItem();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        btnEfeito();
        
       
        alertaDataVenda();
        
    
       
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSide = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        btnRegistroClientes = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnVendas = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSistema = new javax.swing.JButton();
        JPprincipal = new javax.swing.JPanel();
        telaInicial = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        telaCadastroProduto = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtTamanho = new javax.swing.JTextField();
        txtValorCompra = new javax.swing.JTextField();
        txtValorVenda = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        btnCadastrar1 = new javax.swing.JButton();
        telaCliente = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btnDeletar1 = new javax.swing.JButton();
        btnAtualizar2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnNovoCliente = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        cbFiltroCliente = new javax.swing.JComboBox<>();
        txtPesquisaCliente = new javax.swing.JTextField();
        telaCadastroCliente = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNomeCliente = new javax.swing.JTextField();
        btnCadastrarCliente = new javax.swing.JButton();
        telaVenda = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPCadastroVenda = new javax.swing.JPanel();
        jcbCliente = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JCheckBox();
        txtClienteNaoRegistrado = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        cbNao = new javax.swing.JCheckBox();
        cbSim = new javax.swing.JCheckBox();
        txtDataPagamento = new javax.swing.JFormattedTextField();
        txtDataVenda = new javax.swing.JFormattedTextField();
        jcbProduto = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnCadastrarVenda = new javax.swing.JButton();
        jcbQuantidadeProduto = new javax.swing.JComboBox<>();
        txtValorTotal = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jcbProdutosVenda = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jPRegistroVendas = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        btnDeletarVenda = new javax.swing.JButton();
        telaEstoque = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnValorTotal = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JComboBox<>();
        txtPesquisar = new javax.swing.JTextField();
        btnNovoProduto = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnValorTotal1 = new javax.swing.JButton();
        btnDeletarProduto = new javax.swing.JButton();
        btnAtualizarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        pnlSide.setBackground(new java.awt.Color(17, 24, 39));
        pnlSide.setForeground(new java.awt.Color(255, 255, 255));
        pnlSide.setPreferredSize(new java.awt.Dimension(90, 0));

        jButton1.setBackground(new java.awt.Color(17, 24, 39));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loja.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEstoque.setBackground(new java.awt.Color(17, 24, 39));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        btnEstoque.setBorder(null);
        btnEstoque.setPreferredSize(new java.awt.Dimension(40, 40));
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnAdicionarProduto.setBackground(new java.awt.Color(17, 24, 39));
        btnAdicionarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-produto.png"))); // NOI18N
        btnAdicionarProduto.setBorder(null);
        btnAdicionarProduto.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnRegistroClientes.setBackground(new java.awt.Color(17, 24, 39));
        btnRegistroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        btnRegistroClientes.setBorder(null);
        btnRegistroClientes.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroClientesActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setBackground(new java.awt.Color(17, 24, 39));
        btnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-usuario (1).png"))); // NOI18N
        btnRegistrarCliente.setBorder(null);
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        btnVendas.setBackground(new java.awt.Color(17, 24, 39));
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-de-precos.png"))); // NOI18N
        btnVendas.setBorder(null);
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(17, 24, 39));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSistema.setBackground(new java.awt.Color(17, 24, 39));
        btnSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sistema.png"))); // NOI18N

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarCliente)
                            .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVendas)
                            .addComponent(btnSistema)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(40, 40, 40)
                .addComponent(btnRegistrarCliente)
                .addGap(40, 40, 40)
                .addComponent(btnVendas)
                .addGap(40, 40, 40)
                .addComponent(btnSistema)
                .addGap(193, 193, 193)
                .addComponent(btnSair)
                .addContainerGap())
        );

        getContentPane().add(pnlSide, java.awt.BorderLayout.WEST);

        JPprincipal.setLayout(new java.awt.CardLayout());

        telaInicial.setBackground(new java.awt.Color(17, 24, 39));
        telaInicial.setForeground(new java.awt.Color(204, 255, 0));

        javax.swing.GroupLayout telaInicialLayout = new javax.swing.GroupLayout(telaInicial);
        telaInicial.setLayout(telaInicialLayout);
        telaInicialLayout.setHorizontalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel52)
                .addContainerGap(1908, Short.MAX_VALUE))
        );
        telaInicialLayout.setVerticalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel52)
                .addContainerGap(1449, Short.MAX_VALUE))
        );

        JPprincipal.add(telaInicial, "telaInicial");

        telaCadastroProduto.setBackground(new java.awt.Color(17, 24, 39));

        jPanel2.setBackground(new java.awt.Color(17, 24, 39));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastrar Produto");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dados do produto para cadastro");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome*");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descrição*");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tamanho*");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valor Venda*");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor Compra*");

        txtNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeProduto.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeProduto.setToolTipText("Insira o nome do produto.");
        txtNomeProduto.setBorder(null);
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        txtDescricao.setBackground(new java.awt.Color(255, 255, 255));
        txtDescricao.setForeground(new java.awt.Color(0, 0, 0));
        txtDescricao.setToolTipText("Aqui sera escrito a descriçao do produto , caracteristicas etc...");
        txtDescricao.setBorder(null);

        txtTamanho.setBackground(new java.awt.Color(255, 255, 255));
        txtTamanho.setForeground(new java.awt.Color(0, 0, 0));
        txtTamanho.setToolTipText("Insira o tamanho do produto (M, U, P, G ou GG).");
        txtTamanho.setBorder(null);
        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });

        txtValorCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtValorCompra.setForeground(new java.awt.Color(0, 0, 0));
        txtValorCompra.setToolTipText("Insira o valor de compra do produto (entre 2 e 5 dígitos).");
        txtValorCompra.setBorder(null);

        txtValorVenda.setBackground(new java.awt.Color(255, 255, 255));
        txtValorVenda.setForeground(new java.awt.Color(0, 0, 0));
        txtValorVenda.setToolTipText("Insira o valor de venda do produto (não negativo e maior ou igual ao valor de compra).");
        txtValorVenda.setBorder(null);

        txtQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        txtQuantidade.setToolTipText("Insira a quantidade do produto (nao pode ser negativa)");
        txtQuantidade.setBorder(null);

        btnCadastrar1.setBackground(new java.awt.Color(17, 24, 39));
        btnCadastrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar1.setText("Cadastrar");
        btnCadastrar1.setActionCommand(" Voltar");
        btnCadastrar1.setPreferredSize(new java.awt.Dimension(123, 39));
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtValorCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtValorVenda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTamanho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addContainerGap(1205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 995, Short.MAX_VALUE)
                .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout telaCadastroProdutoLayout = new javax.swing.GroupLayout(telaCadastroProduto);
        telaCadastroProduto.setLayout(telaCadastroProdutoLayout);
        telaCadastroProdutoLayout.setHorizontalGroup(
            telaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaCadastroProdutoLayout.setVerticalGroup(
            telaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPprincipal.add(telaCadastroProduto, "tela1");

        telaCliente.setBackground(new java.awt.Color(17, 24, 39));

        jPanel3.setBackground(new java.awt.Color(17, 24, 39));

        tabelaCliente.setModel(montarTabela(new Cliente()));
        jScrollPane2.setViewportView(tabelaCliente);

        btnDeletar1.setBackground(new java.awt.Color(17, 24, 39));
        btnDeletar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeletar1.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btnDeletar1.setText("Deletar");
        btnDeletar1.setActionCommand(" Voltar");
        btnDeletar1.setPreferredSize(new java.awt.Dimension(123, 39));
        btnDeletar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletar1ActionPerformed(evt);
            }
        });

        btnAtualizar2.setBackground(new java.awt.Color(17, 24, 39));
        btnAtualizar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar2.setText("Atualizar");
        btnAtualizar2.setActionCommand(" Voltar");
        btnAtualizar2.setPreferredSize(new java.awt.Dimension(123, 39));
        btnAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clientes");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Registro de Clientes com id , nome , cpf , telefone , email e endereço.");

        btnNovoCliente.setBackground(new java.awt.Color(17, 24, 39));
        btnNovoCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-usuario (1).png"))); // NOI18N
        btnNovoCliente.setText("Novo Cliente");
        btnNovoCliente.setToolTipText("Registrar novo cliente a loja");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Pesquisar Cliente por ");

        cbFiltroCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Clique Aqui>\t", "Nome", "Cpf", "Telefone", "Email", "Endereco" }));

        txtPesquisaCliente.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesquisaClienteCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(cbFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(btnAtualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeletar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNovoCliente))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(btnNovoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(cbFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 858, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout telaClienteLayout = new javax.swing.GroupLayout(telaCliente);
        telaCliente.setLayout(telaClienteLayout);
        telaClienteLayout.setHorizontalGroup(
            telaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1011, Short.MAX_VALUE))
        );
        telaClienteLayout.setVerticalGroup(
            telaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPprincipal.add(telaCliente, "telaCliente");

        telaCadastroCliente.setBackground(new java.awt.Color(17, 24, 39));
        telaCadastroCliente.setForeground(new java.awt.Color(0, 0, 0));
        telaCadastroCliente.setPreferredSize(new java.awt.Dimension(1162, 1372));
        telaCadastroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(17, 24, 39));
        jPanel4.setPreferredSize(new java.awt.Dimension(1162, 1372));

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        txtEndereco.setBorder(null);
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(null);
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("9########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Telefone");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Endereço");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Email");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cpf");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nome");

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Dados do cliente para cadastro");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cadastrar Cliente");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setBorder(null);
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeCliente.setBorder(null);
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setBackground(new java.awt.Color(17, 24, 39));
        btnCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.setActionCommand(" Voltar");
        btnCadastrarCliente.setPreferredSize(new java.awt.Dimension(123, 39));
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(46, 46, 46)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(62, 62, 62)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(51, 51, 51)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(27, 27, 27)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(32, 32, 32)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel16)
                .addGap(6, 6, 6)
                .addComponent(jLabel17)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(303, 303, 303)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(609, Short.MAX_VALUE))
        );

        telaCadastroCliente.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1340));

        JPprincipal.add(telaCadastroCliente, "telaCadastroCliente");

        telaVenda.setBackground(new java.awt.Color(17, 24, 39));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));

        txtValorTotal.setEditable(false);
        jPCadastroVenda.setBackground(new java.awt.Color(17, 24, 39));
        jPCadastroVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbCliente.setToolTipText("");
        jcbCliente.setEnabled(false);
        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });

        cbStatus.setForeground(new java.awt.Color(255, 255, 255));
        cbStatus.setText("Pago");
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        txtClienteNaoRegistrado.setBackground(new java.awt.Color(255, 255, 255));
        txtClienteNaoRegistrado.setForeground(new java.awt.Color(0, 0, 0));
        txtClienteNaoRegistrado.setEnabled(false);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Escreva nome, telefone e endereço");

        cbNao.setForeground(new java.awt.Color(255, 255, 255));
        cbNao.setText("Não");
        cbNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNaoActionPerformed(evt);
            }
        });

        cbSim.setForeground(new java.awt.Color(255, 255, 255));
        cbSim.setText("Sim");
        cbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSimActionPerformed(evt);
            }
        });

        txtDataPagamento.setBackground(new java.awt.Color(255, 255, 255));
        txtDataPagamento.setBorder(null);
        txtDataPagamento.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtDataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtDataVenda.setBackground(new java.awt.Color(255, 255, 255));
        txtDataVenda.setBorder(null);
        txtDataVenda.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jcbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProdutoActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Valor Venda*");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cliente*");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cadastrar Venda");

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Dados da venda para registro");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Data Venda*");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Data Pagamento*");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Status");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Estoque Produtos*");

        btnCadastrarVenda.setBackground(new java.awt.Color(17, 24, 39));
        btnCadastrarVenda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarVenda.setText("Cadastrar");
        btnCadastrarVenda.setActionCommand(" Voltar");
        btnCadastrarVenda.setPreferredSize(new java.awt.Dimension(123, 39));
        btnCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVendaActionPerformed(evt);
            }
        });

        jcbQuantidadeProduto.setEnabled(false);
        jcbQuantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbQuantidadeProdutoActionPerformed(evt);
            }
        });

        Produto p = (Produto) jcbProduto.getSelectedItem();
        if(p != null && jcbQuantidadeProduto.getSelectedItem() != null){
            int quantidade = (int) jcbQuantidadeProduto.getSelectedItem();
            String valorVendaStr = String.valueOf(p.getValorVenda() * quantidade);
            txtValorTotal.setText(valorVendaStr);
        }
        txtValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Produtos Da Venda*");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Quantidade* :");

        javax.swing.GroupLayout jPCadastroVendaLayout = new javax.swing.GroupLayout(jPCadastroVenda);
        jPCadastroVenda.setLayout(jPCadastroVendaLayout);
        jPCadastroVendaLayout.setHorizontalGroup(
            jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                        .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                                    .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(136, 136, 136))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroVendaLayout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroVendaLayout.createSequentialGroup()
                                    .addComponent(cbSim)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbNao)
                                    .addGap(38, 38, 38)))
                            .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)))
                        .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteNaoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatus)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbProdutosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                                .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(jcbQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadastroVendaLayout.setVerticalGroup(
            jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroVendaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(8, 8, 8)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jcbProdutosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cbSim)
                    .addComponent(cbNao)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteNaoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cbStatus))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPRegistroVendas.setBackground(new java.awt.Color(17, 24, 39));
        jPRegistroVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Vendas");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Registro de vendas com todas as informaçoes da venda.");

        jScrollPane3.setBackground(new java.awt.Color(17, 24, 39));

        tabelaVendas.setModel(montarTabela(new Venda()));
        jScrollPane3.setViewportView(tabelaVendas);

        btnDeletarVenda.setBackground(new java.awt.Color(17, 24, 39));
        btnDeletarVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDeletarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btnDeletarVenda.setText("Deletar");
        btnDeletarVenda.setActionCommand(" Voltar");
        btnDeletarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroVendasLayout = new javax.swing.GroupLayout(jPRegistroVendas);
        jPRegistroVendas.setLayout(jPRegistroVendasLayout);
        jPRegistroVendasLayout.setHorizontalGroup(
            jPRegistroVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistroVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPRegistroVendasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPRegistroVendasLayout.setVerticalGroup(
            jPRegistroVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233)
                .addComponent(btnDeletarVenda)
                .addGap(218, 218, 218))
        );

        javax.swing.GroupLayout telaVendaLayout = new javax.swing.GroupLayout(telaVenda);
        telaVenda.setLayout(telaVendaLayout);
        telaVendaLayout.setHorizontalGroup(
            telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVendaLayout.createSequentialGroup()
                .addGroup(telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaVendaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel35)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaVendaLayout.createSequentialGroup()
                        .addContainerGap(629, Short.MAX_VALUE)
                        .addGroup(telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPRegistroVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPCadastroVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 632, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(15, 15, 15))
        );
        telaVendaLayout.setVerticalGroup(
            telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVendaLayout.createSequentialGroup()
                .addGroup(telaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaVendaLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel31))
                    .addGroup(telaVendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPCadastroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPRegistroVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(555, 555, 555))
        );

        JPprincipal.add(telaVenda, "telaVendas");

        telaEstoque.setBackground(new java.awt.Color(17, 24, 39));
        telaEstoque.setForeground(new java.awt.Color(204, 255, 0));
        telaEstoque.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel1.setBackground(new java.awt.Color(17, 24, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValorTotal.setBackground(new java.awt.Color(17, 24, 39));
        btnValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        btnValorTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nota-de-dolar (1).png"))); // NOI18N
        btnValorTotal.setText("ValorTotal");
        btnValorTotal.setActionCommand(" Voltar");
        btnValorTotal.setPreferredSize(new java.awt.Dimension(123, 39));
        btnValorTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValorTotalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValorTotalMouseExited(evt);
            }
        });
        btnValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorTotalActionPerformed(evt);
            }
        });
        jPanel1.add(btnValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1371, 763, 136, -1));

        btnDeletar.setBackground(new java.awt.Color(17, 24, 39));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setActionCommand(" Voltar");
        btnDeletar.setMaximumSize(new java.awt.Dimension(123, 39));
        btnDeletar.setMinimumSize(new java.awt.Dimension(123, 39));
        btnDeletar.setPreferredSize(new java.awt.Dimension(163, 39));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 763, 123, -1));

        btnAtualizar1.setBackground(new java.awt.Color(17, 24, 39));
        btnAtualizar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar1.setText("Atualizar");
        btnAtualizar1.setActionCommand(" Voltar");
        btnAtualizar1.setMaximumSize(new java.awt.Dimension(123, 39));
        btnAtualizar1.setMinimumSize(new java.awt.Dimension(123, 39));
        btnAtualizar1.setPreferredSize(new java.awt.Dimension(123, 39));
        btnAtualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1101, 763, 135, -1));

        jPanel5.setBackground(new java.awt.Color(17, 24, 39));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Estoque");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Pesquisar Produto por ");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Valor:");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        txtValor1.setEnabled(false);
        txtValor1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtValor1CaretUpdate(evt);
            }
        });
        jPanel5.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 70, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("a Valor:");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        txtValor2.setEnabled(false);
        txtValor2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtValor2CaretUpdate(evt);
            }
        });
        jPanel5.add(txtValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 73, -1));

        cbFiltro.setBackground(new java.awt.Color(255, 255, 255));
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clique Aqui", "Nome", "Descricao", "Tamanho", "Quantidade", "Valor", "" }));
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });
        jPanel5.add(cbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        txtPesquisar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesquisarCaretUpdate(evt);
            }
        });
        jPanel5.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 183, -1));

        btnNovoProduto.setBackground(new java.awt.Color(17, 24, 39));
        btnNovoProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNovoProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-produto.png"))); // NOI18N
        btnNovoProduto.setText("Novo Produto");
        btnNovoProduto.setToolTipText("Registrar novo produto a loja");
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNovoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1250, 170));

        jPanel6.setBackground(new java.awt.Color(17, 24, 39));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tabelaProduto.setBackground(new java.awt.Color(17, 24, 39));
        tabelaProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaProduto.setForeground(new java.awt.Color(255, 255, 255));
        tabelaProduto.setModel(montarTabela(new Produto()));
        tabelaProduto.setToolTipText("Lista de Produtos do estoque da loja");
        tabelaProduto.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaProduto.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tabelaProduto.setRowHeight(30);
        jScrollPane1.setViewportView(tabelaProduto);
        tabelaProduto.getAccessibleContext().setAccessibleName("TabelaEstoque");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1250, 360));

        btnValorTotal1.setBackground(new java.awt.Color(17, 24, 39));
        btnValorTotal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnValorTotal1.setForeground(new java.awt.Color(255, 255, 255));
        btnValorTotal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nota-de-dolar (1).png"))); // NOI18N
        btnValorTotal1.setText("ValorTotal");
        btnValorTotal1.setActionCommand(" Voltar");
        btnValorTotal1.setPreferredSize(new java.awt.Dimension(123, 39));
        btnValorTotal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValorTotal1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValorTotal1MouseExited(evt);
            }
        });

        btnDeletarProduto.setBackground(new java.awt.Color(17, 24, 39));
        btnDeletarProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btnDeletarProduto.setText("Deletar");
        btnDeletarProduto.setActionCommand(" Voltar");
        btnDeletarProduto.setMaximumSize(new java.awt.Dimension(123, 39));
        btnDeletarProduto.setMinimumSize(new java.awt.Dimension(123, 39));
        btnDeletarProduto.setPreferredSize(new java.awt.Dimension(163, 39));
        btnDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProdutoActionPerformed(evt);
            }
        });

        btnAtualizarProduto.setBackground(new java.awt.Color(17, 24, 39));
        btnAtualizarProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarProduto.setText("Atualizar");
        btnAtualizarProduto.setActionCommand(" Voltar");
        btnAtualizarProduto.setMaximumSize(new java.awt.Dimension(123, 39));
        btnAtualizarProduto.setMinimumSize(new java.awt.Dimension(123, 39));
        btnAtualizarProduto.setPreferredSize(new java.awt.Dimension(123, 39));
        btnAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaEstoqueLayout = new javax.swing.GroupLayout(telaEstoque);
        telaEstoque.setLayout(telaEstoqueLayout);
        telaEstoqueLayout.setHorizontalGroup(
            telaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaEstoqueLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2082, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377)
                .addComponent(btnValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(825, 825, 825))
        );
        telaEstoqueLayout.setVerticalGroup(
            telaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaEstoqueLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(telaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 774, Short.MAX_VALUE))
        );

        JPprincipal.add(telaEstoque, "tela2");

        getContentPane().add(JPprincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /** Ao clicar no botão de estoque a tela estoque será aberta*/
    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed

        CardLayout cl = (CardLayout) JPprincipal.getLayout();
        cl.show(JPprincipal, "tela2");


    }//GEN-LAST:event_btnEstoqueActionPerformed

    /** Ao clicar no botão de produto+ a tela de cadastro de produto será aberta*/
    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed

        CardLayout cl = (CardLayout) JPprincipal.getLayout();
        cl.show(JPprincipal, "tela1");
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    /**Metodo para cadastrar produto no banco de dados        */
    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed

        String nome = txtNomeProduto.getText();
        String descricao = txtDescricao.getText();
        String tamanho = txtTamanho.getText().toUpperCase();
        String quantidade = txtQuantidade.getText();
        String valorCompra = txtValorCompra.getText();
        String valorVenda = txtValorVenda.getText();

        if (nome.isEmpty() || descricao.isEmpty() || tamanho.isEmpty() || quantidade.isEmpty() || valorCompra.isEmpty() || valorVenda.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos devem ser preenchidos");
        } else {

            try {
                ListaProduto.validarDados(nome, descricao, tamanho, valorCompra, valorVenda, quantidade);
                int qnt = Integer.parseInt(quantidade);
                double vCompra = Double.parseDouble(valorCompra);
                double vVenda = Double.parseDouble(valorVenda);
                Produto p = new Produto();
                p.setNome(nome);
                p.setDescricao(descricao);
                p.setTamanho(tamanho);
                p.setValorCompra(vCompra);
                p.setValorVenda(vVenda);
                p.setQuantidade(qnt);

                new ProdutoDAO().cadastrarProduto(p);

                limparCaixaTextos();

                JOptionPane.showMessageDialog(rootPane,
                        "Produto Cadastrado com Sucesso");

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "A quantidade do produto deve ser um numero inteiro");
            } catch (dadosProdutoException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());

            }
        }


    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    /**
     * Sempre que a tela principal ganhar foco: Os modelos das tabelas serao
     * definidos com os dados do banoc de dados. As caixas serao preenchidas com
     * as informações. O produto mais vendido será mostrado.
     * O cliente que fez mais compras na loja será mostrado. 
     * O lucro mensal será mostrado.
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       
         // Atualiza o modelo das tabelas com os dados do banco de dados
        tabelaProduto.setModel(montarTabela(new Produto()));
        tabelaCliente.setModel(montarTabela(new Cliente()));
        tabelaVendas.setModel(montarTabela(new Venda()));
        
         // Preenche as caixas com informações relevantes
         preencherBox();
         
          // Exibe o produto mais vendido
        produtoMaisVendido();
        
         // Exibe o cliente que fez mais compras
        clienteQueMaisComprou();
        
        // Exibe o valor das vendas no mês atual
        valorVendaMesAtual();
       

 
    }//GEN-LAST:event_formWindowGainedFocus

    /**Ao clicar na casinha , voltará para a tela inicial do sistema */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout c1 = (CardLayout) JPprincipal.getLayout();
        c1.show(JPprincipal, "telaInicial");
    }//GEN-LAST:event_jButton1ActionPerformed

    /** Ao clicar no cliente a tela que contem o registro de todos os clientes cadastros sera aberta*/
    private void btnRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroClientesActionPerformed
        CardLayout c1 = (CardLayout) JPprincipal.getLayout();
        c1.show(JPprincipal, "telaCliente");
    }//GEN-LAST:event_btnRegistroClientesActionPerformed

    /**
     * Ao clicar no botão de atualizar, ao selecionar um cliente, será aberta a
     * tela de atualizar com todos os dados do cliente selecionado para editar.
     */
    private void btnAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar2ActionPerformed
        new TelaAtualizarCliente(this, tabelaCliente.getSelectedRow()).setVisible(true);
    }//GEN-LAST:event_btnAtualizar2ActionPerformed

    /**Ao clicar no botao de deletar se estiver selecionado um cliente
     * o referido cliente sera deletado do banco de dados
     */
    private void btnDeletar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletar1ActionPerformed

        if (tabelaCliente.getSelectedRow() != -1) {
            new ClienteDAO().deletarCliente(getID(tabelaCliente));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente para deletar");
        }

    }//GEN-LAST:event_btnDeletar1ActionPerformed

    /**Tela de cadastro de clientes no banco de dados*/
    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        CardLayout c1 = (CardLayout) JPprincipal.getLayout();
        c1.show(JPprincipal, "telaCadastroCliente");
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    /**
     * Metodo para cadastro de cliente no banco de dados.
     */
    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed

        String[] dados = {txtNomeCliente.getText(), txtCpf.getText(), txtEmail.getText(), txtEndereco.getText(), txtTelefone.getText()};
        if (ListaCliente.validarDados(dados)) {
        try{ 
            Cliente c = new Cliente();
            c.setNome(txtNomeCliente.getText());
            c.setCpf(txtCpf.getText());
            c.setEmail(txtEmail.getText());
            c.setEndereco(txtEndereco.getText());
            c.setTelefone(Integer.parseInt(txtTelefone.getText()));
            new ClienteDAO().cadastrarCliente(c);
            JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado Com Sucesso");
            limparCaixaTextos();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Telefone deve ser um numero valido");
        }
           

        }else{
            JOptionPane.showMessageDialog(rootPane, "Dádos invalidos , verifique e tente novamente");
        }


    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    /**
     * Metodo que recebe um Objeto cliente ocmo parãmetro para verificar se o
     * referido cliente está cadastrado no banco de dados
     *
     * @param c Cliente a ser verificado.
     * @return true se o cliente estiver cadastrado, false caso contrário.
     */
    public boolean clienteRegistrado(Cliente c){
        
        List<Cliente> clientes = new ClienteDAO().listar();
        
          for(Cliente cl : clientes ){
            if(c != null && c.equals(cl)){
                return  true;
            }
           
        }
         return false;
    }
    
    /**
     *Método para cadastrar Venda no banco de dados
     * Ao selecionar um produto da lista de produtos a quantidade aparecerá na caixa de quantidade
     *  Ao selecionar a quantidade, o produto será adicionado ao carrinho e seu devido valor será registrado no valor da venda
     * Se selecionar que é um cliente registrado, terá acesso a caixa de clientes registrados.
     * Se nao selecionar, sera aberta uma caixa de texto para escrever os dados do novo cliente.
     */
    private void btnCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVendaActionPerformed

        Object clienteSelecionado = jcbCliente.getSelectedItem();
        Cliente c = null;
        
        if (clienteSelecionado instanceof Cliente) {

            c = (Cliente) clienteSelecionado;
        }

        String dataVenda = txtDataVenda.getText();
        String dataPagamento = txtDataPagamento.getText();
        boolean status = cbStatus.isSelected();
        String naoCliente = txtClienteNaoRegistrado.getText();
        String valorTotal = txtValorTotal.getText();

        try {

            if (ListaVenda.validarDados(produtosVenda, dataVenda, dataPagamento, jcbQuantidadeProduto, valorTotal, c, naoCliente)) {

                Venda v = new Venda();

                int quantidadeTotal = 0;
                String valorVenda = "";

                for (VendaProduto p : produtosVenda) {

                    int qnt = p.getQuantidade();
                    quantidadeTotal += p.getQuantidade();
                    v.setProdutoVenda(produtosVenda);

                }

                v.setDataVenda(criarData(dataVenda));
                v.setDataPagamento(criarData(dataPagamento));
                v.setProdutoVenda(produtosVenda);

                v.setValorVenda(Double.parseDouble(valorTotal));

                v.setQuantidade(quantidadeTotal);

                v.setStatus(status);
                v.setQuantidade(quantidadeTotal);

                if (clienteRegistrado(c) || !txtClienteNaoRegistrado.getText().isEmpty()) {
                    if (c instanceof Cliente) {
                        v.setCliente(c);
                        v.setNaoCliente(naoCliente);

                        new VendaDAO().cadastrarVenda(v);
                        JOptionPane.showMessageDialog(rootPane, "Venda Realizada Com Sucesso");

                        limparCaixaTextos();
                        jcbProdutosVenda.removeAllItems();
                        produtosVenda.clear();
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Atençao , o cliente deve ser selecionado se ja for cliente ,"
                            + " e se nao for deve regitrar os dados do novo cliente");
                }

            }else{
                JOptionPane.showMessageDialog(rootPane, "Dados invalidos , verifique e tente novamente");
            }

        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao receber as datas. Verifique os formatos das datas.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        } catch(NumberFormatException ex){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, "Erro ao receber o valor total. Verifique o formato do valor.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCadastrarVendaActionPerformed

    /**
     *Metódo que limpa todas as caixas de textos e reseta os itens selecionados nas caixas de seleçao e checkboxes.
     */
    public void limparCaixaTextos() {

        txtNomeProduto.setText("");
        txtDescricao.setText("");
        txtTamanho.setText("");
        txtValorCompra.setText("");
        txtValorVenda.setText("");
        txtQuantidade.setText("");
        txtNomeCliente.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        jcbProduto.setSelectedIndex(-1);
        jcbQuantidadeProduto.setSelectedIndex(-1);
        txtDataVenda.setText("");
        txtDataPagamento.setText("");
        txtClienteNaoRegistrado.setText("");
        txtValorTotal.setText("");
        cbSim.setSelected(false);
        cbNao.setSelected(false);
        cbStatus.setSelected(false);
    }

    /**
     *Metodo que preenche a combobox de quantidade com valores validos de um produto selecionado
     */
    private void jcbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProdutoActionPerformed

        
        try{
          Object produtoSelecionado = jcbProduto.getSelectedItem();
          
         
          
        if (produtoSelecionado instanceof Produto) {
             Produto produto = (Produto) produtoSelecionado;
             
            if (produto != null) {
                DefaultComboBoxModel<Object> comboBoxModelQuantidade = new DefaultComboBoxModel<>();

                // Preenche a combobox com valores de 1 até a quantidade disponível do produto
                for (int qnt = 1; qnt < produto.getQuantidade(); qnt++) {
                    comboBoxModelQuantidade.addElement(qnt);

                }

                jcbQuantidadeProduto.setModel(comboBoxModelQuantidade);
                jcbQuantidadeProduto.setEnabled(true);

            }else{
                JOptionPane.showMessageDialog(rootPane, "Produto não encontrado");
            }
         }
        }catch(Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a quantidade do produto.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jcbProdutoActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    /**
     *Metodó que administra as duas opçoes de clientes na venda
     * Ao selecionar um cliente registrado no sistema , a combobox com a lista de cleintes sera habilitada ,
     * a caixa de escolha de nao cliente e sua caixa de texto sera desativadas.
     * Ao desmarcar a opçao de cliente nao registrado , a caixa de cliente registrado sera desativada.
     */
    private void cbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSimActionPerformed

        if (cbSim.isSelected()) {
            jcbCliente.setEnabled(true);
            cbNao.setSelected(false);
            txtClienteNaoRegistrado.setEnabled(false);
        } else {
            jcbCliente.setEnabled(false);
           
        }


    }//GEN-LAST:event_cbSimActionPerformed

    /**
     *Metodo que administra as duas opçoes de clientes na venda
     * Ao selecionar que o cliente nao esta registrado no sistema, 
     * a combobox de clientes registrados sera desativada e a caixa de texto para os dados do novo cliente será habilitada
     * Ao desmarcar a opção , a caixa de nao cliente e sua ciaxa de texto serão desativadas.
     */
    private void cbNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNaoActionPerformed

        if (cbNao.isSelected()) {

            jcbCliente.setEnabled(false);
            cbSim.setSelected(false);
            txtClienteNaoRegistrado.setEnabled(true);
        } else {
            jcbCliente.setEnabled(false);
            txtClienteNaoRegistrado.setEnabled(false);
        }
    }//GEN-LAST:event_cbNaoActionPerformed

    
   
    private void btnDeletarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarVendaActionPerformed
 
        new VendaDAO().deletar(getID(tabelaVendas));
        
    }//GEN-LAST:event_btnDeletarVendaActionPerformed

    /**Tela de cadastro e historico de vendas*/
    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        CardLayout c1 = (CardLayout) JPprincipal.getLayout();
        c1.show(JPprincipal, "telaVendas");

    }//GEN-LAST:event_btnVendasActionPerformed

    
    /**
     *Método que, ao selecionar a quantidade do produto escolhido,
     * adiciona o produto e sua quantidade ao "carrinho",
     * e atualiza o valor total da venda.
     *
     */
    private void jcbQuantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbQuantidadeProdutoActionPerformed
       //obtem o produto selecionado da combobox produto
        Produto produtoSelecionado = (Produto) jcbProduto.getSelectedItem();

        //verifica se o produto e sua quantidade foi selecionado
        if (produtoSelecionado != null && jcbQuantidadeProduto.getSelectedItem() != null) {

            //Cria um modelo de combo box para atualizar a lista de produtos no "carrinho"
            DefaultComboBoxModel<Object> comboBoxModelProdutoVenda = new DefaultComboBoxModel<>();
            
            //Obtem a quantidade selecionada do produto na combobox quantidade
            int quantidade = (int) jcbQuantidadeProduto.getSelectedItem();

            //verifica se o produto selecionado ja esta no carrinho
            Boolean produtoVendaExiste = false;
            for (VendaProduto p : produtosVenda) {
                if (p.getProduto().getId() == produtoSelecionado.getId()) {
                    produtoVendaExiste = true;
                    break;
                }
            }

            //verifica se o produto nao esta no carrinho , adiciona um novo produto a venda
            if (!produtoVendaExiste) {
                VendaProduto produtoVenda = new VendaProduto();
                produtoVenda.setProduto(produtoSelecionado);
                produtoVenda.setQuantidade(quantidade);
                produtosVenda.add(produtoVenda);

            }

            //atualiza o modelo da combobox com os produtos do carrinho
            for (VendaProduto p : produtosVenda) {
                comboBoxModelProdutoVenda.addElement(p);
            }

            //combobox do carrinho recebe a lista de produtos selecionados
            jcbProdutosVenda.setModel(comboBoxModelProdutoVenda);
            
            //atualiza o valor total da venda de acordo com o valor e quantidade de todos os produtos do "carrinho"
            atualizarValorTotal();
        }


    }//GEN-LAST:event_jcbQuantidadeProdutoActionPerformed

    //Metodo que recebe o valor de todos os itens do carrinho e suas quantidades, e soma seu valor total
    public void atualizarValorTotal() {
        double valorTotal = 0;
        for (VendaProduto p : produtosVenda) {
            //multiplica o valor do produto pela quantidade do produto no carrinho
            valorTotal += p.getProduto().getValorVenda() * p.getQuantidade();
        }
        txtValorTotal.setText(String.valueOf("%.2f"+valorTotal)); //Formata o valor total com duas casas decimais
    }

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbClienteActionPerformed

    /**Metodo inicia a tela para cadastro de cliente*/
    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        CardLayout cl = (CardLayout) JPprincipal.getLayout();
        cl.show(JPprincipal, "telaCadastroCliente");

    }//GEN-LAST:event_btnNovoClienteActionPerformed

    
    /**
     * Método para pesquisa de um cliente no banco de dados Recebe como
     * parãmetro o tipo de filtro pela combobox (nome,telefone,email,endereço)
     * Recebe como parametro a caixa de texto para pesquisar o cliente no banco
     * de dados
     */
    private void txtPesquisaClienteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisaClienteCaretUpdate

        try {

            //Realiza a pesquisa no banco de daods
            List<Cliente> listaCliente = new ClienteDAO().pesquisarCliente(cbFiltroCliente.getSelectedItem().toString(), txtPesquisaCliente.getText());

            //Verifica se a lista é nula ou vazia
            if (listaCliente == null) {
                System.out.println("Erro a receber lista cliente");
            }

            // Atualiza a tabela com os resultados da pesquisa
            atualizarTabela(listaCliente,tabelaCliente);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao pesquisar cliente" + e.getMessage());

        }

    }//GEN-LAST:event_txtPesquisaClienteCaretUpdate

    /**
     * Mètodo que atualiza a tabela com os dados de uma lista de elementos
     * genericos
     *
     * @param <T> O tipo de elementos na lista.
     * @param lista A lista de elementos que será usada para atualizar a tabela.
     * @param tabela A tabela que será atualizada com os dados da lista.
     *
     * O método começa verificando o tipo do primeiro elemento da lista.
     * Dependendo do tipo do elemento, ele adiciona as linhas correspondentes á
     * tabela com base nos valores do atributo do elemento. Utiliza os métodos
     * getters e setters para obter os valores do atributo e adicionar eses
     * valores as linhas da tabela.
     */
    public <T> void atualizarTabela(List<T> lista, JTable tabela) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0); // Limpa a tabela antes de adicionar novos dados

        // Verifica se a lista não está vazia
        if (lista.isEmpty()) {
            return;
        }

        // Obtém o tipo do primeiro elemento da lista
        T primeiroElemento = lista.get(0);

        if (primeiroElemento instanceof Cliente) {
            // Se o elemento for do tipo Cliente, preenche a tabela com dados de Cliente
            for (T obj : lista) {
                Cliente c = (Cliente) obj;
                Object[] linha = {
                    c.getId(),
                    c.getNome(),
                    c.getCpf(),
                    c.getEmail(),
                    c.getEndereco(),
                    c.getTelefone()
                };

                modelo.addRow(linha);
            }
        } else if (primeiroElemento instanceof Produto) {
            for (T obj : lista) {
                // Se o elemento for do tipo Produto, preenche a tabela com dados de Produto
                Produto p = (Produto) obj;
                Object[] linha = {
                    p.getId(),
                    p.getNome(),
                    p.getDescricao(),
                    p.getTamanho(),
                    p.getValorCompra(),
                    p.getValorVenda(),
                    p.getQuantidade()
                };

                modelo.addRow(linha);
            }

        }
        // Define o modelo atualizado na tabela
        tabela.setModel(modelo);
    }
    
    
    /**Metodo para abrir tela de cadastro de produto*/
    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        CardLayout cl = (CardLayout) JPprincipal.getLayout();

        cl.show(JPprincipal, "tela1");
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    
    /**
     *Metódo para pesquisar os produtos cadastrados
     * Este método é acionado sempre que o texto na caixa de pesquisa é atualizado
     * Ele pesquisa no banco de dados de acordo com o tipo escolihdo de uma combo box e o texto digitado pelo usuario,
     * e atualiza a tabela de produtos com o resultado da pesquisa.
     */
    private void txtPesquisarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisarCaretUpdate

        String tipo = cbFiltro.getSelectedItem().toString();

        List<Produto> listaProduto = new ProdutoDAO().pesquisar(tipo, txtPesquisar.getText());

        if (listaProduto == null) {
            System.out.println("Erro ao obter lista de Produto");
            return;
        }
       
        atualizarTabela(listaProduto, tabelaProduto);
    }//GEN-LAST:event_txtPesquisarCaretUpdate

    /**
     *Metodo que ativa as caixas de texto dos valores , caso o tipo escolhido no filtro seja "valor".
     * Quando o tipo "Valor" é selecionado no filtro, as caixas de texto "txtValor1" e "txtValor2" serão habilitadas.
     *  Ao selecionar qualquer outro tipo, essas caixas de texto serão desativadas.
     * 
     * @param evt O evento de ação gerado pela seleção na combo box "cbFiltro".
     */
    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
       
        if (cbFiltro.getSelectedItem().equals("Valor")) {
            txtValor1.setEnabled(true);
            txtValor2.setEnabled(true);
        } else {
            txtValor1.setEnabled(false);
            txtValor2.setEnabled(false);
        }
    }//GEN-LAST:event_cbFiltroActionPerformed

    
    
    /**
     *Pesquisa produtos no banco de dados pelo valor entre os valores fornecidos nas caixas de texto txtValor1 e txtValor2.
     * E atualiza a tabelaProduto com eses produtos
     */
    private void txtValor2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtValor2CaretUpdate
        List<Produto> lista = new ProdutoDAO().pesquisarPorValor(Double.parseDouble(txtValor1.getText()), Double.parseDouble(txtValor2.getText()));

        atualizarTabela(lista, tabelaProduto);
    }//GEN-LAST:event_txtValor2CaretUpdate

     /**
     *Pesquisa produtos no banco de dados acima do valor especificado em txtValor1 
     * e atualiza a tabelaProduto com eses produtos.
     */
    private void txtValor1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtValor1CaretUpdate
        List<Produto> lista = new ProdutoDAO().pesquisarPorValor(Double.parseDouble(txtValor1.getText()), 1000000.00);

        DefaultTableModel tabelaFiltrada = (DefaultTableModel) tabelaProduto.getModel();

        tabelaFiltrada.setNumRows(0);
        for (Produto p : lista) {

            Object[] obj = {
                p.getId(),
                p.getNome(),
                p.getDescricao(),
                p.getTamanho(),
                p.getValorCompra(),
                p.getValorVenda(),
                p.getQuantidade()
            };

            tabelaFiltrada.addRow(obj);
        }

        tabelaProduto.setModel(tabelaFiltrada);
    }//GEN-LAST:event_txtValor1CaretUpdate

    
    /**
     *Abre a tela de atualizaçao com os dados do produto selecinoado na tabela ,ao clicar no botão atualizar
     *Exibe uma mensagem de erro se nenhun produto foi selecionado na tabela.
     * 
     *@param evt O evento de ação gerado pelo clique no botão "Atualizar".
     */
    private void btnAtualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar1ActionPerformed
        if (tabelaProduto.getSelectedRow() != -1) {
            new TelaAtualizarProdutoo(this, tabelaProduto.getSelectedRow()).setVisible(true);/*Instancia da tela de atualizar que recebe a tela principal e
            um metodo para obter a linha da tabela que precisa como parametro um id e uma variavel table*/
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para atualizar");
        }

        
    }//GEN-LAST:event_btnAtualizar1ActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
      
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorTotalActionPerformed
     
    }//GEN-LAST:event_btnValorTotalActionPerformed

    private void btnValorTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorTotalMouseExited
     
    }//GEN-LAST:event_btnValorTotalMouseExited

    private void btnValorTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorTotalMouseEntered

       
    }//GEN-LAST:event_btnValorTotalMouseEntered

    /**
     *Atualiza o texto do botao 'btnValorTotal1' para mostrar o valor total dos produtos em estoque
     */
    private void btnValorTotal1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorTotal1MouseEntered
        btnValorTotal1.setText(String.valueOf(calcularValorTotal()));
    }//GEN-LAST:event_btnValorTotal1MouseEntered

     /**
     *Restaura o texto do botao 'btnValorTotal1' para "Valor Total" ao retirar
     */
    private void btnValorTotal1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorTotal1MouseExited
          btnValorTotal1.setText("Valor Total");
    }//GEN-LAST:event_btnValorTotal1MouseExited

    /**
     *Metodo para deletar um produto do estoque
     */
    private void btnDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProdutoActionPerformed
        deletar(getID(tabelaProduto));
    }//GEN-LAST:event_btnDeletarProdutoActionPerformed

      /**
     *Abre a tela de atualizaçao com os dados do produto selecinoado na tabela ,ao clicar no botão atualizar
     *Exibe uma mensagem de erro se nenhun produto foi selecionado na tabela.
     * 
     *@param evt O evento de ação gerado pelo clique no botão "Atualizar".
     */
    private void btnAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProdutoActionPerformed
         if (tabelaProduto.getSelectedRow() != -1) {
            new TelaAtualizarProdutoo(this, tabelaProduto.getSelectedRow()).setVisible(true);/*Instancia da tela de atualizar que recebe a tela principal e
            um metodo para obter a linha da tabela que precisa como parametro um id e uma variavel table*/
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para atualizar");
        }
    }//GEN-LAST:event_btnAtualizarProdutoActionPerformed

    /**
     *Sair do sistema ao clicar no botao de sair
     */
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanhoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
    
    /**
     * Atualiza a tabela correspondente com base no tipo de objeto passado como
     * parâmetro. Se o objeto for um Produto, atualiza a tabelaProduto com os
     * produtos do banco de dados. Se o objeto for um Cliente, atualiza a
     * tabelaCliente com os clientes do banco de dados. Se o objeto for uma
     * Venda, atualiza a tabelaVendas com as vendas do banco de dados.
     *
     * @param o Objeto cujo tipo determina qual tabela sera atualizada
     * @return o modelo da tabela atualizado com os dados do banco de dados
     */
    private DefaultTableModel montarTabela(Object o) {

        DefaultTableModel modeloTabela = null;

        if (o instanceof Produto) {
            // Configuração das colunas da tabela de produtos
            String[] colunas = {"Id", "Nome", "Descrição", "Tamanho", "ValorCompra", "ValorVenda", "Quantidade"};

            modeloTabela = new DefaultTableModel(colunas, 0);

            // Obtém a lista de produtos do banco de dados
            ArrayList<Produto> listaProduto = (ArrayList<Produto>) new ProdutoDAO().listar();

            // Preenche o modelo da tabela com os dados dos produtos
            for (int i = 0; i < listaProduto.size(); i++) {
                Produto p = listaProduto.get(i);
                String[] linha = {String.valueOf(p.getId()), p.getNome(), p.getDescricao(),
                    p.getTamanho(), String.valueOf(p.getValorCompra()),
                    String.valueOf(p.getValorVenda()), String.valueOf(p.getQuantidade())};
                modeloTabela.addRow(linha);
            }

            // Define o modelo atualizado na tabelaProduto
            tabelaProduto.setModel(modeloTabela);

        } else if (o instanceof Cliente) {

            // Configuração das colunas da tabela de clientes
            String[] colunas = {"Id", "Nome", "Cpf", "Email", "Endereço", "Telefone"};

            modeloTabela = new DefaultTableModel(colunas, 0);

            // Obtém a lista de clientes do banco de dados
            ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) new ClienteDAO().listar();
            for (int i = 0; i < listaCliente.size(); i++) {
                Cliente c = listaCliente.get(i);
                String[] linha = {String.valueOf(c.getId()), c.getNome(), c.getCpf(), c.getEmail(), c.getEndereco(), String.valueOf(c.getTelefone())
                };
                modeloTabela.addRow(linha);
            }
            // Define o modelo atualizado na tabelaCliente
            tabelaCliente.setModel(modeloTabela);

        } else if (o instanceof Venda) {

            // Configuração das coluna da tabela de vendas
            String[] colunas = {"Id", "QuantidadeTotal", "Produtos", "ValorVenda", "dataVenda", "dataPagamento", "Cliente", "NãoCliente", "Status"};

            modeloTabela = new DefaultTableModel(colunas, 0);
            ArrayList<Venda> listaVenda = (ArrayList<Venda>) new VendaDAO().listar();

            // Preenche o modelo da tabela com os dados das vendas
            for (Venda v : listaVenda) {

                String validarCliente = (v.getCliente() != null) ? v.getCliente().toString() : "";
                String validarDataPagamento = (v.getDataPagamento() != null) ? v.dataPagamento().toString() : "";
                String validarDataVenda = (v.getDataVenda() != null) ? v.dataVenda() : "";

                String pago = (v.isStatus()) ? "Pago" : "Em aberto";

                StringBuilder produtoStr = new StringBuilder();
                for (VendaProduto p : v.getProdutoVenda()) {
                    produtoStr.append(p.getProduto().getNome()).append(",");
                }

                String[] linhas = {
                    Integer.toString(v.getId()),
                    String.valueOf(v.getQuantidade()),
                    produtoStr.toString(),
                    Double.toString(v.getValorVenda()),
                    validarDataVenda,
                    validarDataPagamento,
                    validarCliente,
                    v.getNaoCliente(),
                    pago
                };

                modeloTabela.addRow(linhas);

            }

            // Define o modelo atualizado na tabelaVendas
            tabelaVendas.setModel(modeloTabela);
        }

        return modeloTabela;

    }

    
    /**
     * Obtém o ID da linha selecionada em uma tabela. 
     * 
     * Esté metodo recebe um parametro Jtable e retorna o valor da coluna id.
     * Se nenhuma linha estiver selecionada retorna -1
     * 
     * @param tabela a tabela da qual o id sera obtido.
     * @return o id da linha selecionada convertida para int, ou -1 se nenhuma linha estiver selecionada
     */
    protected int getID(JTable tabela) {
        int linha = tabela.getSelectedRow();

        if (linha != -1) {

            int id = Integer.parseInt(tabela.getValueAt(linha, 0).toString());
            return id;
        }

        return -1;
    }

    /**
     * Deleta um produto do estoque.
     * 
     * Este metodo recebe o ID da linha selecionada como parãmetro,exibe uma
     * confirmação de exclusão para o usuario e,se confirmado,deleta o produto
     * correspondente no estoque.
     * 
     * @param posicao O ID da linha selecionada na tabela.
     *                 Deve ser um valor inteiro maior ou igual a zero.
     * 
     * O método apresenta uma caixa de diálogo ao usuario perguntando se ele tem
     * certeza que deseja excluir o produto. Se é usuario confirmar , o produto é deletado.Se usuario cancelar,
     * a seleçao na tabela é limpa.
     */
    public void deletar(int posicao) {

        if (posicao >= 0) {

            String[] options = {"Sim", "Não"};

            int deletar = JOptionPane.showOptionDialog(rootPane,
                    "Tem certeza que deseja excluir?",
                    "Exclusão de Produto",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (deletar == 0) {

                new ProdutoDAO().deletarProduto(posicao);

            } else {
                tabelaProduto.clearSelection();
            }
        }

    }

    /**
     *Calcula valor total dos produto no estoque.
     * 
     *  Este método percorre a lista de produtos obtida do banco de dados e calcula
     *  o valor total do estoque,multiplicando o valor de venda do produto pela quantidade de cada produto
     * 
     * @return o valor total do estoque como valor de ponto flutuante(double).
     */
    public double calcularValorTotal() {
        double total = 0;
        for (Produto p : new ProdutoDAO().listar()) {
            total += p.getValorVenda() * p.getQuantidade();

        }
        return total;
    }

    
    /**
     * Preenche todas as combobox do sistema com dados do banco de dados.
     *
     *
     * Este método obtém listas de produtos e clientes do banco de dados e
     * preenche as combobox correspondentes. Se a lista de produtos estiver
     * vazia, uma mensagem "Estoque vazio" sera exibida na combobox de produtos.
     * se a lista de clientes esta vazia, a combobox de clientes nao sera
     * alterada.
     *
     * A combobox de produtos (jcbProduto) é preenchida com a lista de produtos
     * do banco de dados. A combobox de clientes (jcbCliente) é preenchida com a
     * lista de clientes do banco de dados.
     */
    public void preencherBox() {

        List<Produto> listaProduto = new ProdutoDAO().listar();
        DefaultComboBoxModel<Object> comboBoxModel = new DefaultComboBoxModel<>();
        if (!listaProduto.isEmpty()) {

            comboBoxModel.addElement("Selecione um produto");

            for (Object produto : listaProduto) {
                comboBoxModel.addElement((Produto) produto);

            }

            jcbProduto.setModel(comboBoxModel);

        } else {
            DefaultComboBoxModel<Object> comboBoxVazio = new DefaultComboBoxModel<>();
            comboBoxVazio.addElement("Estoque Vazio");
            jcbProduto.setModel(comboBoxVazio);
            DefaultComboBoxModel<Object> cbVazio = new DefaultComboBoxModel<>();
            cbVazio.addElement("Selecione um Produto");
            jcbQuantidadeProduto.setModel(cbVazio);
        }

        List<Cliente> listaCliente = new ClienteDAO().listar();
        DefaultComboBoxModel<Object> comboBoxCliente = new DefaultComboBoxModel<>();
        if (!listaCliente.isEmpty()) {

            comboBoxCliente.addElement("Selecione um cliente");
            for (Object cliente : listaCliente) {
                comboBoxCliente.addElement((Cliente) cliente);
            }

            Object clienteSelecionado = jcbCliente.getSelectedItem();

            jcbCliente.setModel(comboBoxCliente);

            if (clienteSelecionado instanceof Cliente) {
                jcbCliente.setSelectedItem(clienteSelecionado);
            }
        }

    }

    
    /**
     * Converte uma data no formato de String para um tipo Calendar.
     * 
     * Esté metodo recebe uma string representando uma data no formato "dd/MM/yyyy",
     * utiliza um simpleDateFormat para fazer o parsing  da string  e converte essa data 
     * em um objeto Calendar.
     * 
     * @param data uma string representando a data no formato "dd/MM/yyyy".
     * @return um objeto Calendar correspondente á data fornecida.
     * @throws ParseException se a string de data não puder ser analisada.
     */
    public static Calendar criarData(String data) throws ParseException {
        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        date = sdf.parse(data);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c;

    }

    
    /**
     * Aplica efeito visuais de entrada  e saida do mouse em um array de botões;.
     * 
     * Este método recebe um array de botões  e define efeitos de mudança de cor
     * quando o mouse entra e sai de cada botão. A cor de fundo dos botões  muda
     * para um tom específico quando o mouse passa sobre eles e retorna á cor
     * original quando o mouse sai
     * 
     * Os botões tambem sao estilizados usando 'BasicButtonUi' para uma aparencia 
     * personalizada.
     */
    public void btnEfeito() {
        JButton[] buttons = {jButton1, btnEstoque, btnAdicionarProduto, btnRegistroClientes, btnRegistrarCliente, btnAtualizarProduto, btnAtualizar2, btnCadastrar1, btnCadastrarCliente,
            btnCadastrarVenda, btnDeletarProduto, btnDeletar1, btnDeletarVenda, btnNovoCliente, btnNovoProduto, btnValorTotal1, btnVendas,btnSair,btnSistema};
        for (JButton btn : buttons) {
            btn.setBackground(new Color(17, 24, 39));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(79, 79, 207));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(17, 24, 39));

                }
            });
        }
    }

    /**
     * Calcula e exibe o valor total  das vendas realizadas no mês atual.
     * 
     * Este método  obtém a lista de todas vendas do banco de dados.
     * Em seguida percorre a lista de vendas e soma o valor das vendas que
     * ocorrem no mês e ano atual. O valor atual  é exibido  em um JLabel (`lucroLbl`) 
     * e também impresso no console.
     * 
     * Se nao hover vendas registradas ,o metodo exibe  uma mensagem no console 
     * indicando isso e encerra a execução.
     */
    public void valorVendaMesAtual(){
      
        // Obtém a lista de vendas do banco de dados
        List<Venda> vendas = new VendaDAO().listar();
        
        // Verifica se a lista de vendas está vazia
        if (vendas.isEmpty()) {
            System.out.println("Não há vendas registradas.");
            return;
        }
        
 
        //Obtem o mes atual
        Calendar mesAtual = Calendar.getInstance();
        
        //Variavel para armazenar o valor das vendas
        double lucroMensal = 0;
        
        
        //Percorre todas as vendas da lista 
        for(Venda v: vendas){
     
       
            //Verifica se ocorreu no mes e ano atual.
            if(v.getDataVenda().get(Calendar.MONTH) == mesAtual.get(Calendar.MONTH) &&
                    v.getDataVenda().get(Calendar.YEAR) == mesAtual.get(Calendar.YEAR)){
                
                // Soma o valor da venda ao lucro mensal
                lucroMensal += v.getValorVenda();
               
            }
            
             //  Atualiza o jLabel com o valor total das vendas do mes atual
           //  lucroLbl.setText("R$ " + lucroMensal);
          
            
        }
        
        
    }
    
    
    /**
     * Exibe o cliente que mais comprou
     * 
     * Este método obtém a lista de vendas cadastradas a partir do 'VendaDao'. Em seguida
     * percorre a lista de vendas para identificar qual cliente fez mais compras na loja.
     * O método mantem uma lista de clientes e uma lista correspondente de contagens de compra.
     * Ao final, o metodo atualiza o labels 'nomeClienteMaisCompralbl' e 'telefoneClienteMaisCompralbl'
     * Com as informações do cliente que realizou o maior numero compras;
     */
    public void clienteQueMaisComprou(){
        
        //Recebe a lista de vendas cadastrada
        List<Venda> vendas = new VendaDAO().listar();
        
        //Verifica se a lista de venda esta vazia;
        if (vendas.isEmpty()) {
        System.out.println("Não há vendas registradas.");
        return;
    }
        
         //Cria uma lista de clientes e uma lista para a quantidade de vezes que cada cliente comprou na loja
         List<Cliente> clientes = new ArrayList<>();
         List<Integer> numeroCompra = new ArrayList();
        
         //Variavel para armazenar o cliente com mais compras na loja
        int clienteMaisCompras = 0;
      
        //Percorre a lista de vendas 
        for(Venda v : vendas){
            
           //Obtem o cliente da venda
           Cliente clienteVenda = v.getCliente();    
           int idCliente = v.getCliente().getId();
            
           //Verifica se o cliente ja esta na lista de clientes 
           int index = clientes.indexOf(clienteVenda);
           
           //Se o cliente ja esta na lista , incrementa sua quantidade de compras
           if(index != -1){
               
               numeroCompra.set(index,numeroCompra.get(index)+1);
               
           }else{
               //Se o cliente nao esta na lista , adiciona-o a lista de clientes e define a quantidade de compras como 1 
               clientes.add(clienteVenda);
               numeroCompra.add(1);
           }
           
           // Variavel para armazernar o cliente com mais compras 
           Cliente clienteMaisComprou = null;
           
           //Variavel para armarzenar o maior numero de ocmpras 
           int maiorNumeroCompra = 0;
           
           //Pecorre aa lista  de quantidades de compras 
           for(int i=0; i<numeroCompra.size();i++){
               
               //Verifica se a quantidade do cliente atual é a maior que a maior quantidade registrada
               if(numeroCompra.get(i) > maiorNumeroCompra){
                   
                   //Atualiza a maior quantidade e define o cliente atual como o cliente que mais comprou
                     maiorNumeroCompra = numeroCompra.get(i);
                     clienteMaisComprou = clientes.get(i);
                     
                      
                   // Atualiza os labels com o nome e telefone do cliente que mais comprou
                   // nomeClienteMaisCompraLbl.setText(clienteMaisComprou.getNome());
                   // telefoneClienteMaisCompraLbl.setText("(31)9"+String.valueOf(clienteMaisComprou.getTelefone()));
               }
             
               
               
           }
           
           
        }
        
      
        
    }
    
    
    /**
     * Verifica as vendas em aberto  que estao vencidas  ou vencem hoje  e exibe uma mensagem de alerta;
     * 
     * Este método obtem a lista  de vendas do banco de dados e percorre cada venda para verificar se
     * esta vencida  ou vence  no dia atual. Se a venda estiver vencida ou vencendo , exibe um alerta
     * com as informações do produto ,data de venda , data de pagamento e informaçoes do cliente.
     * 
     */
    public void alertaDataVenda() {

        //Obtem a data atual
        Calendar dataAtual = Calendar.getInstance(TimeZone.getDefault());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        //Obtem a lista de todas as vendas do banco de dados
        List<Venda> listaVenda = new VendaDAO().listar();
        
        //Percore todas as vendas da lista de venda
        for (Venda v : listaVenda) {
            
            //Obtem a data de pagamento e ajusta para o fuso horário padrão.
            Calendar dataPagamento = v.getDataPagamento();
            dataPagamento.setTimeZone(TimeZone.getDefault());

            // Monta as informações do produto ,data venda, data pagamento e informações do cliente.
            String produtoInfo = "Produto Venda: " + v.getProdutoVenda() + "\nData Venda: " + sdf.format(v.getDataVenda().getTime());
            String dataPagamentoInfo = "Data Pagamento: " + sdf.format(dataPagamento.getTime());
            String clienteInfo = (v.getCliente() != null) ? "Cliente: " + v.getCliente().getNome() + "\nTelefone: " + v.getCliente().getTelefone()
                    : "Cliente Dados: " + v.getNaoCliente();

            // Verifica se a venda nao esta paga
            if (!v.isStatus()) {
                
                // Verifica se a data de pagamento ja passou do dia atual
                if (v.getDataPagamento().getTimeInMillis() < dataAtual.getTimeInMillis()) {
                    JOptionPane.showMessageDialog(rootPane, produtoInfo + "\n" + dataPagamentoInfo + "(Vencida)" + "\n" + clienteInfo,
                             "Essa Venda Passou do dia do pagamento", JOptionPane.INFORMATION_MESSAGE);
                } else if (v.getDataPagamento().getTimeInMillis() == dataAtual.getTimeInMillis()) {
                    // Verifica se a data do pagamento é hoje
                    JOptionPane.showMessageDialog(rootPane, produtoInfo + "\n" + dataPagamentoInfo + "\n" + clienteInfo,
                            "Essa Venda vence hoje, ligue para o cliente", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            
        }

    }
    
    
    
    /**
     *Verifica qual o produto mais vendido
     * 
     * Este método obtém a lista de produtos vendidos, calcula a quantidade total vendida
     * de cada produto, e determina qual produto teve a maior quantidade vendida. As informações 
     * do produto mais vendido são entao exibidas.
     */
    public void produtoMaisVendido(){
        
        //Obtem a lista de todos os produtos vendidos
        List<VendaProduto> produtosVendidos = new ProdutoDAO().produtosVendidos();
        
        //Cria uma lista de produtos e uma lista de quantidades do produto vendido
        List<Produto> produtos = new ArrayList();
        List<Integer> qnt = new ArrayList();
        
        
        //Percorre toda a lista de produtos vendidos
         for(VendaProduto vp: produtosVendidos){
             
             //Obtem e a quantidade vendida
             Produto p  = vp.getProduto();
             int quantidade = vp.getQuantidade();
         
             //Verifica se o produto ja esta na lista de produtos
             int index = produtos.indexOf(p);
             
             
             //Se o produto ja esta na lista  , Atualiza  a quantidade atual do produto pela quantidade anterior mais a nova quantidade 
             if(index != -1){
                 
                  int quantidadeAtual = qnt.get(index);
                  qnt.set(index,quantidadeAtual+ quantidade);
             }else{
                 //Se o produto nao esta na lista , adiciona o produto e sua quantidade na lista
                  produtos.add(p);
                  qnt.add(quantidade);
             }
             
             //Variaveis para armazenar o produto mais vendido e a maior quantidade vendida
             Produto produtoMaisVendido = null;
            
             int maiorQuantidade = -1;
             
             //Percorre toda lista de produtos vendidos
             for(int i=0; i<produtos.size(); i++){
                 
                 //Verifica se a quantidade do produto atual é maior que o produto com maior quantidade
                 if(qnt.get(i) > maiorQuantidade){
                     
                     //Atualiza a maior quantidade
                     maiorQuantidade = qnt.get(i);
               
                     //Atualiza o produto mais vendido
                     produtoMaisVendido = produtos.get(i);
                     
                 }
                 
             }
             
             //Se o produto mais vendido for diferente de null 
             if(produtoMaisVendido != null){
       
               // produtoMVLbl.setText(produtoMaisVendido.getNome());
                //valorProdutoMaisVendidoLbl.setText("R$ " + String.valueOf(produtoMaisVendido.getValorVenda()));
                //qntProdutoVendidoLbl.setText(String.valueOf(maiorQuantidade));
                 
             }
            
             
             
           
         }
    }
    
  
          
          
          
      
       
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPprincipal;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAtualizar1;
    private javax.swing.JButton btnAtualizar2;
    private javax.swing.JButton btnAtualizarProduto;
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarVenda;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletar1;
    private javax.swing.JButton btnDeletarProduto;
    private javax.swing.JButton btnDeletarVenda;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistroClientes;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSistema;
    protected javax.swing.JButton btnValorTotal;
    protected javax.swing.JButton btnValorTotal1;
    private javax.swing.JButton btnVendas;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbFiltroCliente;
    private javax.swing.JCheckBox cbNao;
    private javax.swing.JCheckBox cbSim;
    private javax.swing.JCheckBox cbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPCadastroVenda;
    private javax.swing.JPanel jPRegistroVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    protected javax.swing.JComboBox<Object> jcbCliente;
    private javax.swing.JComboBox<Object> jcbProduto;
    private javax.swing.JComboBox<Object> jcbProdutosVenda;
    protected javax.swing.JComboBox<Object> jcbQuantidadeProduto;
    private javax.swing.JPanel pnlSide;
    protected javax.swing.JTable tabelaCliente;
    public javax.swing.JTable tabelaProduto;
    public javax.swing.JTable tabelaVendas;
    private javax.swing.JPanel telaCadastroCliente;
    private javax.swing.JPanel telaCadastroProduto;
    private javax.swing.JPanel telaCliente;
    private javax.swing.JPanel telaEstoque;
    private javax.swing.JPanel telaInicial;
    private javax.swing.JPanel telaVenda;
    private javax.swing.JTextField txtClienteNaoRegistrado;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataPagamento;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisaCliente;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTamanho;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    private javax.swing.JTextField txtValorCompra;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
