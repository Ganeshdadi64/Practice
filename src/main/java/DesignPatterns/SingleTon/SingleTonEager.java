package DesignPatterns.SingleTon;

public class SingleTonEager {


    //ekkada method instance nee return cheyyadaniki mundhe instace create ipoindhi
    // this is Eager initialization

    private static SingleTonEager instance = new SingleTonEager();

    private SingleTonEager(){

    }
    public SingleTonEager getInstance(){
        return instance;
    }


    public static void main(String[] args) {
        SingleTonEager s=new SingleTonEager();
        System.out.println(s.getInstance());
        SingleTonEager s1=new SingleTonEager();
        System.out.println(s1.getInstance());
        //s and s1 both are same
    }



}
