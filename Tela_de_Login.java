import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

public class Tela_de_Login extends JFrame {

	private JPanel Painel;
	private JTextPane textNome;
	
	private JPasswordField textSenha;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_de_Login frame = new Tela_de_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela_de_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Painel = new JPanel();
		Painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel);
		Painel.setLayout(null);
		
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			String nome = textNome.getText();
			String senha = String.valueOf(textSenha.getPassword());
			
			if( nome.equals("admin") && senha.equals("swordfish"))
				JOptionPane.showMessageDialog(Painel,"Logado com sucesso");
			else
				JOptionPane.showMessageDialog(Painel, "Usuario ou senha incorretos ");
				
			
		
			    
			    
			    
			}
		});
		btnOk.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnOk.setBounds(189, 180, 89, 23);
		Painel.add(btnOk);
		
		
		//Login_e_senha
		
		JLabel PL_login = new JLabel("Login:");
		PL_login.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PL_login.setBounds(70, 78, 60, 38);
		Painel.add(PL_login);
		
		
		
		JLabel PL_Senha = new JLabel("Senha:");
		PL_Senha.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PL_Senha.setBounds(70, 127, 60, 36);
		Painel.add(PL_Senha);
		
		//Caixa_de_textos
		
		textNome = new JTextPane();
		textNome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textNome.setBounds(119, 83, 204, 33);
		Painel.add(textNome);
		
		textSenha = new JPasswordField();
		textSenha.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textSenha.setBounds(119, 127, 204, 33);
		Painel.add(textSenha);
	}
}
