public class Main {
    public static void main(String[] args) {

        int x = 100;

        int y = 1100;

        if(y <= 1000) {
            System.out.println((x + y) + " Сумма на вашем счете");
            System.out.println((0) + " Из них бонусных рублей");
        }

        if(y > 1000) {
            System.out.println(((x + y) + (1 * y / 100)) + " Сумма на вашем счете");
            System.out.println((1 * y / 100) + " Из них бонусных рублей");
        }

    }
}
