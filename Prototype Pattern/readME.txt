Prototype Pattern kaynak kullanımı çok olan objelerin tekrar üretilmesi yerine klonlanmasını ele alan bir design patterndir.
Prototype Pattern kullanılmasının amacı üretilen nesnenin çok kaynak tüketimini engellenmeye çalışmaktır.
Yazılan sınıf, Clone sınıfından kalıtım alır. Alınan kalıtım ile Clone sınıfındaki clone fonksiyonu override edilir.
Mainde yeni bir obje oluşturmadan klonlama işlemi yapılır.