package abstractClass;

public class Lingkaran extends BangunDatar{
    public int jariJari;
@Override
    public void hitungLuas(){
    this.luas = Math.PI*jariJari*jariJari;
}
@Override
    public void hitungKeliling(){
    this.keliling = 2*Math.PI*jariJari;
}
}