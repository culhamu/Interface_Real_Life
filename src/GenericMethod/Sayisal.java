package GenericMethod;

public class Sayisal extends Aday{

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik) {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla() {

        return getMatematik()*5+getTurkce()*5+getFizik()*4+getEdebiyat();
    }
}
