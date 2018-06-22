package InterFace;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LokantaSahibi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LokantaSahibi frame = new LokantaSahibi();
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
	public LokantaSahibi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMasa = new JButton("Masa Ekle");
		btnMasa.setFont(new Font("Verdana", Font.BOLD, 13));
		btnMasa.setBounds(10, 64, 210, 44);
		contentPane.add(btnMasa);
		
		JLabel label = new JLabel("\u0130sim");
		label.setFont(new Font("Verdana", Font.BOLD, 12));
		label.setBounds(10, 11, 171, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Soyisim");
		label_1.setFont(new Font("Verdana", Font.BOLD, 12));
		label_1.setBounds(221, 11, 171, 31);
		contentPane.add(label_1);
		
		JButton btnefEkle = new JButton("\u015Eef Ekle");
		btnefEkle.setFont(new Font("Verdana", Font.BOLD, 13));
		btnefEkle.setBounds(266, 64, 210, 44);
		contentPane.add(btnefEkle);
		
		JButton btnGarsonuEkle = new JButton("Garson Ekle");
		btnGarsonuEkle.setFont(new Font("Verdana", Font.BOLD, 13));
		btnGarsonuEkle.setBounds(525, 64, 210, 44);
		contentPane.add(btnGarsonuEkle);
		
		JButton btnDuyuruEkle = new JButton("Duyuru Ekle");
		btnDuyuruEkle.setFont(new Font("Verdana", Font.BOLD, 13));
		btnDuyuruEkle.setBounds(766, 64, 210, 44);
		contentPane.add(btnDuyuruEkle);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Verdana", Font.PLAIN, 11));
		textArea.setBounds(766, 160, 208, 290);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.BOLD, 13));
		textField.setBounds(608, 157, 127, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Verdana", Font.BOLD, 13));
		lblId.setBounds(525, 160, 73, 28);
		contentPane.add(lblId);
		
		JLabel lblifre = new JLabel("\u015Eifre");
		lblifre.setFont(new Font("Verdana", Font.BOLD, 13));
		lblifre.setBounds(525, 213, 73, 28);
		contentPane.add(lblifre);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(608, 210, 127, 31);
		contentPane.add(textField_1);
		
		JLabel lblAd = new JLabel("Ad");
		lblAd.setFont(new Font("Verdana", Font.BOLD, 13));
		lblAd.setBounds(525, 260, 73, 28);
		contentPane.add(lblAd);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(608, 257, 127, 31);
		contentPane.add(textField_2);
		
		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setFont(new Font("Verdana", Font.BOLD, 13));
		lblSoyad.setBounds(525, 312, 73, 28);
		contentPane.add(lblSoyad);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(608, 309, 127, 31);
		contentPane.add(textField_3);
		
		JLabel lblPozisyon = new JLabel("Pozisyon");
		lblPozisyon.setFont(new Font("Verdana", Font.BOLD, 13));
		lblPozisyon.setBounds(525, 365, 73, 28);
		contentPane.add(lblPozisyon);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(608, 362, 127, 31);
		contentPane.add(textField_4);
		
		JLabel label_2 = new JLabel("ID");
		label_2.setFont(new Font("Verdana", Font.BOLD, 13));
		label_2.setBounds(266, 160, 73, 28);
		contentPane.add(label_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(349, 157, 127, 31);
		contentPane.add(textField_5);
		
		JLabel label_3 = new JLabel("\u015Eifre");
		label_3.setFont(new Font("Verdana", Font.BOLD, 13));
		label_3.setBounds(266, 213, 73, 28);
		contentPane.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_6.setColumns(10);
		textField_6.setBounds(349, 210, 127, 31);
		contentPane.add(textField_6);
		
		JLabel label_4 = new JLabel("Ad");
		label_4.setFont(new Font("Verdana", Font.BOLD, 13));
		label_4.setBounds(266, 260, 73, 28);
		contentPane.add(label_4);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(349, 257, 127, 31);
		contentPane.add(textField_7);
		
		JLabel label_5 = new JLabel("Soyad");
		label_5.setFont(new Font("Verdana", Font.BOLD, 13));
		label_5.setBounds(266, 312, 73, 28);
		contentPane.add(label_5);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(349, 309, 127, 31);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Verdana", Font.BOLD, 13));
		textField_9.setColumns(10);
		textField_9.setBounds(93, 160, 127, 31);
		contentPane.add(textField_9);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNo.setBounds(10, 163, 73, 28);
		contentPane.add(lblNo);
		
		JButton btnAnasayfa = new JButton("Anasayfa");
		btnAnasayfa.setFont(new Font("Verdana", Font.BOLD, 13));
		btnAnasayfa.setBounds(766, 11, 210, 44);
		contentPane.add(btnAnasayfa);
	}
}
