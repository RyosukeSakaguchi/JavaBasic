package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;
	int count;
	
	int run() {
		if(this.gasoline > 0) {
			this.gasoline --;
			int num = new java.util.Random().nextInt(15);
			return num + 1;
		}else {
			return -1;
		}
	}

}
