package br.com.cristal.hrpayroll.services;

import br.com.cristal.hrpayroll.clients.WorkerClient;
import br.com.cristal.hrpayroll.clients.models.WorkerResponse;
import br.com.cristal.hrpayroll.entities.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerClient workerClient;

    public Payment getPayment(Long workerId, int days) {
        WorkerResponse workerResponse = workerClient.findWorkerById(workerId);

        return new Payment(workerResponse.getName(),workerResponse.getDailyIncome(), days);
    }
}
