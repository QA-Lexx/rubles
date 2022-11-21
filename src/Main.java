public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int addAmount = 1100;

        if (addAmount <= 1000) {
            System.out.println((initialAmount + addAmount) + " Сумма на вашем счете");
            System.out.println((0) + " Из них бонусных рублей");
        } else {
            System.out.println(((initialAmount + addAmount) + (1 * addAmount / 100)) + " Сумма на вашем счете");
            System.out.println((1 * addAmount / 100) + " Из них бонусных рублей");
        }

    }
}
