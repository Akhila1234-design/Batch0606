public class Arrays{
	public static void main(String[] args){
String[] names = {
    "Narasimha A", "Hemanth Ch", "Sumanth M", "Mohith Sai K", "Vijaya Lakshmi P",
    "Kavya Sri K", "Akhila D", "Sai Charan P", "Sathvika A", "Karishma Md",
    "Aparna K", "Lakshmi Chaitanya L", "Rahul R", "Saikumar J", "Raghu J",
    "Suvarchala K", "Saideepa K", "Siva Nageswararao Ch", "Sai Kiran V"
};

int[] javaMarks= {85, 75, 92, 45, 88, 72, 80, 90, 78, 20, 95, 85, 50, 82, 77, 80, 91, 33, 88};
int[] htmlMarks= {78, 82, 85, 55, 90, 75, 88, 92, 80, 40, 98, 83, 30, 85, 79, 82, 89, 35, 90};
int[] sqlMarks= {90, 80, 88, 65, 85, 78, 84, 95, 82, 45, 92, 80, 35, 88, 75, 84, 92, 38, 87};
int[] jsMarks= {88, 70, 94, 50, 86, 80, 82, 91, 76, 50, 94, 89, 40, 81, 80, 85, 88, 40, 85};

int sum;
float avg;
float percentage;
String pass;

for(int i=0;i<names.length;i++){
	sum=javaMarks[i]+htmlMarks[i]+sqlMarks[i]+jsMarks[i];
	avg=sum/4.0f;
	percentage=(sum/400.0f)*100;
	if (javaMarks[i]<35 || htmlMarks[i]<35 || sqlMarks[i]<35 || jsMarks[i]<35){	
	pass="FAIL";

		
}
	else{
	pass="PASS";
}
	System.out.println("Name:"+names[i]);
	System.out.println("Student marks are:");
	System.out.println("Java Marks:"+javaMarks[i]);
	System.out.println("HTML Marks:"+javaMarks[i]);
	System.out.println("SQL Marks:"+javaMarks[i]);
	System.out.println("Java Script Marks:"+javaMarks[i]);
	System.out.println("Total Marks:"+sum);
	System.out.println("Average Marks:"+avg);
	System.out.println("Percentage:"+percentage);
	System.out.println("Pass or Fail:"+pass);
	System.out.println("------------------------------------------");


	
	
}

System.out.println("Subjects wise Minimum and Maximum marks are:");
int minimumIndex=0;
int max=0;
int maximumIndex=0;
int min=100;

for (int i=0;i<javaMarks.length;i++){
	if (min>javaMarks[i]){
	minimumIndex=i;
	min=javaMarks[i];
}
	if (max<javaMarks[i]){
	maximumIndex=i;
	max=javaMarks[i];
}
}
System.out.println("Minimum Marks in java is "+min+" by "+names[minimumIndex]);
System.out.println("MAximum Marks in java is "+max+" by "+names[maximumIndex]);
System.out.println("--------------------------------------");


	


 minimumIndex=0;
 max=0;
maximumIndex=0;
 min=100;

for (int i=0;i<htmlMarks.length;i++){
	if (min>htmlMarks[i]){
	minimumIndex=i;
	min=htmlMarks[i];
}
	if (max<htmlMarks[i]){
	maximumIndex=i;
max=htmlMarks[i];
}
}
System.out.println("Minimum Marks in HTML is "+min+" by "+names[minimumIndex]);
System.out.println("MAximum Marks in HTML is "+max+" by "+names[maximumIndex]);
System.out.println("--------------------------------------");



	


 minimumIndex=0;
 max=0;
maximumIndex=0;
 min=100;

for (int i=0;i<sqlMarks.length;i++){
	if (min>sqlMarks[i]){
	minimumIndex=i;
	min=sqlMarks[i];
}
	if (max<sqlMarks[i]){
	maximumIndex=i;
max=sqlMarks[i];
}
}
System.out.println("Minimum Marks in SQl is "+min+" by "+names[minimumIndex]);
System.out.println("MAximum Marks in SQL is "+max+" by "+names[maximumIndex]);
System.out.println("--------------------------------------");



	


 minimumIndex=0;
 max=0;
maximumIndex=0;
 min=100;

for (int i=0;i<jsMarks.length;i++){
	if (min>jsMarks[i]){
	minimumIndex=i;
	min=jsMarks[i];
}
	if (max<jsMarks[i]){
	maximumIndex=i;
max=jsMarks[i];
}
}
System.out.println("Minimum Marks in JAVA SCRIPT is "+min+" by "+names[minimumIndex]);
System.out.println("MAximum Marks in JAVA SCRIPT is "+max+" by "+names[maximumIndex]);
System.out.println("--------------------------------------");



	








}
}