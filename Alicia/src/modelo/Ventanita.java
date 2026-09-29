package modelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventanita extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanita frame = new Ventanita();
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
	public Ventanita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 600, 1000, 800);
		contentPane = 
				new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personaje");
		lblNewLabel.setBounds(436, 11, 192, 58);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("¿Esta o no?");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(375, 229, 288, 52);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Embellecer");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(69, 139, 169, 69);
		contentPane.add(btnNewButton);
		
		JButton btnEstaEnMaravilla = new JButton("Esta en maravilla");
		btnEstaEnMaravilla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Personaje Jax = new Personaje(67,67,67);
				if(Jax.esDeMaravilla()==true) {
					lblNewLabel_1.setText("Esta en maravilla");
				}else {
					lblNewLabel_1.setText("Esta en el mundo");
				}
			}
		});
		btnEstaEnMaravilla.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnEstaEnMaravilla.setBounds(69, 219, 259, 69);
		contentPane.add(btnEstaEnMaravilla);
		
		JButton btnEsLindo = new JButton("Es lindo");
		btnEsLindo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnEsLindo.setBounds(69, 295, 169, 69);
		contentPane.add(btnEsLindo);
		
		JButton btnEsNormal = new JButton("Es normal");
		btnEsNormal.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnEsNormal.setBounds(69, 375, 169, 69);
		contentPane.add(btnEsNormal);
	}

}
