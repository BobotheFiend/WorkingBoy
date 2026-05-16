import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateExercises{

	public static void main(String... args){

		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:s a");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
		DateTimeFormatter leapYear = DateTimeFormatter.ofPattern("DDD, yyyy");

		LocalDate getDate = LocalDate.of(2026,04,12);
        String datttee = getDate.format(formatDate);
		System.out.println(datttee);
		
		LocalDate dateOf = LocalDate.parse("2026-04-12");
        String dattteeOf = dateOf.format(formatDate);
		System.out.println(dattteeOf);
	
		LocalDate todaysDate = LocalDate.now();
		String dateToday = todaysDate.format(formatDate);
		System.out.println(dateToday);
 
		LocalTime currentTime = LocalTime.now();
		String timeToday = currentTime.format(timeFormat);
		System.out.println(timeToday);

		LocalDate currently = LocalDate.of(2026,04,12).plusDays(7);
        String currentDatee = currently.format(formatDate);
		System.out.println(currentDatee);
		
		LocalDate threeDaysAgo = currently.minusDays(3);
		System.out.println(threeDaysAgo);
	
		LocalDate onThisDay = LocalDate.of(2026,5,2);
        String onThisDayy = onThisDay.format(format);
		System.out.println(onThisDayy);

		int getYearInfos = LocalDate.of(2026, 4, 12).getYear();
		Month getMonthInfos = LocalDate.of(2026, 4, 12).getMonth();
		int getMonthValueInfos = LocalDate.of(2026, 4, 12).getMonthValue();
		int getDayOfMonthInfos = LocalDate.of(2026, 4, 12).getDayOfMonth();
		DayOfWeek getDayOfWeekInfos = LocalDate.of(2026, 4, 12).getDayOfWeek();
		
		System.out.printf("%d\n%s\n%d\n%d\n%s\n",getYearInfos, getMonthInfos,getMonthValueInfos, getDayOfMonthInfos, getDayOfWeekInfos);


		int cycleLength = 29;
		LocalDate nextPeriodDate = LocalDate.now().plusDays(cycleLength);
		String nextDate = nextPeriodDate.format(formatDate);
		System.out.println(nextDate);
		
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a Year to cheack if it is a leap year: ");
		int isLeapYear = input.nextInt(); 

		LocalDate getLeapYear = LocalDate.of(isLeapYear, 01, 01);

//		String leapYears = getLeapYear.format(leapYear);
		
		if (getLeapYear.isLeapYear()){
			System.out.println("It is a Leap Year!");

		}else{
		System.out.println("It's not a leap year!");
        }
		

			
	}
}
