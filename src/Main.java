public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 62;
        double height = 1.62;
        double bmi = service.calculation(weight, height);
        System.out.println((int) bmi);
    }
}
