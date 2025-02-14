package DesignPatterns.SingleTon;

public class SingleTonSynchronizeMethod {

    private static SingleTonSynchronizeMethod instance;

    private SingleTonSynchronizeMethod(){

    }


    // 2 times check chestunnam and anni threads nee lock cheyyamu instance null unnapudu matrame lock
    //chesi create chestam incase instance unte direct ga return chesestam faster and efficiency
    public static SingleTonSynchronizeMethod getInstance(){
        if(instance==null){
            synchronized (SingleTonSynchronizeMethod.class){
                if(instance==null){
                    instance=new SingleTonSynchronizeMethod();
                }

            }
        }
        return instance;
    }
}
