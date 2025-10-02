package abstractClass;

public class SegiTigaSamaKaki extends BangunDatar{
    public int alas,tinggi;
    @Override
    public void hitungLuas(){
        this.luas=0.5*alas*tinggi;
    }
    @Override
    public void hitungKeliling(){
        double simir =
                Math.sqrt(Math.pow((0.5*alas),2)+
                        Math.pow(tinggi,2));
        this.keliling=(2*simir)+alas;
    }
}