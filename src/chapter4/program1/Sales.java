package chapter4.program1;

public class Sales extends Eemploye {
    public Sales(String name) {
        super(name, "営業");
    }

    public void replyWeeklyReport() {
        System.out.println("週報の返信をした");
    }

    public void arrangeMeeting(Engineer engineer) {
        System.out.println(engineer.name + "の面談を組んだ");
    }

    public void haveMeeting() {
        System.out.println("新規の打ち合わせをした");
    }
}
