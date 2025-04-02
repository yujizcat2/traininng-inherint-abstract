package chapter5.program1;

public class Main {
    public static void main(String[] args) {
        DE de = new DE();
        de.createEmployee("田中", "人事");
        de.createEmployee("佐藤", "営業");
        de.createEmployee("鈴木", "エンジニア");

        de.showAllEmployees();
        
        HumanResource hr = new HumanResource("田中",de);
        Sales sales = new Sales("白猫");
        Engineer suzuki = new Engineer("鈴木", "Java");

 
        hr.interview(); 
        sales.replyWeeklyReport();
        sales.arrangeMeeting(suzuki);
        suzuki.develop();
    }
}