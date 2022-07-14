// [BackJoon] 2884번 : 알람 시계
package conditionalSentence;

import java.util.Scanner;

public class AlarmClock {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        int h, m;

        h = s.nextInt();
        m = s.nextInt();

        if (m - 45 < 0){
            if (h == 0)
                h = 23;
            else
                h--;
            System.out.print(h + " " + (15 + m));
        }

        else
            System.out.print(h + " " + (m - 45));
    }
}
