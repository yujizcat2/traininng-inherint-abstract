package chapter4.program1;

public class Engineer extends Eemploye {
    String programmingLanguage;

    public Engineer(String name, String programmingLanguage) {
        super(name, "エンジニア");
        this.programmingLanguage = programmingLanguage;
    }

    public void develop() {
        System.out.println(programmingLanguage + "で開発を行なった");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("使用言語：" + programmingLanguage);
    }
}