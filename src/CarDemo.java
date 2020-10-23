public class CarDemo {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();

        car1.model = "Renault";
        car1.year = 2015;
        car1.price = 130000;

        car2.model = "Audi";
        car2.year = 2018;
        car2.price = 420000;

        System.out.println("Märke: " + car1.model + "\nÅrsmodell: " + car1.year + "\nPris: " + car1.price );
        System.out.println("");
        System.out.println("Märket är: " + car2.model + "\nÅrsmodell: " + car2.year + "\nPris: " + car2.price );
    }
}
