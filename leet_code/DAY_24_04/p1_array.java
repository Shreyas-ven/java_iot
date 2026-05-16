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

        for(String i : name){
            System.out.println(i);
        }
        for (int j = 0; j < branch.length; j++){
         System.out.println(branch[j]);
       }


        //2D Array
        int data[][] = new int[3][3];
       data[0][0]=1;
       data[0][1]=2;
       data[0][2]=3;
       data[1][0]=4;
       data[1][1]=5;
       data[1][2]=6;
       data[2][0]=7;
       data[2][1]=8;
       data[2][2]=9;

       for (int k=0 ;k<data.length; k++){
        System.out.println(" ");
        for (int j=0; j<data.length;j++){
            System.out.print(data[k][j]);
        }
       }

       //row traversal
       int data_2[][] = new int[1][3];
       data_2[0][0] = 7;
      data_2[0][1] = 8;
      data_2[0][2] = 9;

      System.out.println("");
      System.out.println("Row traversal");
       for (int i = 0; i < data_2.length; i++){
    for (int j = 0; j < data_2[i].length; j++){
        System.out.print(data_2[i][j] + " ");
    }
}  


 //colum traversal
       int data_3[][] = new int[3][3];
       data_3[0][0] = 1;
      data_3[0][1] = 2;
      data_3[0][2] = 3;
      data_3[1][0]=4;
       data_3[1][1]=5;
       data_3[1][2]=6;
       data_3[2][0]=7;
       data_3[2][1]=8;
       data_3[2][2]=9;

       System.out.println("");
      System.out.println("Column Traversal");
       for (int i = 0; i < data_3[0].length; i++){
    for (int j = 0; j < data_3[i].length; j++){
        System.out.print(data_3[j][i] + " ");
    }
       }


       //String Storing
       String brand[][]=new String[2][2];
       brand[0][0]="MH  ";
       brand[0][1]="RC  ";
       brand[1][0]="BP  ";
       brand[1][1]="RS  ";

       for (int a=brand.length ;a<=0; a--){
        System.out.println();
        for (int b=brand.length; b<=0;b++){
            System.out.print(brand[a][b]);
        }
       }
    }
}

