import CarParts.Engine;
import CarParts.SeatBelt;
import CarParts.Windscreen;

public class Program {
    public static void main(String[] args) {
        Car car = new Car(4,
                new SeatBelt("nhà Văn Chiến làm"),
                "đỏ",
                new Windscreen("kinh cường  lực "),
                new Engine("4 bánh"));

        Car carByBuilder = new CarBuilder()
                .addWheels(4)
                .addSeatBelts(new SeatBelt("Văn  chiến Seat Belt"))
                .addWindscreen(new Windscreen("Văn Chiến wind screen"))
                .addEngine(new Engine("Văn Chiến 4 bánh"))
                .paint("dỏ")
                .build();

        System.out.println(car.toString());
        System.out.println("------------------------------------");
        System.out.println(carByBuilder.toString());
    }
}
