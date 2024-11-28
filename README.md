Bu ödevde, bir sinema salonu ve müşteri kayıt sistemi oluşturdum. Sistem, filmler, salonlar ve müşteriler arasında etkileşimi yönetiyor. Temel olarak, kullanıcıların belirli salonlarda filmleri izlemeye kaydolmalarını sağlayan bir yapı tasarladım.

Projede BaseEntity adlı bir sınıf ile tüm varlıklara (film, müşteri, salon) bir kimlik (ID) verdim. Bu sınıf, diğer sınıflara kalıtım yoluyla id özelliğini sağladı.

Film sınıfında, filmlerin adı, süresi ve türü gibi özellikleri belirledim. Ayrıca, her filmin bir ID'si olduğunu unutmadan BaseEntity sınıfını miras aldım. Bu sınıfın içinde filmin adını, süresini ve türünü döndüren metotlar ve toString metodu ile film bilgilerini daha okunabilir şekilde gösteren bir yapı oluşturdum.

Salon sınıfında ise, her bir salonun kapasitesi, adı ve içinde gösterilen film bilgilerini tutuyorum. Ayrıca, her salon için müşteri kaydı yapabilen bir mekanizma geliştirdim. Salonlar, kapasite dolmazsa müşteri kaydını alabiliyor, dolmuşsa ek müşteri alımını engelliyor.

Musteri sınıfında, her müşterinin adı, soyadı ve telefon numarasını sakladım. Bu sınıf da BaseEntity sınıfından türedi ve müşteri bilgilerini toString metodu ile ekranda gösterdim.

Main sınıfı, kullanıcıların interaktif olarak sisteme müşteri kaydını yapmalarını sağlayan ana program. Bu sınıfta, kullanıcıdan alınan müşteri bilgileriyle yeni bir müşteri oluşturuluyor, ardından kullanıcı bir salon seçiyor ve seçilen salona film izlemeye kaydediliyor. Kullanıcı, başka bir müşteri eklemek isteyip istemediğini soran bir döngüyle yönlendiriliyor.

Son olarak, sistemin sonunda, her salonun bilgileri ve o salona kaydolan müşterilerin listesi gösteriliyor.
