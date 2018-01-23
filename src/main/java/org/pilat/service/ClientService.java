/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.service;

import java.util.List;
import org.pilat.model.Client;

/**
 *
 * @author Pilat
 */
public interface ClientService {

    void saveClient(Client client);
    
    Client findById(long id);

    List<Client> findByName(String name);

    void deleteClientById(Long id);

    List<Client> findAllClients();

    void deleteAllClients();

}
