package chapter4.program1;

public class Main {
    public static void main(String[] args) {
        DE de = new DE();
        HumanResource hr = new HumanResource("今存",de);

        hr.interview("山田", "営業");  
        hr.interview("山本", "エンジニア"); 
        hr.interview("大猫", "人事");  
        hr.interview("小猫", "エンジニア"); 


        de.showAllEmployees();
    }
}