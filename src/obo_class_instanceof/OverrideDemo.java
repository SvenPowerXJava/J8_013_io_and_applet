package obo_class_instanceof;
//переопределение обобщенных методов
public class OverrideDemo {
	public static void main(String[] args) {
		
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		Gen2<Integer> iOb2 = new Gen2<Integer>(99);
		
		Gen2<String> strOb2 = new Gen2<String>(" \"Тест обобщений\"");
		System.out.println(iOb.getOb());
		System.out.println(iOb2.getOb());
		System.out.println(strOb2.getOb());
	}
}
