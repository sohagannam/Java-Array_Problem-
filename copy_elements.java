public class copy_elements{
    public static void copy_ele(int myarray1[],int myarray2[] ){
        for(int i=0;i<myarray1.length;i++){
            myarray2[i]=myarray1[i];
        }
     for(int res:myarray2){
         System.out.print(res+" ");
     }
     System.out.println();
    }
    public static void main(String[] args) {
        int MyArrayD[]={3,4,5,6,7,8};
        int Myarray2D[]=new int[MyArrayD.length];
       copy_ele(MyArrayD, Myarray2D);
    }
}