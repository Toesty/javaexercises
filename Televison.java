
public class Televison {

	public int channel;
	public int volume;
	public boolean on;
	
	
	public Televison() {
		on = false;
		channel = 1;
		volume = 1;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void setChannel (int c) {
		if (on == true) {
			channel = c;
		}
	}
	
	public void setVolume(int v) {
		if(on) volume = v;
	}
	
	public void channelUp() {
		if(on == true) {
			channel++;
		}
	}
	
	public void channelDown() {
		if(on == true) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if(on == true) {
			volume++;
		}
	}
	
	public void volumeDown() {
		if (on == true) {
			volume--;
		}
	}
	
}
