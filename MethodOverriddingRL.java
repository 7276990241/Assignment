package assignments;

class Father
{
	void shoot()
	{
		System.out.println("I am the father! I am a right-handed shooter!");
	}
}
class Child extends Father
{
	void shoot()
	{
		System.out.println("I am son! I am a left-handed shooter!");
	}
}
public class MethodOverriddingRL
{
	public static void main(String[] args)
	{
		Father f = new Father();
		f.shoot();//Here the parent class method gets called.
		Father fc = new Child();
		fc.shoot();//This is dynamic method dispatch.
		//The compiler decides method call at runtime.
	}
}
