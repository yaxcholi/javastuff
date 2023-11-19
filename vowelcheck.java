  import java.util.Scanner;

  public class vowelcheck {

      public static boolean isVowel(char ch) {
          char uppercaseChar = Character.toUpperCase(ch);
          return uppercaseChar == 'A' || uppercaseChar == 'E' || uppercaseChar == 'I' || uppercaseChar == 'O' || uppercaseChar == 'U';
      }

      public static void countVowels() {
          Scanner scanner = new Scanner(System.in);
          int vowelCount = 0;

          System.out.println("Enter characters (. to quit): ");

          char inputChar = ' ';

          while (inputChar != '.') {
              System.out.print("Enter a character (or '.' to quit): ");
              String userInput = scanner.next();

              if (!userInput.isEmpty()) {
                  inputChar = userInput.charAt(0);

                  if (isVowel(inputChar)) {
                      vowelCount++;
                  }
              }
          }

          System.out.println("Found " + vowelCount + " vowels.");
      }

      public static void main(String[] args) {
          countVowels();
      }
  }
