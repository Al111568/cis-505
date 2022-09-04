public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.STOPPED);
        fan1.setOn(false);
        fan1.setRadius(6);
        fan1.setColor("white");

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(8);
        fan2.setColor("blue");
        fan2.setOn(true);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}