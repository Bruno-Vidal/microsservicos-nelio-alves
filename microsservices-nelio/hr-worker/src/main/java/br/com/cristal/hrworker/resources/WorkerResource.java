package br.com.cristal.hrworker.resources;

import br.com.cristal.hrworker.entities.Worker;
import br.com.cristal.hrworker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
@RequiredArgsConstructor
public class WorkerResource {

    private final WorkerRepository repository;

    @Value("${server.instance.id}")
    String instanceId;


    @GetMapping
    public List<Worker> getWorkers() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Worker findById(@PathVariable Long id) {

        System.out.println("Instancia de numero : ".concat(this.instanceId));
        return repository.findById(id).orElse(null);
    }
}
