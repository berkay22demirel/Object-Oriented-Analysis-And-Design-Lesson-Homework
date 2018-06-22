package MusteriIslemleri;
import java.util.ArrayList;

import VeriTabani.DBFacede;
import OrtakSiniflar.Urun;
public class Register {	
/////////Sipariþ Ýþlemleri Baþlangýç///////////
	Siparis YeniSiparis;
	Urun YeniUrun;
	public void SiparisIstegi(String MusteriID,int MusteriNo){
		YeniSiparis = new Siparis(MusteriID,MusteriNo);
	}
	public void UrunSec(int UrunNo,int Adet){
		YeniUrun = new Urun();
		DBFacede Kaydet = new DBFacede();
		YeniUrun = (Urun)Kaydet.get(UrunNo, YeniUrun);
		YeniSiparis.MakeSiparis(YeniUrun, Adet);
	}
	public void UrunSecimiBitirme(){
		YeniSiparis.UrunSecimiBitirme();
	}
	public void SiparisiTamamla(){
		DBFacede Kaydet = new DBFacede();
		Kaydet.put(YeniSiparis);
	}
	
	////////Urun Getirme///////////7
	public ArrayList UrunGetir(){
		DBFacede kaydet = new DBFacede();
		return kaydet.getHepsi();
	}
	
	/////////Hesap Ödeme Ýþlemleri Baþlangýç///////////
	HesapOde Hesap;
	Siparis Siparisler;
	public void HesapOdemeIstegi(int MusteriNo){
		DBFacede SiparisGetir = new DBFacede();
		Siparisler = new Siparis("deneme",0);
		Siparisler = (Siparis)SiparisGetir.get(MusteriNo,Siparisler);
		Hesap = new HesapOde();
		(Hesap.Siparisler).add(Siparisler);
		System.out.println(Siparisler.ToplamUcret);
		Hesap.MakeTutar(Siparisler.ToplamUcret);
	}
	public void Odeme(){	
		DBFacede HesapKaydet = new DBFacede();
		HesapKaydet.put(Hesap);
	}
	
}
