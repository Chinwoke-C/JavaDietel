package Practizezz;


class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("toyota","2014",322.460);
        Car car2 = new Car("isuzu","2008", 464.367);
        car1.setPrice(-400.345);
        System.out.printf(" car1 price is %f%n",car1.getPrice());
        System.out.println();
        car2.setPrice(-700.423);
        System.out.printf("car2 price is %f%n",car2.getPrice());
        System.out.println();
        System.out.println("The price after applying the discount is: ");
        car1.setPrice(car1.getPrice() * (1 - 0.05));
        car2.setPrice(car1.getPrice() * (1 - 0.07));
        System.out.println();
        System.out.printf("new discount for car1 is %f",car1.getPrice());
        System.out.println();
        System.out.printf("new discount for car2 is %f",car2.getPrice());
    }



    }
