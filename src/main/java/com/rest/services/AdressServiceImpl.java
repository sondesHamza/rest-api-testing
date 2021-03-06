package com.rest.services;

import com.rest.dao.AdressRepository;
import com.rest.domains.Adress;
import com.rest.domains.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("adressService")
public class AdressServiceImpl implements AdressService {
    private AdressRepository adressRepository;

    public AdressServiceImpl(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }

    @Override
    public List<Adress> findAll() {
        List<Adress> adresses = new ArrayList<>();
        Client client1 = new Client("1", "Societe generale");
        Client  client2 =new Client("2", "ALMA Group");
        //Adress adress  = new Adress("bellini","3 Rue",new Long(75008),client1);
        //Adress adress2  = new Adress("Boetie","Rue 124",new Long(75008),client2);
        //adresses.add(adress);
        //adresses.add(adress2);

        return adresses;
       // return (List<Adress>) adressRepository.findAll();
    }
    @Override
    public Adress findById(long id) {
        return adressRepository.findById(id).get();
    }

    @Override
    public Adress findByLibelle(String libelle) {
        return adressRepository.findAdressByLibelleCourt(libelle);
    }

    @Override
    public void save(Adress a) {
        adressRepository.save(a);

    }

    @Override
    public void delete() {
        adressRepository.deleteAll();
    }

    @Override
    public void deleteById(long id) {
        adressRepository.deleteById(id);
    }
}
