public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Learning Java!");

        System.out.println("Original String: " + sb);

        sb.deleteCharAt(8); 
        System.out.println("After deleting character at index 8: " + sb);

        sb.delete(9, 13); 
        System.out.println("After deleting characters from index 9 to 13: " + sb);

        String modifiedString = sb.toString();
        System.out.println("Final Modified String: " + modifiedString);
    }
}
