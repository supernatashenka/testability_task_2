public class BmiService {
    public <kg, m> int calculate(double weight, double height) {
        double heightSquared = height * height;
        double index;
        index = weight / heightSquared;
        return (int) index;
    }
}
