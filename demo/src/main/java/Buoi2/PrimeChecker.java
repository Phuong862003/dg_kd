package Buoi2;

public class PrimeChecker {
    public boolean isPrime(int n){
        if(n<1){
            return false;
        }
        for(int i=1; i<=Math.sqrt(n);i++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }
    public void checkPrime(int n){
        for(int i=1;i<=n;i++){
            if(isPrime(n)){
                System.out.println(i+"la so nt");
            }else{
                System.out.println(i+"khong phai la snt");
            }
        }
    }
    public static void main(){
        PrimeChecker checker = new PrimeChecker();
        checker.checkPrime(10);
    }
}
