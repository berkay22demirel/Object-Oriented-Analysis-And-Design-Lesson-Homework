package InterFace;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.util.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import MusteriIslemleri.Register;
import MusteriIslemleri.SatisLineItem;
import MusteriIslemleri.Siparis;
import OrtakSiniflar.Urun;
public class ÜyeMüsteri extends JFrame implements ListSelectionListener,ActionListener{

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JList ListUrunler;
	private JButton ButonUrunleriGor;
	private JButton ButonUrunSec;
	private JButton ButonSiparisVer;
	private JList ListSecilenUrunler;
	public ArrayList UrunlerListesi;
	public ArrayList SecilenUrunlerListesi = new ArrayList();
	public String [] UrunlerString;
	public int SecilenUrun;
	public Register YeniSiparisIstegi;
	public JLabel LabelSiparis;
	private JLabel LabelHesapOde;
	private JButton ButonHesapOde;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ÜyeMüsteri frame = new ÜyeMüsteri();
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
	public ÜyeMüsteri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIsim = new JLabel("\u0130sim");
		lblIsim.setFont(new Font("Verdana", Font.BOLD, 12));
		lblIsim.setBounds(8, 7, 171, 31);
		contentPane.add(lblIsim);
		
		JLabel lblSoyisim = new JLabel("Soyisim");
		lblSoyisim.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSoyisim.setBounds(219, 7, 171, 31);
		contentPane.add(lblSoyisim);
		
		ButonUrunleriGor = new JButton("\u00DCr\u00FCnleri G\u00F6r");
		ButonUrunleriGor.setFont(new Font("Verdana", Font.BOLD, 13));
		ButonUrunleriGor.setBounds(8, 60, 210, 44);
		contentPane.add(ButonUrunleriGor);
		ButonUrunleriGor.addActionListener(this);
		ButonUrunleriGor.setActionCommand("ButonUrunleriGor");
		
		ButonUrunSec = new JButton("\u00DCr\u00FCn Se\u00E7");
		ButonUrunSec.setFont(new Font("Verdana", Font.BOLD, 13));
		ButonUrunSec.setBounds(264, 60, 210, 44);
		contentPane.add(ButonUrunSec);
		ButonUrunSec.addActionListener(this);
		ButonUrunSec.setActionCommand("ButonUrunSec");
		
		ButonSiparisVer = new JButton("Sipari\u015F Ver");
		ButonSiparisVer.setFont(new Font("Verdana", Font.BOLD, 13));
		ButonSiparisVer.setBounds(523, 60, 210, 44);
		contentPane.add(ButonSiparisVer);
		ButonSiparisVer.addActionListener(this);
		ButonSiparisVer.setActionCommand("ButonSiparisVer");
		
		JLabel lblDuyurular = new JLabel("Duyurular");
		lblDuyurular.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuyurular.setFont(new Font("Verdana", Font.BOLD, 13));
		lblDuyurular.setBounds(764, 152, 210, 24);
		contentPane.add(lblDuyurular);
		
		ListSecilenUrunler = new JList();
		ListSecilenUrunler.setBounds(264, 186, 210, 263);
		contentPane.add(ListSecilenUrunler);
		
		table = new JTable();
		table.setBounds(523, 187, 210, 263);
		contentPane.add(table);
		
		JLabel lblSiparilerim = new JLabel("Sipari\u015Flerim");
		lblSiparilerim.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiparilerim.setFont(new Font("Verdana", Font.BOLD, 13));
		lblSiparilerim.setBounds(523, 152, 210, 24);
		contentPane.add(lblSiparilerim);
		
		table_1 = new JTable();
		table_1.setBounds(764, 187, 210, 263);
		contentPane.add(table_1);
		
		JLabel SecilenUrunler = new JLabel("Se\u00E7ilen \u00DCr\u00FCnler");
		SecilenUrunler.setHorizontalAlignment(SwingConstants.CENTER);
		SecilenUrunler.setFont(new Font("Verdana", Font.BOLD, 13));
		SecilenUrunler.setBounds(264, 152, 210, 24);
		contentPane.add(SecilenUrunler);
		
		
		ListUrunler = new JList<String>();
		ListUrunler.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListUrunler.setBounds(8, 186, 210, 263);
		contentPane.add(ListUrunler);
		ListUrunler.addListSelectionListener(this);
		
		JLabel lblrnler = new JLabel("\u00DCr\u00FCnler");
		lblrnler.setHorizontalAlignment(SwingConstants.CENTER);
		lblrnler.setFont(new Font("Verdana", Font.BOLD, 13));
		lblrnler.setBounds(8, 152, 210, 24);
		contentPane.add(lblrnler);
		
		ButonHesapOde = new JButton("Hesap \u00D6de");
		ButonHesapOde.setFont(new Font("Verdana", Font.BOLD, 13));
		ButonHesapOde.setBounds(764, 60, 210, 44);
		contentPane.add(ButonHesapOde);
		ButonHesapOde.addActionListener(this);
		ButonHesapOde.setActionCommand("ButonHesapOde");
		
		LabelSiparis = new JLabel("");
		LabelSiparis.setFont(new Font("Verdana", Font.BOLD, 12));
		LabelSiparis.setBounds(523, 16, 171, 31);
		contentPane.add(LabelSiparis);
		
		LabelHesapOde = new JLabel("");
		LabelHesapOde.setFont(new Font("Verdana", Font.BOLD, 12));
		LabelHesapOde.setBounds(764, 16, 171, 31);
		contentPane.add(LabelHesapOde);
		
		YeniSiparisIstegi = new Register();
		YeniSiparisIstegi.SiparisIstegi("berkay22",140401029);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String ButonText = e.getActionCommand();
		LokantaSahibiGiris FrameAnasayfa = new LokantaSahibiGiris();
		if(ButonText.equals("ButonUrunleriGor")){
			
			Register UrunleriGor = new Register();
			UrunlerListesi = new ArrayList();
			UrunlerListesi = UrunleriGor.UrunGetir();
			ListIterator i = UrunlerListesi.listIterator();
			String [] UrunlerString = new String[250];
			int j = 0;
			while(i.hasNext()){
				UrunlerString[j] = ((Urun)(i.next())).UrunAdi;
				j++;
			}
			ListUrunler.setListData(UrunlerString);
		}
		else if(ButonText.equals("ButonUrunSec")){
			SecilenUrunlerListesi.add(UrunlerListesi.get(SecilenUrun));
			ListIterator i = SecilenUrunlerListesi.listIterator();
			String [] SecilenUrunlerString = new String[250];
			int z = 0;
			while(i.hasNext()){
				SecilenUrunlerString[z] = ((Urun)(i.next())).UrunAdi;
				z++;
			}
			ListSecilenUrunler.setListData(SecilenUrunlerString);
			YeniSiparisIstegi.UrunSec(((Urun)(UrunlerListesi.get(SecilenUrun))).UrunNo, 1);
		}
		else if(ButonText.equals("ButonSiparisVer")){
			YeniSiparisIstegi.UrunSecimiBitirme();
			YeniSiparisIstegi.SiparisiTamamla();
			LabelSiparis.setText("Baþarýyla Sipariþ Verildi");
		}
		else if(ButonText.equals("ButonHesapOde")){
			Register denemeR = new Register();
			denemeR.HesapOdemeIstegi(140401029);
			denemeR.Odeme();
			LabelHesapOde.setText("Baþarýyla Hesap Ödendi");
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		SecilenUrun = ListUrunler.getSelectedIndex();
		
		
	}
}
