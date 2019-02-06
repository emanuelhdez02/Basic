public class Runner {

    public static void main(String[]args) {
        Car manny = new Car(2019, "Maserati",100, "GranTurismo" );
        Rectangle wanny = new Rectangle(50, 70);
        System.out.println(manny.toString());
        System.out.println(wanny.getArea());
        System.out.println(wanny.getDiagonal());
        System.out.print(wanny.isSquare());
    }
}
