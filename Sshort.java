public class Sshort {
    public static void short_one(int myarray[]){
        for(int i=0;i<myarray.length;i++){
            for(int j=0;j<myarray.length-i-1;j++){
                if(myarray[j]>myarray[j+1]){
                    int temp=myarray[j+1];
                    myarray[j+1]=myarray[j];
                    myarray[j]=temp;
                }
            }
        }
        System.out.print("First short result: ");
        for(int first_result:myarray){
            System.out.print(first_result);
        }
        System.out.println();
    }
public static void short_two(int myarray[]){
    for(int i=0;i<myarray.length;i++){
        int min=i;
        for(int j=i+1;j<myarray.length;j++){
            if(myarray[j]<myarray[min]){
                min=j;
            }
        }
        int temp=myarray[min];
        myarray[min]=myarray[i];
        myarray[i]=temp;
    }
    System.out.print("Short two result: ");
    for(int short_two:myarray){
        System.out.print(short_two);
    }
    System.out.println();
}
public static void short_three(int myarray[]){
    for(int i=0;i<myarray.length;i++){
        for(int j=i+1;j<myarray.length;j++){
            if(myarray[i]>myarray[j]){
                int temp=myarray[j];
                myarray[j]=myarray[i];
                myarray[i]=temp;
            }
        }
    }
    System.out.print("Short three result: ");
    for(int res:myarray){
        System.out.print(res);
    }
}
    public static void main(String[] args) {
       int usarray[]={6,7,8,1,2,3};
       short_one(usarray);
        short_two(usarray);
        short_three(usarray);
    }
}
