public class p1_array {
    public static void main(String []args){

        //1D Array
        String branch[] ={"BCA","MCA","BBA","MBA","B.COM"};
        String[] name = new String[5];
        name[0] ="Sharan";
        name[1]="Bassappa";
        name[2]="Sapthagiri";
        name[3]="Johnny";
        name[4]="Subba";

        //for (int =0 ; i<name.length; i++)

        for(String i : name){
            System.out.println(i);
        }
        for (int j = 0; j < branch.length; j++){
         System.out.println(branch[j]);
       }


        //2D Array
        int data[][] = new int[2][2];
       data[0][0]=1;
       data[0][1]=2;
       data[1][0]=3;
       data[1][1]=4;

       for (int k=0 ;k<data.length; k++){
        System.out.println();
        for (int j=0; j<data.length;j++){
            System.out.print(data[k][j]);
        }
       }
    }
}
