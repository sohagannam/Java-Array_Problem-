public class ascending{
    public static void main(String[] args) {
        int myarray[]={8,5,12,4,9,3};
        for(int i=0;i<myarray.length;i++){
            for(int j=i+1;j<myarray.length;j++){
                if(myarray[i]>myarray[j]){
                    int temp=myarray[j];
                    myarray[j]=myarray[i];
                    myarray[i]=temp;
                }
            }
        }
        for(int res:myarray){
            System.out.print(res+"");
        }
    }
}