public class PangramChecker {
    public static void main(String[] args) {
    String input = "Java is a most popular object-oriented and it widely used programming language";
    boolean isPangram = checkIfPangram(input.toLowerCase());
    if (isPangram) {
    System.out.println("The input is a pangram.");
    } else {
    System.out.println("The input is not a pangram.");
    }
    }
    public static boolean checkIfPangram(String sentence) {
    boolean[] alphabetPresence = new boolean[26];
    int totalAlphabets = 0;
    for (char ch : sentence.toCharArray()) {
    if ('a' <= ch && ch <= 'z') {
    int index = ch - 'a';
    if (!alphabetPresence[index]) {
    alphabetPresence[index] = true;
    totalAlphabets++;
    }
    }
    }
    return totalAlphabets == 26;
    }
}
    
    // Output :- The input is not a pangram.