public class User {
    private String name;

    public User(String name) {
    this.name = name;
}
    public static class Address {
        private String city;
        private String state;
        private String zipCode;

        public Address(String city, String state, String zipCode) {
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }
        public void displayAddress() {
            System.out.println("City: " + city + ", State: " + state + ", Zip Code: " + zipCode);
        }
    }
    public static void main(String[] args) {
        Address address = new Address ("New York", "NY", "10001");
        address.displayAddress();
    }
}