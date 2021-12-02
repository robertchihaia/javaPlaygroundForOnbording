import java.util.*;

public class Programs {
    //1)
    public static void convertFahrToCels(Double tempFahr) {
        Double tempCels = ((5 * (tempFahr - 32.0)) / 9.0);
        System.out.println(tempFahr + " degree Fahrenheit is equal to " + tempCels + " in Celsius");
    }

    //2)
    public static void minutesToYearsDays(Integer mins) {
        Integer years = mins / (60 * 24 * 365);
        Integer days = ((mins / 60) / 24) % 365;
        System.out.println(mins + " minutes is approximetely " + years + " years and " + days + " days");
    }

    //3)
    public static void breakIntToSequence(Integer intToBreak) {
        while (intToBreak > 0) {
            System.out.println(intToBreak % 10);
            intToBreak = intToBreak / 10;
        }
    }

    //4)
    public static Integer sumOfFirstNrs(Integer nForSum) {
        Integer sum = 0;
        for (Integer i = 1; i < nForSum; i++) {
            sum += i;
        }
        return sum;
    }

    //5)
    public static Double averageValueArr(Double[] arrayOfNrs) {
        Double sum = arrayOfNrs[0];
        for (Integer i = 1; i < arrayOfNrs.length; i++) {
            sum += arrayOfNrs[i];
        }
        return sum / arrayOfNrs.length;
    }

    //6)
    public static void evenAndOddInArr(Integer[] arrayOfNrs) {
        Integer even = 0;
        for (Integer arrayOfNr : arrayOfNrs) {
            if (arrayOfNr % 2 == 0) {
                even += 1;
            }
        }
        System.out.println("Even numbers in array: " + even);
        System.out.println("Even numbers in array: " + (arrayOfNrs.length - even));
    }

    //7)
    public static <ArayList> Integer diffLargeSmall(List<Integer> arrayOfNrs) {
        List<Integer> tempSortedList = new ArrayList<>(arrayOfNrs);
        Collections.sort(tempSortedList);
        Integer max = tempSortedList.get(tempSortedList.size() - 1);
        Integer min = tempSortedList.get(0);
        return (max - min);
    }

    //8)
    public static Double averageExcepLargeSmallOfArr(List<Integer> arrayOfNrs) {
        Double sum = 0.0;
        List<Integer> tempSortedList = new ArrayList<Integer>(arrayOfNrs);
        Collections.sort(tempSortedList);
        tempSortedList.remove(tempSortedList.size() - 1);
        tempSortedList.remove(0);
        for (Integer i : tempSortedList) {
            sum += i;
        }
        return (sum / tempSortedList.size());
    }

    //9)
    public static String replaceChar(String arrOfChar, Character toBeReplaced, Character toReplace) {
        arrOfChar = arrOfChar.replace(toBeReplaced, toReplace);
        return arrOfChar;
    }

    //10)
    public static String removeChar(String arrOfChar, Character toRemove) {
        StringBuilder afterRemoval = new StringBuilder();
        for (Integer i = 0; i < arrOfChar.length(); i++) {
            if (arrOfChar.charAt(i) != toRemove) {
                afterRemoval.append(arrOfChar.charAt(i));
            }
        }
        return afterRemoval.toString();
    }

    //11)
    public static void digitsInString(String arrOfChar) {
        Boolean checkForDigits = arrOfChar.matches("[0-9]+");
        if (checkForDigits) {
            System.out.println("The string " + arrOfChar + " contains only digits.");
        } else {
            System.out.println("The string " + arrOfChar + " doesn't contain only digits.");
        }
    }

    //12)
    public static String charAtEvenPos(String arrOfChar) {
        StringBuilder afterRemoval = new StringBuilder();
        for (Integer i = 0; i < arrOfChar.length(); i = i + 2) {
            afterRemoval.append(arrOfChar.charAt(i));
        }
        return afterRemoval.toString();
    }

    //13)
    public static Integer sumDigitsInString(String arrOfChar) {
        Integer sum = 0;
        for (Integer i = 0; i < arrOfChar.length(); i++) {
            if (Character.isDigit(arrOfChar.charAt(i))) {
                sum += Character.getNumericValue(arrOfChar.charAt(i));
            }
        }
        return sum;
    }

    //1)
    public static Integer[] zerosToEndOfArr(Integer[] arrayOfNrs) {
        Integer cnt = 0;
        for (Integer i = 0; i < arrayOfNrs.length; i++) {
            if (arrayOfNrs[i] != 0) {
                arrayOfNrs[cnt++] = arrayOfNrs[i];
            }
        }
        for (Integer j = cnt; j < arrayOfNrs.length; j++) {
            arrayOfNrs[j] = 0;
        }
        return arrayOfNrs;
    }

    //2
    public static void sortStringAsc(String[] stringArrToOrder, Boolean order) {
        if (order) {
            Arrays.sort(stringArrToOrder, (x, y) -> Integer.compare(x.length(), y.length()));
        } else {
            Arrays.sort(stringArrToOrder, (x, y) -> (-1) * Integer.compare(x.length(), y.length()));
        }
    }

    //3
    public static Integer mirrorNr(Integer nrToMirror) {
        Integer finalNr = 0;
        while (nrToMirror > 0) {
            finalNr = finalNr * 10 + nrToMirror % 10;
            nrToMirror = nrToMirror / 10;
        }
        return finalNr;
    }

    //4
    public static void palinVerif(Integer nrToCheckForPalin) {
        Integer finalNr = 0;
        Integer memOrigNr = nrToCheckForPalin;
        while (nrToCheckForPalin != 0) {
            finalNr = finalNr * 10 + nrToCheckForPalin % 10;
            nrToCheckForPalin = nrToCheckForPalin / 10;
        }
        if (finalNr.equals(memOrigNr)) {
            System.out.println("The number is a palindrom.");
        } else {
            System.out.println("The number is not a palindrom.");
        }
    }

    public static void fibonacci(Integer nrsInSequence) {
        Integer current = 0, next = 1, sum;
        for (Integer i = 0; i < nrsInSequence; i++) {
            sum = current + next;
            current = next;
            next = sum;
            System.out.print(" " + sum);
        }
    }


}
