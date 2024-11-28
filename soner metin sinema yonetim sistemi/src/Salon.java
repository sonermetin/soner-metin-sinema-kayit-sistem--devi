import java.util.ArrayList;
import java.util.List;

public class Salon {
    private int id;
    private String ad;
    private int kapasite;
    private Film film;
    private List<Musteri> musteriler;

    public Salon(int id, String ad, int kapasite) {
        this.id = id;
        this.ad = ad;
        this.kapasite = kapasite;
        this.musteriler = new ArrayList<>();
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Film getFilm() {
        return film;
    }

    public String getAd() {
        return ad;
    }

    public void musteriKaydet(Musteri musteri) {
        if (musteriler.size() < kapasite) {
            musteriler.add(musteri);
            System.out.println(musteri.getAd() + " " + musteri.getSoyad() + " salonun filmini izlemeye kaydoldu.");
        } else {
            System.out.println("Salon kapasitesi dolmuş.");
        }
    }

    public void bilgiGoster() {
        System.out.println("Salon Adı: " + ad);
        System.out.println("Kapasite: " + kapasite);
        System.out.println("Gösterilen Film: " + film);
        System.out.println("Kayıtlı Müşteriler:");
        for (Musteri musteri : musteriler) {
            System.out.println("Müşteri: " + musteri.getAd() + " " + musteri.getSoyad());
        }
    }

    public List<Musteri> getMusteriler() {
        return musteriler;
    }
}

