package week3.ass;
public class StringReverser {
    public static String reverseString(String input) {
       
        if (input == null) {
            return "Invalid Input";
        }

        
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
       
        String input1 = "testleaf";
        String result1 = reverseString(input1);
        System.out.println(result1);

        
        String input2 = null;
        String result2 = reverseString(input2);
        System.out.println(result2); 
    }
}
