package day_51;

public class AtTheGym {
     public static void main(String[] args) {
		Exercise e = new Exercise ();
		Running r = new Running ();
		Swimming s = new Swimming ();
		Yoga y = new Yoga();
		JJitsu j = new JJitsu();
		Sprinting sp = new Sprinting ();
		
		System.out.println(e.perform(30));
		System.out.println(r.perform(30));
		System.out.println(s.perform(30));
		System.out.println(y.perform(30));
		System.out.println(j.perform(30));
		System.out.println(sp.perform(30));
		
		Exercise e2 = new Exercise ();
		System.out.println(e2.perform(33));
		System.out.println("====================");
		Snowboarding sn  = new Snowboarding();
		System.out.println(sn.perform(100));
		
		
	}
}
