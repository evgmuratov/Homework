package BeginnerLevel;
public class Task5 {
	public String checkMark(int mark){
		String comment=null;
		switch (mark){
		case 1:
			comment="Why do you go to school!?!?";
			break;
		case 2:
			comment="Failed";
			break;
		case 3:
			comment="It is not good";
			break;
		case 4:
			comment="Good!";
			break;
		case 5:
			comment="Excelent!";
			break;
		}
		return comment;
	}
	public static void main(String[] args) {
		Task5 myComment=new Task5();
		String comment;
		comment=myComment.checkMark(3);
		System.out.println(comment);
	}
}
