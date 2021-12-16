public class Marketer extends Employee {
    public Marketer(){
        super.getSalary();
    }
    public double getSalary(){
        return super.baseSalary+10000;
    }
    public  void advertise(){
        System.out.print( "Act now, while supplies last!");
    }
    
}