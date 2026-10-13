package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Entities.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client client);
    void deleteClient(long id);
    List<Client> retrieveAgence();
    Client retrieveClientById(long id);
    Client updateAgence(Client client);
}
