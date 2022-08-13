package br.com.cristal.hrpayroll.clients.impl;

import br.com.cristal.hrpayroll.clients.WorkerClient;
import br.com.cristal.hrpayroll.clients.models.WorkerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
@RequiredArgsConstructor
public class WorkerClientRestTemplate  implements WorkerClient {
    private final RestTemplate restTemplate;

    @Value("${hr-worker.host}")
    private String workerHost;

    @Override
    public WorkerResponse findWorkerById(Long id) {
        return restTemplate.getForObject(this.workerHost + "/workers/" + id, WorkerResponse.class);
    }

}
