package com.oguz.stock.adapters.user.rest;

import com.oguz.stock.adapters.user.jpa.UserDataAdapter;
import com.oguz.stock.adapters.user.rest.dto.Account;
import com.oguz.stock.product.model.Product;
import com.oguz.stock.product.usecase.ProductCreate;
import com.oguz.stock.user.model.User;
import com.oguz.stock.user.usecase.CreateUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserDataAdapter userDataAdapter;
    @GetMapping
    public ResponseEntity<List<User>> getList(){
        List<User> users =  userDataAdapter.getAll();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getCategoryById(@RequestParam long id){
        User product = userDataAdapter.getUserById(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/account/{id}")
    public ResponseEntity<Account> getAccount(@RequestParam long id){
        String uri = "http://localhost:8091/api/account/"+id;
        RestTemplate restTemplate = new RestTemplate();
        Account account = restTemplate.getForObject(uri, Account.class);
        return ResponseEntity.ok(account);
    }

    @PostMapping
    public ResponseEntity<User> createProduct(@RequestBody CreateUser createUser){
        User product =  userDataAdapter.createUser(createUser);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}
