import static java.lang.StringTemplate.STR;

public class StringTemplate {

    public static void main(String[] args) {
        String name = "Joan";
        String info = STR."My name is \{name}";
        System.out.println(info);
    }
}
