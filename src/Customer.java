public class Customer extends Person {


    private int wydatki;

    public Customer(String imie, String nazwisko, String miasto, int wydatki) {
        super(imie, nazwisko, miasto);
        this.wydatki = wydatki;
    }



    public Customer(int wydatki) {
        this.wydatki = wydatki;
    }

    public Customer() {

    }


    public int getWydatki() {
        return wydatki;
    }


    public void setWydatki(int wydatki) {
        this.wydatki = wydatki;
    }

    public void showInfo(){

        super.showInfo();
        System.out.println("Wydatki: "+getWydatki());
    }
}
