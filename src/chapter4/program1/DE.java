package chapter4.program1;

import java.util.ArrayList;

public class DE {
    String companyName = "BT/DE固定";
    ArrayList<Eemploye> employees = new ArrayList<>();
    ArrayList<String> departments = new ArrayList<>();

    public DE() {
        departments.add("人事");
        departments.add("営業");
        departments.add("エンジニア");
    }
    
    private DE de;

    public void createEmployee(String name, String department) {
        Eemploye emp;
        if ("人事".equals(department)) {
            emp = new HumanResource(name, de);
        } else if ("営業".equals(department)) {
            emp = new Sales(name);
        } else if ("エンジニア".equals(department)) {
            emp = new Engineer(name, "Java");  
        } else {
            return;
        }
        employees.add(emp);
    }

    public void showAllEmployees() {
    	System.out.println("-----------社員------------");
        for (Eemploye emp : employees) {
            emp.showInfo();
            System.out.println("--------------------------");
        }
    }
}