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
import javax.swing.JList;

public class LokantaSahibiDuzenle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LokantaSahibiDuzenle frame = new LokantaSahibiDuzenle();
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
	public LokantaSahibiDuzenle() {
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
		
		JButton btnMasaSil = new JButton("Masa Sil");
		btnMasaSil.setFont(new Font("Verdana", Font.BOLD, 13));
		btnMasaSil.setBounds(10, 64, 210, 44);
		contentPane.add(btnMasaSil);
		
		JButton btnefDzenle = new JButton("\u015Eef Sil");
		btnefDzenle.setFont(new Font("Verdana", Font.BOLD, 13));
		btnefDzenle.setBounds(266, 64, 210, 44);
		contentPane.add(btnefDzenle);
		
		JButton btnGarsonDzenle = new JButton("Garson Sil");
		btnGarsonDzenle.setFont(new Font("Verdana", Font.BOLD, 13));
		btnGarsonDzenle.setBounds(525, 64, 210, 44);
		contentPane.add(btnGarsonDzenle);
		
		JButton btnDuyuruDzenle = new JButton("Duyuru Sil");
		btnDuyuruDzenle.setFont(new Font("Verdana", Font.BOLD, 13));
		btnDuyuruDzenle.setBounds(766, 64, 210, 44);
		contentPane.add(btnDuyuruDzenle);
		
		JList list = new JList();
		list.setBounds(766, 141, 210, 309);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(525, 141, 210, 309);
		contentPane.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(266, 141, 210, 309);
		contentPane.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(10, 141, 210, 309);
		contentPane.add(list_3);
		
		JButton btnAnasayfa = new JButton("Anasayfa");
		btnAnasayfa.setFont(new Font("Verdana", Font.BOLD, 13));
		btnAnasayfa.setBounds(766, 11, 210, 44);
		contentPane.add(btnAnasayfa);
	}

}
