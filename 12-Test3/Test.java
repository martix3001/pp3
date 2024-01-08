import java.util.Arrays;

public class Test {
    
    public static void main(String[] args) {
        //1
        C1_Person p1 = new C1_Person("anna", "May");
        System.out.println(p1.f());
        //2
        boolean b2 = C2_Isogram.isogram("my BLUE water");
        System.out.println(b2);
        //3
        boolean arr1[] = {true,false,false};
        boolean arr2[] = {true,false,true,false};
        boolean arr3[] = {true,false,true,true,false,true,false,true,false};
        System.out.println(new C3_Logic(arr1).opposite());
        System.out.println(new C3_Logic(arr2).opposite());
        System.out.println(new C3_Logic(arr3).opposite());
        //4
        String[] arr= {"Warszawa", "Sopot", "Kielce", "Szczecin"};
        C4_Cities c4 = new C4_Cities(arr);

        String f4 = c4.filter('S').cities();
        System.out.println(f4);  // Output: "SopotSzczecin"
        //5

        //6
        int[] arr61 = {6,7,6,1,4};
        int[] arr62 = {2,5,2,8,4};
        System.out.println(new C6_Number(arr61).ok());
        System.out.println(new C6_Number(arr62).ok());
        //7
        C7_Product[] arr71 = 
        {
            new C7_Product("milk",5), 
            new C7_Product("cheese",2), 
            new C7_Product("ham",9)
         };
         
        System.out.println(arr71[0].getPrice()); 
        System.out.println(arr71[1].getPrice()); 
        System.out.println(arr71[2].getPrice()); 
        Arrays.sort(arr71);
        System.out.println(arr71[0].getPrice()); 
        System.out.println(arr71[1].getPrice()); 
        System.out.println(arr71[2].getPrice()); 


    }
}
