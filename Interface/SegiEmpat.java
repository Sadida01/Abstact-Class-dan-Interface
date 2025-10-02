package interface_;

public class SegiEmpat extends BangunDatar implements Resizeable {
    int panjang;
    int lebar;

    public SegiEmpat(int p, int l) {
        panjang = p;
        lebar = l;
    }

    void hitungLuas() {
        luas = panjang * lebar;
        System.out.println("Luas Segi Empat: " + luas);
    }

    void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Segi Empat: " + keliling);
    }

    public void perbesar() {
        panjang += 2;
        lebar += 2;
    }

    public void perkecil() {
        panjang -= 2;
        lebar -= 2;
    }
}
