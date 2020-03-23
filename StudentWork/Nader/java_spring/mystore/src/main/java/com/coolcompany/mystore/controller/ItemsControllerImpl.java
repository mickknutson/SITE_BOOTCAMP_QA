package com.coolcompany.mystore.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ItemsControllerImpl {

    @Autowired
    private ItemsService service;


        @Override
        public Items findById(int id) {
            System.out.println("** ItemsController.FindById():" + id);
            return service.findById(id);
        }

        @Override
        public List<Items> findAll() {
            System.out.println("** ItemsController.findAll();");
            return service.findAll();    }

        @Override
        public void add(Items item) {
            System.out.println("** ItemsController.add() ");
            service.add(item);
        }
    }

}
