Flyweight pattern aynı objeyi tekrar oluşturmanın önüne geçip bellek tüketimini optimize etmek amacıyla kullanılan bir design patterndir.
Havuz mantığı içeren bu pattern bir kez üretilen objenin yeniden kullanılmasını sağlayarak performans artışını sağlar. Hashmap kullanarak oluşan nesneleri tutan bir havuz elde edebiliriz.
Projede renklerine göre üretilen şekiller mevcuttur. Örneğin siyah şekil objesi üretildiğinde havuzda tutulur ve yeni bir siyah şekil objesi türetilmek istenildiğinde havuzdaki objeyi kullanır.
