package homework.sixth;

import java.util.List;

public class Shoes {
    private String brand;
    private String color;
    private double price;

    public Shoes(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {
        Shoes firstItem = new Shoes("Nike", "White", 250.6);
        Shoes secondItem = new Shoes("Adidas", "Black", 175.9);
        Shoes thirdItem = new Shoes("New Balance", "Blue", 317.1);
        Shoes fourItem = new Shoes("Nike", "Blue", 299.9);
        final String colorToFilter = "Blue";
        final double priceToFilter = 250;
        List<Shoes> shoes = List.of(firstItem, secondItem, thirdItem, fourItem);

        shoes.forEach(System.out::println);

        List<Shoes> filterByColor = shoes.stream().filter(item -> item.getColor().equals(colorToFilter)).toList();
        System.out.println("Shoes with color " + colorToFilter + ": " + filterByColor);

        List<Shoes> filterByPrice = shoes.stream().filter(item -> item.getPrice() > priceToFilter).toList();
        System.out.println("Shoes with price more then " + priceToFilter + ": " + filterByPrice);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
