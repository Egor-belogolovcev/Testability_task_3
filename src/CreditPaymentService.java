public class CreditPaymentService {
    int summ;
    double interestRate;
    int years;

    public CreditPaymentService(int summ, double interestRate, int years) {
        this.summ = summ;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double calculate() {
        double i = interestRate / ( 12 * 100 );
        int n = years * 12;
        double k = i * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1);
        double annuityPay = summ * k;
        // Формула расчета аннуитетного платежа (А) представляет собой следующее соотношение: А=К*(П/(1+П)-М-1),
        // где К – сумма кредита, П – процентная ставка, М – количество месяцев.
        return annuityPay;
    }
}
