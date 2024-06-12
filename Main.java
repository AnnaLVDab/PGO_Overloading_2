public class Main {
    public static void main(String[] args) {
        Address address = new Address("Polska", "Warszawa", "01-234", "Koszykowa", "123");
        System.out.println(address.createAddress("Polska"));
        System.out.println(address.createAddress("Polska", "Warszawa"));
        System.out.println(address.createAddress("Polska", "Warszawa", "01-234"));
        System.out.println(address.createAddress("Polska", "Warszawa", "01-234", "Koszykowa"));
        System.out.println(address.createAddress("Polska", "Warszawa", "01-234", "Koszykowa", "123"));
    }
}