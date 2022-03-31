package OPP;

import java.util.Scanner;

class Time {

   int h, m, s;
   int allt; // time sec translate

   public Time(int a, int b, int c) {
      h = a;
      m = b;
      s = c;
   } // time class 생성자

   public Time add(Time k) { // add method

      int addall = ((60 * 60 * h) + (60 * m) + s) + ((60 * 60 * k.h) + (60 * k.m) + k.s);

      int alls = addall % 60;
      int allm = (addall / 60) % 60;
      int allh = (addall / 60) / 60;

      Time nn1 = new Time(allh, allm, alls);
      return nn1;
   }

   public Time sub(Time k) { // sub method

      int allh, allm, alls, allt;
      allt = (60 * 60 * h) + (60 * m) + s;
      k.allt = (60 * 60 * k.h) + (60 * k.m) + k.s;

      if (allt >= k.allt) {

         int suball = allt - k.allt;

         alls = suball % 60;
         allm = (suball / 60) % 60;
         allh = (suball / 60) / 60;
      } else {

         int suball = k.allt - allt;

         alls = suball % 60;
         allm = (suball / 60) % 60;
         allh = (suball / 60) / 60;

      }

      Time nn2 = new Time(allh, allm, alls);
      return nn2;

   }

   public int compare(Time k) { // compare method

      allt = (60 * 60 * h) + (60 * m) + s;
      k.allt = (60 * 60 * k.h) + (60 * k.m) + k.s;

      if (allt < k.allt) {
         return 1;
      } else if (allt == k.allt) {
         return 0;
      } else {
         return -1;
      }

   }

   public void print(Time k) { // print method

      System.out.printf("%d시 %d분 %d초\n", h, m, s);
   }

}

public class timetime {

   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      int hour = in.nextInt();
      int min = in.nextInt();
      int sec = in.nextInt();

      Time first_time = new Time(10, 10, 10); // first time 객체생성
      Time second_time = new Time(hour, min, sec); // second time 객체생성 .. 생성자?

      Time add_time = first_time.add(second_time);
      Time sub_time = first_time.sub(second_time);

      System.out.println("두 시간 합은");
      add_time.print(add_time);

      System.out.println("두시간 차는");
      sub_time.print(sub_time);

      int result = first_time.compare(second_time);
      System.out.println(result);

   }

}