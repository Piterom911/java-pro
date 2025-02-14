package com.telran.summary.summary26.task;

import java.util.Date;

/**
 *  Order: data, number, status
 *  Ability to set different statuses to an order
 *  @EventListener status(EnumStatus -> CREATED, CANCELLED, PAID) in orderStatus
 *  OrderStatusChangeEventHandler -> onOrderCreated(), onOrderCancelled(), onOrderPaid()
 *  EventDispatcher -> registerHandler(OrderStatusChangeEventHandler!!!! Abstract!!!!), createEvent(Order): HashMap with @ method and EventHandler
 *  EventApp
 *  EventDispatcher.register(EventHandler)
 *
 */

public class EventListenerApp {

    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();
        OrderStatusChangeEventHandler handler = new OrderStatusChangeEventHandler();
        Order order = new Order(new Date(), 11, Status.CREATED);
        dispatcher.registerHandler(handler);
        dispatcher.createEvent(order);
        order.setStatus(Status.PAID);
        dispatcher.createEvent(order);
    }
}
