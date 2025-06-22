public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        
        generateNullPointerException();
        
        
        handleNullPointerException();
    }

    
    public static void generateNullPointerException() {
        String text = null; 
        
        
        int length = text.length(); 
        System.out.println("Length of text: " + length);
    }

    
    public static void handleNullPointerException() {
        String text = null; 
        
        try {
            
            int length = text.length(); 
            System.out.println("Length of text: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot access method on a null reference.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}
