import java.util.Scanner;

class UserInputHW3{
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
    
       System.out.println("Enter a number to Check if its an  armstrong number");
        int number = scan.nextInt();
        int temporary = number;
        int remainder = 0;
        int sum = 0;

        while (number > 0){

            remainder = number % 10;
            sum =sum+(remainder*remainder*remainder);
            number=number/10;

        }   
        if(temporary ==  sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
}
}
