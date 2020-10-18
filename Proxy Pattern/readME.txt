Proxy Pattern var olan nesneye erişilmek istendiğinde vekil kalıp oluşturup nesne ile istemci arasına bir katman koyan bir yapısal design patterndir. 
Ara koyulan bu katman sayesinde istemci işlemi yapan sınıfla doğrudan iletişime geçmemiş olur. Yapılan örnekte ise gerçek bir resime doğrudan ulaşılmaz. 
Proxy sınıfı içerisinden bir nesne üretilir. Nesne ilk üretildiğinde diskten yüklenir ancak üretildikten sonra display fonksiyonu tekrar çağrıldığında 
nesne tekrardan oluşturulmaz. 