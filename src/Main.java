public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(180, 75.5);
        System.out.printf("Ваш ИМТ равен %.2f", result);
    }
}