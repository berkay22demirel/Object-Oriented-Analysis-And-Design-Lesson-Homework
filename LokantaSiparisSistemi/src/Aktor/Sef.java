package Aktor;

public class Sef {
	public String SefID;
	public String SefSifre;
	public String Ad;
	public String Soyad;
	public boolean Durum;
	public void SefEkle(String SefID,String SefSifre,String Ad,String Soyad){
		this.SefID = SefID;
		this.SefSifre = SefSifre;
		this.Ad = Ad;
		this.Soyad = Soyad;
		this.Durum = false;
	}
}
