public class DrivingLicence {
    private String name;
    private String driverAdress;
    private String postCode;
    private String city;
    private int  year;
    private String category;
    
    @Override
    public String toString() {
        return "DrivingLicence [name=" + name + ", driverAdress=" + driverAdress + ", postCode=" + postCode + ", city="
                + city + ", year=" + year + ", category=" + category + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String f = name.substring(0,1);
        String rest = name.substring(1);
        f = f.toUpperCase();
        rest = rest.toLowerCase();
        this.name = f+rest;
    }

    public String getDriverAdress() {
        return driverAdress;
    }

    public void setDriverAdress(String driverAdress) {
        this.driverAdress = driverAdress;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1800){
            this.year = year;
        }
        
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    

    

    
}