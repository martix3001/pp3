public class Temperatures {

    static double CetoKe(double temp){

        return temp + 273.15;
    }
    static double KetoCe(double temp){
        return temp - 273.15;
    }
    static double CetoFa(double temp){

        return (temp * 1.8)+32;
    }
    static double FatoCe(double temp){

        return (temp - 32)*5.0/9.0;
    }
    static double FatoK(double temp){
        // K = (F − 32) × 5 ⁄ 9 + 273.15
         return (temp - 32)*5.0/9.0 + 273.15;
    }
    static double KetoFa(double temp){
        //°F = (K − 273.15) × 1.8 + 32
         return (temp -273.15)*1.8 + 32;
    }
   public static void main(String[] args) {
        //a
        System.out.println(CetoFa(25)+" "+CetoKe(25));
        //b
        System.out.println(FatoCe(100)+" "+FatoK(100));
        //c
        System.out.println(KetoCe(0)+" "+KetoFa(0));
   }
}
