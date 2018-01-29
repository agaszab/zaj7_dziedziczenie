public class Person {

    private String imie;
    private String nazwisko;
    private String miasto;

    public Person(String imie, String nazwisko, String miasto) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
    }

    public Person() {

    }

    public void showInfo(){

        System.out.println("Imię: "+getImie());
        System.out.println("Nazwisko: "+getNazwisko());
        System.out.println("Miato: "+getMiasto());

    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
}
