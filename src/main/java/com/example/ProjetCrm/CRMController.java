package com.example.ProjetCrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Api")
public class CRMController {

    @Autowired
    CRMService crmService;

    @PostMapping("clients")
    public void createClient(@RequestBody Client client){
        crmService.createClient(client);
    }

    @PostMapping("orders")
    public void createOrder(@RequestBody Order order){
        crmService.createOrder(order);
    }

    @GetMapping("clients")
    public List<ClientDTO> getClients(){
        List<Client> clients = crmService.getClients();
        List<ClientDTO> dtos = new ArrayList<>();
        for(Client entity : clients){
            dtos.add(new ClientDTO(entity));
        }
        return dtos;
    }

    @GetMapping("orders")
    public List<OrderDTO> getOrders(){
        List<Order> orders = crmService.getOrders();
        List<OrderDTO> dtos = new ArrayList<>();
        for(Order entity : orders){
            dtos.add(new OrderDTO(entity));
        }
        return dtos;
    }

    @DeleteMapping("clients/{id}")
    public void deleteClient(@PathVariable Integer id){
        crmService.deleteClient(id);
    }

    @DeleteMapping("orders/{id}")
    public void deleteOrder(@PathVariable Integer id){
        crmService.deleteOrder(id);
    }

    @PutMapping("clients/{id}")
    public void updateClient(@PathVariable Integer id, @RequestBody Client client){
        crmService.updateClient(id, client);}

    @PutMapping("orders/{id}")
    public void updateOrder(@PathVariable Integer id, @RequestBody Order order){
        crmService.updateOrder(id, order);
    }
}
