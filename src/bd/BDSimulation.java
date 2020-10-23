package bd;

import java.util.ArrayList;
import java.util.List;
import entidade.FoneDeOuvido;

public class BDSimulation {
	// Creation of Database Simulation
	private static List<FoneDeOuvido> bd = new ArrayList<FoneDeOuvido>();

	// Add item on ArrayList
	public static void insertDb(FoneDeOuvido f) {
		bd.add(f);
	}
	
	// Getters and Setters
	public static List<FoneDeOuvido> getBd() {
		return bd;
	}
}
