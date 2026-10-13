package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import tn.esprit.autoloc.Entities.Client;

import tn.esprit.autoloc.Repositories.IClientRepository;

import java.util.List;
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService {
    private final IClientRepository clientRepo;
    @Override
    public Client addClient(Client client) {
        return clientRepo.save(client);    }

    @Override
    public void deleteClient(long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public List<Client> retrieveAgence() {
        return clientRepo.findAll();
    }

    @Override
    public Client retrieveClientById(long id) {
        return clientRepo.findById(id).orElseThrow(null);
    }

    @Override
    public Client updateAgence(Client client) {
        return clientRepo.save(client);
    }
}
