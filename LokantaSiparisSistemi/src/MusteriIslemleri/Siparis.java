package MusteriIslemleri;
import java.util.ArrayList;
import OrtakSiniflar.Urun;
public class Siparis {
	public String MusteriID;
	public int SiparisNo;
	public int MusteriNo;
	public double ToplamUcret;
	public String Durum;
	public ArrayList SatisLineItemListesi = new ArrayList();
	
	
	//Sipariþ Verme Ýþlemleri///
	public Siparis(String MusteriID,int MusteriNo){
		this.MusteriID = MusteriID;
		this.MusteriNo = MusteriNo;
		ToplamUcret = 0.0;
		Durum = "Beklemede";
	}
	public void MakeSiparis(Urun YeniUrun,int Adet){
		SatisLineItem sli = new SatisLineItem(YeniUrun,Adet);
		SatisLineItemListesi.add(sli);
		ToplamUcret = ToplamUcret +  (YeniUrun.UrunFiyati * Adet);
	}
	public void UrunSecimiBitirme(){
		
	}
}
