import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static float sumNumber(float a, float b,float c) {
		float ketqua = a + b + c;
		return ketqua;
	}
	
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Chương trình tính tổng ba số ");
	  System.out.println("nhập số thứ nhất: ");
	  float x = Float.parseFloat(scan.nextLine());
	  System.out.println("nhập số thứ thứ hai: ");
	  float y = Float.parseFloat(scan.nextLine());
	  System.out.println("nhập số thứ thứ ba: ");
	  float z = Float.parseFloat(scan.nextLine());
	  
	  float ketqua = sumNumber(x,y,z);
	  
	  System.out.println("Tổng ba số là " + ketqua);
	}

}
