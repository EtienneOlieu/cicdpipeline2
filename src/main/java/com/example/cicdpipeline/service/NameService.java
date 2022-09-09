package com.example.cicdpipeline.service;

import com.example.cicdpipeline.model.Name;
import com.example.cicdpipeline.repositories.NameRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class NameService implements INameService{

    private NameRepository nRep;
    public NameService(NameRepository nRep){
        this.nRep = nRep;
    }
    @Override
    public Set<Name> findAll() {
        Set<Name> nSet = new HashSet<>();
        nRep.findAll().forEach(nSet::add);
        return nSet;
    }

    @Override
    public Name save(Name object) {
        return null;
    }

    @Override
    public void delete(Name object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Name> findById(Long aLong) {
        return Optional.empty();
    }
}
