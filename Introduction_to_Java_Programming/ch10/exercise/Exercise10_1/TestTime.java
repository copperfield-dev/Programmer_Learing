public class TestTime {
	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("Hour: " + time1.getHour() + " Minute: " +
                       time1.getMinute() + " Second: " + time1.getSecond());

		Time time2 = new Time(555550);
		System.out.println("Hour: " + time2.getHour() + " Minute: " +
                       time2.getMinute() + " Second: " + time2.getSecond());
	}
}