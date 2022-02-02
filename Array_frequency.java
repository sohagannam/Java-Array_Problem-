public class Array_frequency{
    public static void main(String[] args) {
        int myarray[]={1,2,3,4,5,2,1,3};
        int frAr[]=new int [myarray.length];
        int visited=-1;
        for(int i=0;i<myarray.length;i++){
            int count=1;
            for(int j=i+1;j<myarray.length;j++){
                if(myarray[i]==myarray[j]){
                    count++;
                    frAr[j]=visited;
                }
            }
            if(frAr[i]!=visited){
                frAr[i]=count;
            }
        }
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < frAr.length; i++){  
            if(frAr[i] != visited)  
                System.out.println("    " + myarray[i] + "    |    " + frAr[i]);
        } 
        System.out.println("---------------------------------------");   
    }
}