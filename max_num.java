public class max_num {
    public static void main(String[] args) {
        int myarray[]={2,3,4,5,6,7};
        int max=myarray[0];
        for(int i=0;i<myarray.length;i++){
            if(myarray[i]>max){
                max=myarray[i];
            }
        }
      System.out.print(max+" ");
    }
}
