package br.com.cristal.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private Double DailyIncome;
    private Integer days;

    public Double getTotal() {
        return days * getDailyIncome();
    }
}
