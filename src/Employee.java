public class Employee extends Person {

    private int wyplata;

    public Employee(String imie, String nazwisko, String miasto, int wyplata) {
        super(imie, nazwisko, miasto);
        this.wyplata = wyplata;
    }

    public Employee() {

    }


    public int getWyplata() {
        return wyplata;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }

    public void showInfo() {

        super.showInfo();
        System.out.println("Wypłata: " + getWyplata());
    }


}
