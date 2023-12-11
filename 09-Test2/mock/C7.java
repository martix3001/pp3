import java.util.ArrayList;

public class C7 {
    private String[] cities;

    public C7(String[] cities) {
        this.cities = cities;
    }

    public C7 filter(char c){
       ArrayList<String> fil = new ArrayList<String>();
        for (String city : cities) {
            if (city.charAt(0) == c) {
                fil.add(city);
            }
        }
        return new C7(fil.toArray(new String[0]));

    }
    public String cities() {
        return String.join("", cities);
    }

}

