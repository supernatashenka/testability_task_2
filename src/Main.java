public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(71, 1.61);
        System.out.println(bmi);

    }
}