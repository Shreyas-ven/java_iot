public class p2_interviewBased {
public static void main(String[] args) {
        int[] arr = {12,3,4,55,67,34,12,2,33,55};
        int n = arr.length;
        int[] prSum = new int[n];
        prSum[0] = arr[0];
        for(int i=1 ; i < arr.length; i ++){
            prSum[i] = prSum[i-1]+arr[i];
        }
        for(int k: arr){
            System.out.print(k + "  ");
        }
        System.out.print("\n");
        for(int k: prSum){
            System.out.print(k + "  ");
        }
        System.out.print("\n");

        int L = 1,R=5;

        int prSum_LR = prSum[R] - prSum[L-1];
        System.out.println("Sum of range between index L=1 to R=3 is: " + prSum_LR);
        
    }
}
