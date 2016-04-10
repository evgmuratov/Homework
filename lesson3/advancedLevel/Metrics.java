package advancedLevel;

public class Metrics {
	public static double percentFailedTC(int passed, int failed){
		double result;
		result = (double)failed/(passed+failed)*100;
		return result;
	}
	public static double percentBlockerIssues(int allBugs, int blockerBugs){
		double result;
		result = (double)blockerBugs/allBugs*100;
		return result;
	}

}
