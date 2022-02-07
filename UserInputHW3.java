import java.util.Scanner;

class UserInputHW3{
    public static void main(String args[]){

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number  to be armstronged");
        String UserInput = scan.nextLine(); 
        int Digits = UserInput.length();
        int sum = 0;

        for(int i=0; i<Digits; i++){
        // System.out.println(UserInput.charAt(i));
           // this prints out the numbers seperaterly
            int number = Character.getNumericValue(UserInput.charAt(i));
            // System.out.println(number);
            int Check =  (int) Math.pow(number,Digits);
            sum = Check + sum;
            }
            System.out.println((Integer.parseInt(UserInput)==sum) ? UserInput + " is an armstrong number "
            : UserInput + " is not an armstrong number ");

    }
}

        // Character.getNumericValue(number.charAt(i));

        // int number = (int) UserInput.charAt(i);
        // this cast it from string to integers I get unicode back. must turn unicode back ro numbers
        
        //  this gives me the number from unicode

        // int sum = Math.pow(a,Digits) 
        // MAth.pow( once I get numbers seprated, digits)
        // this is how you raise a number to another number
        
        // System.out.println(numbers);

        // double a=30;
        // double b=2;
        // System.out.println(Math.pow(a,b));
        // System.out.println(Math.pow(a,b));


        //  153 ==  (1^3 + 5^3 + 5^3)
        //
        // step one take user input
        // - scanner
        //  step 2 check if its armostrong number
        //  -(153)
        // - (see how many digits are in each number .length())
        // for loop (for int i=0; i<UserInput.length; i++)
        // 
        // - (store that number of digits 
        //   int container = userinput.length)
        // 
        // - (seperate each number 
        //  userInput.substring() 
        //    userInput.charAt(i))
        //  charAt() 
        // casting to integer it gets unicode()
        //   Character.getNumericValue(number.charAt(i))
        // )
        // - exponent each seperate number to the amount of digits
        //  -
        // 153 
        // Math.pow(a,b)
        // Math.pow(index 0,Userinput.length) = a
        // Math.pow(index 1,Userinput.length) = b
        //  sum = a + b
        // if(userInput == sum) =true  
        // if(userInput == sum) = false

        // - compare that sum
        // to the initial value inputted
        // true = its armotrong
        // false its not armstrong 
        // n that is the sum
        // of its own digits 
        // each raised to the power
        // of the number of digits
        
        

