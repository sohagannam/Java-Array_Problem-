public class second_smallest_number{
    public static void main(String[] args) {
        int myarray[]={2,3,4,5,6,7,8};
        int size=myarray.length;
        for(int i=0;i<myarray.length;i++){
            for(int j=i+1;j<myarray.length;j++){
                if(myarray[i]<myarray[j]){
                    int temp=myarray[j];
                    myarray[j]=myarray[i];
                    myarray[i]=temp;
                }
            }
        }
        System.out.print("Second smallest number is: "+myarray[size-2]);
    }
}