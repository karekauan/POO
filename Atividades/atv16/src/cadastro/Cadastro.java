package cadastro;

import java.awt.Container; 
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 2998090226598389756L;

	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblEndereco;
	private JTextField txtEndereco;
	private JLabel lblTelefone;
	private JFormattedTextField txtTelefone;
	private JLabel lblSangue;
	private JComboBox cbmSangue;
	private JLabel lblCurso;
	private JComboBox cbmCurso;
	private JLabel lblEmergenciaNome;
	private JTextField txtEmergenciaNome;
	private JLabel lblEmergenciaTelefone;
	private JFormattedTextField txtEmergenciaTelefone;
	
	private JButton btnInserir;
	private JButton btnCancelar;
	
	private Container ctn;
	
	private final String[] tiposSangue = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
	private final String[] cursoAlunos = {"Química", "TADS"};
	
	public Cadastro() {
		
		setSize (500, 800);
		setTitle("Cadastro Aluno");
		
		ctn = getContentPane();
		
		lblNome = new JLabel("Nome");
		txtNome = new JTextField();
		
		lblEndereco = new JLabel("Endereço");
		txtEndereco = new JTextField();
		
		lblTelefone = new JLabel("Telefone");
		try {
			txtTelefone = new JFormattedTextField(new MaskFormatter("(##) 9####-####"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		lblSangue = new JLabel("Tipo Sanguíneo");
		cbmSangue = new JComboBox(tiposSangue);
		
		lblCurso = new JLabel("Curso");
		cbmCurso = new JComboBox(cursoAlunos);
		
		lblEmergenciaNome = new JLabel("Contato Emergencial");
		txtEmergenciaNome = new JTextField();
		
		lblEmergenciaTelefone = new JLabel("Telefone Emergencial");
		try {
			txtEmergenciaTelefone = new JFormattedTextField(new MaskFormatter("(##) 9####-####"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		btnCancelar = new JButton("Cancelar");
		btnInserir = new JButton("Inserir");
		
		ctn.setLayout(null);
		
		lblNome.setBounds(75,0,100,25);
		txtNome.setBounds(10,25,200,25);
		lblTelefone.setBounds(300,0,100,25);
		txtTelefone.setBounds(275,25,120,25);
		lblEmergenciaNome.setBounds(25,50,150,25);
		txtEmergenciaNome.setBounds(10,75,200,25);
		lblEmergenciaTelefone.setBounds(260,50,200,25);
		txtEmergenciaTelefone.setBounds(275,75,120,25);
		lblSangue.setBounds(55,100,130,25);
		cbmSangue.setBounds(85,125,50,25);
		lblCurso.setBounds(315,100,50,25);
		cbmCurso.setBounds(285,125,100,25);
		lblEndereco.setBounds(210,150,100,25);
		txtEndereco.setBounds(45,175,400,25);
		btnCancelar.setBounds(100,225,100,25);
		btnInserir.setBounds(300,225,100,25);
		
		ctn.add(lblNome);
		ctn.add(txtNome);
		ctn.add(lblTelefone);
		ctn.add(txtTelefone);
		ctn.add(lblEmergenciaNome);
		ctn.add(txtEmergenciaNome);
		ctn.add(lblEmergenciaTelefone);
		ctn.add(txtEmergenciaTelefone);
		ctn.add(lblSangue);
		ctn.add(cbmSangue);
		ctn.add(lblCurso);
		ctn.add(cbmCurso);
		ctn.add(lblEndereco);
		ctn.add(txtEndereco);
		ctn.add(btnCancelar);
		ctn.add(btnInserir);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
			
		Cadastro cadastro = new Cadastro();
		
		}
	
}