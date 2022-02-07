import java.util.Scanner;

class UserInputHW3{
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
    
       System.out.println("Enter a number  to be armstronged");
        int number = scan.nextInt();
        int temporary = number;
        int remainder = 0;
        int summation = 0;

        while (number > 0){

            remainder = number % 10;
            summation =summation+(remainder*remainder*remainder);
            number=number/10;

        }   
        if(temporary ==  summation){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
}
}
