public class p3_linear_search {
    public static void main(String args[]){
        int arr[] = {3,8,12,6,10,2};
        int flag=-0;
        int key = 6;
        for (int i=0;i<arr.length; i++){
            if(arr[i]==key){
                flag=1;
                break;
            }
        }

        if (flag==1){
            System.out.println("Element found !");
        }else {
            System.out.println("Element not found");
        }
        


    }
}
