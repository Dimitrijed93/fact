package com.cn.factservice.controller;

import com.cn.factservice.client.FactClient;
import com.cn.factservice.model.FactList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/facts")
public class FactController {
    private FactClient factClient;

    FactController(FactClient factClient) {
        this.factClient = factClient;
    }

    @Operation(summary = "Load Dog Facts")
    @ApiResponse(responseCode = "200", description = "Dog Facts Loaded",
        content = {@Content(mediaType = "application/json", schema = @Schema(implementation = FactList.class))} )
    @GetMapping
    ResponseEntity<FactList> load() {
        FactList list = factClient.getFacts();
        return ResponseEntity.ok(list);
    }
}
