package My;

import java.util.Calendar;

import static java.util.Calendar.HOUR_OF_DAY;

/**
 * Created by Andrzej on 2017-07-28.
 */
public class Alarm implements Runnable {
    @Override
    public void run() {
        while(true){
            try {
                Calendar dateX = Calendar.getInstance();
                dateX.set(HOUR_OF_DAY, 17);
                dateX.set(Calendar.MINUTE, 16);
                Calendar currentData = Calendar.getInstance();

                if (dateX.get(HOUR_OF_DAY) == currentData.get(HOUR_OF_DAY)){
                    System.out.println("hours is true");
                    if (dateX.get(Calendar.MINUTE) == currentData.get(Calendar.MINUTE)) {
                        System.out.println("minutes is the same");
                        Mailer.SendingMassage();
                        break;
                    }
                }else{
                    System.out.println("try again");
                }

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
