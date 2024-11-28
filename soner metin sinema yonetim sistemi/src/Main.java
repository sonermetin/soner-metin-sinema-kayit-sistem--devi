import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Film film1 = new Film(1, "Avengers", 150, "Aksiyon");
        Film film2 = new Film(2, "Titanic", 195, "Romantik");
        Film film3 = new Film(3, "Inception", 148, "Bilim Kurgu");
        Film film4 = new Film(4, "The Dark Knight", 152, "Aksiyon");
        Film film5 = new Film(5, "Forrest Gump", 142, "Dram");

        Salon salon1 = new Salon(1, "Salon 1", 100);
        Salon salon2 = new Salon(2, "Salon 2", 80);
        Salon salon3 = new Salon(3, "Salon 3", 150);
        Salon salon4 = new Salon(4, "Salon 4", 120);
        Salon salon5 = new Salon(5, "Salon 5", 90);

        salon1.setFilm(film1);
        salon2.setFilm(film2);
        salon3.setFilm(film3);
        salon4.setFilm(film4);
        salon5.setFilm(film5);

        List<Salon> salonlar = new ArrayList<>();
        salonlar.add(salon1);
        salonlar.add(salon2);
        salonlar.add(salon3);
        salonlar.add(salon4);
        salonlar.add(salon5);

        List<Musteri> musteriler = new ArrayList<>();

        System.out.println("Film ve Salon Ekleme Sistemi");

        while (true) {
            System.out.print("\nMüşteri adı: ");
            String musteriAdi = scanner.nextLine();
            System.out.print("Müşteri soyadı: ");
            String musteriSoyadi = scanner.nextLine();
            System.out.print("Telefon numarası: ");
            String telefon = scanner.nextLine();

            Musteri yeniMusteri = new Musteri(musteriler.size() + 1, musteriAdi, musteriSoyadi, telefon);
            musteriler.add(yeniMusteri);

            System.out.println("Müşteri kaydedildi: " + yeniMusteri.getAd() + " " + yeniMusteri.getSoyad());

            System.out.println("\nSalonlar:");
            for (int i = 0; i < salonlar.size(); i++) {
                Salon salon = salonlar.get(i);
                System.out.println(i + 1 + ". " + salon.getAd() + " - Gösterilen Film: " + salon.getFilm().toString());
            }
            System.out.print("Bir salon seçin (1-5): ");
            int salonSecimi = scanner.nextInt();
            scanner.nextLine();

            Salon secilenSalon = salonlar.get(salonSecimi - 1);
            Film secilenFilm = secilenSalon.getFilm();

            System.out.println("\nSeçilen Film: " + secilenFilm.toString());
            secilenSalon.musteriKaydet(yeniMusteri);

            System.out.println("\n--- Salon Bilgileri ---");
            secilenSalon.bilgiGoster();

            System.out.print("\nBaşka bir müşteri eklemek ister misiniz? (Evet/Hayır): ");
            String cevap = scanner.nextLine();
            if (cevap.equalsIgnoreCase("Hayır")) {
                break;
            }
        }

        System.out.println("\n--- Tüm Müşteriler ve Kaydettikleri Filmler ---");
        for (Salon salon : salonlar) {
            System.out.println("\n" + salon.getAd() + " - Gösterilen Film: " + salon.getFilm().toString());
            System.out.println("Kayıtlı Müşteriler:");
            for (Musteri musteri : salon.getMusteriler()) {
                System.out.println(musteri.getAd() + " " + musteri.getSoyad() + " - " + salon.getFilm().getAd());
            }
        }
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
