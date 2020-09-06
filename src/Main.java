public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
        double weight = 53.2;
        double height = 1.58;
        double bmi = service.calculate (weight,height);
        System.out.println("Индекс Вашего тела: в пределах нормы " + bmi);
    }
}
