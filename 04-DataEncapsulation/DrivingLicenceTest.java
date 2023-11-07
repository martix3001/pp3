public class DrivingLicenceTest {
    
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        
        dl.setName("Kazio");
        dl.setYear(2000);
        dl.setCategory("bezokularnik");
        dl.setCity("LOL");
        dl.setDriverAdress("neverland 1.0");
        dl.setPostCode("bruh");
        System.out.println(dl.toString());


    }
}
