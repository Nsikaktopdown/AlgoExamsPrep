package linearsearch;

public class Main {

    private static String linearSearch(int[] args, int value){
        for(int i = 0; i < args.length; i++){
            if(args[i] == value){
                return "Found element in index " + i;
            }
        }
        return "Element not found";
    }
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {1,2,3,4,5}, 3));
    }
}