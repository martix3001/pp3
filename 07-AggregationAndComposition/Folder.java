public class Folder {
    private String name;
    private int size;
    private String path;
    private File file;
    
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

  
}
