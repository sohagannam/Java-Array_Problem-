public class two_sum {
    public static void main(String[] args) {
        int myarray[]={5,8,9,2,3};
        boolean check=false;
        int terget=17;
        for(int i=0;i<myarray.length;i++){
          for(int j=i+1;j<myarray.length;j++){
            if(myarray[i]+myarray[j]==terget){
                System.out.print("("+myarray[i]+"  " +myarray[j]+")");
                check=true;
                break;
            }
          }
        }
        if(!check){
            System.out.print("Elements is not found");
        }
    
    }
}
