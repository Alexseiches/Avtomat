// Main.java
public class Main {
    public static void main(String[] args) {
        ГорячихНапитковАвтомат автомат = new ГорячихНапитковАвтомат();

        Продукт чайИзАвтомата = автомат.getProduct(1, 200);
        Продукт кофеИзАвтомата = автомат.getProduct(2, 300, 85);

        System.out.println("Продукт из автомата: " + чайИзАвтомата);
        System.out.println("Продукт из автомата: " + кофеИзАвтомата);

    }
}