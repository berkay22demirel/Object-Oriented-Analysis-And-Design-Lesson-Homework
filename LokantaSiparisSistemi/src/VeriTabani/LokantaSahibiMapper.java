package VeriTabani;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Aktor.LokantaSahibi;
public class LokantaSahibiMapper implements IMapper{
	LokantaSahibi KaydetLokantaSahibi = new LokantaSahibi();
	public Object get(int LokantaSahibiID){
		return KaydetLokantaSahibi;
	}
	public void put(Object GelenNesne){
		String sql = "INSERT INTO LokantaSahibi (LokantaSahibiID,LokantaSahibiSifre,Ad,Soyad)VALUES (?,?,?,?)";
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			PreparedStatement pst = con.prepareStatement(sql); 
			pst.setString(1,((LokantaSahibi)GelenNesne).LokantaSahibiID);
			pst.setString(2,((LokantaSahibi)GelenNesne).LokantaSahibiSifre);
			pst.setString(3,((LokantaSahibi)GelenNesne).Ad);
			pst.setString(4, ((LokantaSahibi)GelenNesne).Soyad);
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
