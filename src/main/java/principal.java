import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class principal extends Programs {

    public static void main(String[] args) {
/*
        //1)
        convertFahrToCels(212.12);

        //2)
        minutesToYearsDays(3456789);

        //3)
        breakIntToSequence(1342);

        //4)
        Integer sumForTest4 = sumOfFirstNrs(10);
        System.out.println(sumForTest4);

        //5)
        Double[] doubleArrForTest5 = {3.2, 5.4, 85.98, 34.7};
        Double averageForTest5 = averageValueArr(doubleArrForTest5);
        System.out.println(averageForTest5);

        //6)
        Integer[] integerArrForTest6 = {12, 54, 20, 6, 7, 86, 69};
        evenAndOddaInArr(integerArrForTest6);
*/
/*
        //7)
        List<Integer> integerListForTest7 = new ArrayList<>(6);
        integerListForTest7.add(10);
        integerListForTest7.add(23);
        integerListForTest7.add(17);
        integerListForTest7.add(4);
        integerListForTest7.add(69);
        integerListForTest7.add(80);
        integerListForTest7.add(23);
        Integer diffIntegerForTest7 = diffLargeSmall(integerListForTest7);
        System.out.println(diffIntegerForTest7);

        //8)
        List<Integer> integerListForTest8 = new ArrayList<>(6);
        integerListForTest8.add(10);
        integerListForTest8.add(23);
        integerListForTest8.add(17);
        integerListForTest8.add(4);
        integerListForTest8.add(69);
        integerListForTest8.add(80);
        integerListForTest8.add(23);
        Double averageForTest8 = averageExcepLargeSmallOfArr(integerListForTest8);
        System.out.println(averageForTest8);

*/
/*
        //9)
        String strForTest9=replaceChar("aabbccddeeff",'c','z');
        System.out.println(strForTest9);

        //10)
        String strForTest10=removeChar("aabbccddeeff",'a');
        System.out.println(strForTest10);

        //11)
        digitsInString("04232454");
        digitsInString("042a4234");
        digitsInString("abcdefgh");

        //12)
        String strForTest12=charAtEvenPos("aabbccddeeffgghh");
        System.out.println(strForTest12);

        //13)
        Integer integerForTest13 = sumDigitsInString("a1b2c3d4");
        System.out.println(integerForTest13);

        //14)
        Circle circle = new Circle(10.4);
        Double circlePerimeter=circle.calculatePerimeter();
        Double circleArea=circle.calculateArea();
        System.out.println("Perimeter of the circle: "+ circlePerimeter);
        System.out.println("Area of the circle: "+ circleArea);

        Square square = new Square(7.3);
        Double squarePerimeter=circle.calculatePerimeter();
        Double squareArea=circle.calculateArea();
        System.out.println("Perimeter of the square: "+ squarePerimeter);
        System.out.println("Area of the square: "+ squareArea);

        Triangle triangle = new Triangle(12.4 , 6.3, 14.5, 5.8);
        Double trianglePerimeter=circle.calculatePerimeter();
        Double triangleCircleArea=circle.calculateArea();
        System.out.println("Perimeter of the triangle: "+ trianglePerimeter);
        System.out.println("Area of the triangle: "+ triangleCircleArea);

        Rectangle rectangle = new Rectangle(14.3 , 20.7);
        Double rectanglePerimeter=circle.calculatePerimeter();
        Double rectangleCircleArea=circle.calculateArea();
        System.out.println("Perimeter of the rectangle: "+ rectanglePerimeter);
        System.out.println("Area of the rectangle: "+ rectangleCircleArea);
*/
/*
        //15)
        String s1 = "abcdefg";
        String s2 = "abcdefg";

        if(s1==s2){
            System.out.println("== works!");
        }

        if(s1.equals(s2)){
            System.out.println("equals works!");
        }

        //1)
        Integer[] integerArrForTest1 = {4, 0, 5, 0 ,7, 0};
        Integer[] modifiedArrForTest1 = zerosToEndOfArr(integerArrForTest1);
        System.out.println(Arrays.toString(modifiedArrForTest1));

        //2.a)
        String[] stringArrForTest2 = {"this", "is", "very", "weird"};
        sortStringAsc(stringArrForTest2, false);
        for (String s : stringArrForTest2) {
            System.out.println(s);
        }

        //3
        Integer nrForTest3=mirrorNr(12345);
        System.out.println(nrForTest3);

        //4
        palinVerif(2432);

        //5
        fibonacci(10);
*/
        int a[] = new int[2];
        try {
            System.out.println("Access element three:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            a[0]=6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed.");;
        }

    }
}
