package exercises2;

import java.time.*;
import static java.time.LocalDate.*;
import static java.lang.System.*;

public class Ex11 {
  public static void main (String[] args) {
    out.println("Calendar");

    final int FIRST_DAY_OF_WEEK = 0;
    final int MONTH = 11;
    final int YEAR = 2016;

    LocalDate date = of(YEAR, MONTH, 1);
    
    String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    for (int i = 0; i < 7; i++) {
      out.print(" " + days[(i + FIRST_DAY_OF_WEEK) % 7]);
    }
    out.println();

    int weekDayOfTheFirst = date.getDayOfWeek().getValue();
    for (int i = FIRST_DAY_OF_WEEK; (i % 7) != weekDayOfTheFirst; i++) {
      out.print("    ");
    }

    while (date.getMonthValue() == MONTH) {
      out.printf("%4d", date.getDayOfMonth());
      date = date.plusDays(1);

      if (date.getDayOfWeek().getValue() % 7 == FIRST_DAY_OF_WEEK) {
        out.println();
      }
    }

    out.println();
  }
}

