/*
 * A multithreading application has two threads which information mentioned below. You are 
*  required to write it to perform below mentioned tasks. (10 Marks)
*  Thread 1 :
*  Name : MinTemp
*  Priority : 2
*  Task : Read temperature values stored in an array and output 
*  minimum temperature value.

*  Thread 2 :
*  Name : MaxRain
*  Priority : 4
*  Task : Read rainfall values stored in an array and output 
*  maximum rainfall value
 */

class Thread1 extends Thread {
    int temp[] = { 5, 2, 8, 4, 1, 6, 7, 3, 9, 10 };

    @Override
    public void run() {
        int min = temp[0];// 2

        for (int i = 0; i < temp.length; i++) {

            if (temp[i] < min) {
                min = temp[i];
            }

        }

        System.out.println("Minimum temperature is " + min);
    }
}

class Thread2 extends Thread {
    int rain[] = { 5, 2, 8, 4, 1, 6, 7, 3, 9, 10 };

    @Override
    public void run() {
        int max = rain[0];// 10

        for (int i = 0; i < rain.length; i++) {
            if (rain[i] > max) {
                max = rain[i];
            }
        }

        System.out.println("Maximum rainfall is " + max);
    }
}

public class RainTempThread {
    public static void main(String[] args) {

        Thread1 minTemp = new Thread1();

        minTemp.setName("MinTemp");
        minTemp.setPriority(2);
        minTemp.start();

        Thread2 maxRain = new Thread2();
        maxRain.setName("MaxRain");
        maxRain.setPriority(4);
        maxRain.start();
        

        //minTemp.getName();
    }
}
