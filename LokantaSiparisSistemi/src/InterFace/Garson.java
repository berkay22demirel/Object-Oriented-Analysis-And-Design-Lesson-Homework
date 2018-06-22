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

public class Garson extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Garson frame = new Garson();
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
	public Garson() {
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
		
		JButton btnHesapde = new JButton("Hesap \u00D6de");
		btnHesapde.setFont(new Font("Verdana", Font.BOLD, 13));
		btnHesapde.setBounds(10, 64, 210, 44);
		contentPane.add(btnHesapde);
		
		JButton btnSipariTamamla = new JButton("Sipari\u015F Tamamla");
		btnSipariTamamla.setFont(new Font("Verdana", Font.BOLD, 13));
		btnSipariTamamla.setBounds(266, 64, 210, 44);
		contentPane.add(btnSipariTamamla);
		
		JButton btnaryaKarlkVer = new JButton("\u00C7a\u011Fr\u0131ya Kar\u015F\u0131l\u0131k Ver");
		btnaryaKarlkVer.setFont(new Font("Verdana", Font.BOLD, 13));
		btnaryaKarlkVer.setBounds(525, 64, 210, 44);
		contentPane.add(btnaryaKarlkVer);
		
		JList list = new JList();
		list.setBounds(10, 141, 210, 309);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(266, 141, 210, 309);
		contentPane.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(525, 141, 210, 309);
		contentPane.add(list_2);
	}

}
