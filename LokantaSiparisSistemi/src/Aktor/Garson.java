package Aktor;

public class Garson {
	public String GarsonID;
	public String GarsonSifre;
	public String Ad;
	public String Soyad;
	public boolean Durum;
	public String Pozisyon;
	public void GarsonEkle(String GarsonID,String GarsonSifre,String Ad,String Soyad,String Pozisyon){
		this.GarsonID = GarsonID;
		this.GarsonSifre = GarsonSifre;
		this.Ad = Ad;
		this.Soyad = Soyad;
		this.Pozisyon = Pozisyon;
		this.Durum = false;
	}
}
