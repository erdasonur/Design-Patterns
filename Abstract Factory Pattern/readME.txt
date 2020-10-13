Abstract Factory Pattern super-factory mantığında çalışıp yeni factoryler üreten bir design patterndir. 
Mantığı Factory Pattern ile aynıdır ancak super-factoryler dahil edilmektedir.
Örneğin Factory Patternde Shape Class'ı ile çalışırken Factory Class'ından obje türetiyorduk.
Abstract Factory Pattern için ise Shape üreten iki ayrı fabrika bulunmaktadır. Örneğin biri şekil üretirken
diğer fabrika yeşil kare üretsin. Bu fabrikaların kontrolü için ise Abstract bir sınıf tanımlıyoruz. 
Fabrikaları Abstract Class'tan FactoryProducer ile oluşturuyoruz. 
Oluşturulan bu fabrikalardan ise objeleri oluşturuyoruz.