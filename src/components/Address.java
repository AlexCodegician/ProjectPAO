package components;

public class Address {
    static long addressCounter = 0;

    private String country, county, city, street;
    private Integer block, floor, appartmentNumber;

    public Address(String country, String county, String city, String street, Integer block, Integer floor, Integer appartmentNumber) {
        addressCounter += 1;
        this.country = country;
        this.county = county;
        this.city = city;
        this.street = street;
        this.block = block;
        this.floor = floor;
        this.appartmentNumber = appartmentNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getAppartmentNumber() {
        return appartmentNumber;
    }

    public void setAppartmentNumber(Integer appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }

    public void showAddress() {
        String info = "Country: " + this.country + "\r\n" +
                      "County: " + this.county + "\r\n" +
                      "City: " + this.city + "\r\n" +
                      "Street: " + this.street + "\r\n" +
                      "Block: " + this.block + "\r\n" +
                      "Floor: " + this.floor + "\r\n" +
                      "appartmentNumber" + this.appartmentNumber + "\r\n";

        System.out.println(info);
    }
}
