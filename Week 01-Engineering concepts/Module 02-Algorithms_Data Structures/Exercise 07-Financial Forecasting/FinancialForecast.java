import java.time.LocalDateTime;

public class FinancialForecast {
    private static final int CURRENT_YEAR = LocalDateTime.now().getYear();
    private double growthRate;

    public FinancialForecast(double growthRate) {
        this.growthRate = growthRate;
    }

    public void setGrowthRate(double growthRate) {
        if (growthRate < -100) {
            throw new IllegalArgumentException("Growth rate is too negative to be realistic.");
        }
        this.growthRate = growthRate;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public double recursiveForecast(int targetYear, double initialValue) {
        if (targetYear < CURRENT_YEAR) {
            throw new IllegalArgumentException("Target year must be the current year or a future year.");
        }
        if (initialValue < 0) {
            throw new IllegalArgumentException("Initial value cannot be negative.");
        }
        return recursiveForecast(targetYear, initialValue, this.growthRate);
    }
    /**
     * Recursively forecasts the value for a target year based on an initial value and a growth rate.
     *
     * @param targetYear   The year for which the forecast is made.
     * @param initialValue The initial value at the current year.
     * @param growthRate   The annual growth rate in percentage.
     * @return The forecasted value for the target year.
     */
    public static double recursiveForecast(int targetYear, double initialValue, double growthRate) {
        if (targetYear <= CURRENT_YEAR) {
            return initialValue;
        }
        return recursiveForecast(targetYear - 1, initialValue, growthRate) * (1 + growthRate / 100);
    }
}
