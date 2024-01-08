import java.util.ArrayList;

public class C4_Cities {
    private String[] cities;

    public C4_Cities(String[] cities) {
        this.cities = cities;
    }

    public C4_Cities filter(char c){
       ArrayList<String> fil = new ArrayList<String>();
        for (String city : cities) {
            if (city.charAt(0) == c) {
                fil.add(city);
            }
        }
        return new C4_Cities(fil.toArray(new String[0]));

    }
    public String cities() {
        return String.join("", cities);
    }

}
