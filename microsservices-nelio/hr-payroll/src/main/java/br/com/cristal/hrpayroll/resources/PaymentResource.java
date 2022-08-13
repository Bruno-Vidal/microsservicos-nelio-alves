package br.com.cristal.hrpayroll.resources;

import br.com.cristal.hrpayroll.entities.Payment;
import br.com.cristal.hrpayroll.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentResource {

    private final PaymentService paymentService;


    @GetMapping("/{workerId}/days/{days}")
    public Payment getPaymentOfWorker(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment payment = paymentService.getPayment(workerId, days);
        return payment;
    }
}
