package kdk.android.simplydo.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;
import kdk.android.simplydo.SimplyDoActivity;
import kdk.android.simplydo.R;
import com.robotium.solo.Solo;
public class TestMain extends ActivityInstrumentationTestCase2<SimplyDoActivity>{
private Solo solo;
public TestMain(){
super(SimplyDoActivity.class);
}
@Override
protected void setUp()throws Exception{
super.setUp();
solo=new Solo(getInstrumentation(),getActivity());
}
public void test1AddList(){
String firstlist = "First";
EditText vFirstEditText=(EditText)solo.getView(R.id.AddListEditText);
solo.clearEditText(vFirstEditText);
solo.enterText(vFirstEditText, firstlist);
//Click on Add button
solo.clickOnButton("Add");
assertTrue(solo.searchText(firstlist));
}
public void test2EditList(){
	String editlist = "First2";
	solo.clickLongInList(1);
	solo.clickOnText("Edit");
	assertTrue(solo.searchText("Edit List Label"));
	EditText vFirstEditedEditText=(EditText)solo.getView(R.id.EditListLabelEditText);
	solo.clearEditText(vFirstEditedEditText);
	solo.enterText(vFirstEditedEditText, editlist);
	solo.clickOnButton("OK");
	assertTrue(solo.searchText(editlist));
}
public void test9DeleteList(){
	String editlist = "First2";
	solo.clickLongInList(1);
	solo.clickOnText("Delete");
	solo.clickOnButton("Yes");
	assertFalse(solo.searchText(editlist));
}
public void test3AddItem(){
	String firstItem = "New";
	solo.clickInList(1);
	EditText firstItemEditText=(EditText)solo.getView(R.id.AddItemEditText);
	solo.clearEditText(firstItemEditText);
	solo.enterText(firstItemEditText, firstItem);
	solo.clickOnButton("Add");
	assertTrue(solo.searchText(firstItem));
}
public void test4SelectItem(){
	solo.clickInList(1);
	solo.clickInList(1);
	TextView text = (TextView) solo.getCurrentActivity().findViewById(R.id.ieText1);
	assertEquals(String.valueOf(text.getCurrentTextColor()),"-1");	
}
public void test5DeselectItem(){
	solo.clickInList(1);
	solo.clickInList(1);
	TextView text = (TextView) solo.getCurrentActivity().findViewById(R.id.ieText1);
	assertEquals(String.valueOf(text.getCurrentTextColor()),"-10066330");		
}
public void test6AddStar(){
	solo.clickInList(1);
	solo.clickLongInList(1);
	solo.clickOnText("Add Star");
	Boolean isVisible = (Boolean) solo.getCurrentActivity().getResources().getDrawable(R.drawable.star).isVisible();
    assertTrue(isVisible);
}
public void test7DeleteStar() {
	solo.clickInList(1);
	solo.clickLongInList(1);
	solo.clickOnText("Remove Star");
	Boolean isVisible = (Boolean) solo.getCurrentActivity().getResources().getDrawable(R.drawable.star).isVisible();
    //Follow check fails
	assertFalse(isVisible);
}
public void test8DeleteItem() {
	String firstItem = "New";
	solo.clickInList(1);
	solo.clickLongInList(1);
	solo.clickOnText("Delete");
	solo.clickOnButton("Yes");
	//Follow check fails
	assertFalse(solo.searchText(firstItem));
}

//assertEquals(String.valueOf(vResutl),outputField.getText().toString());

@Override
protected void tearDown()throws Exception{
solo.finishOpenedActivities();
}
}

