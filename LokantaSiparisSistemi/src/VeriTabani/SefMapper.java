package VeriTabani;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import Aktor.Sef;
public class SefMapper implements IMapper{
	Sef KaydetSef = new Sef();
	public Object get(int SefID){
		return KaydetSef;
	}
	public void put(Object GelenNesne){
		String sql = "INSERT INTO Sef (SefID,SefSifre,Ad,Soyad,Durum)VALUES (?,?,?,?,?)";
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
			PreparedStatement pst = con.prepareStatement(sql); 
			pst.setString(1,((Sef)GelenNesne).SefID);
			pst.setString(2,((Sef)GelenNesne).SefSifre);
			pst.setString(3,((Sef)GelenNesne).Ad);
			pst.setString(4, ((Sef)GelenNesne).Soyad);
			if(((Sef)GelenNesne).Durum){
				pst.setInt(5,1);
			}
			else{
				pst.setInt(5, 0);
			}
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
