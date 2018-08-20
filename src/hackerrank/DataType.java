package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Minal.Fulzele on 13/08/2018.
 */
public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> inputValues = new ArrayList<>();
        String nextVal;
        for(int i=0;i<N;i++) {
            nextVal = scanner.next();
            inputValues.add(nextVal);
        }

        for(String str : inputValues) {
            findContainer(str);
        }
    }//main

    private static void findContainer(String N) {
        if(N.charAt(0)=='-') {
            if(!canFit(N.substring(1,N.length()),removeSign(String.valueOf(Byte.MIN_VALUE)))) {
                if(!canFit(N.substring(1,N.length()),removeSign(String.valueOf(Short.MIN_VALUE)))){
                    if(!canFit(N.substring(1,N.length()),removeSign(String.valueOf(Integer.MIN_VALUE)))) {
                        if(!canFit(N.substring(1,N.length()),removeSign(String.valueOf(Long.MIN_VALUE)))) {
                            System.out.println(N+" can't be fitted anywhere.");
                        } else {
                            printOutput(N,"long");
                        }
                    } else {
                        printOutput(N,"int");
                    }
                } else {
                    printOutput(N,"short");
                }
            } else {
                printOutput(N,"byte");
            }
        } else {
            if(!canFit(N,String.valueOf(Byte.MAX_VALUE))) {
                if(!canFit(N,String.valueOf(Short.MAX_VALUE))){
                    if(!canFit(N,String.valueOf(Integer.MAX_VALUE))) {
                        if(!canFit(N,String.valueOf(Long.MAX_VALUE))) {
                            System.out.println(N+" can't be fitted anywhere.");
                        } else {
                            printOutput(N,"long");
                        }
                    } else {
                        printOutput(N,"int");
                    }
                } else {
                    printOutput(N,"short");
                }
            } else {
                printOutput(N,"byte");
            }
        }
    }

    private static String removeSign(String signedValue) {
        return signedValue.substring(1);
    }

    private static void printOutput(String n, String aLong) {

        System.out.println(n + " can be fitted in:");
        switch(aLong) {
            case "byte":
                System.out.println("* byte");
            case "short" :
                System.out.println("* short");
            case "int" :
                System.out.println("* int");
            case "long":
                System.out.println("* long");
                break;
        }
    }

    private static boolean canFit(String value, String limit) {

        if(value.length()>limit.length()) {
            return false;
        } else if (value.length()==limit.length()) {
            if(Long.parseLong(value.substring(0,1))>Long.parseLong(limit.substring(0,1))) {
                return false;
            }
            for(int i=0;i<value.length();i++) {
                if(Long.parseLong(limit.substring(i,i+1))>Long.parseLong(value.substring(i,i+1))) {
                    return true;
                } else if (Long.parseLong(value.substring(i,i+1))>Long.parseLong(limit.substring(i,i+1))) {
                    return false;
                } else {
                    continue;
                }
            }
        }
        return true;
    }
}
