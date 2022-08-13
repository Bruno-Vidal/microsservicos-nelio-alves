package br.com.cristal.hrworker.resources;

import br.com.cristal.hrworker.entities.Worker;
import br.com.cristal.hrworker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
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


    @GetMapping
    public List<Worker> getWorkers() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Worker findById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}
