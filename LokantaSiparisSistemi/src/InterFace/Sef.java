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
import javax.swing.JCheckBox;

public class Sef extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sef frame = new Sef();
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
	public Sef() {
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
		
		JButton btnSipariiTamamla = new JButton("Sipari\u015Fi Tamamla");
		btnSipariiTamamla.setFont(new Font("Verdana", Font.BOLD, 13));
		btnSipariiTamamla.setBounds(10, 64, 210, 44);
		contentPane.add(btnSipariiTamamla);
		
		JButton btnSipariBilgisiGir = new JButton("Sipari\u015F Bilgisi Gir");
		btnSipariBilgisiGir.setFont(new Font("Verdana", Font.BOLD, 13));
		btnSipariBilgisiGir.setBounds(266, 64, 210, 44);
		contentPane.add(btnSipariBilgisiGir);
		
		JList list = new JList();
		list.setBounds(10, 139, 210, 311);
		contentPane.add(list);
		
		JCheckBox chckbxHazrlanyor = new JCheckBox("Haz\u0131rlan\u0131yor");
		chckbxHazrlanyor.setBounds(266, 139, 200, 50);
		contentPane.add(chckbxHazrlanyor);
	}

}
