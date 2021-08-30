package controller;


public class ThreadId extends Thread{

    private int idThread;

    public ThreadId (int idThread) {
        this.idThread = (int) this.getId();
    }
    @Override
    public void run() {
        System.out.println(idThread);
    }
}