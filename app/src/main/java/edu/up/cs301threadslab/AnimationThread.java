package edu.up.cs301threadslab;

public class AnimationThread extends Thread {

    private AnimationView animationView;

    public AnimationThread(AnimationView animationView) {
        this.animationView = animationView;
    }

    @Override
    public void run() {
        for (;;) {
            animationView.postInvalidate();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
