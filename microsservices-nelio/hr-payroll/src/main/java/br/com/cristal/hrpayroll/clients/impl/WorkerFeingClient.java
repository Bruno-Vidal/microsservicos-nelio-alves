package br.com.cristal.hrpayroll.clients.impl;

import br.com.cristal.hrpayroll.clients.WorkerClient;
import br.com.cristal.hrpayroll.clients.models.WorkerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", path = "workers")
public interface WorkerFeingClient extends WorkerClient {

    @Override
    @GetMapping("/{id}")
    WorkerResponse findWorkerById(@PathVariable Long id);

}
