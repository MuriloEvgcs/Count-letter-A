import java.util.Scanner;

public class CountLetterA {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String sentence = scanner.nextLine();
        int countLowerCase = 0;
        int countUpperCase = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar == 'a') {
                countLowerCase++;
            } else if (currentChar == 'A') {
                countUpperCase++;
            }
        }

        int countTotal = countLowerCase + countUpperCase;

        if (countTotal > 0) {
            System.out.println("A letra 'A' aparece " + countTotal + " vezes, sendo " + countLowerCase + " minúscula e " + countUpperCase + " maiúscula.");
        } else {
            System.out.println("A letra 'A' não está presente na frase fornecida.");
        }
    }
}
