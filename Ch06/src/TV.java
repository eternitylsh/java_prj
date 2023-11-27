
public class TV {
	String color;
	boolean power;
	int ch;
	
	void OnInit() {
		this.color = "red";
		this.power = false;
		this.ch = 0;
	}
	
	void Power() {
		this.power = !this.power;
	}
	
	void channelup() {
		++this.ch;
	}
	void channelDown() {
		--this.ch;
	}
}	
