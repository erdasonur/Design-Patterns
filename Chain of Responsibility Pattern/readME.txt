Chain of Responsibility Pattern hiyerarşik bağımlılığı ele alan bir design patterndır. Örneğin bankaya gidip kredi çekmek istediğimizde bankacı bize maksimum
40000 tlye kadar verebilirken şefi 70000 tlye kadar verebilir. Benzer şekilde müdür 150000e kadar verebilirken genel müdür 500000e kadar verebilir. 
Bu gibi durumlarda chain of responsibility patternı kullanıyoruz. Öncelikle para çekme adında bir class oluşturup gerekli hesap bilgilerini alıyoruz. 
Sonrasında bir çalışan sınıfı oluşturup çalışan sınıfı altındaki somut sınıfları tanımlıyoruz. Bir sonraki işlemde bankacıya çekmek istenilen tutar gidiyor ve
eğer bankacı bu tutarı verebiliyorsa işlemi onaylanır ancak eğer bu tutarı veremiyorsa işlem bir üstüne gider.