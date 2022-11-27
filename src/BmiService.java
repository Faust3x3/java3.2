public class BmiService {
    public double calculate(double growth, double weight) {
        double bmi = weight / (Math.pow(growth / 100, 2));
        return bmi;
    }
}
