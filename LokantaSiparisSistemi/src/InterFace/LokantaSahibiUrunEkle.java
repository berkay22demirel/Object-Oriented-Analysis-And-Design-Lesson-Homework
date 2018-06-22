package InterFace;
import LokantaSahibiIslemleri.Register;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LokantaSahibiUrunEkle extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textFieldUrunAdi;
	private JTextField textFieldUrunFiyati;
	private JTextField textFieldUrunKalorisi;
	private JTextField textFieldUrunKategorisi;
	private JLabel LabelUrunDurumu;
	private JButton	ButonAnasayfa;
	private JButton ButonUrunEkle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LokantaSahibiUrunEkle frame = new LokantaSahibiUrunEkle();
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
	public LokantaSahibiUrunEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0130sim");
		label.setFont(new Font("Verdana", Font.BOLD, 12));
		label.setBounds(10, 11, 171, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Soyisim");
		label_1.setFont(new Font("Verdana", Font.BOLD, 12));
		label_1.setBounds(221, 11, 171, 31);
		contentPane.add(label_1);
		
		ButonUrunEkle = new JButton("\u00DCr\u00FCn Ekle");
		ButonUrunEkle.setFont(new Font("Verdana", Font.BOLD, 13));
		ButonUrunEkle.setBounds(10, 64, 382, 44);
		contentPane.add(ButonUrunEkle);
		ButonUrunEkle.addActionListener(this);
		ButonUrunEkle.setActionCommand("ButonUrunEkle");
		
		textFieldUrunAdi = new JTextField();
		textFieldUrunAdi.setBounds(193, 132, 199, 44);
		contentPane.add(textFieldUrunAdi);
		textFieldUrunAdi.setColumns(10);
		
		JLabel LabelUrunAdi = new JLabel("\u00DCr\u00FCn Ad\u0131");
		LabelUrunAdi.setFont(new Font("Verdana", Font.BOLD, 12));
		LabelUrunAdi.setBounds(10, 132, 151, 44);
		contentPane.add(LabelUrunAdi);
		
		textFieldUrunFiyati = new JTextField();
		textFieldUrunFiyati.setColumns(10);
		textFieldUrunFiyati.setBounds(193, 199, 199, 44);
		contentPane.add(textFieldUrunFiyati);
		
		JLabel LabelUrunFiyati = new JLabel("\u00DCr\u00FCn Fiyat\u0131");
		LabelUrunFiyati.setFont(new Font("Verdana", Font.BOLD, 12));
		LabelUrunFiyati.setBounds(10, 199, 151, 44);
		contentPane.add(LabelUrunFiyati);
		
		textFieldUrunKalorisi = new JTextField();
		textFieldUrunKalorisi.setColumns(10);
		textFieldUrunKalorisi.setBounds(193, 259, 199, 44);
		contentPane.add(textFieldUrunKalorisi);
		
		JLabel LabelUrunKalorisi = new JLabel("\u00DCr\u00FCn Kalorisi");
		LabelUrunKalorisi.setFont(new Font("Verdana", Font.BOLD, 12));
		LabelUrunKalorisi.setBounds(10, 259, 151, 44);
		contentPane.add(LabelUrunKalorisi);
		
		JLabel LabelUrunKategorisi = new JLabel("\u00DCr\u00FCn Kategorisi");
		LabelUrunKategorisi.setFont(new Font("Verdana", Font.BOLD, 12));
		LabelUrunKategorisi.setBounds(10, 324, 151, 44);
		contentPane.add(LabelUrunKategorisi);
		
		textFieldUrunKategorisi = new JTextField();
		textFieldUrunKategorisi.setColumns(10);
		textFieldUrunKategorisi.setBounds(193, 324, 199, 44);
		contentPane.add(textFieldUrunKategorisi);
		
		ButonAnasayfa = new JButton("Anasayfa");
		ButonAnasayfa.setFont(new Font("Verdana", Font.BOLD, 13));
		ButonAnasayfa.setBounds(193, 387, 199, 44);
		contentPane.add(ButonAnasayfa);
		ButonAnasayfa.addActionListener(this);
		ButonAnasayfa.setActionCommand("ButonAnasayfa");
		
		LabelUrunDurumu = new JLabel("");
		LabelUrunDurumu.setFont(new Font("Verdana", Font.BOLD, 12));
		LabelUrunDurumu.setBounds(10, 387, 151, 44);
		contentPane.add(LabelUrunDurumu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ButonText = e.getActionCommand();
		LokantaSahibiGiris FrameAnasayfa = new LokantaSahibiGiris();
		if(ButonText.equals("ButonAnasayfa")){
			FrameAnasayfa.setVisible(true);
			this.setVisible(false);
		}
		else if(ButonText.equals("ButonUrunEkle")){
			Register YeniUrunEkle = new Register();
			YeniUrunEkle.UrunBilgisiGirisiIstegi();
			String UrunAdi = textFieldUrunAdi.getText();
			double UrunFiyati = (double)(Integer.parseInt(textFieldUrunFiyati.getText()));
			int UrunKalori = Integer.parseInt(textFieldUrunKalorisi.getText());
			String UrunKategorisi = textFieldUrunKategorisi.getText();
			YeniUrunEkle.UrunBilgisiGiris(UrunAdi, UrunFiyati, UrunKalori, UrunKategorisi);
			YeniUrunEkle.UrunGirisiBitirme();
			LabelUrunDurumu.setText("Ürün Giriþi Baþarýlý");
		}
		
	}
}
