package GenericMethod;

public class EsitAgirlik extends Aday{

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik) {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla() {

        return getMatematik()*5+getTurkce()*5+getFizik()+getEdebiyat()*4;
    }
}
