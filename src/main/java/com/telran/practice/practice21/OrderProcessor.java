package com.telran.practice.practice21;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private List<Order> orders = new ArrayList<>();

    private double getTotalAmount(List<Item> items) {
        return items.stream().map(Item::getPrice).reduce(0.0, Double::sum);
    }

    private Double getShippingCost(String shippingMethod) {
        return switch (shippingMethod) {
            case "standard" -> 5.99;
            case "express" -> 9.99;
            default -> {
                System.out.println("Invalid shipping method");
                yield null;
            }
        };
    }

    public void processOrder(String customerId, List<String> itemIds, String shippingMethod) {
        Customer customer = getCustomerById(customerId);
        if (customer == null) {
            System.out.println("Customer not found");
            return;
        }

        List<Item> items = new ArrayList<>();
        for (String itemId : itemIds) {
            Item item = getItemById(itemId);
            if (item != null) {
                items.add(item);
            } else {
                System.out.println("Item not found: " + itemId);
            }
        }

        if (items.isEmpty()) {
            System.out.println("No valid items found for order");
            return;
        }

        double totalAmount = getTotalAmount(items);

        Double shippingCost = getShippingCost(shippingMethod);
        if (shippingCost == null) return;

        Order order = new Order();
        order.setCustomer(customer);
        order.setItems(items);
        order.setTotalAmount(totalAmount);
        order.setShippingCost(shippingCost);
        order.setOrderStatus("Processing");

        orders.add(order);
        System.out.println("Order processed: " + order.getId());
    }

    public void cancelOrder(long orderId) {
        Order orderToRemove = null;
        for (Order order : orders) {
            if (order.getId() == orderId) {
                orderToRemove = order;
                break;
            }
        }
        if (orderToRemove != null) {
            orders.remove(orderToRemove);
            System.out.println("Order canceled: " + orderToRemove.getId());
        } else {
            System.out.println("Order not found: " + orderId);
        }
    }

    public void printOrderDetails(long orderId) {
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getId() == orderId) {
                foundOrder = order;
                break;
            }
        }
        if (foundOrder != null) {
            System.out.println("Order Details: ");
            System.out.println("Customer: " + foundOrder.getCustomer().getName());
            System.out.println("Items: ");
            for (Item item : foundOrder.getItems()) {
                System.out.println(" - " + item.getName() + ": $" + item.getPrice());
            }
            System.out.println("Total Amount: $" + foundOrder.getTotalAmount());
            System.out.println("Shipping Cost: $" + foundOrder.getShippingCost());
            System.out.println("Status: " + foundOrder.getOrderStatus());
        } else {
            System.out.println("Order not found: " + orderId);
        }
    }

    private Customer getCustomerById(String customerId) {
        // Simulated method to get customer by ID
        return new Customer(customerId, "Customer Name");
    }

    private Item getItemById(String itemId) {
        // Simulated method to get item by ID
        return new Item(itemId, "Item Name", Math.random() * 100);
    }
}
