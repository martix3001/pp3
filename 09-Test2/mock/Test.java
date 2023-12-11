import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //1
        C1 c1 = new C1(3,4,2,6,6);
        System.out.println(c1.different());
        //2
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.println(C2.arr(arr1, arr2));
        //3
        Person p1 = new Person("Ann", 5);
        Person p2 = new Person("Buu", 20);
        Person[] fam = {p1,p2};
        C3 c3 = new C3(fam);
        System.out.println(c3.adults());
        //4
        Product pr1 = new Product("Apple", 3);
        Product pr3 = new Product("milk", 2);
        C4 c4 = new C4();
        c4.add(pr1);
        c4.add(pr3);
        System.out.println(c4.toString());
        System.out.println(c4.total());
        //5
        C5 cou1 = new C5(5);
        cou1.addN(5);
        System.out.println(cou1.getCounter());
        //6
        C6 cc6 = new C6(5, 110);
        System.out.println(Arrays.toString(cc6.spec()));
        //7
        String[] cit = {"Warszawa","Sopot","Kielce","Szczecin"};
        C7 c7 = new C7(cit);
        System.out.println(c7.filter('S').cities());
        
    }
}
