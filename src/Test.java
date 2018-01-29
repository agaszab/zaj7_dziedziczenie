public class Test {

    public static void main(String[] args) {

    Employee empl =new Employee("Jan", "Kowalski", "Wroc", 2030);
    Customer cust=new Customer("Tadeusz", "Nowak", "Warszawa", 4500);
    Director dir=new Director("Piotr", "Jankowski", "Wroc", 5400, 2000);
    Director dir1=new Director("Paweł", "Kot", "Wroc", 5400);


    empl.showInfo();
    System.out.println();
    cust.showInfo();
    System.out.println();
    dir.showInfo();

    System.out.println("Wypłata wraz z premią: "+dir.totalPayment());

    System.out.println();
    dir1.showInfo();


    }


}
