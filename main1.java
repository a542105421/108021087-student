public class main1 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.setName("BOB");
        student1.setID("87879487");
        student1.setGender("male");
        System.out.println(student1.getName());
        System.out.println(student1.getID());
        System.out.println(student1.getGender());
    }
}