import java.awt.Color;
import javax.swing.*;

public class AppSigCad extends JFrame {

    public AppSigCad() {
        super();
        setTitle("Sistema de Gerenciamento de clientes, produtos e fornecedores");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        JTabbedPane tbPanel = new JTabbedPane();
        tbPanel.setSize(545, 350);
        tbPanel.setLocation(20, 10);
        add(tbPanel);

        // Painéis das abas
        JPanel pnlCliente = new JPanel(null);
        JPanel pnlProduto = new JPanel(null);
        JPanel pnlFornecedor = new JPanel(null);

        tbPanel.addTab("Cliente", pnlCliente);
        tbPanel.addTab("Produto", pnlProduto);
        tbPanel.addTab("Fornecedor", pnlFornecedor);

        // -------------------- CLIENTE ---------------------
        JPanel pnlCadCli = new JPanel(null);
        pnlCadCli.setBounds(10, 150, 500, 110); // POSIÇÃO MAIS EMBAIXO
        pnlCadCli.setBorder(BorderFactory.createTitledBorder("Dados do Cliente"));

        JLabel lblCodigoCli = new JLabel("Matrícula:");
        lblCodigoCli.setBounds(10, 25, 70, 20);
        pnlCadCli.add(lblCodigoCli);

        JTextField jtfCodigoCli = new JTextField();
        jtfCodigoCli.setBounds(80, 25, 60, 25);
        pnlCadCli.add(jtfCodigoCli);

        JLabel lblNomeCli = new JLabel("Nome:");
        lblNomeCli.setBounds(160, 25, 50, 20);
        pnlCadCli.add(lblNomeCli);

        JTextField jtfNomeCli = new JTextField();
        jtfNomeCli.setBounds(210, 25, 250, 25);
        pnlCadCli.add(jtfNomeCli);

        JLabel lblFoneCli = new JLabel("Telefone:");
        lblFoneCli.setBounds(10, 65, 70, 20);
        pnlCadCli.add(lblFoneCli);

        JTextField jtfFoneCli = new JTextField();
        jtfFoneCli.setBounds(80, 65, 100, 25);
        pnlCadCli.add(jtfFoneCli);

        JLabel lblEmailCli = new JLabel("Email:");
        lblEmailCli.setBounds(200, 65, 50, 20);
        pnlCadCli.add(lblEmailCli);

        JTextField jtfEmailCli = new JTextField();
        jtfEmailCli.setBounds(250, 65, 210, 25);
        pnlCadCli.add(jtfEmailCli);

        pnlCliente.add(pnlCadCli);

        // -------------------- PRODUTO ---------------------
// -------------------- PRODUTO ---------------------
JPanel pnlCadProd = new JPanel(null);
pnlCadProd.setBounds(10, 150, 500, 180); // Altura ajustada pra caber tudo
pnlCadProd.setBorder(BorderFactory.createTitledBorder("Dados do Produto"));

JLabel lblCodigoProd = new JLabel("Código:");
lblCodigoProd.setBounds(10, 25, 70, 20);
pnlCadProd.add(lblCodigoProd);

JTextField jtfCodigoProd = new JTextField();
jtfCodigoProd.setBounds(80, 25, 60, 25);
pnlCadProd.add(jtfCodigoProd);

JLabel lblNomeProd = new JLabel("Nome:");
lblNomeProd.setBounds(160, 25, 50, 20);
pnlCadProd.add(lblNomeProd);

JTextField jtfNomeProd = new JTextField();
jtfNomeProd.setBounds(210, 25, 250, 25);
pnlCadProd.add(jtfNomeProd);

JLabel lblPreco = new JLabel("Preço:");
lblPreco.setBounds(10, 65, 70, 20);
pnlCadProd.add(lblPreco);

JTextField jtfPreco = new JTextField();
jtfPreco.setBounds(80, 65, 100, 25);
pnlCadProd.add(jtfPreco);

JLabel lblEstoque = new JLabel("Estoque:");
lblEstoque.setBounds(200, 65, 70, 20);
pnlCadProd.add(lblEstoque);

JTextField jtfEstoque = new JTextField();
jtfEstoque.setBounds(270, 65, 190, 25);
pnlCadProd.add(jtfEstoque);

// Painel da descrição com borda (cointernezinho)
JPanel pnlDesc = new JPanel(null);
pnlDesc.setBounds(10, 105, 480, 50); // Altura padrão
pnlDesc.setBorder(BorderFactory.createTitledBorder("Descrição"));

JTextArea jtaDescricao = new JTextArea();
jtaDescricao.setLineWrap(true);
jtaDescricao.setWrapStyleWord(true);
jtaDescricao.setBounds(10, 15, 455, 25); // LARGO E BAIXO
jtaDescricao.setBorder(null);
pnlDesc.add(jtaDescricao);

pnlCadProd.add(pnlDesc);
pnlProduto.add(pnlCadProd);

// -------------------- FORNECEDOR ---------------------
        JPanel pnlCadFor = new JPanel(null);
        pnlCadFor.setBounds(10, 150, 500, 110); // POSIÇÃO MAIS EMBAIXO
        pnlCadFor.setBorder(BorderFactory.createTitledBorder("Dados do Fornecedor"));

        JLabel lblEmpresa = new JLabel("Empresa:");
        lblEmpresa.setBounds(10, 25, 70, 20);
        pnlCadFor.add(lblEmpresa);

        JTextField jtfEmpresa = new JTextField();
        jtfEmpresa.setBounds(80, 25, 380, 25);
        pnlCadFor.add(jtfEmpresa);

        JLabel lblCnpj = new JLabel("CNPJ:");
        lblCnpj.setBounds(10, 65, 70, 20);
        pnlCadFor.add(lblCnpj);

        JTextField jtfCnpj = new JTextField();
         jtfCnpj.setBounds(80, 65, 200, 25);
        pnlCadFor.add(jtfCnpj);

        JLabel lblContato = new JLabel("Contato:");
        lblContato.setBounds(300, 65, 70, 20);
        pnlCadFor.add(lblContato);

        JTextField jtfContato = new JTextField();
        jtfContato.setBounds(360, 65, 100, 25);
        pnlCadFor.add(jtfContato);

        pnlFornecedor.add(pnlCadFor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppSigCad());
    }
}