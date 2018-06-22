package OrtakSiniflar;

public class Urun {
	public int UrunNo;
	public String UrunAdi;
	public double UrunFiyati;
	public int UrunKalori;
	public String UrunKategorisi;
	public void UrunEkle(String UrunAdi,double UrunFiyati,int UrunKalori,String UrunKategorisi){
		this.UrunAdi = UrunAdi;
		this.UrunFiyati = UrunFiyati;
		this.UrunKalori = UrunKalori;
		this.UrunKategorisi = UrunKategorisi;
	}
	
}
