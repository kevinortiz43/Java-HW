import java.util.Scanner;
class UserInputHW1{
    public static void main(String args[]){


        System.out.println("enter any number");
        Scanner scan = new Scanner(System.in);
        int inum = scan.nextInt();
            int previous = 0;
            int current = 1; 
            int sum;
        
        for(int i=0; i<=inum; i++){
            sum = previous + current;
            previous = current;
            current = sum;
                    
            System.out.print(sum+",");
        }
    }
}


