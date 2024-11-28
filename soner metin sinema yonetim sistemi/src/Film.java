public class Film extends BaseEntity {
    private String ad;
    private int sure;
    private String tur;

    public Film(int id, String ad, int sure, String tur) {
        super(id);
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public int getSure() {
        return sure;
    }

    public String getTur() {
        return tur;
    }

    @Override
    public String toString() {
        return "Film: " + ad + ", Süre: " + sure + " dakika, Tür: " + tur;
    }
}

