public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        if (n==0) {
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Disk no. "+n+ " Moved from "+src+" to "+dest);
        towerOfHanoi(n-1, helper,src, dest);
        
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "src", "helper","dest");
    }
}
