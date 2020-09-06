package lesson_6;

public class ArrayCheck {
    public int[] find4(int[] arr) {
        int[] outputArray;
        int last4number = -1;

        for (int i = (arr.length - 1); i >= 0; i--) {
            if (arr[i] == 4) {
                last4number = i + 1;
                break;
            }
        }

        if(last4number == -1){
            throw new RuntimeException("No digit 4 in array");
        } else {
           outputArray = new int[arr.length - last4number];
            for (int i = 0; i < outputArray.length; i++){
                outputArray[i] = arr[last4number + i];
            }
            return outputArray;
        }
    }

    public boolean find1and4(int[] arr){
        boolean oneFound = false;
        boolean fourFound = false;
        boolean wrongArray = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4){
                  wrongArray = true;
            }
            if(arr[i] == 1) oneFound = true;
            if(arr[i] == 4) fourFound = true;
        }
        if(wrongArray)  throw new RuntimeException("No digit 4 or 1 in array");

        if(oneFound && fourFound){
            return true;
        }

        return false;

    }
}
