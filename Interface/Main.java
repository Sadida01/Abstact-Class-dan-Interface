package interface_;

public class Main {
    public static void main(String[] args) {
        SegiEmpat se = new SegiEmpat(5, 3);
        se.hitungLuas();
        se.hitungKeliling();

        Lingkaran l = new Lingkaran(7);
        l.hitungLuas();
        l.hitungKeliling();

        SegiTigaSamaKaki s = new SegiTigaSamaKaki(6, 4);
        s.hitungLuas();
        s.hitungKeliling();

        // contoh pemanggilan perbesar & perkecil
        se.perbesar();
        se.hitungLuas();
        se.hitungKeliling();

        l.perkecil();
        l.hitungLuas();
        l.hitungKeliling();
    }
}
