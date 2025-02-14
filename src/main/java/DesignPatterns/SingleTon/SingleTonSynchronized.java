package DesignPatterns.SingleTon;

public class SingleTonSynchronized {

// ekkada just we are using synchronized key word


//    he entire method is synchronized using synchronized in the method signature.
//    Every call to getInstance() is synchronized, meaning only one thread can execute this
//    method at a time.




    private static SingleTonSynchronized instance;

    private SingleTonSynchronized(){

    }

  //Note ekkada every thread nee lock chesi check chestunnam this is in efficiency

    public static synchronized SingleTonSynchronized getInstance(){
        if(instance==null){
            instance =new SingleTonSynchronized();
        }
        return instance;
    }

    public static void main(String[] args) {

        SingleTonSynchronized s1=new SingleTonSynchronized();
        System.out.println(s1.getInstance());
        SingleTonSynchronized s2= new SingleTonSynchronized();
        System.out.println(s2.getInstance());
    }

}
