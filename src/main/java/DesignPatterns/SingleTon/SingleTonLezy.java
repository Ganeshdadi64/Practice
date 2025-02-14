package DesignPatterns.SingleTon;

public class SingleTonLezy {


    //edhi lezy initialization eppudu avasaramo appude create avuthundhi
    //
    private static SingleTonLezy instance;

    private SingleTonLezy(){

    }

    public SingleTonLezy getInstance(){
        if(instance==null){
            instance=new SingleTonLezy();
        }
        return instance;
    }

    public static void main(String[] args) {

        SingleTonLezy s1=new SingleTonLezy();
        System.out.println(s1.getInstance());
        SingleTonLezy s2=new SingleTonLezy();
        System.out.println(s2.getInstance());


    }

}
