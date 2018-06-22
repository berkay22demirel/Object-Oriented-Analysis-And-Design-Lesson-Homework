package InterFace;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class LokantaSahibiGiris extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LokantaSahibiGiris frame = new LokantaSahibiGiris();
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
	public LokantaSahibiGiris() {
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
		
		JButton btnHaslat = new JButton("Has\u0131lat");
		btnHaslat.setFont(new Font("Verdana", Font.BOLD, 13));
		btnHaslat.setBounds(266, 64, 210, 44);
		contentPane.add(btnHaslat);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setFont(new Font("Verdana", Font.BOLD, 13));
		btnEkle.setBounds(525, 64, 210, 44);
		contentPane.add(btnEkle);
		
		JButton btnAyarlar = new JButton("Sil");
		btnAyarlar.setFont(new Font("Verdana", Font.BOLD, 13));
		btnAyarlar.setBounds(766, 64, 210, 44);
		contentPane.add(btnAyarlar);
		
		table = new JTable();
		table.setBounds(10, 168, 210, 282);
		contentPane.add(table);
		
		JLabel lblAnlkSipariler = new JLabel("Anl\u0131k Sipari\u015Fler");
		lblAnlkSipariler.setFont(new Font("Verdana", Font.BOLD, 13));
		lblAnlkSipariler.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnlkSipariler.setBounds(10, 136, 210, 21);
		contentPane.add(lblAnlkSipariler);
		
		table_1 = new JTable();
		table_1.setBounds(266, 168, 210, 282);
		contentPane.add(table_1);
		
		JLabel lblMasalar = new JLabel("Masalar");
		lblMasalar.setHorizontalAlignment(SwingConstants.CENTER);
		lblMasalar.setFont(new Font("Verdana", Font.BOLD, 13));
		lblMasalar.setBounds(266, 136, 210, 21);
		contentPane.add(lblMasalar);
		
		table_2 = new JTable();
		table_2.setBounds(525, 168, 210, 282);
		contentPane.add(table_2);
		
		JLabel lblGarsonlarVeefler = new JLabel("Aktif Garsonlar ve \u015Eefler");
		lblGarsonlarVeefler.setHorizontalAlignment(SwingConstants.CENTER);
		lblGarsonlarVeefler.setFont(new Font("Verdana", Font.BOLD, 13));
		lblGarsonlarVeefler.setBounds(525, 136, 210, 21);
		contentPane.add(lblGarsonlarVeefler);
		
		JLabel lblAktifMteriler = new JLabel("Aktif M\u00FC\u015Fteriler");
		lblAktifMteriler.setHorizontalAlignment(SwingConstants.CENTER);
		lblAktifMteriler.setFont(new Font("Verdana", Font.BOLD, 13));
		lblAktifMteriler.setBounds(766, 136, 210, 21);
		contentPane.add(lblAktifMteriler);
		
		table_3 = new JTable();
		table_3.setBounds(766, 168, 210, 282);
		contentPane.add(table_3);
		
		JButton ButonUrunEkle = new JButton("UrunEkle");
		ButonUrunEkle.setFont(new Font("Verdana", Font.BOLD, 13));
		ButonUrunEkle.setBounds(10, 64, 210, 44);
		contentPane.add(ButonUrunEkle);
	}
}
