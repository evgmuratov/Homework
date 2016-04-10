package advancedLevel;

import java.util.Scanner;

public class HappyTestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter passed number of test cases (TC): ");
		Scanner myScanner = new Scanner(System.in);
		int passedTC = myScanner.nextInt();
		System.out.print("Enter failed number of test cases (TC): ");
		myScanner = new Scanner(System.in);
		int failedTC = myScanner.nextInt();
		System.out.print("Enter complete number of unresolved issues (bugs): ");
		myScanner = new Scanner(System.in);
		int completeBugs = myScanner.nextInt();
		System.out.print("Enter number of unresolved issues (bugs) with HIGH priority: ");
		myScanner = new Scanner(System.in);
		int highBugs = myScanner.nextInt();
		System.out.print("Enter number of unresolved issues (bugs) with Blocker and Critical severity: ");
		myScanner = new Scanner(System.in);
		int blockerBugs = myScanner.nextInt();
		myScanner.close();
		System.out.println();
		if (Metrics.percentFailedTC(passedTC, failedTC)<20){
			System.out.println("Failed TCs equal "+Metrics.percentFailedTC(passedTC, failedTC)+"%. Condition passed");			
		}else{
			System.out.println("Failed TCs equal "+Metrics.percentFailedTC(passedTC, failedTC)+"%. Condition failed(less than 20% failed TC)");
		}
		if (highBugs<=10){
			System.out.println("Bugs with HIGH priority equal "+highBugs+". Condition passed");
		}else{
			System.out.println("Bugs with HIGH priority equal "+highBugs+". Condition failed(less than 10 bugs with HIGH priority)");
		}
		if (blockerBugs<=5){
			System.out.println("Bugs with Blocker and Critical severity equal "+blockerBugs+". Condition passed");
		}else{
			System.out.println("Bugs with Blocker and Critical severity equal "+blockerBugs+". Condition failed(less than 5 bugs with Blocker and Critical severity)");
		}
		if (Metrics.percentBlockerIssues(completeBugs, blockerBugs)<5){
			System.out.println("Bugs with Blocker and Critical severity(percent) equal "+Metrics.percentBlockerIssues(completeBugs, blockerBugs)+"%. Condition passed");			
		}else{
			System.out.println("Bugs with Blocker and Critical severity(percent) "+Metrics.percentBlockerIssues(completeBugs, blockerBugs)+"%. Condition failed(less than 5% bugs with Blocker and Critical severity)");
		}
		System.out.println();
		if (Metrics.percentFailedTC(passedTC, failedTC)<20 && highBugs<=10 && blockerBugs<=5 && Metrics.percentBlockerIssues(completeBugs, blockerBugs)<5){
			System.out.println("Build is stable. Let release it!!");
		}else{
			System.out.println("Build is not stable. You should work better!");
		}
	}

}
