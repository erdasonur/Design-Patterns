Null Object Pattern null return etmek yerine istenilen değeri return etmeye yarayan bir design patterndır. Bu şekilde null yerine daha tutarlı değerler geri döner.
Açıkca bu patternin amacı null objeler return etmek yerine ilgili tipin yerine geçen ve expected value'nun null objesi olarak kabul edilen tipi geriye dönmektir.
Yapılan uygulamada bir isim dizisine sahip ve Customer üreten CustomerFactory sınıfınfan nesne üretmekteyiz. Verilen isimleri bulamadığı durumda null yerine bu isimde
bir müşteri bulunamamaktadır şeklinde mesaj döndürmektedir.