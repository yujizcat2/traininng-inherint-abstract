package chapter4.program1;

public class Eemploye {
	String name;
    String department;

    public Eemploye(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void showInfo() {
        System.out.println(name + "：" + department);
    }

}
