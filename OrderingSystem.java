// When a customer places an order:
// One thread should handle payment processing.
// Another thread should handle order preparation.
// A third thread can handle delivery assignment.

class PaymentProcessing extends Thread{
    public void run(){
        System.out.println("Payment processing..");
        try{
            sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();;
        }
        System.out.println("Payment processed.");
    }
}

class OrderPreparation extends Thread{
    public void run(){
        System.out.println("Order preparing..");
        try{
            sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();;
        }
        System.out.println("Order prepared.");
    }
}

class DeliveryAssigning extends Thread{ 
    public void run(){
        System.out.println("Delivery assigning..");
        try{
            sleep(3000);
        }
        catch(Exception e){
            e.printStackTrace();;
        }
        System.out.println("Delivery assigned.");
    }
}

public class OrderingSystem {
    public static void main(String[] args) {
        PaymentProcessing paymentThread = new PaymentProcessing();
        OrderPreparation orderThread = new OrderPreparation();
        DeliveryAssigning deliveryThread = new DeliveryAssigning();

        paymentThread.start();
        orderThread.start();
        deliveryThread.start();

        try{
            paymentThread.join();
            orderThread.join();
            deliveryThread.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Order confirmed ✅ Your food is on the way!");
    }
}
