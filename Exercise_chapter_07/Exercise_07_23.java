public class Exercise_07_23 {
    public static void main(String[] args){
        boolean[] lockers = new boolean[101];
        toggle(lockers);
        print(lockers);
    }
    //Method to perform the toggle lockers
    public static void toggle(boolean[] array){
        for(int i = 1; i < array.length; ++i){
            for(int j = i; j < array.length; j += i){
                array[j] = !array[j];
            }
        }
    }

    //Method to print the array
    public static void print(boolean[] array){
        for(int i = 1; i < array.length; i++){
            if(array[i]){
                System.out.print(i + " ");
            }
        }
    }
}
