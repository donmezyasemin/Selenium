
# WARE HOUSE MANAGEMENT SYSTEM V-1.0 

![depo](https://github.com/mehmetdurankaya/warehouseproject/assets/44356848/e519b9f5-33fe-46a2-9cfa-12a4ee25e114)






 - CONTRACTS
   - IDescriptionAndLocation(Interface)
   - Location(Abstract)
   
 - CONTROLLER
   - EntryValidation
   

 - FRD
   - Task


 - INFO AND UML DIAGRAMS
   - Sunum dosyaları(Mark Down Documantation Files)


 - MODEL
   - ProductManager
   

 - PAGES
   - ExitPage(Çıkış ve Uğurlama)
   - HomePage(Anasayfa)
   - OutputProductPage(Ürün Çıkış)
   - ProductDefinePage(Ürün Tanımla)
   - ProductUpdatePage(Ürün Güncelle)
   - PutOnSelfPage    (Ürün rafa yerleştir)
   - ShowProductList  (Ürün Listele)


 - PRODUCT POJO
   - Product
   - ProductList


 - STYLE
   - Utils
   
 - Runner class
 
 - warehousemanagmentsystemv-1.0 Yukarıda belirtilen Classlar üzerine inşaa edilmiştir.
 
 
 ### contracts package 
   #### IDescriptionAndLocation Class(Interface) : 
   - pages package içerisindeki tüm classların implements ederek
   - sayfa açıklaması ve
   - sayfa ile ilgili bilgilendirme yapması zorunlu tutuldu.  
   ### Location Class (Abstract)                : 
   - pages package içerisindeki tüm classların Location class'ını inherit etmesi sağlandı 
   - lokasyon belirtmesi zorunlu tutuldu.
   - ayrıca bu class'ta ProductManager nesnesi uses-a ilişkisi kullanılarak inherit eden tüm classlarda 
   - ProductManager nesnesinin kullanılmasını zorunlu tuttu bundan amaç program içerisine bir ürün yönetim 
   - yetkilisi olmayanların, uygulamayı işletmesinin önüne geçmektir.
### controller package                             
   - EntryValidation Class                    :Kullanıcı girişlerinin kontrol edilmesini sağlayan Class olarak tasarlandı.
### model package
   - ProductManager Class                     :Ürünlere ait yapılacak iş ve işlemlerin yönetilmesini sağlayan Class olarak tasarlandı.  
### pages package  
   - ExitPage Class                           : Çıkış ve Uğurlama lokasyonu olarak tasarlandı.
   - HomePage Class                           : Ana sayfa ve ana menü  lokasyonu olarak tasarlandı
   - OutputProductPage Class                  : Ürün Çıkış lokasyonu olarak tasarlandı 
   - ProductDefinePage Class                  : Ürün Tanımlama lokasyonu olarak tasarlandı
   - ProductUpdatePage Class                  : Ürün Güncelleme lokasyonu olarak tasarlandı
   - PutOnSelfPage Class                      : Ürünü Rafa yerleştirme lokasyonu olarak tasarlandı.
   - ShowProductList Class                    : Ürünü Listeleme lokasyonu olarak tasarlandı.
#### Tüm page classlar Location class'ını inherite eder ve IDescriptionandLocation class'ını imlemente ederler.



### productpojo package
- Product Class           :Ürünün tanımlandığı pasif ve aktif özelliklerinin belirlendiği bir pojoclass olarak tasarlandı. ProductManager Class' tan inherit edildi.
- ProductList Class       :Listenin başlangıçta dolu gelmesini sağlayan bir class olarak tasarlandı.



### style package
- Utils Class            :
- Bir web sayfası mantığı ile hareket edilerek Static methodlar,
- pointer maniplasyonu,
- renk ayarları,
- output görsellik etkisi,
- listelerin ayarlanması
- gibi fonksiyonlari gerçekleştiren Class olarak tasarlandı.


- Runner Class            :Entrypoint program giriş bölümü main metodu olarak bu Class tasarlandı.



 # AMAÇ: 
 -   Bir depoda ürünün depoya giriş kaydının oluşturulması,
 -   Ürünün rafa yerleştirilmesi,
 -   Ürünün çıkış işlemlerinin yapılması,
 -   Ürünün güncellenmesi,
 -   Ürünün listelenmesi gibi işlemleri gerçekleştirir.
 
##### 1.1 Depo Giriş Kaydı: 
 - kullanıcı sadece ürünün adını, üreticisini ve birimini girer.
 - Ürün numarasını uygulamamız otomatik olarak verecektir.
 - Buradan amaç ürün numarası barkod numarası gibi tasarlanmıştır.
 - Hata yapılmasının önüne geçilmiştir.

 
##### 2.1 Ürünün Rafa Yerleştirilmesi:
 - Miktar güncelleme işleminin yapılıp yapılmayacağını uygulama kullanıcıya sorar.
 - Kullanici miktar güncellemek isterse
 - miktar güncelleme işlemi yaptırır ve otomatik olarak ürün numarasına göre
 - rafa yerleştirme işlemi gerçekleştirir. 

 - Algoritma çalışma mantığı;
 - a) Ürün numarasını 10' a bölüyor ve result variable'ına atama yapıyor resutlt=productId/10;
 - b) Result variable' ını tekrar 10'a bölüp kendisine atıyor. result/=10;
 - c) Örnek: productId=100  result=100/10  result/=10  result 1 e eşit olur ve 1. rafa yerleştirir.
 


 - 3.1 Ürün Çıkış İşlemleri: 
  - Miktar bilgisinin güncellenmesi ve raftaki ürünün durumu ile ilgili bigininin 
  - kullanıcıya aktarılması işlemi olarak tasarlandı. Çalışma mantığı;
  - a) Kullanıcıdan ürün numarası istenir.
  - b) Kullanıcıdan çıkış yapılacak ürün miktarı istenir.
  - c) Eğer çıkış yapılacak miktar raftaki miktardan fazla ise program uyarı verir.
    - Rafta yeteri kadar ürün olmadığını kullanıcıya bildirir.
    - Yeteri kadar ürün var ise raftaki ürün miktarından kullanıcının verdiği ürün miktarını çıkarıp 
    - raftaki ürün miktarını günceller,
    - raftaki ürünü kullanıcıya gösterir.
    - Eğer kullanıcının verdiği ürün miktarı raftaki ürün miktarına eşit ise
    - ozaman raftaki ürün miktarını günceller,
    - kullanıcıya rafta ürün kalmadğını bildirir ve ekrana gönderir.
 
 - 4.1  Ürünün Güncellenmesi:
 - Kullanıcı ürünü tanımlarken, miktar bilgisini girerken veya ürüne ait bilgi girişlerinde hata yapabilir.
 - Kullanıcı yaptığı hataları manuel olarak güncelleyebilsin, değiştirilebilsin 
 - mantığı ile ürünün tüm niteliklerine müdahale olanağı tanımlandı.
 
 - 5.1  Ürünün Listelenmesi: 
 - Ürünün bir zaman damgası ile ürüne ait field(alan) ları
 - header(başlık) body(gövde) ve footer(alt bölüm) den oluşan bir template dizayn edildi.
 - kullanıcının tabloya baktığında ürün ile ilgili bilgilerin tamamını göre bileceği bir liste olarak tasarlandı.
 
 ###  Bu application User Story yöntemi ile planlanmıştır. Bu proje; 
 #### Geliştirilebilir,
 #### Test edile bilir,
 #### Kolay anlaşılabilir,
 #### Entegre edilebilir

