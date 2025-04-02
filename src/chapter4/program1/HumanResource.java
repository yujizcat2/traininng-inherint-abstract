package chapter4.program1;

public class HumanResource extends Eemploye {
	 private DE de;
    public HumanResource(String name, DE de) {
        super(name, "人事");
        this.de = de;
    }

    public void interview(String candidateName, String department) {
        boolean isHired = Math.random() > 0.5; 
        if (isHired) {
            System.out.println(candidateName + " " + department + " 面接を行い、結果は採用だった");
            de.createEmployee(candidateName, department);  // 创建新员工
        } else {
            System.out.println(candidateName + " " + department + " 面接を行い、結果は不採用だった");
        }
    }

    public void calculateSalary() {
        System.out.println("給与計算を行なった");
    }
}