/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.arsw.myrestaurant.restcontrollers;

import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.model.ProductType;
import edu.eci.arsw.myrestaurant.model.RestaurantProduct;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServicesStub;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcadavid
 */
    @RestController
    @RequestMapping(value = "/xx")

public class OrdersAPIController {


        @RequestMapping(method = RequestMethod.GET)
        public ResponseEntity<?> manejadorGetRecursoXX() {

            Map<String, RestaurantProduct> productsMap = new ConcurrentHashMap<>();
            productsMap.put("PIZZA", new RestaurantProduct("PIZZA", 10000, ProductType.DISH));
            productsMap.put("HOTDOG", new RestaurantProduct("HOTDOG", 3000, ProductType.DISH));
            productsMap.put("COKE", new RestaurantProduct("COKE", 1300, ProductType.DRINK));
            productsMap.put("HAMBURGER", new RestaurantProduct("HAMBURGER", 12300, ProductType.DISH));
            productsMap.put("BEER", new RestaurantProduct("BEER", 2500, ProductType.DRINK));

            Order o = new Order(1);
            o.addDish("PIZZA", 3);
            o.addDish("HOTDOG", 1);
            o.addDish("COKE", 4);
            

            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(o, HttpStatus.ACCEPTED);
        }

        public static void main(String a[]){
                    RestaurantOrderServicesStub serv=new RestaurantOrderServicesStub();
        Order o=new Order(222);
        o.addDish("PIZZA", 3);
        o.addDish("HOTDOG", 3);
        o.addDish("PIZZA", 5);
        o.addDish("PIZZAx", 5);
        
        System.out.println(o);

        }
    
}
