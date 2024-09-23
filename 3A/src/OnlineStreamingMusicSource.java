public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Business logic methods
    public boolean isAdult() {
        return age >= 18;
    }

    public String getFullName() {
        return "Mr./Ms. " + name;
    }

    public void updateAddress(String newAddress) {
        // Additional logic for updating address
        this.address = newAddress;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
