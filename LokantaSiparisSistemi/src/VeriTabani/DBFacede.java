package VeriTabani;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.*;

import MusteriIslemleri.HesapOde;

public class DBFacede{
	Map<Object,IMapper> Mappers = new HashMap<Object, IMapper>();
	SiparisMapper SiparisVeriTabani = new SiparisMapper();
	HesapMapper HesapVeriTabani = new HesapMapper();
	UrunMapper UrunVeriTabani = new UrunMapper();
	GarsonMapper GarsonVeriTabani = new GarsonMapper();
	SefMapper SefVeriTabani = new SefMapper();
	LokantaSahibiMapper LokantaSahibiVeriTabani = new LokantaSahibiMapper();
	public DBFacede(){
		Mappers.put((SiparisVeriTabani.KaydetSiparis).getClass(), SiparisVeriTabani);
		Mappers.put((HesapVeriTabani.KaydetHesap).getClass(), HesapVeriTabani);
		Mappers.put((UrunVeriTabani.KaydetUrun).getClass(), UrunVeriTabani);
		Mappers.put((GarsonVeriTabani.KaydetGarson).getClass(), GarsonVeriTabani);
		Mappers.put((SefVeriTabani.KaydetSef).getClass(), SefVeriTabani);
		Mappers.put((LokantaSahibiVeriTabani.KaydetLokantaSahibi).getClass(), LokantaSahibiVeriTabani);
	}
	public void VeriTabaniBaglantisi(){
		try{
			String Baglanti = "jdbc:mysql://localhost:3306/LokantaSiparisSistemiDatabase";
			String KullaniciAdi = "root";
			String Sifre = "1234";
			Connection con = DriverManager.getConnection(Baglanti,KullaniciAdi,Sifre);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void put(Object GelenNesne){
		IMapper mapper = Mappers.get(GelenNesne.getClass());
		mapper.put(GelenNesne);
	}
	public Object get(int No,Object GelenNesne){
		IMapper mapper = Mappers.get(GelenNesne.getClass());
		return mapper.get(No);
	}
	public ArrayList getHepsi(){
		UrunlerMapper urunler = new UrunlerMapper();
		return urunler.getHepsi();
	}
}