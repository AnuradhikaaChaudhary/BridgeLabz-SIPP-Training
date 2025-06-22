import java.util.Scanner;

public class WordsAndLengths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        
        String[] words = splitText(text);

        
        String[][] wordLengthArray = getWordLengthArray(words);

       
        System.out.println("\nWord\tLength");
        for (String[] entry : wordLengthArray) {
            int len = Integer.parseInt(entry[1]);
            System.out.println(entry[0] + "\t" + len);
        }

       
        int[] minMax = findMinMaxLengthWords(wordLengthArray);
        System.out.println("\nShortest word: " + wordLengthArray[minMax[0]][0]);
        System.out.println("Longest word: " + wordLengthArray[minMax[1]][0]);
    }

   
    public static String[] splitText(String text) {
        String[] temp = new String[100]; 
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                temp[wordCount++] = word;
                word = "";
            }
        }

       
        if (!word.equals("")) {
            temp[wordCount++] = word;
        }

        
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = temp[i];
        }

        return words;
    }

    
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            
        }
        return count;
    }

    
    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    
    public static int[] findMinMaxLengthWords(String[][] wordArray) {
        int minIndex = 0, maxIndex = 0;
        int minLength = Integer.parseInt(wordArray[0][1]);
        int maxLength = minLength;

        for (int i = 1; i < wordArray.length; i++) {
            int len = Integer.parseInt(wordArray[i][1]);
            if (len < minLength) {
                minLength = len;
                minIndex = i;
            }
            if (len > maxLength) {
                maxLength = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
}
