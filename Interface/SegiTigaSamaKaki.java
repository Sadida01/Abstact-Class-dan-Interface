
package interface_;

public class SegiTigaSamaKaki extends BangunDatar implements Resizeable {
    int alas;
    int tinggi;

    public SegiTigaSamaKaki(int a, int t) {
        alas = a;
        tinggi = t;
    }

    void hitungLuas() {
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga Sama Kaki: " + luas);
    }

    void hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow((alas / 2), 2) + Math.pow(tinggi, 2));
        keliling = alas + 2 * sisiMiring;
        System.out.println("Keliling Segitiga Sama Kaki: " + keliling);
    }

    public void perbesar() {
        alas += 2;
        tinggi += 2;
    }

    public void perkecil() {
        alas -= 2;
        tinggi -= 2;
    }
}
