package com.lucky.mecha.controller.admin;

import com.lucky.mecha.entity.Buying;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.BuyingService;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.response.BuyingResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:24
 * Description:
 */
@Slf4j
@RestController
@RequestMapping("/buyingBk")
public class BuyingControllerBk {
    private final BuyingService buyingService;

    public BuyingControllerBk(BuyingService buyingService) {
        this.buyingService = buyingService;
    }

    @GetMapping("/getAll")
    public Pager<Buying> getAll(Pager pager) {
        return buyingService.findAllBk(pager);
    }

    @PostMapping("/delete")
    public String delete(Long id) throws MechaException {
        return buyingService.delete(id);
    }

    @PostMapping("/update")
    public BuyingResponse update(Buying request) throws MechaException {
        return buyingService.update(request);
    }
}
