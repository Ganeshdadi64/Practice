package InterviewQuestions.CoreJava.Java8Features1;



public class FunctionalInterface {
    public static void main(String[] args) {
        MyFunctionalInter functionalInterface= ()-> System.out.println("hello");

        functionalInterface.sayHello();
    }

}
