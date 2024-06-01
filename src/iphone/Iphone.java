import phonemodels.IphoneOne;

public class Iphone {
    public static void main(String[] args) {
        IphoneOne iphone = new IphoneOne();

        iphone.startAppItunes();
        System.out.println();
        iphone.startAppCall(null);
        System.out.println();
        iphone.startAppSafari();
    }
    
}
