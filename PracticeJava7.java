public class PracticeJava7{

    public static void main(String[] args){
double length =12;
double width =10;
double area = length*width;
double parameter = 2*(length =width);

System.out.println("the area is :" + area);
System.out.println("the parameter :" + parameter);
// convert mereurement
// measure in feet an inches into centimeters
double cenperinch =2.54;
int inchperfoot =12;
int feet =20;
int inch =44;
double centimeter = cenperinch*inch;
double totalinch = inchperfoot*feet+inch;
System.out.println("total inch is : " + totalinch);
System.out.println("total centimeter is : " + centimeter);

float width=4;
float length=8;
float area = length*width;
float parameter = 2* length + width;
System.out.println("the area is : " + area + "\n the parameter is : " + parameter);
    }
}