public class BuilderPatternExample {
    public static void main(String[] args) {
        Araba araba = new Araba.Builder(12)
                .klima(true)
                .abs(true)
                .build();
        araba.bilgileriGoster();
    }
}
