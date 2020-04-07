package edu.up.cs301threadslab;

import android.view.animation.Animation;

import java.util.Random;

public class RandomStarThread extends Thread {

    private StarAnimation starAnimation;
    private Random random = new Random();

    public RandomStarThread(StarAnimation starAnimation) {
            this.starAnimation = starAnimation;
    }

    @Override
    public void run() {
        for (;;) {
            int num = random.nextInt(1);

            if (num == 0) {
                starAnimation.addStar();
            } else {
                starAnimation.removeStar();
            }

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
