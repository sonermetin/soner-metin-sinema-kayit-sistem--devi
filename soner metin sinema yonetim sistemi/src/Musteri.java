public class Musteri extends BaseEntity {
    private String ad;
    private String soyad;
    private String telefon;

    public Musteri(int id, String ad, String soyad, String telefon) {
        super(id);
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        return "Müşteri: " + ad + " " + soyad + ", Telefon: " + telefon;
    }
}
