package VeriTabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.*;
import OrtakSiniflar.Urun;

public class UrunlerMapper {
	public ArrayList getHepsi(){
		ArrayList UrunlerListesi = new ArrayList();
		String sql = "SELECT * FROM Urun";
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			Statement st = con.createStatement();
			ResultSet Sonuc = st.executeQuery(sql);
			while(Sonuc.next()){
					Urun YeniUrun = new Urun();
					YeniUrun.UrunNo = Sonuc.getInt("UrunNo");
					YeniUrun.UrunAdi = Sonuc.getString("UrunAdi");
					YeniUrun.UrunFiyati = Sonuc.getDouble("UrunFiyati");
					YeniUrun.UrunKalori = Sonuc.getInt("UrunKalori");
					YeniUrun.UrunKategorisi = Sonuc.getString("UrunKategorisi");
					UrunlerListesi.add(YeniUrun);
			}
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		return UrunlerListesi;
	}
}
