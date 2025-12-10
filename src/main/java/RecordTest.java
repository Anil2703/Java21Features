public class RecordTest {

    public record Employee(String name, int age) {

        public String appendTitle(String title) {
            return title + name;
        }
    }


    public static void main(String[] args) {

        Employee emp = new Employee("Anil", 30);
        System.out.println(emp.name());
        System.out.println(emp.appendTitle("Mr."));

    }
}
