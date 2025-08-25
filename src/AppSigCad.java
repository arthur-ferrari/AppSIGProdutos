import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
 
public class AppSigCad extends JFrame{
 
    //Construtor da classe
    public AppSigCad(){
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

        JPanel pnlCliente = new JPanel();
        pnlCliente.setLayout(null);
        tbPanel.addTab("Cliente", pnlCliente);

        JPanel pnlProduto = new JPanel();
        pnlProduto.setLayout(null);
        tbPanel.addTab("Produto", pnlProduto);
        
        JPanel pnlFornecedor = new JPanel();
        pnlFornecedor.setLayout(null);
        tbPanel.addTab("Fornecedor", pnlFornecedor);

        JPanel pnlCadCli = new JPanel();
        pnlCliente.add(pnlCadCli);

        pnlCadCli.setSize(520, 118);
        pnlCadCli.setLocation(10, 150);
        pnlCadCli.setLayout(null);
        Border borda = BorderFactory.createLineBorder(new Color(128, 128, 128), 1);
        pnlCadCli.setBorder(borda);

        
	//Declaração dos Labels
        JLabel lblCodigo = new JLabel("Matricula: ");
        lblCodigo.setSize(70, 20);
        lblCodigo.setLocation(10, 20);
        pnlCadCli.add(lblCodigo);

        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setSize(50, 20);
        lblNome.setLocation(120, 20);
        pnlCadCli.add(lblNome);

        JLabel lblFone = new JLabel("Telefone: ");
        lblFone.setSize(100, 20);
        lblFone.setLocation(10, 60);
        pnlCadCli.add(lblFone);

        JLabel lblEmail = new JLabel("Email: ");
        lblEmail.setSize(50, 20);
        lblEmail.setLocation(170, 60);
        pnlCadCli.add(lblEmail);

        //Declaração dos JTextFields
        JTextField jtfCodigo = new JTextField();
        jtfCodigo.setSize(50, 25);
        jtfCodigo.setLocation(70, 20);
        pnlCadCli.add(jtfCodigo);

        JTextField jtfNome = new JTextField();
        jtfNome.setSize(230, 25);
        jtfNome.setLocation(160, 20);
        pnlCadCli.add(jtfNome);

        JTextField jtfFone = new JTextField();
        jtfFone.setSize(90, 25);
        jtfFone.setLocation(70, 60);
        pnlCadCli.add(jtfFone);

        JTextField jtfEmail = new JTextField();
        jtfEmail.setSize(180, 25);
        jtfEmail.setLocation(210, 60);
        pnlCadCli.add(jtfEmail);

        
    }
    public static void main(String[] args) throws Exception {
        AppSigCad form = new AppSigCad();
    }
}