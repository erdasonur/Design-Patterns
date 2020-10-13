public class SingletonPattern {
    public static void main(String[] args){

        //SingleObject s = new SingleObject();//Hata alinmaktadir
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }

}