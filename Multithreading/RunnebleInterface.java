
class myThread extends Thread{

    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}



public class RunnebleInterface{
    public static void main(String[] args){
        myThread t1 = new myThread();
        t1.run();
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}