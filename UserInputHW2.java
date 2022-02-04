import java.util.Scanner;
class UserInputHW2{
    public static void main(String args[]){

        System.out.println(" Enter a word to be checks as a palindrome: ");
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine().toLowerCase();
        Boolean palindrome = false; 

        for(int i=1; i<userInput.length(); i++){

            if(userInput.charAt(i-1) == userInput.charAt(userInput.length()-i)){
                palindrome = true;
                System.out.println(userInput + " is a palindrome " );
                break;
            } else{
                palindrome=false;
                System.out.println(userInput + " is not a palindrome. ");
            }
        }

    }
}