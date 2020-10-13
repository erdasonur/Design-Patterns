Builder Pattern en çok kullanılan design patternlardan biridir. 
Constructor içerisinde tanımlı değişkenlerin hepsine atama yapmamız gereken durumda tüm değişkenlere atama yapmaktan bizi kurtaran bir pattern.
Örneğin bir İnsan sınıfı düşünelim. Bir insanın onlarca özelliği vardır. İsim, soyisim, yaş gibi özelliklere sahiptir.
Eğer yalnızca isim veya yaş veya isim ve yaş girmek istiyorsak buna uygun onlarca Constructor yazıp fonksiyon overloading yapmalıyız.
Builder Pattern ile istediğimiz parametrelerle objeyi türetebiliriz. Ayrıca Builder classı bir inner classtır. 
Girilmesi kesin gereken bir değişken var ise tipi final olarak tanımlanıp builder Constructor içerisinde değer elde edilebilir.
