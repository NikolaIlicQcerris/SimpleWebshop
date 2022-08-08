package com.qcerris.webshop.rest;


import com.qcerris.webshop.domain.dto.PayPalAccountDTO;
import com.qcerris.webshop.service.impl.PaypalAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/paypal/account")
public class PaypalAccountController {

    private final PaypalAccountService paypalAccountService;

    public PaypalAccountController(PaypalAccountService paypalAccountService) {
        this.paypalAccountService = paypalAccountService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PayPalAccountDTO> insertNewPayPalAccount(@RequestBody PayPalAccountDTO payPalAccountDTO) {
        return new ResponseEntity<>(paypalAccountService.insertNewPayPalAccount(payPalAccountDTO), HttpStatus.OK);
    }

    @GetMapping(value = "/{userId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PayPalAccountDTO> fetchPayPalAccountByUserId(@PathVariable Long userId) {
        return new ResponseEntity<>(paypalAccountService.fetchPayPalAccountByUserId(userId), HttpStatus.OK);
    }

    @GetMapping(value = "accountId/{accountId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PayPalAccountDTO> fetchPayPalAccountByAccountId(@PathVariable String accountId) {
        return new ResponseEntity<>(paypalAccountService.fetchPayPalAccountByAccountId(accountId), HttpStatus.OK);
    }

    @GetMapping(value = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PayPalAccountDTO>> getAllPayPalAccounts() {
        return new ResponseEntity<>(paypalAccountService.getAllPayPalAccounts(), HttpStatus.OK);
    }

    @PutMapping (consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PayPalAccountDTO> updatePayPallAccount(@RequestBody PayPalAccountDTO payPalAccountDTO) {
        return new ResponseEntity<>(paypalAccountService.updatePayPallAccount(payPalAccountDTO), HttpStatus.OK);
    }

    @DeleteMapping (value = "/{userId}")
    public ResponseEntity<String> deletePayPalAccountByUserId(@PathVariable Long userId) {
        return new ResponseEntity<>(paypalAccountService.deletePayPalAccountByUserId(userId), HttpStatus.OK);
    }


}
