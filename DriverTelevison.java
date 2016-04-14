
 public class DriverTelevison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Televison tv1 = new Televison();
	        tv1.turnOn();
	        tv1.setChannel(30);
	        tv1.setVolume(3);
	        
	        Televison tv2 = new Televison();
	        tv2.turnOn();
	        tv2.channelUp();
	        tv2.channelUp();
	        tv2.volumeUp();
	        
	        Televison tv3 = new Televison();
	        tv3.setChannel(30);
	        tv3.channelUp();
	        tv3.volumeUp();
	        
	        System.out.println("tv1's channel: " + tv1.channel);
	        System.out.println("tv1's volume:  " + tv1.volume);
	        System.out.println("tv2's channel: " + tv2.channel);
	        System.out.println("tv2's volume:  " + tv2.volume);
	        System.out.println("tv3's channel: " + tv3.channel);
	        System.out.println("tv3's volume:  " + tv3.volume);
	}

}
