package VeriTabani;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ListIterator;

import MusteriIslemleri.HesapOde;
import MusteriIslemleri.SatisLineItem;
import MusteriIslemleri.Siparis;
public class HesapMapper implements IMapper{
	HesapOde KaydetHesap = new HesapOde();
	public Object get(int HesapNo){
		SiparisMapper YeniSiparis = new SiparisMapper();
		return YeniSiparis;
	}
	public void put(Object GelenNesne){
		String sql = "INSERT INTO HesapOde (MusteriID,GarsonID,Tutar,Durum)VALUES (?,?,?,?)";
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			PreparedStatement pst = con.prepareStatement(sql); 
			pst.setString(1,((HesapOde)GelenNesne).MusteriID);
			pst.setString(2,((HesapOde)GelenNesne).GarsonID);
			pst.setDouble(3,((HesapOde)GelenNesne).Tutar);
			pst.setString(4,"Odenmis");
			int sonuc = pst.executeUpdate();
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
}
