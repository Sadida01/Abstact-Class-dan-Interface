package abstractClass;

public class Main {
    public static void main(String[] argv) {
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas STSK = "+stsk.luas);
        System.out.println("Keliling STSK = "+
                stsk.keliling);
}
}