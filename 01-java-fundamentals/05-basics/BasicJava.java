import java.util.ArrayList;

public class BasicJava {
    
    public String print255() {
        int i = 1;
        while(i <= 255){
            System.out.println(i);
            i++;
        }
        return "Done";
    }

    public String print255odd() {
        int i = 1;
        while(i <= 255){
            if(i % 2 != 0){
            System.out.println(i);
            i++;
            }   else{
            i++;
            }
        }
        return "Done";
    }


    public String sum255() {
        int i = 1;
        int sum = 0;
        while(i <= 255){
            sum += i;
            i++;
        }
        System.out.println(sum);
        return "Done";
    }

    public String printArray() {
        int[] theArray = {1,3,5,7,9,13};
        int i = 0;
        while(i < theArray.length){
            System.out.println(theArray[i]);
            i++;
        }
        return "Done";
    }

    public String printArrayMax() {
        int[] theArray = {-200,-1,-3,-5,-7,-9,-13};
        int i = 0;
        int max = theArray[0];
        while(i < theArray.length){
            if( max < theArray[i]){
                max = theArray[i];
            }
            i++;
        }
        System.out.println(max);
        return "Done";
    }

    public String printOddArray() {
        
        ArrayList<Integer> y = new ArrayList<Integer>();
        int i = 0;
        while(i <= 255){
            if(i % 2 != 0){
            y.add(i);
            i++;
            }   else{
            i++;
            }
        }
        System.out.println(y);
        return "Done";
    }
}
