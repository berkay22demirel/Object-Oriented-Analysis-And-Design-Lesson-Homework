package MusteriIslemleri;
import OrtakSiniflar.Urun;
public class SatisLineItem {
	public int SatisLineItemNo;
	public Urun Item;
	public int Adet;
	public SatisLineItem(Urun urun,int Adet){
		Item = urun;
		this.Adet = Adet;
	}
}
