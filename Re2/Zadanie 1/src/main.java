public class main {
    public static void main(String[] args) {
        int[]x = new int[]{14567234,834523,89543124,89543124,345715};
        System.out.println(uniqueCount(x));
    }
    public static int uniqueCount(int[]array){

        int[] copy = new int[array.length];
        int result = 0;
        int countNum = 0;
        int count = 0;

        for (int i = 0; i <copy.length ; i++) {
            copy[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (copy[i]==0){
                for (int j = 0; j < array.length; j++) {
                    if (array[i]==array[j]){
                        copy[j] = 1;
                        count++;
                    }
                }
            }
            if (countNum<count){
                countNum = count;
                result++;
            }

        }
        return result;
    }
}