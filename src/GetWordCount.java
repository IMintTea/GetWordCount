import java.util.Scanner;


public class GetWordCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is you sentence");
        String Sentence = sc.nextLine();

        String[] words = Sentence.split(" ");
        System.out.println("The word count is " + words.length);

    }
}
//change