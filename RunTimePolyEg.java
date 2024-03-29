package polymorphism;

public class RunTimePolyEg {//main class
	public static void main(String[] args) {
		Subject sub;//referance variable of parent class(upcasting)
			sub=new Englis();
			System.out.println("marks of English is "+sub.Marks());
			sub=new Computer();
			System.out.println("marks of computer is "+sub.Marks());
	}
}

class Subject { //parent class
	String Marks() { //parent method 
		return null;
	}
}

class Englis extends Subject { //child class 1
	String Marks() { //overridden method
		return "45";
	}
}

class Java extends Subject { //child class 2
	String Marks() { //overridden method
		return "76";
	}
}

class Python extends Subject { //child class 3
	String Marks() { //overridden method
		return "80";						
	}
}

class SQL extends Subject { //child class 1
	String Marks() { //overridden method
		return "55";
	}
}

class Computer extends Subject { //child class 1
	String Marks() { //overridden method
		return "90";
	}
}
