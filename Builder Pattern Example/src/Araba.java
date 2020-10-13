public class Araba {
    private final int yas;
    private boolean klima;
    private boolean ekran;
    private boolean abs;

    private Araba(Builder builder) {
        this.yas = builder.yas;
        this.klima = builder.klima;
        this.ekran = builder.ekran;
        this.abs = builder.abs;
    }
    public static class Builder {

        private final int yas;
        private boolean klima = false;
        private boolean ekran = false;
        private boolean abs = false;

        public Builder(int yas) {
            this.yas = yas;
        }

        public Builder klima(boolean klima) {
            this.klima = klima;
            return this;
        }

        public Builder ekran(boolean ekran) {
            this.ekran = ekran;
            return this;
        }

        public Builder abs(boolean abs) {
            this.abs = abs;
            return this;
        }

        public Araba build() {
            return new Araba(this);
        }
    }
    public void bilgileriGoster(){
        System.out.println("Yas : " + yas + " klima : " + klima + " ekran : " + " abs : " +abs);
    }
}