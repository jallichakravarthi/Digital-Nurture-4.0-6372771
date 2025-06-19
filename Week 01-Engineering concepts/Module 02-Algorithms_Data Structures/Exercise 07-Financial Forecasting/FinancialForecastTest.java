public class FinancialForecastTest {
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast(7.5);

        double initialInvestment = 10000.0;
        int targetYear = 2050;

        try {
            double futureValue = forecast.recursiveForecast(targetYear, initialInvestment);
            System.out.printf("Forecasted value in %d for an initial investment of ₹%.2f at %.2f%% annual growth: ₹%.2f%n",
                    targetYear, initialInvestment, forecast.getGrowthRate(), futureValue);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Trying negative growth rate
        try {
            forecast.setGrowthRate(-110);  // Invalid rate
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid growth rate test passed: " + e.getMessage());
        }

        // Trying past year
        try {
            forecast.recursiveForecast(2000, initialInvestment);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year test passed: " + e.getMessage());
        }

        // Trying negative initial value
        try {
            forecast.recursiveForecast(targetYear, -5000);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid initial value test passed: " + e.getMessage());
        }
    }
}
