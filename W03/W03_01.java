package W03;
class W03_01 {
    public static void main(String[] args) {

        short price = 350;

        byte quantity = 10;
        byte percentDiscount = 5;

        int totalPrice = price * quantity, discount = totalPrice * percentDiscount / 100,
                netPrice = totalPrice - discount;

}