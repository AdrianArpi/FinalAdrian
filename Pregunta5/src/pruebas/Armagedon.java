package pruebas;

public class Armagedon {

	static class Muerte {String nombre ="Muerte";
		public Muerte(){super();};
		public String Invocar() {return "El fin se acerca, soy: ";}
		public char[] nombre() {
			// TODO Auto-generated method stub
			return null;
		};

}
	
	static class Guerra {String nombre ="Guerra";
	public Guerra(){super();};
	public String Invocar() {return "El fin se acerca, soy: ";}
	public char[] nombre() {
		// TODO Auto-generated method stub
		return null;
	};

}
	
	static class Peste {String nombre ="Peste";
	public Peste(){super();};
	public String Invocar() {return "El fin se acerca, soy: ";}
	public char[] nombre() {
		// TODO Auto-generated method stub
		return null;
	};

}
	
	static class Hambre {String nombre ="Hambre"; 
	public Hambre(){super();};
	public String Invocar() {return "El fin se acerca, soy: ";}
	public char[] nombre() {
		// TODO Auto-generated method stub
		return null;
	};

}
	
	public static void main(String[] args) {
		
		Muerte	jinete1= new Muerte();
		Guerra	jinete2= new Guerra();
		Peste	jinete3= new Peste();
		Hambre	jinete4= new Hambre();
		
		System.out.println(jinete1.Invocar());
		System.out.println(jinete1.nombre());
		System.out.println(jinete2.Invocar());
		System.out.println(jinete2.nombre());
		System.out.println(jinete3.Invocar());
		System.out.println(jinete3.nombre());
		System.out.println(jinete4.Invocar());
		System.out.println(jinete4.nombre());
	}

}
