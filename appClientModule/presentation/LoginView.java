package presentation;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controller.LoginCont;
import pojo.User;

import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class LoginView {

	private JFrame frame;
	private User usr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Page d'authentification");
		
		JLabel bg = new JLabel("");
		bg.setBackground(Color.WHITE);
		bg.setBounds(0, 0, 433, 260);
		frame.getContentPane().add(bg);
		Image img = new ImageIcon (this.getClass().getResource("/loginPage.png")).getImage();
		
		bg.setIcon(new ImageIcon(img));
		
		
		JPanel pancont = new JPanel();
		pancont.setOpaque(false);
		pancont.setBounds(50, 50, 280, 180);
		pancont.setBorder(new TitledBorder("Authentification"));
		bg.add(pancont);
		pancont.setLayout(null);
		
		GridLayout g = new GridLayout();
		g.setColumns(2);
		g.setRows(2);
		g.setHgap(10);
		g.setVgap(10);
		
		JPanel panchp = new JPanel();
		panchp.setOpaque(false);
		panchp.setBounds(10, 50, 250, 50);
		panchp.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		panchp.setLayout(g);
		pancont.add(panchp);
		
		JLabel lblNewLabel = new JLabel("Nom d'utilisateur");
		lblNewLabel.setBounds(173, 67, 88, 17);
		panchp.add(lblNewLabel);
		
		JTextField login = new JTextField();
		login.setForeground(Color.BLACK);
		//login.setBounds(0, 63, 10, 10);
		panchp.add(login);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe");
		lblNewLabel_1.setBounds(173, 104, 88, 17);
		panchp.add(lblNewLabel_1);
		
		JPasswordField mdp = new JPasswordField();
		//mdp.setBounds(271, 100, 140, 22);
		panchp.add(mdp);
		
		GridLayout gl = new GridLayout();
		g.setColumns(2);
		g.setRows(2);
		g.setHgap(10);
		g.setVgap(10);
		
		JPanel panbtn = new JPanel();
		panbtn.setOpaque(false);
		panbtn.setBounds(10, 120, 250, 25);
		panbtn.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		panbtn.setLayout(gl);
		pancont.add(panbtn);
		
		JButton btnNewButton = new JButton("Se connecter");
		panbtn.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String log = login.getText();
				char [] mp = mdp.getPassword();
				LoginCont lc = new LoginCont();
				boolean result = lc.controlerInput(log, mp);
				String dialog = lc.getConnect();
				if (result == false) {
					JOptionPane.showMessageDialog(btnNewButton, "Vous devez remplir tous les champs en ne dépassant le nombre de caractères autorisé.");
					String rs = String.valueOf(result);
					login.setText("");
					mdp.setText("");
				}
				else
					JOptionPane.showMessageDialog(btnNewButton, dialog);
					
				
			}
		});
		btnNewButton.setBounds(90, 140, 99, 21);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		JButton btnNewButton1 = new JButton("Quitter");
		panbtn.add(btnNewButton1);
		
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int op = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment quitter l'application?", "Confirmer choix", JOptionPane.YES_NO_OPTION);
				if (op == 0)
					System.exit(0);
			}
		});
		btnNewButton1.setBounds(90, 140, 99, 21);
		btnNewButton1.setForeground(Color.WHITE);
		btnNewButton1.setBackground(Color.BLUE);
		btnNewButton1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		
		/*JLabel lblImage = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/log.png")).getImage();
		lblImage.setIcon(new ImageIcon(img));
		lblImage.setBounds(50, 30, 414, 213);
		frame.getContentPane().add(lblImage);*/
		
		//background section
				/*JLabel bg = new JLabel();
				//bg.setLocation(0, 5);
				bg.setLayout(new BorderLayout());
				Image img = new ImageIcon (this.getClass().getResource("/log.png")).getImage();
				bg.setIcon(new ImageIcon(img));
				//bg.setBounds(0, 0, 414, 213);
				//frame.setContentPane(bg);
				frame.getContentPane().setLayout(new FlowLayout());
				frame.getContentPane().add(bg);*/
	}
	
	
}
