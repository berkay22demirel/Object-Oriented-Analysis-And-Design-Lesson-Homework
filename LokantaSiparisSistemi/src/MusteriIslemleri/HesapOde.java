package MusteriIslemleri;
import java.util.*;
public class HesapOde {
	public int HesapNo;
	public String MusteriID;
	public String GarsonID;
	public double Tutar;
	public ArrayList Siparisler;
	public String Durum;
	public HesapOde(){
		 Siparisler = new ArrayList();
		 MusteriID = "berkay22";
		 GarsonID="aliosmanay";
		 Durum="Odenmemis";
	}
	public void MakeTutar(double Tutar){
		this.Tutar = Tutar;
	}
}
