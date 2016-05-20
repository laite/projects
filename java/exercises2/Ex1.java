package exercises2;

import java.time.*;

public class Ex1 {
  public static void main (String[] args) {
    System.out.println("Calendar");

    final int FIRST_DAY_OF_WEEK = 0;
    final int MONTH = 11;
    final int YEAR = 2016;

    LocalDate date = LocalDate.of(YEAR, MONTH, 1);
    
    String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    for (int i = 0; i < 7; i++) {
      System.out.print(" " + days[(i + FIRST_DAY_OF_WEEK) % 7]);
    }
    System.out.println();

    int weekDayOfTheFirst = date.getDayOfWeek().getValue();
    for (int i = FIRST_DAY_OF_WEEK; (i % 7) != weekDayOfTheFirst; i++) {
      System.out.print("    ");
    }

    while (date.getMonthValue() == MONTH) {
      System.out.printf("%4d", date.getDayOfMonth());
      date = date.plusDays(1);

      if (date.getDayOfWeek().getValue() % 7 == FIRST_DAY_OF_WEEK) {
        System.out.println();
      }
    }

    System.out.println();
  }
}

