import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //prompts user for a string
        System.out.println("Enter a string to be reversed: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();

        //reverses the inputted string
        String output = new String();
        output = reverse(inputString);
        
        //output printing
        System.out.print("Reversed string: ");
        System.out.println(output);
        
    
    
    }


    public static String reverse(String s){
        String outputString = new String();
        char temp;

        //iterates through input string 
        for(int i = s.length() - 1; i >= 0; i--){
            //gets char at current index
            temp = s.charAt(i);
            
           //adds current char to the output string
           outputString = outputString + temp;
        }

        return outputString;
    }
    

}
