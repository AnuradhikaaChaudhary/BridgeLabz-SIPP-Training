import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitText(input);
        String[][] wordLengthPairs = getWordLengthArray(words);
        int[] minMax = findMinMaxLengthWords(wordLengthPairs);

        System.out.println("Shortest word: " + wordLengthPairs[minMax[0]][0]);
        System.out.println("Longest word: " + wordLengthPairs[minMax[1]][0]);
    }

    static String[] splitText(String text) {
        String[] temp = new String[100]; 
        int count = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                temp[count++] = word;
                word = "";
            }
        }
        if (!word.equals("")) {
            temp[count++] = word;
        }

        String[] result = new String[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }

    
    static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

   
    static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    
    static int[] findMinMaxLengthWords(String[][] wordArr) {
        int min = 0, max = 0;
        int minLen = Integer.parseInt(wordArr[0][1]);
        int maxLen = minLen;

        for (int i = 1; i < wordArr.length; i++) {
            int len = Integer.parseInt(wordArr[i][1]);
            if (len < minLen) {
                minLen = len;
                min = i;
            }
            if (len > maxLen) {
                maxLen = len;
                max = i;
            }
        }

        return new int[]{min, max};
    }
}
