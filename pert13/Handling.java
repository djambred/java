public class Handling {
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            //berdasarkan array 0,1,2 jika lebih dari itu maka akan balikan error
            System.out.println(myNumbers[3]); 
        } catch (Exception e) {
            System.out.println("Error Not in Array List");
        }
    }
}