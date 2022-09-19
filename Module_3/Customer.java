package Module_3;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

    public Customer() {
        name = "Ryan Smith";
        address = "1234 Main Street";
        city = "Gotham";
        zip = "98765";
    }

    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String toString() {
        return "The customer's name is: " + name + "\n Their address is: " + address + 
        "\n The city they live in is: " + city + "\n Their zip code is: " + zip + ".";
    }
}
