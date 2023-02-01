package com.example.ProjetCrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Api")
@CrossOrigin
public class CRMController {

    @Autowired
    CRMService crmService;

    @CrossOrigin
    @PostMapping("clients")
    public void createClient(@RequestBody Client client){
        crmService.createClient(client);
    }

    @CrossOrigin
    @PostMapping("orders")
    public void createOrder(@RequestBody Order order){
        crmService.createOrder(order);
    }

    @CrossOrigin
    @GetMapping("clients")
    public List<ClientDTO> getClients(){
        List<Client> clients = crmService.getClients();
        List<ClientDTO> dtos = new ArrayList<>();
        for(Client entity : clients){
            dtos.add(new ClientDTO(entity));
        }
        return dtos;
    }
    @CrossOrigin
    @GetMapping("orders")
    public List<OrderDTO> getOrders(){
        List<Order> orders = crmService.getOrders();
        List<OrderDTO> dtos = new ArrayList<>();
        for(Order entity : orders){
            dtos.add(new OrderDTO(entity));
        }
        return dtos;
    }
    @CrossOrigin
    @DeleteMapping("clients/{id}")
    public void deleteClient(@PathVariable Integer id){
        crmService.deleteClient(id);
    }
    @CrossOrigin
    @DeleteMapping("orders/{id}")
    public void deleteOrder(@PathVariable Integer id){
        crmService.deleteOrder(id);
    }
    @CrossOrigin
    @PutMapping("clients/{id}")
    public void updateClient(@PathVariable Integer id, @RequestBody Client client){
        crmService.updateClient(id, client);}
    @CrossOrigin
    @PutMapping("orders/{id}")
    public void updateOrder(@PathVariable Integer id, @RequestBody Order order){
        crmService.updateOrder(id, order);
    }
}
