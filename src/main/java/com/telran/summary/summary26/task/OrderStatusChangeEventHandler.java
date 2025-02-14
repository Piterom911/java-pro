package com.telran.summary.summary26.task;

public class OrderStatusChangeEventHandler {

    @EventListener(status = Status.CREATED)
    public void onOrderCreated() {
        System.out.println("Order created");
    }

    @EventListener(status = Status.CANCELED)
    public void onOrderCancelled() {
        System.out.println("Order cancelled");
    }

    @EventListener(status = Status.PAID)
    public void onOrderPaid() {
        System.out.println("Order paid");
    }
}
