package interface_;

public class Lingkaran extends BangunDatar implements Resizeable {
    int jariJari;

    public Lingkaran(int r) {
        jariJari = r;
    }

    void hitungLuas() {
        luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
    }

    void hitungKeliling() {
        keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    public void perbesar() {
        jariJari += 2;
    }

    public void perkecil() {
        jariJari -= 2;
    }
}
