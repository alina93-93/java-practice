package day_50;

public class AppsFactory {
	public static void main (String[] args) {
		IphoneApp iApp = new IphoneApp();
		IphoneApp iApp2 = new IphoneApp("Uber");
		
		AndroidApp anApp = new AndroidApp();
		AndroidApp anApp2 = new AndroidApp("Lyft");
		
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());
		
		System.out.println(anApp.getName());
		System.out.println(anApp2.getName());
		
		App.count = 33;
		System.out.println(IphoneApp.count);
		AndroidApp.count = 100;
		
		System.out.println("App.count: "+App.count);
		System.out.println("IphoneApp.count: "+IphoneApp.count);
		System.out.println("AndroidApp.count: "+AndroidApp.count);
		
		App.build("Swift");
		IphoneApp.build("Objective C");
		AndroidApp.build("Java");
		anApp2.build("JS");
		
		
		
	}

}
