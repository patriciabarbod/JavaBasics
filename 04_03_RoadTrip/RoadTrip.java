public class RoadTrip {
    public static void main(String[] args) {

        double trajecteAnada = 347.8;
		double consum100Km = 6.7;
		double preuGasolina = 1.92;
		byte nPassatgers = 4;
		double peatgesAnada = 12.65;
		byte menjarsAnada = 30;
		byte menjarsTornada = 30;
		double aparcament = 18.5; 
		
		double DistanciaTotal = trajecteAnada * 2;
		double llitresTotals = DistanciaTotal / 100 * consum100Km;
		double costTotalCombustible = llitresTotals * preuGasolina;
		double costPeatges = peatgesAnada * 2;
		double costMenjar = menjarsAnada + menjarsTornada;
	    double costTotalViatge = costTotalCombustible + costMenjar + aparcament + costPeatges;
		double costPerPersona = costTotalViatge / nPassatgers;
		
	System.out.printf("=========== ROAD TRIP ===========%n");
	System.out.printf("%-20s%10.2f km%n", "Round trip distance:", DistanciaTotal);
	System.out.printf("---------------------------------%n");
	System.out.printf("%-20s%10.2f L%n", "Fuel needed:", llitresTotals);
	System.out.printf("%-20s%10.2f €%n", "Fuel cost:", costTotalCombustible);
	System.out.printf("---------------------------------%n");
	System.out.printf("%-20s%10.2f €%n", "Tolls:", costPeatges);
	System.out.printf("%-20s%10.2f €%n", "Parking price:", aparcament);
	System.out.printf("%-20s%10.2f €%n", "Food:", costMenjar);
	System.out.printf("---------------------------------%n");
	System.out.printf("%-20s%10.2f €%n", "Total trip cost:", costTotalViatge);
	System.out.printf("%-20s%10d%n", "Passengers:", nPassatgers);
	System.out.printf("%-20s%10.2f €%n", "Cost per passenger:", costPerPersona);
	System.out.printf("=================================%n");


    }
}