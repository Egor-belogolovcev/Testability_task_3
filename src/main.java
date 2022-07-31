public class main {
    public static void main(String[] args) {
        CreditPaymentService service1 = new CreditPaymentService(1_000_000,9.99,1);
        System.out.println(service1.calculate());

        CreditPaymentService service2 = new CreditPaymentService(1_000_000,9.99,2);
        System.out.println(service2.calculate());

        CreditPaymentService service3 = new CreditPaymentService(1_000_000,9.99,3);
        System.out.println(service3.calculate());
    }
}
