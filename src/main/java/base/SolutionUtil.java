package base;

public class SolutionUtil {

    public static void printArray(int[] array){
        String log = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                log = log.concat(array[i] + "");
            }else{
                log = log.concat(array[i] + ",");
            }
        }
        log = log + "]";
        System.out.print(log);
    }

}
