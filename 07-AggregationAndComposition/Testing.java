public class Testing {
    public static void main(String[] args) {
        
        Folder f1 = new Folder("NowyFolder", 3,"C:/Pulpit");
        f1.addFile("Nowy Dokumet Tekstowy", 6);
        System.out.println(f1.toString());
        f1.deleteFile();
        System.out.println(f1.toString());
        f1.addFile("Nowy Dokumet Tekstowy2", 6);
        System.out.println(f1.getFile().getName());

    }
}
