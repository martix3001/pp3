public class Tv implements CanOnOff,CanChangeChannel,CanChangeVolume {
    boolean isOn;
    int channel;
    int vol;

    public void display(){
        if(isOn){
            System.out.println("TV is ON and on channel nr "+channel+" on vol "+vol);
        }else{
            System.out.println("TV is OFF");
        }
        
    }
    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public void on() {
        if(!isOn){
            channel = 1;
            vol = 1;
        }
        isOn = true;
        
    }
    @Override
    public void channelDown() {
       if(isOn){if(channel > 1){
            channel = channel - 1;
        }else
        {
            System.out.println("Juz jest na najnizszyn kanale");
        }}else{
            System.out.println("Tv jest wyłączony");
        }
        
    }
    @Override
    public void channelUp() {
        
        if(isOn){if(channel < 99){
            channel = channel + 1;
        }else
        {
            System.out.println("Juz jest na najwyszym kanale");
        }}else{
            System.out.println("Tv jest wyłączony");
        }
        
    }
    @Override
    public void setChannel(int channelNo) {
         if(isOn){
            if(channelNo >= 1 && channelNo <= 99){
                channel = channelNo;
            }else{
                System.out.println("Nie ma takiego kanalu");
            }
        }else{
            System.out.println("Tv jest wyłączony");
        }
    }
    @Override
    public void volumeDown() {
        if(isOn){
            if(vol > 1){
                vol -= 1;
            }else{
                System.out.println("Już jest najciszej");
            }
        }else{
            System.out.println("TV is OFF");
        }
        
    }
    @Override
    public void volumeUp() {
            if(isOn){
            if(vol < 10){
                vol += 1;
            }else{
                System.out.println("Już jest najglosniej");
            }
        }else{
            System.out.println("TV is OFF");
        }
        
    }
        
}
    

