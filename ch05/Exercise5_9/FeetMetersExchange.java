public class FeetMetersExchange {
    public static void main(String[] args) {
		System.out.print("foot    meter    meter    foot\n");
        double foot = 1.0;
        double meter = 20.0;
        for (int i = 0; i < 10; i++) {
        	System.out.printf("%4.1f    %5.3f    %4.1f    %6.3f\n", 
        		foot, footToMeter(foot),
        		meter, meterToFoot(meter));
        	foot = foot + 1;
        	meter = meter + 5;
        }
		
    }

    public static double footToMeter(double foot) {
        double meter = foot * 0.305;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = meter / 0.305;
        return foot;
    }
}