package com.rest.services;

import com.rest.domains.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public List<Client> findAll();

    Optional<Client> findById(long id);

    Optional<Client> findByCode(String code);

    public void save(Client c);

    public void delete();

    public void deleteById(long id);

    public List<Client> findByAdress(String libelleCourt);
}
