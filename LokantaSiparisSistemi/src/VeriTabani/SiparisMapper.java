package VeriTabani;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import MusteriIslemleri.SatisLineItem;

import MusteriIslemleri.Siparis;
import OrtakSiniflar.Urun;
public class SiparisMapper implements IMapper{
	Siparis KaydetSiparis = new Siparis("Deneme",0);
	public Object get(int MusteriNo){
		String sql = "SELECT * FROM Siparis";
		Siparis SonSiparis = new Siparis("deneme",0);
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			Statement st = con.createStatement();
			ResultSet Sonuc = st.executeQuery(sql);
			while(Sonuc.next()){ 
				if((Sonuc.getInt("MusteriNo") == MusteriNo)){
					SonSiparis.ToplamUcret = SonSiparis.ToplamUcret + Sonuc.getInt("ToplamUcret");
				}
			}
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return SonSiparis;
	}
	public void put(Object GelenNesne){
		String sql = "INSERT INTO Siparis (MusteriID,ToplamUcret,Durum,MusteriNo)VALUES (?,?,?,?)";
		String sql2 = "INSERT INTO SatisLineItem (Adet,UrunNo,SiparisNo)VALUES (?,?,?)";
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			PreparedStatement pst = con.prepareStatement(sql); 
			pst.setString(1,((Siparis)GelenNesne).MusteriID);
			pst.setDouble(2,((Siparis)GelenNesne).ToplamUcret);
			pst.setString(3,((Siparis)GelenNesne).Durum);
			pst.setInt(4,((Siparis)GelenNesne).MusteriNo);
			int sonuc = pst.executeUpdate();
			ListIterator i = ((Siparis)GelenNesne).SatisLineItemListesi.listIterator();
			SatisLineItem gecici;
			while(i.hasNext()){
				PreparedStatement pst2 = con.prepareStatement(sql2);
				gecici = (SatisLineItem)i.next();
				pst2.setInt(1,gecici.Adet);
				pst2.setInt(2,gecici.Item.UrunNo);
				pst2.setInt(3,0);
				int sonuc2 = pst2.executeUpdate();
			}
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
