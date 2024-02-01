public class BmiService {
    public double calculation(double weight, double height) {
        double weightIndex;
        weightIndex = weight / (height * height);
        return weightIndex;
    }
}
