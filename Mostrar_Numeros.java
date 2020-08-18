import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Mostrar_Numeros extends JFrame {

	private JPanel Painel;
	
	int num1 = 1;
	int num2 = 0;
	private JTextField textA;
	private JTextField textB;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mostrar_Numeros frame = new Mostrar_Numeros();
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
	public Mostrar_Numeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		Painel = new JPanel();
		Painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel);
		Painel.setLayout(null);
		
		
	
		
		JLabel LetraA = new JLabel("A:");
		LetraA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		LetraA.setBounds(85, 74, 31, 33);
		Painel.add(LetraA);
		
		JLabel LetraB = new JLabel("B:");
		LetraB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		LetraB.setBounds(85, 118, 20, 30);
		Painel.add(LetraB);
		
		JButton Botao = new JButton("Mostrar Numeros");
		Botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int a = 0 ,b = 0;
			
			try {
			
		 a = Integer.valueOf(textA.getText());
		 b = Integer.valueOf(textB.getText());
		
		 String  result = "";
		 
		 for (int x = a+1; x < b; x++)
		  result += x+ "  |  ";
		  
		   
		 JOptionPane.showMessageDialog(Painel, result);
		 
			}
			catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(Painel,"Por favor digite apenas numero inteiros ! ");
			}
				
				
			}
		});
		Botao.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Botao.setBounds(115, 174, 186, 33);
		Painel.add(Botao);
		
		textA = new JTextField();
		textA.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textA.setBounds(115, 74, 186, 33);
		Painel.add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textB.setBounds(115, 118, 186, 34);
		Painel.add(textB);
		textB.setColumns(10);
		
	
		
		
		
		
		
	}
}
