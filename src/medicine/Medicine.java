package medicine;

public class Medicine extends Item {

    private int exp_day, exp_month, exp_year, pro_day, pro_month, pro_year;
    
    Date getExp = new Date();
    Date getProd = new Date();
    
    public Medicine(int ID, String name, int pro_day, int pro_month, int pro_year, int exp_day, int exp_month, int exp_year) {
        super(name, ID);
        this.exp_day = exp_day;
        this.exp_month = exp_month;
        this.exp_year = exp_year;
        this.pro_day = pro_day;
        this.pro_month = pro_month;
        this.pro_year = pro_year;
        this.getExp = new Date(exp_day, exp_month, exp_year);
        this.getProd = new Date(pro_day, pro_month, pro_year);
    }
    
    
    public boolean isExpired () {
        return exp_year < 2018 || (exp_year <= 2018 && exp_month < 3) || (exp_year <= 2018 && exp_month <= 3 && exp_day <= 5);
    }
    
    
    @Override
    public String toString() {
        String expired = (exp_year < 2018 || (exp_year <= 2018 && exp_month < 3) || (exp_year <= 2018 && exp_month <= 3 && exp_day <= 5)) ? "Already Expired" : "Not Expired" ;
        return "----(0)----\nMedicine: " + super.getName() + "      ID: " + super.getID() + "\nProduced: " + getProd + "\nExpires: " + getExp + "\n" + expired;
    }
    
}
