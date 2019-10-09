
package almi;


public class faktorial {
    int f=1;
    int i;
 int faktorial(int n){
    for (i=1;i<=n;i++){
       f=f*i; 
    }
    return f;
}
    
    public static void main(String[] args) {
    faktorial hasil=new faktorial();
        System.out.println(hasil.faktorial(5));
}
}
