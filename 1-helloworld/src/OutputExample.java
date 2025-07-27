import java.util.Date;

public class OutputExample {
    public static void main(String[] args) {
        System.out.printf("1) Сегодня %tA",new Date());
        System.out.println();
        System.out.printf("2) Число ПИ равно -  %e!", 3.14159);
    }
}
