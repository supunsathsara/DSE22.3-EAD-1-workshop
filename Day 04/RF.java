/*
 * A simple raffle draw game generates a six digit raffle draw number by every hour.
* a. Create a RaffleDraw java class and generate a method to generate a six digit
* random number. This random number should print the number against the
* timestamp as below.
* (6 Marks)
* [Date Time] - [Six digit random number]
* ( LocalDateTime.now() returns the date time string )
* b. Now convert the RaffleDraw class to a Thread class and make it generate the
* raffle draw number every one hour. (8 Marks)
*/

import java.time.LocalDateTime;
import java.util.Random;

class RaffleDraw extends Thread {

    @Override
    public void run() {

        while (true) {
            generateRandomNumber();

            try {
                /*
                 * 1s = 1000ms
                 * 1m = 60s
                 * 1h = 60m * 60  * 1000 ms
                 */
                Thread.sleep(1000 * 60 * 60); // 1 hour
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void generateRandomNumber() {

        double rnd = Math.random() * 1000000; // 0.0 <= rnd < 1.0
        int rndInt = (int) rnd;

        LocalDateTime now = LocalDateTime.now();
        //System.out.println(rndInt);

        // int raffleNumber = Random.nextInt(900000) + 100000; // Generates a random
        // 6-digit number | 899999 + 100000 = 999999

        //! Print the number against the timestamp as below.
        System.out.println(now + " - " + rndInt);
    }

}

public class RF {

    public static void main(String[] args) {

        RaffleDraw raffleDraw = new RaffleDraw();

        raffleDraw.setName("Raffle Draw");
        raffleDraw.setPriority(10);
        
        raffleDraw.start();
    }
}
