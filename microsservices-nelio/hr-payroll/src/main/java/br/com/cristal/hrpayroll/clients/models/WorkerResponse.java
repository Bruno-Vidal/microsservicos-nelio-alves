package br.com.cristal.hrpayroll.clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerResponse {

    private Long id;
    private String name;
    private Double dailyIncome;
}
