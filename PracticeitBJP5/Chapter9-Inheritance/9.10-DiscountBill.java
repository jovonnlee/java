public class DiscountBill extends GroceryBill {
    public boolean preferred;
    private double percent;
    public int discountItem;
    
    
    public DiscountBill(Employee clerk, boolean preferred){
        super(clerk);
        this.preferred=preferred;
        discountItem =0;
        percent= 0.0;
    }
    public int getDiscountCount(){
        return discountItem;
    }
    public double getDiscountAmount(){
        return percent;
    }
    public double getDiscountPercent(){
        return percent * 100/ super.getTotal();
    }
    public double getTotal(){
        return super.getTotal()-percent;
    }
    public void add(Item i){
        super.add(i);
        if (preferred && i.getDiscount()>0){
            discountItem++;
            percent +=i.getDiscount();
        }
    }
    
}