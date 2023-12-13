package TaskMaster;

class Shop {
    int notecount = 50;

    public synchronized void sell(int notecount1) {
        if (notecount < notecount1) {
            System.out.println("Trying to sell");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        else {
            notecount-=notecount1;
            System.out.println("Done");
        }
    }

    public synchronized void exchange(int notecount3) {
            try {
                wait();
            } catch (Exception e) {
        }
        System.out.println("Exchange done successfully " + notecount3);
    }
    public synchronized void load(int notecount2){
        notecount+=notecount2;
        System.out.println("Add");
        notifyAll();
        System.out.println(notecount+" "+notecount2);
    }
}

class Inter_Thread {
    public static void main(String[]args){
        Shop s = new Shop();
        Thread t1 = new Thread(){
            public void run(){
                s.sell(100);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                s.load(100);
            }
        };
        Thread t3 = new Thread(){
            public void run(){
                s.exchange(100);
            }
        };
        t1.start();
        t3.start();
        t2.start();
    }
}
