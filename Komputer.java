public class Komputer {
	 public int prosesor;
	 public int memori;
	 public int storage;

	public Komputer() {
		prosesor = 500;
		System.out.println ("Kecepatan Prosesor Komputer: "+prosesor);
	}
}  

class Notebook07 extends Komputer {
	public int baterai;
	public Notebook07(int p, int m, int s, int b) {
		prosesor = p;
		memori = m;
		storage = s;
		baterai = b;
	}
	public void CetakSpesifikasi() {
		System.out.println("Kecepatan Prosesor Notebook: "+prosesor);
		System.out.println("Kapasitas Memori: "+memori);
		System.out.println("Kapasitas Storage: "+storage);
		System.out.println("Kapasitas Baterai: "+baterai+"\n");
	}
	public void Overclock(int k){
		int kecepatan = k;
		System.out.println("Notebook dioverclock dengan kecepatan prosesor "+kecepatan);
	}
}  