package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        // ให้นับนวนเลขคู่และเลขคี่ใน Array ด้านล่าง
        int [] numbers = {1, 5, 6, 34, 12, 77, 11, 9, 2, 8, 4, 7, 10, 13, 15, 16, 18, 20, 21,};

        int count0dd = 0;
        int countEven = 0;
        
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers [i] + " ");
            if(numbers [i] % 2 == 0){
                countEven++;
            }else{
                count0dd++;
            }
            
        }
            System.out.println("\n Amount of all Number : " + numbers.length);
            System.out.println("\n Amount of odd Number : " + numbers.length);
            System.out.println("\n Amount of Even Number : " + numbers.length);



    }
}
