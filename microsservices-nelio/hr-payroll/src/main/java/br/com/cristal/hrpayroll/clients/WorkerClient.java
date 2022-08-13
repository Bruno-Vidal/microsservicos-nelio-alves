package br.com.cristal.hrpayroll.clients;

import br.com.cristal.hrpayroll.clients.models.WorkerResponse;

public interface WorkerClient {

    WorkerResponse findWorkerById(Long id);

}
