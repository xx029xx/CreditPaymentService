public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // Сумма кредита
        int credit = 1_000_000;

        // Процентная ставка
        double creditRate = 9.99;

        // Срок кредита в годах
        int duration = 1;

        // Ежемесячный аннуитентный платёж
        double creditPayment = service.calculate(credit, creditRate, duration);

        String creditPaymentInteger = String.format("%.0f",creditPayment);
        System.out.println("Сумма кредита: " + credit + " руб.");
        System.out.println("Годовая процентная ставка: " + creditRate + " %.");
        System.out.println("Срок кредита: " + duration + " лет.");
        System.out.println("Сумма ежемесячного платежа: " + creditPaymentInteger + " руб.");
    }
}