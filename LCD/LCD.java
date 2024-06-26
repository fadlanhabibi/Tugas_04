package LCD;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    public LCD() {
        this.status = "mati";
        this.volume = 0;
        this.brightness = 50;
        this.cable = "";
    }

    public void turnOn() {
        this.status = "menyala";
    }

    public void turnOff() {
        this.status = "mati";
    }

    public void Freeze() {
        this.status = "freeze";
    }

    public void setVolume(int level) {
            this.volume = level;
        
    }

    public void volumeUp() {   
            this.volume++;
        }
    

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void setBrightness(int level) {
        this.brightness = level;
        
        
    }

    public void brightnessUp() {
        this.brightness++;
    }

    public void brightnessDown() {
        this.brightness--;

    }

    public void setCable(int index) {
        String[] cables = { "VGA", "DVI", "HDMI", "DisplayPort" };
            this.cable = cables[index];
        
    }

    public void displayMessage() {
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
    }
}
