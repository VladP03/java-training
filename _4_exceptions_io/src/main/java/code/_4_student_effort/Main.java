package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    //challenge1();
    challenge2();
  }

  public static void challenge1() {
    Map<String, String> phoneBook = new HashMap<>();
    BufferedReader file;
    String[] phone;

    try {
      file = new BufferedReader(new FileReader("_test_files\\in\\phonebook.txt"));
      String line;

      while ((line = file.readLine())!= null) {
        phone = line.split(" ");
        phoneBook.put(phone[0],phone[1]);
      }

      System.out.println(phoneBook.get("Abbey"));
      System.out.println(phoneBook.get("Abdul"));

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void challenge2() {
    FileReader file;
    StringBuilder toShow = new StringBuilder();

    try {
      int c;
      file = new FileReader("_test_files\\in\\message.txt");

      while ( (c=file.read()) != -1 ) {
        if (c >= 65 && c <= 90) {
          if (c == 88) {    // X = 88
            toShow.append(" ");
          } else {
            toShow.append(Character.toChars(c));
          }
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(toShow);
  }

}
