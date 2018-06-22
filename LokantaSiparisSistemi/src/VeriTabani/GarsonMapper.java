package VeriTabani;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import Aktor.Garson;
public class GarsonMapper implements IMapper{
	Garson KaydetGarson = new Garson();
	public Object get(int GarsonID){
		return KaydetGarson;
	}
	public void put(Object GelenNesne){
		String sql = "INSERT INTO Sef (GarsonID,GarsonSifre,Ad,Soyad,Durum,Pozisyon)VALUES (?,?,?,?,?,?)";
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			PreparedStatement pst = con.prepareStatement(sql); 
			pst.setString(1,((Garson)GelenNesne).GarsonID);
			pst.setString(2,((Garson)GelenNesne).GarsonSifre);
			pst.setString(3,((Garson)GelenNesne).Ad);
			pst.setString(4, ((Garson)GelenNesne).Soyad);
			if(((Garson)GelenNesne).Durum){
				pst.setInt(5,1);
			}
			else{
				pst.setInt(5, 0);
			}
			pst.setString(6, ((Garson)GelenNesne).Pozisyon);
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
