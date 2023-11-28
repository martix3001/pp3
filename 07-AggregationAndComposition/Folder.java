public class Folder {
    String name;
    int size;
    String path;
    File file;
    
    public Folder(String name, int size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public void addFile(String fname,int size){
        file  = new File(fname,size);
    }

    public void changeFileName(String newnName){
        file.setName(newnName);
    }
    public void deleteFile(){
        file = null;
        //odśmiecacz sam załatwi sprawę
    }
    public void changeSize(int newsize){
        file.setSize(newsize);
    }
    
    @Override
    public String toString() {
        if(file != null){
                    return "Folder " + name + " o rozmiarze " + size + "KB w miejscu " + path + " zawiera plik " + file.getName();
        }
        return "Folder " + name + " o rozmiarze " + size + "KB w miejscu " + path + " nie zawiera plików ";
    }

    public static void main(String[] args) {
        
        Folder f1 = new Folder("NowyFolder", 3,"C:/Pulpit");
        f1.addFile("Nowy Dokumet Tekstowy", 6);
        System.out.println(f1.toString());
        f1.deleteFile();
        System.out.println(f1.toString());

    }
}
