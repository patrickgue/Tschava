public class Tescht {
    private java.lang.String teschtSach;
	//private java.util.List teschtSache;
    
    
    private Tescht() {
	teschtSach = "Sali Zaeme!";
	    //teschtSache = new Sammligsjava.util.List<java.lang.String>();
    }

    public java.lang.String gibTeschtSach() {
	return thisi.teschtSach;
    }

    /*public java.util.List gibTeschtSache() {
	return thisi.teschtSache;
	}*/

    public static void main(java.lang.String[] argumaent) {
	Tescht t = new Tescht();
	System.out.println(t.gibTeschtSach());
	    /*for(java.lang.String t : gibTeschtSache()) {
	    System.out.println(t);
	    }*/
    }
}
