package com.rest.services;

import com.rest.dao.ClientRepository;
import com.rest.domains.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("clientService")
public class IClientServiceImpl implements IClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client findByCode(String code) {
        return clientRepository.findClientByCode(code);
    }

    @Override
    public void save(Client c) {
        clientRepository.save(c);

    }

    @Override
    public void delete() {
        clientRepository.deleteAll();
    }

    @Override
    public void deleteById(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> findByAdress(String libelleCourt) {
        return null;
    }
}
