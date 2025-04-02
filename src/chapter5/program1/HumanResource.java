package chapter5.program1;

public class HumanResource extends Eemploye {

    public HumanResource(String name, DE de) {
        super(name, "人事");
    }
    
    public void interview() {
        System.out.println("面接を行い、結果は〇〇（採用 or 不採用）だった");
    }


    public void calculateSalary() {
        System.out.println("給与計算を行なった");
    }
}