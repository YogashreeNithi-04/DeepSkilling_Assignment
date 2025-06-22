public class InvestmentProjection {

    
    public static double calculateFutureAmount(double principal, double annualRate, int timePeriod) {
        if (timePeriod == 0) {
            return principal;
        }
        return calculateFutureAmount(principal, annualRate, timePeriod - 1) * (1 + annualRate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0;  
        double interestRate = 0.08;      
        int duration = 5;                 

        double result = calculateFutureAmount(initialAmount, interestRate, duration);
        System.out.printf("Projected amount after %d years:%.2f\n", duration, result);
    }
}
