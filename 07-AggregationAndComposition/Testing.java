public class Testing {
    public static void main(String[] args) {
        
        Folder f1 = new Folder("NowyFolder", 1,"C:/Pulpit");
        f1.addFile("Nowy Dokumet Tekstowy", 6,"hehe1");
        System.out.println(f1.toString());
        f1.deleteFile();
        System.out.println(f1.toString());
        f1.addFile("Nowy Dokumet Tekstowy2", 6,"heheeheh2");
        System.out.println(f1.toString());
        System.out.println("Zawartość pliku: "+f1.getFile().getFileContent());

    }
}
