package com.example.ProjetCrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRMService {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    OrderRepository orderRepository;

    public void createClient(Client client){
        clientRepository.save(client);
    }
    public void createOrder(Order order){ orderRepository.save(order);}

    public List<Client> getClients(){return clientRepository.findAll();}

    public List<Order> getOrders(){return orderRepository.findAll();}

    public void deleteClient(Integer id){
        clientRepository.deleteById(id);
    }

    public void deleteOrder(Integer id){
        orderRepository.deleteById(id);
    }
    public void updateClient(Integer id, Client client) {
        clientRepository.save(client);
    }

    public void updateOrder(Integer id, Order order) {
        orderRepository.save(order);
    }

}
