package hackerrank.problemsolving;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Minal.Fulzele on 18/08/2018.
 */
public class PdfViewer {
    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

        Map<Character,Integer> alphabet = new HashMap<>();
        initialise(alphabet,h);
        char[] chars = word.toCharArray();
        int height;
        int max = 0;
        for(char ch : chars) {
            height = alphabet.get(ch);
            if(height>max) {
                max = height;
            }
        }
        return max*chars.length;
    }

    private static void initialise(Map<Character, Integer> alphabet,int[] height) {
        Character alpha;
        for(int i=1;i<=26;i++) {
            alpha = (char)(96 + i);
            alphabet.put(alpha,height[i-1]);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        System.out.println(result);
        scanner.close();
    }
}
