package cn.aup.juc.thread.printabc;

public class Main {
    static int i = 0;
    static Word s = new Word("A");

    public static void main(String[] args) {
        //A线程
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (i < 100) {
                    synchronized (s) {
                        if (s.getS().equals("B")) {
                            try {
                                s.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.out.println(s.getS());
                            s.setS("B");
                            i++;
                            s.notify();
                        }
                    }
                }
            }
        });
        //B线程
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (i < 100) {
                    synchronized (s) {
                        if (s.getS().equals("A")) {
                            try {
                                s.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.out.println(s.getS());
                            s.setS("A");
                            i++;
                            s.notify();
                        }
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }

    static class Word {
        String s;

        public Word(String a) {
            s = a;
        }

        public String getS() {
            return s;
        }

        public void setS(String a) {
            s = a;
        }
    }
}
