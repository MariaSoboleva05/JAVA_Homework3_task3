public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Миллион на год под 9,99% годовых:");
        System.out.println(service.calculate(1000000, 1, 9.99));

        System.out.println();
        System.out.println("Миллион на 2 года под 9,99% годовых:");
        System.out.println(service.calculate(1000000, 2, 9.99));

        System.out.println();
        System.out.println("Миллион на 3 года под 9,99% годовых:");
        System.out.println(service.calculate(1000000, 3, 9.99));


    }
}
