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

public class LokantaSahibiHasilat extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LokantaSahibiHasilat frame = new LokantaSahibiHasilat();
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
	public LokantaSahibiHasilat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Soyisim");
		label.setFont(new Font("Verdana", Font.BOLD, 12));
		label.setBounds(221, 11, 171, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0130sim");
		label_1.setFont(new Font("Verdana", Font.BOLD, 12));
		label_1.setBounds(10, 11, 171, 31);
		contentPane.add(label_1);
		
		JButton btnGnlkListele = new JButton("G\u00FCnl\u00FCk Listele");
		btnGnlkListele.setFont(new Font("Verdana", Font.BOLD, 13));
		btnGnlkListele.setBounds(10, 64, 210, 44);
		contentPane.add(btnGnlkListele);
		
		JButton btnAylkListele = new JButton("Ayl\u0131k Listele");
		btnAylkListele.setFont(new Font("Verdana", Font.BOLD, 13));
		btnAylkListele.setBounds(266, 64, 210, 44);
		contentPane.add(btnAylkListele);
		
		JButton btnYllkListele = new JButton("Y\u0131ll\u0131k Listele");
		btnYllkListele.setFont(new Font("Verdana", Font.BOLD, 13));
		btnYllkListele.setBounds(525, 64, 210, 44);
		contentPane.add(btnYllkListele);
		
		JButton btnAnasayfa = new JButton("Anasayfa");
		btnAnasayfa.setFont(new Font("Verdana", Font.BOLD, 13));
		btnAnasayfa.setBounds(766, 64, 210, 44);
		contentPane.add(btnAnasayfa);
		
		table = new JTable();
		table.setBounds(10, 153, 466, 297);
		contentPane.add(table);
	}

}
