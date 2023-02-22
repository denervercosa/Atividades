package atividade4;

public class TestarFarmacia {

	public static void main(String[] args) {
		
		Farmacia f1 = new Farmacia(1, "Dipirona", "Novalgina", "Teuto", "-", 10.0f);
		
		Farmacia f2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Quimica", "-", 20.0f);
		
		f1.visualizar();
		
		f2.visualizar();
	}

	
	
}
