package medicine;

public class Main {
    public static void main (String [] args) {
        
        Medicine m[] = new Medicine[3];
        
        //current date calculated to: year: 2018 / Month: 3 / Day 5 
        //Any expiration date after the current date will give not Expired.
        m[0] = new Medicine(1,"panadol",15,3,2015,15,3,2017);
        m[1] = new Medicine(10,"revanen",20,10,2016,20,10,2018);
        m[2] = new Medicine(5,"panda",4,2,2017,4,2,2019);
        
        for (int med_count = 0; med_count < m.length; med_count++){
            System.out.println(m[med_count]);
        }
    }
}
