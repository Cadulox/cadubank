package br.com.cadulox.cadubank.services;

import br.com.cadulox.cadubank.models.Client;
import br.com.cadulox.cadubank.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }
}
