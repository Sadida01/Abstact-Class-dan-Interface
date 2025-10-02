package abstractClass;

public class SegiEmpat extends BangunDatar{
public int panjang, lebar;
@Override
public void hitungLuas(){
this.luas = panjang*lebar;
}
@Override
public void hitungKeliling(){
this.keliling = (2*panjang) + 2*lebar;
}
}