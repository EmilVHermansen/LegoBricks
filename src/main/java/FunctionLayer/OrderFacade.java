/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import DBAccess.DataAccessObject;

/**
 *
 * @author emilv
 */
public class OrderFacade {

    public static Order getOrder(String email, String password){
        return DataAccessObject.getOrder();
    }

    public static Order createOrder(int width, int length, int height, int userId) throws LoginSampleException{
        Order order = new Order(length, width, height, userId);
        DataAccessObject.createOrder(order);
        return order;
    }
}
