package threading.racing_cars;


import java.util.Random;

import static threading.racing_cars.Main.DISTANCE;
import static threading.racing_cars.Main.STEP;

public class Car implements Runnable {

    //Khai b�o t�n c?a xe ?ua
    private String name;

    public Car(String nane) {
        this.name = nane;
    }

    @Override
    public void run() {
        // Kh?i t?o ?i?m start(hay km ban ??u)
        int runDistance = 0;
        //kh?i t?o time b?t ??u cu?c ?ua
        long startTime = System.currentTimeMillis();

        //ki?m tra ch?ng n�o c�n xa ch?a k?t th�c qu?ng ???ng ?ua th� xe v?n ti?p t?c ch?y
        while (runDistance < DISTANCE) {
            try {
                //Random speed km/h
                int speed = (new Random()).nextInt(20);
                // Calculate qu?ng ???ng ?� ?i
                runDistance += speed;
                //X�y d?ng ?? h?a k?t qu?
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
