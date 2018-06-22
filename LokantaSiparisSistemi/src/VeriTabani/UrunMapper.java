package VeriTabani;
import MusteriIslemleri.Siparis;
import OrtakSiniflar.Urun;
import java.sql.*;

public class UrunMapper implements IMapper{
	Urun KaydetUrun = new Urun();
	public Object get(int UrunNo){
		String sql = "SELECT * FROM Urun";
		Urun YeniUrun = new Urun();
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			Statement st = con.createStatement();
			ResultSet Sonuc = st.executeQuery(sql);
			while(Sonuc.next()){ 
				if(Sonuc.getInt("UrunNo") == UrunNo){
					YeniUrun.UrunNo = Sonuc.getInt("UrunNo");
					YeniUrun.UrunAdi = Sonuc.getString("UrunAdi");
					YeniUrun.UrunFiyati = Sonuc.getDouble("UrunFiyati");
					YeniUrun.UrunKalori = Sonuc.getInt("UrunKalori");
					YeniUrun.UrunKategorisi = Sonuc.getString("UrunKategorisi");
				}
			}
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return YeniUrun;
	}
	public void put(Object GelenNesne){
		String sql = "INSERT INTO Urun (UrunAdi,UrunFiyati,UrunKalori,UrunKategorisi)VALUES (?,?,?,?)";
		int sonuc;
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			PreparedStatement pst = con.prepareStatement(sql); 
			pst.setString(1,((Urun)GelenNesne).UrunAdi);
			pst.setDouble(2,((Urun)GelenNesne).UrunFiyati);
			pst.setInt(3,((Urun)GelenNesne).UrunKalori);
			pst.setString(4, ((Urun)GelenNesne).UrunKategorisi);
			sonuc = pst.executeUpdate();
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}	
	}
}
