package LokantaSahibiIslemleri;
import Aktor.*;
import VeriTabani.DBFacede;
import OrtakSiniflar.Urun;
import java.util.*;

public class Register {
	public static void main(String[] args) {
		Register yeni = new Register();
		yeni.UrunBilgisiGirisiIstegi();
		yeni.UrunBilgisiGiris("Kola", 15.0, 150, "Icecekler");
		yeni.UrunGirisiBitirme();
	}
	
	/////////Ürün Giriþi Ýþlemleri Baþlangýç///////////
	Urun YeniUrun;
	Garson YeniGarson;
	LokantaSahibi YeniLokantaSahibi;
	Sef YeniSef;
	public void UrunBilgisiGirisiIstegi(){
		YeniUrun = new Urun();
	}
	public void UrunBilgisiGiris(String UrunAdi,double UrunFiyati,int UrunKalori,String UrunKategorisi){
		YeniUrun.UrunEkle(UrunAdi,UrunFiyati,UrunKalori,UrunKategorisi);
	}
	public void UrunGirisiBitirme(){
		DBFacede kaydet = new DBFacede();
		kaydet.put(YeniUrun);
	}
	/////////Ürün Giriþi Ýþlemleri Bitiþ///////////
	
	/////////Garson Ekleme Ýþlemleri Baþlangýç///////////
	public void GarsonEklemeIstegi(){
		YeniGarson = new Garson();
	}
	public void GarsonBilgisiGiris(String GarsonID,String GarsonSifre,String Ad,String Soyad,String Pozisyon){
		YeniGarson.GarsonEkle(GarsonID,GarsonSifre,Ad,Soyad,Pozisyon);
	}
	public void GarsonEklemeBitirme(){
		DBFacede kaydet = new DBFacede();
		kaydet.put(YeniGarson);
	}
	/////////Garson Ekleme Ýþlemleri Bitiþ///////////
	
	/////////Lokanta Sahibi Ekleme Ýþlemleri Baþlangýç///////////
	public void LokantaSahibiEklemeIstegi(){
		YeniLokantaSahibi = new LokantaSahibi();
	}
	public void LokantaSahibiBilgisiGiris(String LokantaSahibiID,String LokantaSahibiSifre,String Ad,String Soyad){
		YeniLokantaSahibi.LokantaSahibiEkle(LokantaSahibiID,LokantaSahibiSifre,Ad,Soyad);
	}
	public void LokantaSahibiEklemeBitirme(){
		DBFacede kaydet = new DBFacede();
		kaydet.put(YeniLokantaSahibi);
	}
	/////////Lokanta Sahibi Ekleme Ýþlemleri Bitiþ///////////
	
	/////////Þef Ekleme Ýþlemleri Baþlangýç///////////
	public void SefEklemeIstegi(){
		YeniSef = new Sef();
	}
	public void SefBilgisiGiris(String SefID,String SefSifre,String Ad,String Soyad){
		YeniSef.SefEkle(SefID,SefSifre,Ad,Soyad);
	}
	public void SefEklemeBitirme(){
		DBFacede kaydet = new DBFacede();
		kaydet.put(YeniSef);
	}
	/////////Þef Ekleme Ýþlemleri Bitiþ///////////
	
	
}
