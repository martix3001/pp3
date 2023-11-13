public class C5 {
    int x;
    int y;

    C5(int x,int y){
        this.x = x;
        this.y = y;
    }

    boolean isX(){
        if(y == 0){
            return true;
        }
        return false;
    }
    boolean isY(){
        if(x == 0){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "P("+x+","+y+")";
    }
}
