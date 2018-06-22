package InterFace;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Giris extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldSifre;
	private JLabel lblId;
	private JLabel lblifre;
	private JLabel label;
	private JLabel label_1;
	private JButton ButonUyeGirisi;
	private JLabel lblCopyright;
	private JButton ButonUyeGirisiYapmadan;
	private JButton ButonUyeOl;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giris frame = new Giris();
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
	public Giris() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLokantaSipariSistemi = new JLabel("Lokanta Sipari\u015F Sistemi");
		lblLokantaSipariSistemi.setHorizontalAlignment(SwingConstants.CENTER);
		lblLokantaSipariSistemi.setFont(new Font("Verdana", Font.BOLD, 33));
		lblLokantaSipariSistemi.setBounds(10, 11, 964, 36);
		contentPane.add(lblLokantaSipariSistemi);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(453, 107, 238, 36);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldSifre = new JTextField();
		textFieldSifre.setColumns(10);
		textFieldSifre.setBounds(453, 181, 238, 36);
		contentPane.add(textFieldSifre);
		
		lblId = new JLabel("ID");
		lblId.setFont(new Font("Verdana", Font.BOLD, 20));
		lblId.setBounds(304, 107, 64, 36);
		contentPane.add(lblId);
		
		lblifre = new JLabel("\u015Eifre");
		lblifre.setFont(new Font("Verdana", Font.BOLD, 20));
		lblifre.setBounds(304, 181, 64, 36);
		contentPane.add(lblifre);
		
		label = new JLabel(":");
		label.setFont(new Font("Verdana", Font.BOLD, 20));
		label.setBounds(378, 181, 64, 36);
		contentPane.add(label);
		
		label_1 = new JLabel(":");
		label_1.setFont(new Font("Verdana", Font.BOLD, 20));
		label_1.setBounds(378, 107, 64, 36);
		contentPane.add(label_1);
		
		ButonUyeGirisi = new JButton("Giri\u015F Yap");
		ButonUyeGirisi.setFont(new Font("Verdana", Font.BOLD, 15));
		ButonUyeGirisi.setBounds(276, 255, 208, 36);
		contentPane.add(ButonUyeGirisi);
		ButonUyeGirisi.addActionListener(this);
		ButonUyeGirisi.setActionCommand("ButonUyeGirisi");
		
		
		lblCopyright = new JLabel("Copyright \u00A9 2017 Berkay Demirel - Ali Osman Ay T\u00FCm Haklar\u0131 Sakl\u0131d\u0131r");
		lblCopyright.setFont(new Font("Verdana", Font.PLAIN, 9));
		lblCopyright.setBounds(615, 442, 367, 14);
		contentPane.add(lblCopyright);
		
		ButonUyeGirisiYapmadan = new JButton("\u00DCye Giri\u015Fi Yapmadan Devam Et");
		ButonUyeGirisiYapmadan.setFont(new Font("Verdana", Font.BOLD, 9));
		ButonUyeGirisiYapmadan.setBounds(500, 253, 208, 36);
		contentPane.add(ButonUyeGirisiYapmadan);
		ButonUyeGirisiYapmadan.addActionListener(this);
		ButonUyeGirisiYapmadan.setActionCommand("ButonUyeGirisiYapmadan");
		
		ButonUyeOl = new JButton("\u00DCye Ol");
		ButonUyeOl.setFont(new Font("Verdana", Font.BOLD, 15));
		ButonUyeOl.setBounds(276, 315, 430, 36);
		contentPane.add(ButonUyeOl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ButonText = e.getActionCommand();
		ÜyeMüsteri FrameMusteri = new ÜyeMüsteri();
		if(ButonText == "ButonUyeGirisiYapmadan"){
			FrameMusteri.setVisible(true);
			this.setVisible(false);
		}
		else if(ButonText == "ButonUyeGirisi"){
			FrameMusteri.setVisible(true);
			this.setVisible(false);		
		}
		
	}
	
}
