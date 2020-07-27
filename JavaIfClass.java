public class JavaIfClass{
    public static void main(String[] args){

        if (10 > 8) {
            System.out.println("10 is greater than 8");
        }

    // else statement
    int time = 30;
    if (time < 20) {
        System.out.println("Good day.");
    } else {
        System.out.println("Good evening.");
        }

        // if else statement
        int times = 22;
        if (times > 12) {
            System.out.println("Good morning.");
         } else {
             System.out.println("Bad morning");
        }

        // switch 
        int day =5;
        switch (day) {    
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thrusday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
    }

    // default switch
    int days =3;
    switch (days) { 
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("Weekend is the best");
    }

    // While loop

    int i = 0;
    while (i < 6) {
        System.out.println(i);
        i++;

    }

    }
}