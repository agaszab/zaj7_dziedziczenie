public class Director extends Employee {

  private  int premia;

    public Director(String imie, String nazwisko, String miasto, int wyplata, int premia) {
        super(imie, nazwisko, miasto, wyplata);
        this.premia = premia;
    }

    public Director(String imie, String nazwisko, String miasto, int wyplata) {
        super(imie, nazwisko, miasto, wyplata);
        this.premia=0;
    }

    public Director(int premia) {
        this.premia = premia;
    }

    @Override
    public void showInfo(){

        super.showInfo();
        System.out.println("Premia: "+getPremia());
    }

    public int getPremia() {
        return premia;
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }

    public int totalPayment (){
        int suma=this.premia+super.getWyplata();
        return suma;
    }
}
