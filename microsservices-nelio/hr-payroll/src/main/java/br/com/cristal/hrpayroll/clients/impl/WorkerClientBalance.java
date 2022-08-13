package br.com.cristal.hrpayroll.clients.impl;

import br.com.cristal.hrpayroll.clients.WorkerClient;
import br.com.cristal.hrpayroll.clients.models.WorkerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class WorkerClientBalance implements WorkerClient {


    private final WebClient.Builder webClient;
    @Override
    public WorkerResponse findWorkerById(Long id) {
        return Objects.requireNonNull(webClient.build().get().uri("http://hr-worker/workers/".concat(id.toString()))
                .retrieve().toEntity(WorkerResponse.class)
                .block()).getBody();
    }
}
