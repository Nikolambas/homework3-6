import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] returnArr(int[] arr) {
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                break;
            }
            list.add(arr[i]);
        }
        if (list.size()==arr.length){
            throw new RuntimeException();
        }
        Collections.reverse(list);
        int [] arrReturt = new int [list.size()];
        int counter =0;
        for (int number : list){
            arrReturt[counter]=number;
            counter++;
        }
        return arrReturt;
    }

        public static boolean isOneAndFour (int[] arr){
            boolean one = false;
            boolean four = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    one = true;
                    continue;
                }
                if (arr[i] == 4) {
                    four = true;
                    continue;
                }
                return false;
            }
            if (one && four) {
                return true;
            }
            return false;
        }

    public static int[] gotArr(String s){
        String[]a = s.split("");
        int [] arr = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            arr[i]=Integer.parseInt(a[i]);
        }
        return arr;
    }
    }

