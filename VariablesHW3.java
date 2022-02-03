public class VariablesHW3{
    public static void main(String[] args){
        int number = 5;
        int sum= number%2;

        System.out.println(number);
        System.out.println(
        sum == 0 && sum>=2  && sum <=5
        ?" Not cool "  
        : sum ==0 && sum>=6 && sum <= 20
        ?"Cool"
        : sum == 0 && sum > 20 
        ? "Not cool"
        : " Cool"  );
    }
}